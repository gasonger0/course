
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String)(content: Html)(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.55*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*7.62*/("""
        """),format.raw/*8.9*/("""<title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
"""),format.raw/*9.107*/("""
"""),format.raw/*10.110*/("""

    """),format.raw/*12.5*/("""</head>
    <body>
        """),_display_(/*14.10*/flash/*14.15*/.get("msg")),format.raw/*14.26*/("""
        """),format.raw/*16.32*/("""
        """),_display_(/*17.10*/content),format.raw/*17.17*/("""

"""),format.raw/*19.105*/("""
    """),format.raw/*20.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(flash)

  def f:((String) => (Html) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (flash) => apply(title)(content)(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 295a7cfb2ecdc354e79b84d15c7778a98d71d0d1
                  MATRIX: 739->3|887->56|917->60|999->168|1035->178|1069->186|1094->191|1132->307|1163->418|1198->426|1255->456|1269->461|1301->472|1339->573|1377->584|1405->591|1438->699|1471->705
                  LINES: 21->2|26->2|28->4|31->7|32->8|32->8|32->8|33->9|34->10|36->12|38->14|38->14|38->14|39->16|40->17|40->17|42->19|43->20
                  -- GENERATED --
              */
          