package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultCounts extends StObject {
  
  /** Result count information for each source with results. */
  var sourceResultCounts: js.UndefOr[js.Array[SourceResultCount]] = js.undefined
}
object ResultCounts {
  
  inline def apply(): ResultCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultCounts]
  }
  
  extension [Self <: ResultCounts](x: Self) {
    
    inline def setSourceResultCounts(value: js.Array[SourceResultCount]): Self = StObject.set(x, "sourceResultCounts", value.asInstanceOf[js.Any])
    
    inline def setSourceResultCountsUndefined: Self = StObject.set(x, "sourceResultCounts", js.undefined)
    
    inline def setSourceResultCountsVarargs(value: SourceResultCount*): Self = StObject.set(x, "sourceResultCounts", js.Array(value*))
  }
}
