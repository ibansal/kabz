
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Bar],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: play.data.Form[Bar]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),_display_(/*3.2*/main("Welcome to Play 2.0")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""

    """),format.raw/*5.5*/("""<script src=""""),_display_(/*5.19*/routes/*5.25*/.Assets.at("javascripts/index.js")),format.raw/*5.59*/("""" type="text/javascript"></script>

    <ul id="bars"></ul>

    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.Application.addBar)/*9.53*/ {_display_(Seq[Any](format.raw/*9.55*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(form("name"))),format.raw/*10.40*/("""
        """),format.raw/*11.9*/("""<input type="submit"/>
    """)))}),format.raw/*12.6*/("""

""")))}))}
  }

  def render(form:play.data.Form[Bar]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((play.data.Form[Bar]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Dec 02 11:15:29 IST 2014
                  SOURCE: /Users/ishan/work/activator-1.2.10-minimal/kabz/app/views/index.scala.html
                  HASH: 6a5cfdc0cfdb04ea8ec5be8f766e7d9e56157118
                  MATRIX: 736->1|851->28|879->31|914->58|953->60|985->66|1025->80|1039->86|1093->120|1184->186|1198->192|1247->233|1286->235|1323->245|1338->251|1383->275|1419->284|1477->312
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|37->9|37->9|37->9|37->9|38->10|38->10|38->10|39->11|40->12
                  -- GENERATED --
              */
          