package typingsJapgolly.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootBrokerResponse extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster operation.
    
    */
  var ClusterOperationArn: js.UndefOr[string] = js.undefined
}
object RebootBrokerResponse {
  
  inline def apply(): RebootBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootBrokerResponse]
  }
  
  extension [Self <: RebootBrokerResponse](x: Self) {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setClusterOperationArn(value: string): Self = StObject.set(x, "ClusterOperationArn", value.asInstanceOf[js.Any])
    
    inline def setClusterOperationArnUndefined: Self = StObject.set(x, "ClusterOperationArn", js.undefined)
  }
}
