
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
    """),format.raw/*5.5*/("""<div id="login"></div>
    <script>
        // Передача токена CSRF для передачи во фронтенд
        let str = `"""),_display_(/*8.21*/helper/*8.27*/.CSRF.formField),format.raw/*8.42*/("""`
        let parser = new DOMParser();
        localStorage.csrf = parser.parseFromString(str, "text/html").querySelector("input").value
        delete parser
        delete str
    </script>
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
                  HASH: 5f43342fe07c16adba1aa9b100b362fa41a1e260
                  MATRIX: 758->23|902->72|932->77|953->90|992->92|1024->98|1166->214|1180->220|1215->235
                  LINES: 21->2|26->2|28->4|28->4|28->4|29->5|32->8|32->8|32->8
                  -- GENERATED --
              */
          