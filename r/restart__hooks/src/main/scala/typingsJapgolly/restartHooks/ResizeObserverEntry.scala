package typingsJapgolly.restartHooks

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserverEntry
  extends StObject
     with /**
  * @param target The Element whose size has changed.
  */
Instantiable1[/* target */ Element, Any] {
  
  /**
    * Element's content rect when ResizeObserverCallback is invoked.
    */
  val contentRect: DOMRectReadOnly = js.native
  
  /**
    * The Element whose size has changed.
    */
  val target: Element = js.native
}
