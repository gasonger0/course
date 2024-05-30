package controllers

import play.api.mvc.{AbstractController, ControllerComponents}
import models.TodoListModel
import javax.inject._

@Singleton
class TodoList @Inject()(cc: ControllerComponents) extends AbstractController(cc){

  def login = Action { implicit request =>
    Ok(views.html.login())
  }

  def validateLogin = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { args =>
      val username = args("username").head
      val password = args("password").head
      if (TodoListModel.validateUser(username, password)) {
        Redirect(routes.TodoList.todoList).withSession("username" -> username)
      } else {
        Redirect(routes.TodoList.login).flashing("msg" -> "Неверный логин или пароль!")
      }
    }.getOrElse(Redirect(routes.TodoList.login))
  }

  def createUser = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { args =>
      val username = args("username").head
      val password = args("password").head
      if (TodoListModel.createUser(username, password)) {
        Redirect(routes.TodoList.todoList)
          .withSession("username" -> username)
      } else {
        Ok("User already Exists")
          .flashing("msg" -> "Пользователь уже существует!")
      }
    }.getOrElse(Redirect(routes.TodoList.login))
  }

  def logout = Action {
    Redirect(routes.TodoList.login).withNewSession
  }

  def todoList = Action { implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map { username =>
      val tasks = TodoListModel.getTasks(username)
      Ok(views.html.todoList(tasks))
    }.getOrElse(Ok(views.html.todoList(Nil)))
  }

  def addTask = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { form =>
      val description = form("task").head
      val userOption = request.session.get("username")
      userOption.map { curUser =>
        TodoListModel.addTask(curUser, description)
        Redirect(routes.TodoList.todoList)
      }.getOrElse(Redirect(routes.TodoList.login))
    }.getOrElse(Redirect(routes.TodoList.todoList)
      .flashing("msg" -> "Error"))
  }

  def removeTask = Action { implicit request =>
    val userOption = request.session.get("username")
    userOption.map { curUser =>
      val id = request.body.asFormUrlEncoded.get("id").head.toInt
      TodoListModel.removeTask(curUser, id)
      Redirect(routes.TodoList.todoList)
    }.getOrElse(Redirect(routes.TodoList.todoList)
      .flashing("msg" -> "Ошибка при удалении заметки"))
  }
}
