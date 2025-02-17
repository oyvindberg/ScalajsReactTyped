package typingsJapgolly.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents UI states and behaviors associated with the device mode (Tablet or Desktop) and input device type. */
trait UIViewSettings extends StObject {
  
  /** Gets a value that indicates whether the device UI is optimized for touch input or mouse input. */
  var userInteractionMode: UserInteractionMode
}
object UIViewSettings {
  
  inline def apply(userInteractionMode: UserInteractionMode): UIViewSettings = {
    val __obj = js.Dynamic.literal(userInteractionMode = userInteractionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIViewSettings]
  }
  
  extension [Self <: UIViewSettings](x: Self) {
    
    inline def setUserInteractionMode(value: UserInteractionMode): Self = StObject.set(x, "userInteractionMode", value.asInstanceOf[js.Any])
  }
}
