package typingsJapgolly.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFindingsFilterResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the filter that was created.
    */
  var arn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the filter that was created.
    */
  var id: js.UndefOr[string] = js.undefined
}
object CreateFindingsFilterResponse {
  
  inline def apply(): CreateFindingsFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFindingsFilterResponse]
  }
  
  extension [Self <: CreateFindingsFilterResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
