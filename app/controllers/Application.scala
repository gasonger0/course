package controllers

import play.api.Play
import play.api.mvc.{AbstractController, Action, ControllerComponents, Request}

import javax.inject._

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc){
  def redirectToLogin = Action {
    Redirect(routes.TodoList.login)
  }
}
