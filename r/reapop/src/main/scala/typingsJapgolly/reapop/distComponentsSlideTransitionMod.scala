package typingsJapgolly.reapop

import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import typingsJapgolly.reapop.anon.Notification
import typingsJapgolly.reapop.reapopStrings.addEndListener
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsSlideTransitionMod {
  
  @JSImport("reapop/dist/components/SlideTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type Props = Notification & (Omit[TransitionProps[HTMLElement], addEndListener])
}
