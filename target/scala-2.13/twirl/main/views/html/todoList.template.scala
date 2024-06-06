
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

object todoList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),_display_(/*3.2*/main("TODO List")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
"""),format.raw/*4.30*/("""
"""),format.raw/*5.13*/("""
"""),format.raw/*6.40*/("""
"""),format.raw/*7.25*/("""
"""),format.raw/*8.74*/("""
"""),format.raw/*9.43*/("""
"""),format.raw/*10.61*/("""
"""),format.raw/*11.63*/("""
"""),format.raw/*12.24*/("""
"""),format.raw/*13.21*/("""
"""),format.raw/*14.57*/("""
"""),format.raw/*15.34*/("""
"""),format.raw/*16.22*/("""
"""),format.raw/*17.22*/("""
"""),format.raw/*18.14*/("""

"""),format.raw/*20.39*/("""
"""),format.raw/*21.78*/("""
"""),format.raw/*22.43*/("""
"""),format.raw/*23.63*/("""
"""),format.raw/*24.67*/("""
"""),format.raw/*25.28*/("""
"""),format.raw/*26.14*/("""

"""),format.raw/*28.63*/("""
"""),format.raw/*29.35*/("""
"""),format.raw/*30.32*/("""
"""),format.raw/*31.24*/("""
"""),format.raw/*32.21*/("""
"""),format.raw/*33.47*/("""
"""),format.raw/*34.17*/("""
"""),format.raw/*35.43*/("""
"""),format.raw/*36.17*/("""
"""),format.raw/*37.59*/("""
"""),format.raw/*38.59*/("""
"""),format.raw/*39.53*/("""
"""),format.raw/*40.17*/("""
"""),format.raw/*41.71*/("""
"""),format.raw/*42.16*/("""
""")))}),format.raw/*43.2*/("""
"""),format.raw/*44.1*/("""<div id="todo">

</div>"""))
      }
    }
  }

  def render(request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(request,flash)

  def f:(() => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (request,flash) => apply()(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/todoList.scala.html
                  HASH: b738151a3d0124f44365beafd254496420ccd199
                  MATRIX: 745->1|889->50|919->55|944->72|983->74|1012->105|1041->119|1070->160|1099->186|1128->261|1157->305|1187->367|1217->431|1247->456|1277->478|1307->536|1337->571|1367->594|1397->617|1427->632|1459->674|1489->753|1519->797|1549->861|1579->929|1609->958|1639->973|1671->1039|1701->1075|1731->1108|1761->1133|1791->1155|1821->1203|1851->1221|1881->1265|1911->1283|1941->1343|1971->1403|2001->1457|2031->1475|2061->1547|2091->1564|2124->1567|2153->1569
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|30->5|31->6|32->7|33->8|34->9|35->10|36->11|37->12|38->13|39->14|40->15|41->16|42->17|43->18|45->20|46->21|47->22|48->23|49->24|50->25|51->26|53->28|54->29|55->30|56->31|57->32|58->33|59->34|60->35|61->36|62->37|63->38|64->39|65->40|66->41|67->42|68->43|69->44
                  -- GENERATED --
              */
          