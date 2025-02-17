package typingsJapgolly.kendoUi.kendo.data

import typingsJapgolly.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Binder
  extends StObject
     with Class {
  
  def bind(binding: Binding, attribute: String): Unit = js.native
  
  var bindings: Bindings = js.native
  
  def destroy(): Unit = js.native
  
  var element: Any = js.native
  
  def init(element: Any, bindings: Bindings): Unit = js.native
  def init(element: Any, bindings: Bindings, options: BinderOptions): Unit = js.native
  
  var options: BinderOptions = js.native
  
  def refresh(): Unit = js.native
  def refresh(attribute: String): Unit = js.native
}
