package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientCardViewFocusedCellChangingEventArgs")
@js.native
open class ASPxClientCardViewFocusedCellChangingEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientCardViewFocusedCellChangingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewFocusedCellChangingEventArgs class with specified settings.
    * @param cellInfo A ASPxClientCardViewCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: typingsJapgolly.devexpressWeb.ASPxClientCardViewCellInfo) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides information of a card's cell currently being focused.
    */
  /* CompleteClass */
  var cellInfo: typingsJapgolly.devexpressWeb.ASPxClientCardViewCellInfo = js.native
}
