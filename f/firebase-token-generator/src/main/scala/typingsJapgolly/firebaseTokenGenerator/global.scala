package typingsJapgolly.firebaseTokenGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("FirebaseTokenGenerator")
  @js.native
  open class FirebaseTokenGenerator protected ()
    extends StObject
       with typingsJapgolly.firebaseTokenGenerator.FirebaseTokenGenerator {
    /**
      * Builds a new object that can generate Firebase authentication tokens.
      * @constructor
      * @param { String } secret The secret for the Firebase being used (get yours from the Firebase Admin Console).
      */
    def this(secret: String) = this()
  }
}
