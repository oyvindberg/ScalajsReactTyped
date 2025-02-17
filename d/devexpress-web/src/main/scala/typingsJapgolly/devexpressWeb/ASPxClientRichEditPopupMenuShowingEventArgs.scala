package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.PopupMenuShowing event.
  */
trait ASPxClientRichEditPopupMenuShowingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    */
  var menuItems: ASPxClientRichEditPopupMenuItemCollection
}
object ASPxClientRichEditPopupMenuShowingEventArgs {
  
  inline def apply(cancel: Boolean, menuItems: ASPxClientRichEditPopupMenuItemCollection): ASPxClientRichEditPopupMenuShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditPopupMenuShowingEventArgs]
  }
  
  extension [Self <: ASPxClientRichEditPopupMenuShowingEventArgs](x: Self) {
    
    inline def setMenuItems(value: ASPxClientRichEditPopupMenuItemCollection): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
  }
}
