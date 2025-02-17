package typingsJapgolly.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableCollection.toJSON()`. */
trait TableCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TableData]] = js.undefined
}
object TableCollectionData {
  
  inline def apply(): TableCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCollectionData]
  }
  
  extension [Self <: TableCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[TableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TableData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
