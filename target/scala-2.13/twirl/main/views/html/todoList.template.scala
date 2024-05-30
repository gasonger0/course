
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

object todoList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[String],RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tasks: Seq[String])(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),_display_(/*3.2*/main("TODO List")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<h2>Список задач</h2>
    <ul>
        """),_display_(/*6.10*/for((task, i) <- tasks.zipWithIndex) yield /*6.46*/{_display_(Seq[Any](format.raw/*6.47*/("""
            """),format.raw/*7.13*/("""<li>"""),_display_(/*7.18*/task),format.raw/*7.22*/("""</li>
            <form method="post" action=""""),_display_(/*8.42*/routes/*8.48*/.TodoList.removeTask),format.raw/*8.68*/("""">
                """),_display_(/*9.18*/helper/*9.24*/.CSRF.formField),format.raw/*9.39*/("""
                """),format.raw/*10.17*/("""<input type="hidden" name="id" value=""""),_display_(/*10.56*/i),format.raw/*10.57*/("""">
                <button type="submit">Удалить заметку</button>
            </form>
        """)))}),format.raw/*13.10*/("""
    """),format.raw/*14.5*/("""</ul>

    <form method="post" action=""""),_display_(/*16.34*/routes/*16.40*/.TodoList.addTask),format.raw/*16.57*/("""">
        """),_display_(/*17.10*/helper/*17.16*/.CSRF.formField),format.raw/*17.31*/("""
        """),format.raw/*18.9*/("""<label for="task">
            Задача:
        </label>
        <textarea name="task"></textarea>
        <br>
        <button type="submit">отправить</button>
        <br>
        <a href=""""),_display_(/*25.19*/routes/*25.25*/.TodoList.logout),format.raw/*25.41*/("""">Выйти из системы</a>
    </form>
""")))}))
      }
    }
  }

  def render(tasks:Seq[String],request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(tasks)(request,flash)

  def f:((Seq[String]) => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => (request,flash) => apply(tasks)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/todoList.scala.html
                  HASH: b050bd78b83d861a211f2d59741503cea78ba14d
                  MATRIX: 757->1|919->68|949->73|974->90|1013->92|1045->98|1113->140|1164->176|1202->177|1243->191|1274->196|1298->200|1372->248|1386->254|1426->274|1473->295|1487->301|1522->316|1568->334|1634->373|1656->374|1785->472|1818->478|1887->520|1902->526|1940->543|1980->556|1995->562|2031->577|2068->587|2293->785|2308->791|2345->807
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|38->13|39->14|41->16|41->16|41->16|42->17|42->17|42->17|43->18|50->25|50->25|50->25
                  -- GENERATED --
              */
          