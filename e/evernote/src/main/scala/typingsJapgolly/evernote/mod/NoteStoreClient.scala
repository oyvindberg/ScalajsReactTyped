package typingsJapgolly.evernote.mod

import typingsJapgolly.evernote.mod.NoteStore.CreateOrUpdateNotebookSharesResult
import typingsJapgolly.evernote.mod.NoteStore.ManageNotebookSharesParameters
import typingsJapgolly.evernote.mod.NoteStore.ManageNotebookSharesResult
import typingsJapgolly.evernote.mod.NoteStore.NoteCollectionCounts
import typingsJapgolly.evernote.mod.NoteStore.NoteEmailParameters
import typingsJapgolly.evernote.mod.NoteStore.NoteFilter
import typingsJapgolly.evernote.mod.NoteStore.NoteResultSpec
import typingsJapgolly.evernote.mod.NoteStore.NoteVersionId
import typingsJapgolly.evernote.mod.NoteStore.NotebookShareTemplate
import typingsJapgolly.evernote.mod.NoteStore.NotesMetadataList
import typingsJapgolly.evernote.mod.NoteStore.NotesMetadataResultSpec
import typingsJapgolly.evernote.mod.NoteStore.RelatedQuery
import typingsJapgolly.evernote.mod.NoteStore.RelatedResult
import typingsJapgolly.evernote.mod.NoteStore.RelatedResultSpec
import typingsJapgolly.evernote.mod.NoteStore.ShareRelationships
import typingsJapgolly.evernote.mod.NoteStore.SyncChunk
import typingsJapgolly.evernote.mod.NoteStore.SyncChunkFilter
import typingsJapgolly.evernote.mod.NoteStore.SyncState
import typingsJapgolly.evernote.mod.NoteStore.UpdateNoteIfUsnMatchesResult
import typingsJapgolly.evernote.mod.Types.Guid
import typingsJapgolly.evernote.mod.Types.LazyMap
import typingsJapgolly.evernote.mod.Types.LinkedNotebook
import typingsJapgolly.evernote.mod.Types.Note
import typingsJapgolly.evernote.mod.Types.Notebook
import typingsJapgolly.evernote.mod.Types.NotebookRecipientSettings
import typingsJapgolly.evernote.mod.Types.Resource
import typingsJapgolly.evernote.mod.Types.ResourceAttributes
import typingsJapgolly.evernote.mod.Types.SavedSearch
import typingsJapgolly.evernote.mod.Types.SharedNotebook
import typingsJapgolly.evernote.mod.Types.Tag
import typingsJapgolly.evernote.mod.Types.UserID
import typingsJapgolly.evernote.mod.UserStore.AuthenticationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStoreClient")
@js.native
open class NoteStoreClient () extends StObject {
  
  def authenticateToSharedNote(guid: Guid, noteKey: String): js.Promise[AuthenticationResult] = js.native
  def authenticateToSharedNote(guid: Guid, noteKey: String, authenticationToken: String): js.Promise[AuthenticationResult] = js.native
  
  def authenticateToSharedNotebook(guid: Guid, noteKey: String): js.Promise[AuthenticationResult] = js.native
  def authenticateToSharedNotebook(guid: Guid, noteKey: String, authenticationToken: String): js.Promise[AuthenticationResult] = js.native
  
  def copyNote(noteGuid: Guid, toNotebookGuid: Guid): js.Promise[Note] = js.native
  
  def createLinkedNotebook(linkedNotebook: LinkedNotebook): js.Promise[LinkedNotebook] = js.native
  
  def createNote(note: Note): js.Promise[Note] = js.native
  
  def createNotebook(notebook: Notebook): js.Promise[Notebook] = js.native
  
  def createOrUpdateNotebookShares(shareTemplate: NotebookShareTemplate): js.Promise[CreateOrUpdateNotebookSharesResult] = js.native
  
  def createSearch(search: SavedSearch): js.Promise[SavedSearch] = js.native
  
  def createTag(tag: Tag): js.Promise[Tag] = js.native
  
  def deleteNote(guid: Guid): js.Promise[Double] = js.native
  
  def emailNote(parameters: NoteEmailParameters): js.Promise[Unit] = js.native
  
  def expungeLinkedNotebook(guid: Guid): js.Promise[Double] = js.native
  
  def expungeNote(guid: Guid): js.Promise[Double] = js.native
  
  def expungeNotebook(guid: Guid): js.Promise[Double] = js.native
  
  def expungeSearch(guid: Guid): js.Promise[Double] = js.native
  
  def expungeTag(guid: Guid): js.Promise[Double] = js.native
  
  def findNoteCounts(filter: NoteFilter, withTrash: Boolean): js.Promise[NoteCollectionCounts] = js.native
  
  def findNoteOffset(filter: NoteFilter, guid: Guid): js.Promise[Double] = js.native
  
  def findNotesMetadata(filter: NoteFilter, offset: Double, maxNotes: Double, resultSpec: NotesMetadataResultSpec): js.Promise[NotesMetadataList] = js.native
  
  def findRelated(query: RelatedQuery, resultSpec: RelatedResultSpec): js.Promise[RelatedResult] = js.native
  
  def getDefaultNotebook(): js.Promise[Notebook] = js.native
  
  def getFilteredSyncChunk(afterUSN: Double, maxEntries: Double, filter: SyncChunkFilter): js.Promise[SyncChunk] = js.native
  
  def getLinkedNotebookSyncChunk(linkedNotebook: LinkedNotebook, afterUSN: Double, maxEntries: Double, fullSyncOnly: Boolean): js.Promise[SyncChunk] = js.native
  
  def getLinkedNotebookSyncState(linkedNotebook: LinkedNotebook): js.Promise[SyncState] = js.native
  
  /* DEPRECATED */
  def getNote(
    guid: Guid,
    withContent: Boolean,
    withResourcesData: Boolean,
    withResourcesRecognition: Boolean,
    withResourcesAlternateData: Boolean
  ): js.Promise[Note] = js.native
  
  def getNoteApplicationData(guid: Guid): js.Promise[LazyMap] = js.native
  
  def getNoteApplicationDataEntry(guid: Guid, key: String): js.Promise[String] = js.native
  
  def getNoteContent(guid: Guid): js.Promise[String] = js.native
  
  def getNoteSearchText(guid: Guid, noteOnly: Boolean, tokenizeForIndexing: Boolean): js.Promise[String] = js.native
  
  def getNoteTagNames(guid: Guid): js.Promise[js.Array[String]] = js.native
  
  def getNoteVersion(
    noteguid: Guid,
    updateSequenceNum: Double,
    withResourcesData: Boolean,
    withResourcesRecognition: Boolean,
    withResourcesAlternateData: Boolean
  ): js.Promise[Note] = js.native
  
  def getNoteWithResultSpec(guid: Guid, resultSpec: NoteResultSpec): js.Promise[Note] = js.native
  
  def getNotebook(guid: Guid): js.Promise[Notebook] = js.native
  
  def getNotebookShares(notebookGuid: String): js.Promise[ShareRelationships] = js.native
  
  def getPublicNotebook(userId: UserID, publicUri: String): js.Promise[Notebook] = js.native
  
  def getResource(
    guid: Guid,
    withData: Boolean,
    withRecognition: Boolean,
    withAttributes: Boolean,
    withAlternateData: Boolean
  ): js.Promise[Resource] = js.native
  
  def getResourceAlternateData(guid: Guid): js.Promise[String] = js.native
  
  def getResourceApplicationData(guid: Guid): js.Promise[LazyMap] = js.native
  
  def getResourceApplicationDataEntry(guid: Guid, key: String): js.Promise[String] = js.native
  
  def getResourceAttributes(guid: Guid): js.Promise[ResourceAttributes] = js.native
  
  def getResourceByHash(
    noteguid: Guid,
    contentHash: String,
    withData: Boolean,
    withRecognition: Boolean,
    withAlternateData: Boolean
  ): js.Promise[Resource] = js.native
  
  def getResourceData(guid: Guid): js.Promise[String] = js.native
  
  def getResourceRecognition(guid: Guid): js.Promise[String] = js.native
  
  def getResourceSearchText(guid: Guid): js.Promise[String] = js.native
  
  def getSearch(guid: Guid): js.Promise[SavedSearch] = js.native
  
  def getSharedNotebookByAuth(): js.Promise[SharedNotebook] = js.native
  
  def getSyncState(): js.Promise[SyncState] = js.native
  
  def getTag(guid: Guid): js.Promise[Tag] = js.native
  
  def listAccessibleBusinessNotebooks(): js.Promise[js.Array[Notebook]] = js.native
  
  def listLinkedNotebooks(): js.Promise[js.Array[LinkedNotebook]] = js.native
  
  def listNoteVersions(noteguid: Guid): js.Promise[js.Array[NoteVersionId]] = js.native
  
  def listNotebooks(): js.Promise[js.Array[Notebook]] = js.native
  
  def listSearches(): js.Promise[js.Array[SavedSearch]] = js.native
  
  def listSharedNotebooks(): js.Promise[js.Array[SharedNotebook]] = js.native
  
  def listTags(): js.Promise[js.Array[Tag]] = js.native
  
  def listTagsByNotebook(notebookguid: Guid): js.Promise[js.Array[Tag]] = js.native
  
  def manageNotebookShares(parameters: ManageNotebookSharesParameters): js.Promise[ManageNotebookSharesResult] = js.native
  
  def setNoteApplicationDataEntry(guid: Guid, key: String, value: String): js.Promise[Double] = js.native
  
  def setNotebookRecipientSettings(notebookGuid: String, recipientSettings: NotebookRecipientSettings): js.Promise[Notebook] = js.native
  
  def setResourceApplicationDataEntry(guid: Guid, key: String, value: String): js.Promise[Double] = js.native
  
  def shareNote(guid: Guid): js.Promise[String] = js.native
  
  def shareNotebook(sharedNotebook: SharedNotebook, message: String): js.Promise[SharedNotebook] = js.native
  
  def stopSharingNote(guid: Guid): js.Promise[Unit] = js.native
  
  def unsetNoteApplicationDataEntry(guid: Guid, key: String): js.Promise[Double] = js.native
  
  def unsetResourceApplicationDataEntry(guid: Guid, key: String): js.Promise[Double] = js.native
  
  def untagAll(guid: Guid): js.Promise[Unit] = js.native
  
  def updateLinkedNotebook(linkedNotebook: LinkedNotebook): js.Promise[Double] = js.native
  
  def updateNote(note: Note): js.Promise[Note] = js.native
  
  def updateNoteIfUsnMatches(note: Note): js.Promise[UpdateNoteIfUsnMatchesResult] = js.native
  
  def updateNotebook(notebook: Notebook): js.Promise[Double] = js.native
  
  def updateResource(resource: Resource): js.Promise[Double] = js.native
  
  def updateSearch(search: SavedSearch): js.Promise[Double] = js.native
  
  def updateSharedNotebook(sharedNotebook: SharedNotebook): js.Promise[Double] = js.native
  
  def updateTag(tag: Tag): js.Promise[Double] = js.native
}
