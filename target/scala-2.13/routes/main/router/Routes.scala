// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  Application_0: controllers.Application,
  // @LINE:10
  TodoList_1: controllers.TodoList,
  // @LINE:28
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    Application_0: controllers.Application,
    // @LINE:10
    TodoList_1: controllers.TodoList,
    // @LINE:28
    Assets_2: controllers.Assets
  ) = this(errorHandler, Application_0, TodoList_1, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_0, TodoList_1, Assets_2, prefix)
  }

  private val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.redirectToLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo""", """controllers.TodoList.todoList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.TodoList.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTasks/""" + "$" + """username<[^/]+>""", """controllers.TodoList.getTasks(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask""", """controllers.TodoList.addTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeTask""", """controllers.TodoList.removeTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validate""", """controllers.TodoList.validateLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createUser""", """controllers.TodoList.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(file:String)"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:9
  private lazy val controllers_Application_redirectToLogin0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private lazy val controllers_Application_redirectToLogin0_invoker = createInvoker(
    Application_0.redirectToLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "redirectToLogin",
      Nil,
      "GET",
      this.prefix + """""",
      """ views""",
      Seq()
    )
  )

  // @LINE:10
  private lazy val controllers_TodoList_todoList1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo")))
  )
  private lazy val controllers_TodoList_todoList1_invoker = createInvoker(
    TodoList_1.todoList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "todoList",
      Nil,
      "GET",
      this.prefix + """todo""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private lazy val controllers_TodoList_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private lazy val controllers_TodoList_login2_invoker = createInvoker(
    TodoList_1.login,
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

  // @LINE:15
  private lazy val controllers_TodoList_getTasks3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTasks/"), DynamicPart("username", """[^/]+""", encodeable=true)))
  )
  private lazy val controllers_TodoList_getTasks3_invoker = createInvoker(
    TodoList_1.getTasks(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "getTasks",
      Seq(classOf[String]),
      "GET",
      this.prefix + """getTasks/""" + "$" + """username<[^/]+>""",
      """ tasks""",
      Seq()
    )
  )

  // @LINE:16
  private lazy val controllers_TodoList_addTask4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask")))
  )
  private lazy val controllers_TodoList_addTask4_invoker = createInvoker(
    TodoList_1.addTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "addTask",
      Nil,
      "POST",
      this.prefix + """addTask""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private lazy val controllers_TodoList_removeTask5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeTask")))
  )
  private lazy val controllers_TodoList_removeTask5_invoker = createInvoker(
    TodoList_1.removeTask,
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

  // @LINE:23
  private lazy val controllers_TodoList_validateLogin6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validate")))
  )
  private lazy val controllers_TodoList_validateLogin6_invoker = createInvoker(
    TodoList_1.validateLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoList",
      "validateLogin",
      Nil,
      "POST",
      this.prefix + """validate""",
      """ user""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:24
  private lazy val controllers_TodoList_createUser7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createUser")))
  )
  private lazy val controllers_TodoList_createUser7_invoker = createInvoker(
    TodoList_1.createUser,
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

  // @LINE:28
  private lazy val controllers_Assets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""", encodeable=false)))
  )
  private lazy val controllers_Assets_at8_invoker = createInvoker(
    Assets_2.at(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ assets""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_Application_redirectToLogin0_route(params@_) =>
      call { 
        controllers_Application_redirectToLogin0_invoker.call(Application_0.redirectToLogin)
      }
  
    // @LINE:10
    case controllers_TodoList_todoList1_route(params@_) =>
      call { 
        controllers_TodoList_todoList1_invoker.call(TodoList_1.todoList)
      }
  
    // @LINE:11
    case controllers_TodoList_login2_route(params@_) =>
      call { 
        controllers_TodoList_login2_invoker.call(TodoList_1.login)
      }
  
    // @LINE:15
    case controllers_TodoList_getTasks3_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_TodoList_getTasks3_invoker.call(TodoList_1.getTasks(username))
      }
  
    // @LINE:16
    case controllers_TodoList_addTask4_route(params@_) =>
      call { 
        controllers_TodoList_addTask4_invoker.call(TodoList_1.addTask)
      }
  
    // @LINE:17
    case controllers_TodoList_removeTask5_route(params@_) =>
      call { 
        controllers_TodoList_removeTask5_invoker.call(TodoList_1.removeTask)
      }
  
    // @LINE:23
    case controllers_TodoList_validateLogin6_route(params@_) =>
      call { 
        controllers_TodoList_validateLogin6_invoker.call(TodoList_1.validateLogin)
      }
  
    // @LINE:24
    case controllers_TodoList_createUser7_route(params@_) =>
      call { 
        controllers_TodoList_createUser7_invoker.call(TodoList_1.createUser)
      }
  
    // @LINE:28
    case controllers_Assets_at8_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_at8_invoker.call(Assets_2.at(file))
      }
  }
}
