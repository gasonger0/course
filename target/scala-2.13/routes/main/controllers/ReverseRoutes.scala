// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseTodoList(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def createUser: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createUser")
    }
  
    // @LINE:13
    def validateLogin: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validate")
    }
  
    // @LINE:9
    def addTask: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addTask")
    }
  
    // @LINE:15
    def logout: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:10
    def removeTask: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "removeTask")
    }
  
    // @LINE:7
    def todoList: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todo")
    }
  
    // @LINE:12
    def login: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
