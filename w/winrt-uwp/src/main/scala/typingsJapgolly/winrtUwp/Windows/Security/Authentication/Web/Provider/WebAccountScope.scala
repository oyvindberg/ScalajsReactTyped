package typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebAccountScope extends StObject
/** Represents the scope of a web account. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountScope")
@js.native
object WebAccountScope extends StObject {
  
  /** Scope that hides the account from PC settings. Use this scope if you do not want the user's login to persist. For these accounts, only per-app tokens should be retained. */
  @js.native
  sealed trait perApplication
    extends StObject
       with WebAccountScope
  
  /** Scope for single-sign-on accounts that appear in PC settings. This is the default scope. */
  @js.native
  sealed trait perUser
    extends StObject
       with WebAccountScope
}
