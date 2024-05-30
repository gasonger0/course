package models

import scala.collection.mutable

object TodoListModel {
  private val users = mutable.Map[String, String]("M" -> "1")
  private val tasks = mutable.Map[String, List[String]]("M" -> List("a", "b"))

  def validateUser(username: String, password: String): Boolean = {
    users.get(username).map(_ == password).getOrElse(false)
  }
  def createUser(username: String, password: String): Boolean = {
    if (users.contains(username)) false else {
      users(username) = password
      true
    }
  }
  def getTasks(username: String): Seq[String] =  {
    tasks.get(username).getOrElse(Nil)
  }
  def addTask(username: String, task: String): Unit = {
    tasks(username) = task :: tasks.get(username).getOrElse(Nil)
  }
  def removeTask(username: String, index: Int): Boolean = {
    if (index < 0 || tasks.get(username).isEmpty || index >= tasks(username).length) false
    tasks(username) = tasks(username).patch(index, Nil, 1)
    true
  }

}
