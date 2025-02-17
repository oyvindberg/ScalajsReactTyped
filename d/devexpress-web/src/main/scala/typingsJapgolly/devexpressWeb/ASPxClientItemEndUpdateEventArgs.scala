package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemEndUpdate event.
  */
trait ASPxClientItemEndUpdateEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the component name of the dashboard item.
    */
  var ItemName: String
}
object ASPxClientItemEndUpdateEventArgs {
  
  inline def apply(ItemName: String): ASPxClientItemEndUpdateEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientItemEndUpdateEventArgs]
  }
  
  extension [Self <: ASPxClientItemEndUpdateEventArgs](x: Self) {
    
    inline def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
