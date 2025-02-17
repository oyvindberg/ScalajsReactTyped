package typingsJapgolly.sipJs.libCoreMod

import typingsJapgolly.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ReInviteUserAgentServer")
@js.native
open class ReInviteUserAgentServer protected ()
  extends typingsJapgolly.sipJs.libCoreUserAgentsMod.ReInviteUserAgentServer {
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog,
    message: typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
