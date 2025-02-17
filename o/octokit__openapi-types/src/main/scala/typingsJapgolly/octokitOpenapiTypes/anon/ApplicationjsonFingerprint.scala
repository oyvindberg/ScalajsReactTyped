package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonFingerprint extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Fingerprint
}
object ApplicationjsonFingerprint {
  
  inline def apply(applicationSlashjson: Fingerprint): ApplicationjsonFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonFingerprint]
  }
  
  extension [Self <: ApplicationjsonFingerprint](x: Self) {
    
    inline def setApplicationSlashjson(value: Fingerprint): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
