package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailQuerySearchScope extends StObject
/** Defines the scope of a query. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQuerySearchScope")
@js.native
object EmailQuerySearchScope extends StObject {
  
  /** Query only the local email message collection. */
  @js.native
  sealed trait local
    extends StObject
       with EmailQuerySearchScope
  
  /** Query the entire email message collection contained on the email server. */
  @js.native
  sealed trait server
    extends StObject
       with EmailQuerySearchScope
}
