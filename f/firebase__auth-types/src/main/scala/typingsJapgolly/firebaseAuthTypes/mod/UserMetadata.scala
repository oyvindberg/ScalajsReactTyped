package typingsJapgolly.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserMetadata extends StObject {
  
  var creationTime: js.UndefOr[String] = js.undefined
  
  var lastSignInTime: js.UndefOr[String] = js.undefined
}
object UserMetadata {
  
  inline def apply(): UserMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMetadata]
  }
  
  extension [Self <: UserMetadata](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setLastSignInTime(value: String): Self = StObject.set(x, "lastSignInTime", value.asInstanceOf[js.Any])
    
    inline def setLastSignInTimeUndefined: Self = StObject.set(x, "lastSignInTime", js.undefined)
  }
}
