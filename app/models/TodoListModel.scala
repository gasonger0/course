package models

import scala.collection.mutable

object TodoListModel {
  private val users = mutable.Map[String, String]("M" -> "1")

  private val tasks = mutable.Map[                       // username -> (title -> (tag2, tag2), title2 -> (tag1, tag3))
    String, mutable.Map[
        String, List[String]
    ]
  ]("M" -> mutable.Map("a" -> List("red", "green"), "b" -> List("1", "2")))

  def validateUser(username: String, password: String): Boolean = {
    users.get(username).map(_ == password).getOrElse(false)
  }
  def createUser(username: String, password: String): Boolean = {
    if (users.contains(username)) false else {
      users(username) = password
      true
    }
  }
  def getTasks(username: String):
    mutable.Map[
      String, List[String]
    ] =  {
    tasks.get(username).getOrElse(mutable.Map.empty)
  }

  def addTask(username: String, title: String, tags: List[String]): Unit = {
    tasks(username)(title) = tags
  }
  def removeTask(username: String, index: String): Boolean = {
      tasks(username) = tasks(username).-(index)
      true
  }

}
