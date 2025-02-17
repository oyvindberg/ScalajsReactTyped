package typingsJapgolly.kolite

import typingsJapgolly.kolite.anon.Opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KoLiteActivity extends StObject {
  
  def apply(options: KoLiteActivityOptions): JQuery = js.native
  
  var defaults: KoLiteActivityOptions = js.native
  
  def getOpacity(options: Opacity, i: Double): Double = js.native
}
