package typingsJapgolly.chrome.chrome

import typingsJapgolly.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// LoginState
////////////////////
/**
  * Use the chrome.loginState API to read and monitor the login state.
  * Permissions: "loginState"
  * @since Chrome 78.
  * Important: This API works only on Chrome OS.
  */
object loginState {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chrome.chromeStrings.SIGNIN_PROFILE
    - typingsJapgolly.chrome.chromeStrings.USER_PROFILE
  */
  trait ProfileType extends StObject
  object ProfileType {
    
    inline def SIGNIN_PROFILE: typingsJapgolly.chrome.chromeStrings.SIGNIN_PROFILE = "SIGNIN_PROFILE".asInstanceOf[typingsJapgolly.chrome.chromeStrings.SIGNIN_PROFILE]
    
    inline def USER_PROFILE: typingsJapgolly.chrome.chromeStrings.USER_PROFILE = "USER_PROFILE".asInstanceOf[typingsJapgolly.chrome.chromeStrings.USER_PROFILE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chrome.chromeStrings.UNKNOWN
    - typingsJapgolly.chrome.chromeStrings.IN_OOBE_SCREEN
    - typingsJapgolly.chrome.chromeStrings.IN_LOGIN_SCREEN
    - typingsJapgolly.chrome.chromeStrings.IN_SESSION
    - typingsJapgolly.chrome.chromeStrings.IN_LOCK_SCREEN
  */
  trait SessionState extends StObject
  object SessionState {
    
    inline def IN_LOCK_SCREEN: typingsJapgolly.chrome.chromeStrings.IN_LOCK_SCREEN = "IN_LOCK_SCREEN".asInstanceOf[typingsJapgolly.chrome.chromeStrings.IN_LOCK_SCREEN]
    
    inline def IN_LOGIN_SCREEN: typingsJapgolly.chrome.chromeStrings.IN_LOGIN_SCREEN = "IN_LOGIN_SCREEN".asInstanceOf[typingsJapgolly.chrome.chromeStrings.IN_LOGIN_SCREEN]
    
    inline def IN_OOBE_SCREEN: typingsJapgolly.chrome.chromeStrings.IN_OOBE_SCREEN = "IN_OOBE_SCREEN".asInstanceOf[typingsJapgolly.chrome.chromeStrings.IN_OOBE_SCREEN]
    
    inline def IN_SESSION: typingsJapgolly.chrome.chromeStrings.IN_SESSION = "IN_SESSION".asInstanceOf[typingsJapgolly.chrome.chromeStrings.IN_SESSION]
    
    inline def UNKNOWN: typingsJapgolly.chrome.chromeStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsJapgolly.chrome.chromeStrings.UNKNOWN]
  }
  
  type SessionStateChangedEvent = Event[js.Function1[/* sessionState */ SessionState, Unit]]
}
