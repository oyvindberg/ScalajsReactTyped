package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiColumnComboBoxFilteringEvent
  extends StObject
     with MultiColumnComboBoxEvent {
  
  var filter: js.UndefOr[Any] = js.undefined
}
object MultiColumnComboBoxFilteringEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: MultiColumnComboBox): MultiColumnComboBoxFilteringEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiColumnComboBoxFilteringEvent]
  }
  
  extension [Self <: MultiColumnComboBoxFilteringEvent](x: Self) {
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
