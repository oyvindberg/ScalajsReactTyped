package typingsJapgolly.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionType extends StObject
/**
  * Specifies the type of custom action in a notification message.
  *
  * @remarks
  * [Api set: Mailbox 1.10]
  */
@JSGlobal("Office.MailboxEnums.ActionType")
@js.native
object ActionType extends StObject {
  
  /**
    * The `showTaskPane` action.
    */
  @js.native
  sealed trait ShowTaskPane
    extends StObject
       with ActionType
}
