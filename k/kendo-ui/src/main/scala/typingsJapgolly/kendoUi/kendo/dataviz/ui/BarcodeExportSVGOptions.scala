package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarcodeExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.undefined
}
object BarcodeExportSVGOptions {
  
  inline def apply(): BarcodeExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarcodeExportSVGOptions]
  }
  
  extension [Self <: BarcodeExportSVGOptions](x: Self) {
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
