package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ReSubscribeUserAgentClient")
@js.native
open class ReSubscribeUserAgentClient protected ()
  extends typingsJapgolly.sipJs.libCoreMod.ReSubscribeUserAgentClient {
  def this(dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SubscriptionDialog) = this()
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate
  ) = this()
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SubscriptionDialog,
    delegate: Unit,
    options: RequestOptions
  ) = this()
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}
