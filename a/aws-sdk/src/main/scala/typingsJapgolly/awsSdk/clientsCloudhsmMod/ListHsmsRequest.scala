package typingsJapgolly.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHsmsRequest extends StObject {
  
  /**
    * The NextToken value from a previous call to ListHsms. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListHsmsRequest {
  
  inline def apply(): ListHsmsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHsmsRequest]
  }
  
  extension [Self <: ListHsmsRequest](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
