package typingsJapgolly.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CancelInvoiceResponse")
@js.native
open class CancelInvoiceResponse () extends StObject {
  
  /**
    * Information about errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The canceled invoice.
    */
  var invoice: js.UndefOr[Invoice] = js.native
}
