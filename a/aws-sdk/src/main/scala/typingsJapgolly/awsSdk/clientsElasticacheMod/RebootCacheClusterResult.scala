package typingsJapgolly.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootCacheClusterResult extends StObject {
  
  var CacheCluster: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticacheMod.CacheCluster] = js.undefined
}
object RebootCacheClusterResult {
  
  inline def apply(): RebootCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootCacheClusterResult]
  }
  
  extension [Self <: RebootCacheClusterResult](x: Self) {
    
    inline def setCacheCluster(value: CacheCluster): Self = StObject.set(x, "CacheCluster", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterUndefined: Self = StObject.set(x, "CacheCluster", js.undefined)
  }
}
