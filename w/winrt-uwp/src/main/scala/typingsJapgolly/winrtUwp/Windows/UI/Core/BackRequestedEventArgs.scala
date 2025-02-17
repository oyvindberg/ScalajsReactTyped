package typingsJapgolly.winrtUwp.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides event data for the SystemNavigationManager.BackRequested event. */
trait BackRequestedEventArgs extends StObject {
  
  /** Gets or sets a value that indicates whether the app performed the requested back-navigation. */
  var handled: Boolean
}
object BackRequestedEventArgs {
  
  inline def apply(handled: Boolean): BackRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackRequestedEventArgs]
  }
  
  extension [Self <: BackRequestedEventArgs](x: Self) {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
