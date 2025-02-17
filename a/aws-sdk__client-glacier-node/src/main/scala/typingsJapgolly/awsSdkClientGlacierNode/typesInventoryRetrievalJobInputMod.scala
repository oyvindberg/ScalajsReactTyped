package typingsJapgolly.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInventoryRetrievalJobInputMod {
  
  trait InventoryRetrievalJobInput extends StObject {
    
    /**
      * <p>The end of the date range in UTC for vault inventory retrieval that includes archives created before this date. This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.</p>
      */
    var EndDate: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specifies the maximum number of inventory items returned per vault inventory retrieval request. Valid values are greater than or equal to 1.</p>
      */
    var Limit: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use the marker in a new <b>InitiateJob</b> request to obtain additional inventory items. If there are no more inventory items, this value is <code>null</code>.</p>
      */
    var Marker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The start of the date range in UTC for vault inventory retrieval that includes archives created on or after this date. This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.</p>
      */
    var StartDate: js.UndefOr[String] = js.undefined
  }
  object InventoryRetrievalJobInput {
    
    inline def apply(): InventoryRetrievalJobInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InventoryRetrievalJobInput]
    }
    
    extension [Self <: InventoryRetrievalJobInput](x: Self) {
      
      inline def setEndDate(value: String): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
      
      inline def setLimit(value: String): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
      
      inline def setStartDate(value: String): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    }
  }
  
  type UnmarshalledInventoryRetrievalJobInput = InventoryRetrievalJobInput
}
