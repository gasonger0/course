
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import scala.collection.mutable

object todoList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[mutable.Map[String, List[String]],RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(tasks: mutable.Map[String, List[String]])(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.91*/("""

"""),_display_(/*4.2*/main("TODO List")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
    """),format.raw/*5.5*/("""<h2>Список задач</h2>
    <ul>
        """),_display_(/*7.10*/for((key, task) <- tasks) yield /*7.35*/{_display_(Seq[Any](format.raw/*7.36*/("""
            """),format.raw/*8.13*/("""<li>"""),_display_(/*8.18*/key),format.raw/*8.21*/("""
            """),format.raw/*9.13*/("""<form method="post" action=""""),_display_(/*9.42*/routes/*9.48*/.TodoList.removeTask),format.raw/*9.68*/("""">
                """),_display_(/*10.18*/helper/*10.24*/.CSRF.formField),format.raw/*10.39*/("""
            """),format.raw/*11.13*/("""<input type="hidden" name="id" value=""""),_display_(/*11.52*/key),format.raw/*11.55*/("""">
            <button type="submit">Удалить заметку</button>
            </form>
            <br>
                """),_display_(/*15.18*/for((i, tag) <- task.zipWithIndex) yield /*15.52*/{_display_(Seq[Any](format.raw/*15.53*/("""
                    """),_display_(/*16.22*/tag),format.raw/*16.25*/(""" """),format.raw/*16.26*/("""- """),_display_(/*16.29*/i),format.raw/*16.30*/("""
                """)))}),format.raw/*17.18*/("""
            """),format.raw/*18.13*/("""</li>
        """)))}),format.raw/*19.10*/("""

                """),format.raw/*26.26*/("""
    """),format.raw/*27.5*/("""</ul>

    <form method="post" action=""""),_display_(/*29.34*/routes/*29.40*/.TodoList.addTask),format.raw/*29.57*/("""">
        """),_display_(/*30.10*/helper/*30.16*/.CSRF.formField),format.raw/*30.31*/("""
        """),format.raw/*31.9*/("""<label for="title">
            Задача:
        </label>
        <textarea name="title"></textarea>
        <br>
        <label for="tags">Теги</label>
        <br>
        <input  type="checkbox" value="a" name="tags">
        <input  type="checkbox" value="b" name="tags">
        <button type="submit">отправить</button>
        <br>
        <a href=""""),_display_(/*42.19*/routes/*42.25*/.TodoList.logout),format.raw/*42.41*/("""">Выйти из системы</a>
    </form>
""")))}))
      }
    }
  }

  def render(tasks:mutable.Map[String, List[String]],request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(tasks)(request,flash)

  def f:((mutable.Map[String, List[String]]) => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => (request,flash) => apply(tasks)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/todoList.scala.html
                  HASH: 26e8f4e102abc8922ed80a4c741ba7d5f3852f68
                  MATRIX: 432->1|818->35|1002->124|1032->129|1057->146|1096->148|1128->154|1196->196|1236->221|1274->222|1315->236|1346->241|1369->244|1410->258|1465->287|1479->293|1519->313|1567->334|1582->340|1618->355|1660->369|1726->408|1750->411|1897->531|1947->565|1986->566|2036->589|2060->592|2089->593|2119->596|2141->597|2191->616|2233->630|2280->646|2328->948|2361->954|2430->996|2445->1002|2483->1019|2523->1032|2538->1038|2574->1053|2611->1063|3004->1429|3019->1435|3056->1451
                  LINES: 17->1|22->2|27->2|29->4|29->4|29->4|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|40->15|40->15|40->15|41->16|41->16|41->16|41->16|41->16|42->17|43->18|44->19|46->26|47->27|49->29|49->29|49->29|50->30|50->30|50->30|51->31|62->42|62->42|62->42
                  -- GENERATED --
              */
          