package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.Privilege
import typingsJapgolly.evernote.mod.Types.SharedNotePrivilegeLevel
import typingsJapgolly.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteMemberShareRelationship")
@js.native
open class NoteMemberShareRelationship () extends StObject {
  def this(args: Privilege) = this()
  
  var displayName: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientUserId: js.UndefOr[UserID] = js.native
  
  var restrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.native
  
  var sharerUserId: js.UndefOr[UserID] = js.native
}
