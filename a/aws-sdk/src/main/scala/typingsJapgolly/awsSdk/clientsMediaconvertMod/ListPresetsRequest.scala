package typingsJapgolly.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPresetsRequest extends StObject {
  
  /**
    * Optionally, specify a preset category to limit responses to only presets from that category.
    */
  var Category: js.UndefOr[string] = js.undefined
  
  /**
    * Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    */
  var ListBy: js.UndefOr[PresetListBy] = js.undefined
  
  /**
    * Optional. Number of presets, up to twenty, that will be returned at one time
    */
  var MaxResults: js.UndefOr[integerMin1Max20] = js.undefined
  
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of presets.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  var Order: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconvertMod.Order] = js.undefined
}
object ListPresetsRequest {
  
  inline def apply(): ListPresetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPresetsRequest]
  }
  
  extension [Self <: ListPresetsRequest](x: Self) {
    
    inline def setCategory(value: string): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setListBy(value: PresetListBy): Self = StObject.set(x, "ListBy", value.asInstanceOf[js.Any])
    
    inline def setListByUndefined: Self = StObject.set(x, "ListBy", js.undefined)
    
    inline def setMaxResults(value: integerMin1Max20): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrder(value: Order): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
  }
}
