package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheetCustomPropertyCollection.toJSON()`. */
trait WorksheetCustomPropertyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[WorksheetCustomPropertyData]] = js.undefined
}
object WorksheetCustomPropertyCollectionData {
  
  inline def apply(): WorksheetCustomPropertyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCustomPropertyCollectionData]
  }
  
  extension [Self <: WorksheetCustomPropertyCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[WorksheetCustomPropertyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: WorksheetCustomPropertyData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
