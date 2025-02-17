package typingsJapgolly.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Filtering
trait FilterOptions extends StObject {
  
  /**
    * Determines whether the filter will apply in exclude mode or include mode.
    * The default is include, which means that you use the fields as part of a filter.
    * Exclude mode means that you include everything else except the specified fields.
    */
  var isExcludeMode: Boolean
}
object FilterOptions {
  
  inline def apply(isExcludeMode: Boolean): FilterOptions = {
    val __obj = js.Dynamic.literal(isExcludeMode = isExcludeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
  
  extension [Self <: FilterOptions](x: Self) {
    
    inline def setIsExcludeMode(value: Boolean): Self = StObject.set(x, "isExcludeMode", value.asInstanceOf[js.Any])
  }
}
