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
      val tags = form("tags")
      val desc = form("desc").head
      val userName = form("username").head
      TodoListModel.addTask(userName, title, desc, tags.toList)
      Ok(Json.toJson("OK"))
    }.getOrElse(BadRequest("Error"))
  }

  def removeTask = Action { implicit request =>
    val curUser = request.body.asFormUrlEncoded.get("username").head
    val id = request.body.asFormUrlEncoded.get("name").head
    TodoListModel.removeTask(curUser, id)
    Ok("OK")
  }

  def changeTags = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { form =>
      val name = form("title").head
      val tags = form("tags").head.split(',').toList
      val username = form("username").head
      TodoListModel.changeTags(username, name, tags)
      Ok("")
    }.getOrElse(BadRequest("Error"))
  }
}
