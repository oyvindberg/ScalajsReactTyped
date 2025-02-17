package typingsJapgolly.jqueryNoty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Noty extends StObject {
  
  def apply(notyOptions: NotyOptions): Any = js.native
  
  def close(): Any = js.native
  
  var closed: Boolean = js.native
  
  def setText(text: String): Any = js.native
  
  def setTimeout(timeout: Double): Any = js.native
  
  def setType(`type`: String): Any = js.native
  
  def show(): Any = js.native
  
  var shown: Boolean = js.native
}
