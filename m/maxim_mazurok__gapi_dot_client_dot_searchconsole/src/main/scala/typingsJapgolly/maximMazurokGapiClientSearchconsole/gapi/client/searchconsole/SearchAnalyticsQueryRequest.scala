package typingsJapgolly.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAnalyticsQueryRequest extends StObject {
  
  /**
    * [Optional; Default is \"auto\"] How data is aggregated. If aggregated by property, all data for the same property is aggregated; if aggregated by page, all data is aggregated by
    * canonical URI. If you filter or group by page, choose AUTO; otherwise you can aggregate either by property or by page, depending on how you want your data calculated; see the help
    * documentation to learn how data is calculated differently by site versus by page. **Note:** If you group or filter by page, you cannot aggregate by property. If you specify any
    * value other than AUTO, the aggregation type in the result will match the requested type, or if you request an invalid type, you will get an error. The API will never change your
    * aggregation type if the requested type is invalid.
    */
  var aggregationType: js.UndefOr[String] = js.undefined
  
  /** The data state to be fetched, can be full or all, the latter including full and partial data. */
  var dataState: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] Zero or more filters to apply to the dimension grouping values; for example, 'query contains \"buy\"' to see only data where the query string contains the substring
    * \"buy\" (not case-sensitive). You can filter by a dimension without grouping by it.
    */
  var dimensionFilterGroups: js.UndefOr[js.Array[ApiDimensionFilterGroup]] = js.undefined
  
  /**
    * [Optional] Zero or more dimensions to group results by. Dimensions are the group-by values in the Search Analytics page. Dimensions are combined to create a unique row key for each
    * row. Results are grouped in the order that you supply these dimensions.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** [Required] End date of the requested date range, in YYYY-MM-DD format, in PST (UTC - 8:00). Must be greater than or equal to the start date. This value is included in the range. */
  var endDate: js.UndefOr[String] = js.undefined
  
  /** [Optional; Default is 1000] The maximum number of rows to return. Must be a number from 1 to 25,000 (inclusive). */
  var rowLimit: js.UndefOr[Double] = js.undefined
  
  /** [Optional; Default is \"web\"] The search type to filter for. */
  var searchType: js.UndefOr[String] = js.undefined
  
  /** [Required] Start date of the requested date range, in YYYY-MM-DD format, in PST time (UTC - 8:00). Must be less than or equal to the end date. This value is included in the range. */
  var startDate: js.UndefOr[String] = js.undefined
  
  /** [Optional; Default is 0] Zero-based index of the first row in the response. Must be a non-negative number. */
  var startRow: js.UndefOr[Double] = js.undefined
  
  /** Optional. [Optional; Default is \"web\"] Type of report: search type, or either Discover or Gnews. */
  var `type`: js.UndefOr[String] = js.undefined
}
object SearchAnalyticsQueryRequest {
  
  inline def apply(): SearchAnalyticsQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAnalyticsQueryRequest]
  }
  
  extension [Self <: SearchAnalyticsQueryRequest](x: Self) {
    
    inline def setAggregationType(value: String): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    inline def setAggregationTypeUndefined: Self = StObject.set(x, "aggregationType", js.undefined)
    
    inline def setDataState(value: String): Self = StObject.set(x, "dataState", value.asInstanceOf[js.Any])
    
    inline def setDataStateUndefined: Self = StObject.set(x, "dataState", js.undefined)
    
    inline def setDimensionFilterGroups(value: js.Array[ApiDimensionFilterGroup]): Self = StObject.set(x, "dimensionFilterGroups", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterGroupsUndefined: Self = StObject.set(x, "dimensionFilterGroups", js.undefined)
    
    inline def setDimensionFilterGroupsVarargs(value: ApiDimensionFilterGroup*): Self = StObject.set(x, "dimensionFilterGroups", js.Array(value*))
    
    inline def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setRowLimit(value: Double): Self = StObject.set(x, "rowLimit", value.asInstanceOf[js.Any])
    
    inline def setRowLimitUndefined: Self = StObject.set(x, "rowLimit", js.undefined)
    
    inline def setSearchType(value: String): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
    
    inline def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    inline def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
