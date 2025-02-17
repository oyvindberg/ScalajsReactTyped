package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskItem extends StObject {
  
  val Actions: typingsJapgolly.activexOutlook.Outlook.Actions = js.native
  
  var ActualWork: Double = js.native
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  def Assign(): TaskItem = js.native
  
  val Attachments: typingsJapgolly.activexOutlook.Outlook.Attachments = js.native
  
  val AutoResolvedWinner: Boolean = js.native
  
  var BillingInformation: String = js.native
  
  var Body: String = js.native
  
  def CancelResponseState(): Unit = js.native
  
  var CardData: String = js.native
  
  var Categories: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def ClearRecurrencePattern(): Unit = js.native
  
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  
  var Companies: String = js.native
  
  var Complete: Boolean = js.native
  
  val Conflicts: typingsJapgolly.activexOutlook.Outlook.Conflicts = js.native
  
  var ContactNames: String = js.native
  
  var Contacts: String = js.native
  
  val ConversationID: String = js.native
  
  val ConversationIndex: String = js.native
  
  val ConversationTopic: String = js.native
  
  def Copy(): Any = js.native
  
  val CreationTime: VarDate = js.native
  
  var DateCompleted: VarDate = js.native
  
  val DelegationState: OlTaskDelegationState = js.native
  
  val Delegator: String = js.native
  
  def Delete(): Unit = js.native
  
  def Display(): Unit = js.native
  def Display(Modal: Any): Unit = js.native
  
  val DownloadState: OlDownloadState = js.native
  
  var DueDate: VarDate = js.native
  
  val EntryID: String = js.native
  
  val FormDescription: typingsJapgolly.activexOutlook.Outlook.FormDescription = js.native
  
  def GetConversation(): Conversation = js.native
  
  val GetInspector: Inspector = js.native
  
  def GetRecurrencePattern(): RecurrencePattern = js.native
  
  var Importance: OlImportance = js.native
  
  var InternetCodepage: Double = js.native
  
  val IsConflict: Boolean = js.native
  
  val IsRecurring: Boolean = js.native
  
  val ItemProperties: typingsJapgolly.activexOutlook.Outlook.ItemProperties = js.native
  
  val LastModificationTime: VarDate = js.native
  
  val Links: typingsJapgolly.activexOutlook.Outlook.Links = js.native
  
  val MAPIOBJECT: Any = js.native
  
  def MarkComplete(): Unit = js.native
  
  var MarkForDownload: OlRemoteStatus = js.native
  
  var MessageClass: String = js.native
  
  var Mileage: String = js.native
  
  def Move(DestFldr: Folder): Any = js.native
  
  var NoAging: Boolean = js.native
  
  var Ordinal: Double = js.native
  
  /* private */ @JSName("Outlook.TaskItem_typekey")
  var OutlookDotTaskItem_typekey: TaskItem = js.native
  
  val OutlookInternalVersion: Double = js.native
  
  val OutlookVersion: String = js.native
  
  var Owner: String = js.native
  
  val Ownership: OlTaskOwnership = js.native
  
  val Parent: Any = js.native
  
  var PercentComplete: Double = js.native
  
  def PrintOut(): Unit = js.native
  
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  
  var RTFBody: Any = js.native
  
  val Recipients: typingsJapgolly.activexOutlook.Outlook.Recipients = js.native
  
  var ReminderOverrideDefault: Boolean = js.native
  
  var ReminderPlaySound: Boolean = js.native
  
  var ReminderSet: Boolean = js.native
  
  var ReminderSoundFile: String = js.native
  
  var ReminderTime: VarDate = js.native
  
  def Respond(Response: OlTaskResponse, fNoUI: Any, fAdditionalTextDialog: Any): TaskItem = js.native
  
  val ResponseState: OlTaskResponse = js.native
  
  var Role: String = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: Any): Unit = js.native
  
  val Saved: Boolean = js.native
  
  var SchedulePlusPriority: String = js.native
  
  def Send(): Unit = js.native
  
  var SendUsingAccount: Account = js.native
  
  var Sensitivity: OlSensitivity = js.native
  
  val Session: NameSpace = js.native
  
  def ShowCategoriesDialog(): Unit = js.native
  
  val Size: Double = js.native
  
  def SkipRecurrence(): Boolean = js.native
  
  var StartDate: VarDate = js.native
  
  var Status: OlTaskStatus = js.native
  
  var StatusOnCompletionRecipients: String = js.native
  
  def StatusReport(): Any = js.native
  
  var StatusUpdateRecipients: String = js.native
  
  var Subject: String = js.native
  
  var TeamTask: Boolean = js.native
  
  var ToDoTaskOrdinal: VarDate = js.native
  
  var TotalWork: Double = js.native
  
  var UnRead: Boolean = js.native
  
  val UserProperties: typingsJapgolly.activexOutlook.Outlook.UserProperties = js.native
}
