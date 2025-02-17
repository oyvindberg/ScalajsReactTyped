package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.Ascending
import typingsJapgolly.evernote.mod.Types.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteFilter")
@js.native
open class NoteFilter () extends StObject {
  def this(args: Ascending) = this()
  
  var ascending: Boolean = js.native
  
  var emphasized: String = js.native
  
  var inactive: Boolean = js.native
  
  var includeAllReadableNotebooks: Boolean = js.native
  
  var notebookGuid: Guid = js.native
  
  var order: Double = js.native
  
  var tagGuids: js.Array[Guid] = js.native
  
  var timeZone: String = js.native
  
  var words: String = js.native
}
