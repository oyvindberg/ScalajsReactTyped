package typingsJapgolly.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Teacher extends StObject {
  
  /** Identifier of the course. Read-only. */
  var courseId: js.UndefOr[String] = js.undefined
  
  /** Global user information for the teacher. Read-only. */
  var profile: js.UndefOr[UserProfile] = js.undefined
  
  /**
    * Identifier of the user. When specified as a parameter of a request, this identifier can be one of the following: * the numeric identifier for the user * the email address of the
    * user * the string literal `"me"`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.undefined
}
object Teacher {
  
  inline def apply(): Teacher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Teacher]
  }
  
  extension [Self <: Teacher](x: Self) {
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    inline def setProfile(value: UserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
