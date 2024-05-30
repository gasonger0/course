// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  TodoList_0: controllers.TodoList,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    TodoList_0: controllers.TodoList
  ) = this(errorHandler, TodoList_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, TodoList_0, prefix)
  }

  private val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo""", """controllers.TodoList.todoList"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask""", """controllers.TodoList.addTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeTask""", """controllers.TodoList.removeTask"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.TodoList.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validate""", """controllers.TodoList.validateLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createUser""", """controllers.TodoList.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.TodoList.logout"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:7
  private lazy val controllers_TodoList_todoList0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo")))
  )
  private lazy val controllers_TodoList_todoList0_invoker = createInvoker(
    TodoList_0.todoList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "todoList",
      Nil,
      "GET",
      this.prefix + """todo""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private lazy val controllers_TodoList_addTask1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask")))
  )
  private lazy val controllers_TodoList_addTask1_invoker = createInvoker(
    TodoList_0.addTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "addTask",
      Nil,
      "POST",
      this.prefix + """addTask""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:10
  private lazy val controllers_TodoList_removeTask2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeTask")))
  )
  private lazy val controllers_TodoList_removeTask2_invoker = createInvoker(
    TodoList_0.removeTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "removeTask",
      Nil,
      "POST",
      this.prefix + """removeTask""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private lazy val controllers_TodoList_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private lazy val controllers_TodoList_login3_invoker = createInvoker(
    TodoList_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private lazy val controllers_TodoList_validateLogin4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validate")))
  )
  private lazy val controllers_TodoList_validateLogin4_invoker = createInvoker(
    TodoList_0.validateLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "validateLogin",
      Nil,
      "POST",
      this.prefix + """validate""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private lazy val controllers_TodoList_createUser5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createUser")))
  )
  private lazy val controllers_TodoList_createUser5_invoker = createInvoker(
    TodoList_0.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "createUser",
      Nil,
      "POST",
      this.prefix + """createUser""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private lazy val controllers_TodoList_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private lazy val controllers_TodoList_logout6_invoker = createInvoker(
    TodoList_0.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_TodoList_todoList0_route(params@_) =>
      call { 
        controllers_TodoList_todoList0_invoker.call(TodoList_0.todoList)
      }
  
    // @LINE:9
    case controllers_TodoList_addTask1_route(params@_) =>
      call { 
        controllers_TodoList_addTask1_invoker.call(TodoList_0.addTask)
      }
  
    // @LINE:10
    case controllers_TodoList_removeTask2_route(params@_) =>
      call { 
        controllers_TodoList_removeTask2_invoker.call(TodoList_0.removeTask)
      }
  
    // @LINE:12
    case controllers_TodoList_login3_route(params@_) =>
      call { 
        controllers_TodoList_login3_invoker.call(TodoList_0.login)
      }
  
    // @LINE:13
    case controllers_TodoList_validateLogin4_route(params@_) =>
      call { 
        controllers_TodoList_validateLogin4_invoker.call(TodoList_0.validateLogin)
      }
  
    // @LINE:14
    case controllers_TodoList_createUser5_route(params@_) =>
      call { 
        controllers_TodoList_createUser5_invoker.call(TodoList_0.createUser)
      }
  
    // @LINE:15
    case controllers_TodoList_logout6_route(params@_) =>
      call { 
        controllers_TodoList_logout6_invoker.call(TodoList_0.logout)
      }
  }
}
