package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagOptionsInput extends StObject {
  
  /**
    * The search filters. If no search filters are specified, the output includes all TagOptions.
    */
  var Filters: js.UndefOr[ListTagOptionsFilters] = js.undefined
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.PageSize] = js.undefined
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.PageToken] = js.undefined
}
object ListTagOptionsInput {
  
  inline def apply(): ListTagOptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagOptionsInput]
  }
  
  extension [Self <: ListTagOptionsInput](x: Self) {
    
    inline def setFilters(value: ListTagOptionsFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
  }
}
