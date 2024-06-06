
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
        <script type="module" src=""""),_display_(/*9.37*/routes/*9.43*/.Assets.at("javascripts/index-CelVY5EL.js")),format.raw/*9.86*/(""""></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.at("stylesheets/index-Bift9DB3.css")),format.raw/*10.104*/("""">
"""),format.raw/*11.109*/("""
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
                  HASH: cdc4745b1cb22903bd9589fc1223a41935173491
                  MATRIX: 739->3|887->56|917->60|999->168|1035->178|1069->186|1094->191|1166->237|1180->243|1243->286|1336->352|1351->358|1417->402|1450->514|1483->520|1540->550|1554->555|1586->566|1624->667|1662->678|1690->685|1723->793|1756->799
                  LINES: 21->2|26->2|28->4|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|36->12|38->14|38->14|38->14|39->16|40->17|40->17|42->19|43->20
                  -- GENERATED --
              */
          