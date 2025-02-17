package typingsJapgolly.pubsubJs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.pubsubJs.PubSubJS.Base
import typingsJapgolly.pubsubJs.PubSubJS.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("pubsub-js", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (Base[Any, Message]) = js.native
  
  type _To = js.Object & (Base[Any, Message])
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & (Base[Any, Message]) = ^
}
