package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.anon.CanPurchaseUploadAllowance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.PremiumInfo")
@js.native
open class PremiumInfo () extends StObject {
  def this(args: CanPurchaseUploadAllowance) = this()
  
  var canPurchaseUploadAllowance: js.UndefOr[Boolean] = js.native
  
  var currentTime: js.UndefOr[Timestamp] = js.native
  
  var premium: js.UndefOr[Boolean] = js.native
  
  var premiumCancellationPending: js.UndefOr[Boolean] = js.native
  
  var premiumExpirationDate: js.UndefOr[Timestamp] = js.native
  
  var premiumExtendable: js.UndefOr[Boolean] = js.native
  
  var premiumPending: js.UndefOr[Boolean] = js.native
  
  var premiumRecurring: js.UndefOr[Boolean] = js.native
  
  var premiumUpgradable: js.UndefOr[Boolean] = js.native
}
