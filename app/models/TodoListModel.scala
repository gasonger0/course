package models

import scala.collection.mutable

object TodoListModel {
  private val users = mutable.Map[String, String]("M" -> "1")

  private val tasks = mutable.Map[                       // username -> (title -> (tag2, tag2), title2 -> (tag1, tag3))
    String, mutable.Map[
        String, mutable.Map[String, List[String]]
    ]
  ]("M" -> mutable.Map(
      "a" -> mutable.Map(
        "desc" -> List("Test desc"),
        "tags" -> List("red", "green")),
      "b" -> mutable.Map(
        "desc" -> List("Test desc"),
        "tags" -> List("blue", "white"))
  ))

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
      String, mutable.Map[String, List[String]]
    ] =  {
    tasks.get(username).getOrElse(mutable.Map.empty)
  }

  def addTask(username: String, title: String, desc: String, tags: List[String]): Unit = {
    tasks(username)(title) = mutable.Map("desc" -> List(desc), "tags" -> tags)
  }

  def removeTask(username: String, index: String): Boolean = {
      tasks(username) = tasks(username).-(index)
      true
  }

  def changeTags(username: String, name: String, tags: Seq[String]): Boolean = {
    tasks(username)(name)("tags") = tags.toList
    true
  }
}
