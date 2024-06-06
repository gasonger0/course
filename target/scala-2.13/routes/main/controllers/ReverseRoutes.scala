// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers {

  // @LINE:9
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def redirectToLogin: Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseTodoList(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def createUser: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createUser")
    }
  
    // @LINE:23
    def validateLogin: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validate")
    }
  
    // @LINE:16
    def addTask: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addTask")
    }
  
    // @LINE:17
    def removeTask: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "removeTask")
    }
  
    // @LINE:15
    def getTasks(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getTasks/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:10
    def todoList: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todo")
    }
  
    // @LINE:11
    def login: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:28
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def at(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
