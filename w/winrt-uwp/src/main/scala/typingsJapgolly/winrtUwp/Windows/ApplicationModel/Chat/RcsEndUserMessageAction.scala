package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the actions to which the user can respond. */
trait RcsEndUserMessageAction extends StObject {
  
  /** Gets the label of the action. */
  var label: String
}
object RcsEndUserMessageAction {
  
  inline def apply(label: String): RcsEndUserMessageAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessageAction]
  }
  
  extension [Self <: RcsEndUserMessageAction](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
