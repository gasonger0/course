package controllers

import play.api.mvc.{AbstractController, ControllerComponents}
import models.TodoListModel
import play.api.libs.json.Json

import javax.inject._
import scala.collection.mutable

@Singleton
class TodoList @Inject()(cc: ControllerComponents) extends AbstractController(cc){

  // VIEWS
  def login = Action { implicit request =>
    Ok(views.html.login())
  }

  def todoList = Action { implicit request =>
    Ok(views.html.todoList())
  }
  // END VIEWS

  def validateLogin = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { args =>
      val username = args("name").head
      val password = args("pswd").head
      if (TodoListModel.validateUser(username, password)) {
        Ok(Json.obj("username" -> username))
      } else {
        NotFound("Неверный логин или пароль!")
      }
    }.getOrElse(Redirect(routes.TodoList.login))
  }

  def createUser = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { args =>
      val username = args("name").head
      val password = args("pswd").head
      if (TodoListModel.createUser(username, password)) {
        Ok(Json.obj("username" -> username))
      } else {
        Conflict("Пользователь уже существует!")
      }
    }.getOrElse(BadRequest)
  }

  def getTasks(username: String) = Action { implicit request =>
      val tasks = TodoListModel.getTasks(username)
      Ok(Json.toJson(tasks))
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
