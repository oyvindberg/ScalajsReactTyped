package typingsJapgolly.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the collection of custom properties.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait CustomPropertyCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The key of the custom property. The key is limited to 255 characters outside of Excel on the web (larger keys are automatically trimmed to 255 characters on other platforms).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var key: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The type of the value used for the custom property.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The value of the custom property. The value is limited to 255 characters outside of Excel on the web (larger values are automatically trimmed to 255 characters on other platforms).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object CustomPropertyCollectionLoadOptions {
  
  inline def apply(): CustomPropertyCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyCollectionLoadOptions]
  }
  
  extension [Self <: CustomPropertyCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
