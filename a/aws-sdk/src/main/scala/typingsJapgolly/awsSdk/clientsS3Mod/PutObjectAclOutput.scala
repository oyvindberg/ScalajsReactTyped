package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectAclOutput extends StObject {
  
  var RequestCharged: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.RequestCharged] = js.undefined
}
object PutObjectAclOutput {
  
  inline def apply(): PutObjectAclOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectAclOutput]
  }
  
  extension [Self <: PutObjectAclOutput](x: Self) {
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
