package controllers

import play.api.mvc.{AbstractController, ControllerComponents}
import models.TodoListModel

import javax.inject._
import scala.collection.mutable

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
    }.getOrElse(Ok(views.html.todoList(mutable.Map.empty)))
  }

  def addTask = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { form =>
      val title = form("title").head
      val description = form("tags")
      val userOption = request.session.get("username")
      userOption.map { curUser =>
        TodoListModel.addTask(curUser, title, description.toList)
        Redirect(routes.TodoList.todoList)
      }.getOrElse(Redirect(routes.TodoList.login))
    }.getOrElse(Redirect(routes.TodoList.todoList)
      .flashing("msg" -> "Error"))
    Redirect(routes.TodoList.todoList)
  }

  def removeTask = Action { implicit request =>
    val userOption = request.session.get("username")
    userOption.map { curUser =>
      val id = request.body.asFormUrlEncoded.get("id").head
      TodoListModel.removeTask(curUser, id)
      Redirect(routes.TodoList.todoList)
    }.getOrElse(Redirect(routes.TodoList.todoList)
      .flashing("msg" -> "Ошибка при удалении заметки"))
  }
}
