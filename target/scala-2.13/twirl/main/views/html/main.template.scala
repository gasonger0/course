
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
        <script type="module" src=""""),_display_(/*9.37*/routes/*9.43*/.Assets.at("javascripts/index-BM2k83wn.js ")),format.raw/*9.87*/(""""></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.at("stylesheets/index-Bc8PjVbA.css")),format.raw/*10.104*/("""">
"""),format.raw/*11.109*/("""
    """),format.raw/*12.5*/("""</head>
    <body>
        """),_display_(/*14.10*/flash/*14.15*/.get("msg")),format.raw/*14.26*/("""
        """),format.raw/*16.32*/("""
        """),_display_(/*17.10*/content),format.raw/*17.17*/("""

"""),format.raw/*19.105*/("""
    """),format.raw/*20.5*/("""</body>
    <script>
        document.addEventListener("DOMContentLoaded", function() """),format.raw/*22.66*/("""{"""),format.raw/*22.67*/("""
            """),format.raw/*23.13*/("""let msg = """"),_display_(/*23.25*/flash/*23.30*/.get("msg")),format.raw/*23.41*/("""";
            if ( msg != "" ) localStorage.msg = msg
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/(""")
    </script>
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
                  HASH: 15624bdc92deeabe4b0349ba27f0da6ae20d9933
                  MATRIX: 739->3|887->56|917->60|999->168|1035->178|1069->186|1094->191|1166->237|1180->243|1244->287|1337->353|1352->359|1418->403|1451->515|1484->521|1541->551|1555->556|1587->567|1625->668|1663->679|1691->686|1724->794|1757->800|1873->888|1902->889|1944->903|1983->915|1997->920|2029->931|2121->996|2150->997
                  LINES: 21->2|26->2|28->4|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|36->12|38->14|38->14|38->14|39->16|40->17|40->17|42->19|43->20|45->22|45->22|46->23|46->23|46->23|46->23|48->25|48->25
                  -- GENERATED --
              */
          