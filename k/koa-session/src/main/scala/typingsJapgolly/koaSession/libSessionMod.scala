package typingsJapgolly.koaSession

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.koaSession.mod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSessionMod extends Shortcut {
  
  @JSImport("koa-session/lib/session", JSImport.Namespace)
  @js.native
  val ^ : Session = js.native
  
  type _To = Session
  
  /* This means you don't have to write `^`, but can instead just say `libSessionMod.foo` */
  override def _to: Session = ^
}
