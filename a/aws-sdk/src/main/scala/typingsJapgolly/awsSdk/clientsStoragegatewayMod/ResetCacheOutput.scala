package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetCacheOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}
object ResetCacheOutput {
  
  inline def apply(): ResetCacheOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetCacheOutput]
  }
  
  extension [Self <: ResetCacheOutput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
