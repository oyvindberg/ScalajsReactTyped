package typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod

import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter[T] extends StObject {
  
  def emit(): CustomEvent = js.native
  def emit(data: T): CustomEvent = js.native
}
