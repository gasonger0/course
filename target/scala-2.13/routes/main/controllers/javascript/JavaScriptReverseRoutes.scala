// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.javascript {

  // @LINE:9
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def redirectToLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.redirectToLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseTodoList(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoList.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createUser"})
        }
      """
    )
  
    // @LINE:23
    def validateLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoList.validateLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validate"})
        }
      """
    )
  
    // @LINE:16
    def addTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoList.addTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addTask"})
        }
      """
    )
  
    // @LINE:17
    def removeTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoList.removeTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "removeTask"})
        }
      """
    )
  
    // @LINE:15
    def getTasks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoList.getTasks",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getTasks/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:10
    def todoList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoList.todoList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todo"})
        }
      """
    )
  
    // @LINE:11
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoList.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }


}
