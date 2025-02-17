package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartLegendEntryCollection.toJSON()`. */
trait ChartLegendEntryCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartLegendEntryData]] = js.undefined
}
object ChartLegendEntryCollectionData {
  
  inline def apply(): ChartLegendEntryCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendEntryCollectionData]
  }
  
  extension [Self <: ChartLegendEntryCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[ChartLegendEntryData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ChartLegendEntryData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
