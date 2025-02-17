package typingsJapgolly.sipJs.libCoreMod

import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "NotifyUserAgentClient")
@js.native
open class NotifyUserAgentClient protected ()
  extends typingsJapgolly.sipJs.libCoreUserAgentsMod.NotifyUserAgentClient {
  def this(dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog,
    delegate: Unit,
    options: RequestOptions
  ) = this()
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}
