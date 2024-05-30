// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTodoList TodoList = new controllers.ReverseTodoList(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTodoList TodoList = new controllers.javascript.ReverseTodoList(RoutesPrefix.byNamePrefix());
  }

}
