package typingsJapgolly.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityPoolUsageRequest extends StObject {
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: typingsJapgolly.awsSdk.clientsCognitosyncMod.IdentityPoolId
}
object DescribeIdentityPoolUsageRequest {
  
  inline def apply(IdentityPoolId: IdentityPoolId): DescribeIdentityPoolUsageRequest = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityPoolUsageRequest]
  }
  
  extension [Self <: DescribeIdentityPoolUsageRequest](x: Self) {
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
  }
}
