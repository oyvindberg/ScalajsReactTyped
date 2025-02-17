package typingsJapgolly.frctlFractal.mod

import typingsJapgolly.frctlFractal.mod.fractal.core.mixins.ConfigurableEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "CliTheme")
@js.native
open class CliTheme () extends ConfigurableEmitter[CliThemeConfig] {
  def this(config: CliThemeConfig) = this()
  
  def delimiter(): String = js.native
  
  def format(str: String): String = js.native
  def format(str: String, style: String): String = js.native
  def format(str: String, style: String, strip: Boolean): String = js.native
  def format(str: String, style: Unit, strip: Boolean): String = js.native
  
  def setDelimiter(text: String, formatter: js.Function1[/* str */ String, String]): Unit = js.native
  
  def setStyle(name: String, opts: Any): Unit = js.native
  
  def style(name: String): Any = js.native
}
