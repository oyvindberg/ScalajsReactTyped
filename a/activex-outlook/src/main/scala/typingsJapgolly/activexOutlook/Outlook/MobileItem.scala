package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileItem extends StObject {
  
  val Actions: typingsJapgolly.activexOutlook.Outlook.Actions = js.native
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  val Attachments: typingsJapgolly.activexOutlook.Outlook.Attachments = js.native
  
  var BillingInformation: String = js.native
  
  var Body: String = js.native
  
  var Categories: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  
  var Companies: String = js.native
  
  val ConversationIndex: String = js.native
  
  val ConversationTopic: String = js.native
  
  def Copy(): Any = js.native
  
  val Count: Double = js.native
  
  val CreationTime: VarDate = js.native
  
  def Delete(): Unit = js.native
  
  def Display(): Unit = js.native
  def Display(Modal: Any): Unit = js.native
  
  val EntryID: String = js.native
  
  val FormDescription: typingsJapgolly.activexOutlook.Outlook.FormDescription = js.native
  
  def Forward(): MobileItem = js.native
  
  val GetInspector: Inspector = js.native
  
  var HTMLBody: String = js.native
  
  var Importance: OlImportance = js.native
  
  val ItemProperties: typingsJapgolly.activexOutlook.Outlook.ItemProperties = js.native
  
  val LastModificationTime: VarDate = js.native
  
  val MAPIOBJECT: Any = js.native
  
  var MessageClass: String = js.native
  
  var Mileage: String = js.native
  
  val MobileFormat: OlMobileFormat = js.native
  
  def Move(DestFldr: Folder): Any = js.native
  
  var NoAging: Boolean = js.native
  
  /* private */ @JSName("Outlook.MobileItem_typekey")
  var OutlookDotMobileItem_typekey: MobileItem = js.native
  
  val OutlookInternalVersion: Double = js.native
  
  val OutlookVersion: String = js.native
  
  val Parent: Any = js.native
  
  def PrintOut(): Unit = js.native
  
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  
  val ReceivedByEntryID: String = js.native
  
  val ReceivedByName: String = js.native
  
  val ReceivedTime: VarDate = js.native
  
  val Recipients: typingsJapgolly.activexOutlook.Outlook.Recipients = js.native
  
  def Reply(): MobileItem = js.native
  
  def ReplyAll(): MobileItem = js.native
  
  val ReplyRecipientNames: String = js.native
  
  val ReplyRecipients: typingsJapgolly.activexOutlook.Outlook.Recipients = js.native
  
  var SMILBody: String = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: Any): Unit = js.native
  
  val Saved: Boolean = js.native
  
  def Send(ForceSend: Boolean): Unit = js.native
  
  var SendUsingAccount: Account = js.native
  
  val SenderEmailAddress: String = js.native
  
  val SenderEmailType: String = js.native
  
  val SenderName: String = js.native
  
  var Sensitivity: OlSensitivity = js.native
  
  val Sent: Boolean = js.native
  
  val SentOn: VarDate = js.native
  
  val Session: NameSpace = js.native
  
  val Size: Double = js.native
  
  var Subject: String = js.native
  
  val Submitted: Boolean = js.native
  
  var To: String = js.native
  
  var UnRead: Boolean = js.native
  
  val UserProperties: typingsJapgolly.activexOutlook.Outlook.UserProperties = js.native
}
