package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineCategoryAxisItemNotesDataItemLine extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object SparklineCategoryAxisItemNotesDataItemLine {
  
  inline def apply(): SparklineCategoryAxisItemNotesDataItemLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineCategoryAxisItemNotesDataItemLine]
  }
  
  extension [Self <: SparklineCategoryAxisItemNotesDataItemLine](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
