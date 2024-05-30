
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* login Template */
  def apply/*2.2*/()(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.51*/("""

"""),_display_(/*4.2*/main("Login")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
    """),format.raw/*5.5*/("""<h2>Вход в систему</h2>

    <form method="post" action=""""),_display_(/*7.34*/routes/*7.40*/.TodoList.validateLogin),format.raw/*7.63*/("""">
        """),_display_(/*8.10*/helper/*8.16*/.CSRF.formField),format.raw/*8.31*/("""
        """),format.raw/*9.9*/("""<label for="username">Имя пользователя:</label>
        <input name="username">
        <label for="password">Пароль:</label>
        <input name="password">
        <button type="submit">Отправить</button>
    </form>
    <br>
    <h2>Регистрация</h2>
    <form method="post" action=""""),_display_(/*17.34*/routes/*17.40*/.TodoList.createUser),format.raw/*17.60*/("""">
        """),_display_(/*18.10*/helper/*18.16*/.CSRF.formField),format.raw/*18.31*/("""
        """),format.raw/*19.9*/("""<label for="username">Имя пользователя:</label>
        <input name="username">
        <label for="password">Пароль:</label>
        <input name="password">
        <button type="submit">Отправить</button>
    </form>

    <a href=""""),_display_(/*26.15*/routes/*26.21*/.TodoList.logout),format.raw/*26.37*/("""">Выйти из системы</a>
""")))}))
      }
    }
  }

  def render(request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(request,flash)

  def f:(() => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (request,flash) => apply()(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: 582c8f85754b7de89da5b4eb90145f44bc408752
                  MATRIX: 758->23|902->72|932->77|953->90|992->92|1024->98|1110->158|1124->164|1167->187|1206->200|1220->206|1255->221|1291->231|1612->525|1627->531|1668->551|1708->564|1723->570|1759->585|1796->595|2064->836|2079->842|2116->858
                  LINES: 21->2|26->2|28->4|28->4|28->4|29->5|31->7|31->7|31->7|32->8|32->8|32->8|33->9|41->17|41->17|41->17|42->18|42->18|42->18|43->19|50->26|50->26|50->26
                  -- GENERATED --
              */
          