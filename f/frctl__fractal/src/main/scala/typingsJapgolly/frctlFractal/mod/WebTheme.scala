package typingsJapgolly.frctlFractal.mod

import typingsJapgolly.frctlFractal.anon.Handle
import typingsJapgolly.frctlFractal.anon.Mount
import typingsJapgolly.frctlFractal.anon.Params
import typingsJapgolly.frctlFractal.anon.Path
import typingsJapgolly.frctlFractal.frctlFractalBooleans.`false`
import typingsJapgolly.frctlFractal.frctlFractalStrings.favicon
import typingsJapgolly.frctlFractal.frctlFractalStrings.format
import typingsJapgolly.frctlFractal.frctlFractalStrings.lang
import typingsJapgolly.frctlFractal.frctlFractalStrings.nav
import typingsJapgolly.frctlFractal.frctlFractalStrings.panels
import typingsJapgolly.frctlFractal.frctlFractalStrings.rtl
import typingsJapgolly.frctlFractal.frctlFractalStrings.scripts
import typingsJapgolly.frctlFractal.frctlFractalStrings.skin
import typingsJapgolly.frctlFractal.frctlFractalStrings.static
import typingsJapgolly.frctlFractal.frctlFractalStrings.staticDotmount
import typingsJapgolly.frctlFractal.frctlFractalStrings.styles
import typingsJapgolly.frctlFractal.frctlFractalStrings.version
import typingsJapgolly.frctlFractal.mod.fractal.core.mixins.ConfigurableEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "WebTheme")
@js.native
open class WebTheme protected () extends ConfigurableEmitter[WebThemeOptions] {
  def this(viewPaths: js.Array[String]) = this()
  def this(viewPaths: js.Array[String], options: WebThemeOptions) = this()
  
  def addLoadPath(path: String): this.type = js.native
  
  def addResolver(handle: String, resolvers: Any): this.type = js.native
  
  def addRoute(path: String, opts: Handle): this.type = js.native
  def addRoute(path: String, opts: Handle, resolver: Any): this.type = js.native
  
  def addStatic(path: String, mount: String): Unit = js.native
  
  def errorView(): String = js.native
  
  @JSName("getOption")
  def getOption_favicon(key: favicon): js.UndefOr[String] = js.native
  @JSName("getOption")
  def getOption_format(key: format): js.UndefOr[String] = js.native
  @JSName("getOption")
  def getOption_lang(key: lang): js.UndefOr[String] = js.native
  @JSName("getOption")
  def getOption_nav(key: nav): js.UndefOr[js.Array[String]] = js.native
  @JSName("getOption")
  def getOption_panels(key: panels): js.UndefOr[js.Array[String]] = js.native
  @JSName("getOption")
  def getOption_rtl(key: rtl): Boolean = js.native
  @JSName("getOption")
  def getOption_scripts(key: scripts): js.UndefOr[js.Array[String]] = js.native
  @JSName("getOption")
  def getOption_skin(key: skin): js.UndefOr[String] = js.native
  @JSName("getOption")
  def getOption_static(key: static): js.UndefOr[Mount] = js.native
  @JSName("getOption")
  def getOption_staticmount(key: staticDotmount): String = js.native
  @JSName("getOption")
  def getOption_styles(key: styles): js.UndefOr[js.Array[String]] = js.native
  @JSName("getOption")
  def getOption_version(key: version): js.UndefOr[String] = js.native
  
  def loadPaths(): js.Array[String] = js.native
  
  def matchRoute(urlPath: String): Params | `false` = js.native
  
  def options(): WebThemeOptions = js.native
  def options(value: WebThemeOptions): this.type = js.native
  
  def redirectView(): String = js.native
  
  def resolvers(): Any = js.native
  
  def routes(): js.Array[Any] = js.native
  
  def setErrorView(view: String): Unit = js.native
  
  @JSName("setOption")
  def setOption_favicon(key: favicon): this.type = js.native
  @JSName("setOption")
  def setOption_favicon(key: favicon, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_format(key: format): this.type = js.native
  @JSName("setOption")
  def setOption_format(key: format, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_lang(key: lang): this.type = js.native
  @JSName("setOption")
  def setOption_lang(key: lang, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_nav(key: nav): this.type = js.native
  @JSName("setOption")
  def setOption_nav(key: nav, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_panels(key: panels): this.type = js.native
  @JSName("setOption")
  def setOption_panels(key: panels, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_rtl(key: rtl, value: Boolean): this.type = js.native
  @JSName("setOption")
  def setOption_scripts(key: scripts): this.type = js.native
  @JSName("setOption")
  def setOption_scripts(key: scripts, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_skin(key: skin): this.type = js.native
  @JSName("setOption")
  def setOption_skin(key: skin, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_static(key: static): this.type = js.native
  @JSName("setOption")
  def setOption_static(key: static, value: Mount): this.type = js.native
  @JSName("setOption")
  def setOption_staticmount(key: staticDotmount, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_styles(key: styles): this.type = js.native
  @JSName("setOption")
  def setOption_styles(key: styles, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_version(key: version): this.type = js.native
  @JSName("setOption")
  def setOption_version(key: version, value: String): this.type = js.native
  
  def setRedirectView(view: String): Unit = js.native
  
  def static(): js.Array[Path] = js.native
  
  def urlFromRoute(handle: String, params: Any): String | Null = js.native
  def urlFromRoute(handle: String, params: Any, noRedirect: Boolean): String | Null = js.native
}
