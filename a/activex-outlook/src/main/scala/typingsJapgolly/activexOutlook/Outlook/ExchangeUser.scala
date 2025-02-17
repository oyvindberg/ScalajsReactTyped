package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexStdole.stdole.StdPicture
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeUser extends StObject {
  
  var Address: String = js.native
  
  val AddressEntryUserType: OlAddressEntryUserType = js.native
  
  val Alias: String = js.native
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  var AssistantName: String = js.native
  
  var BusinessTelephoneNumber: String = js.native
  
  var City: String = js.native
  
  val Class: OlObjectClass = js.native
  
  var Comments: String = js.native
  
  var CompanyName: String = js.native
  
  def Delete(): Unit = js.native
  
  var Department: String = js.native
  
  def Details(): Unit = js.native
  def Details(HWnd: Any): Unit = js.native
  
  val DisplayType: OlDisplayType = js.native
  
  var FirstName: String = js.native
  
  def GetContact(): ContactItem = js.native
  
  def GetDirectReports(): AddressEntries = js.native
  
  def GetExchangeDistributionList(): ExchangeDistributionList = js.native
  
  def GetExchangeUser(): ExchangeUser = js.native
  
  def GetExchangeUserManager(): ExchangeUser = js.native
  
  def GetFreeBusy(Start: VarDate, MinPerChar: Double): String = js.native
  def GetFreeBusy(Start: VarDate, MinPerChar: Double, CompleteFormat: Any): String = js.native
  
  def GetMemberOfList(): AddressEntries = js.native
  
  def GetPicture(): StdPicture = js.native
  
  val ID: String = js.native
  
  var JobTitle: String = js.native
  
  var LastName: String = js.native
  
  var MAPIOBJECT: Any = js.native
  
  val Manager: AddressEntry = js.native
  
  val Members: AddressEntries = js.native
  
  var MobileTelephoneNumber: String = js.native
  
  var Name: String = js.native
  
  var OfficeLocation: String = js.native
  
  /* private */ @JSName("Outlook.ExchangeUser_typekey")
  var OutlookDotExchangeUser_typekey: ExchangeUser = js.native
  
  val Parent: Any = js.native
  
  var PostalCode: String = js.native
  
  val PrimarySmtpAddress: String = js.native
  
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  
  val Session: NameSpace = js.native
  
  var StateOrProvince: String = js.native
  
  var StreetAddress: String = js.native
  
  var Type: String = js.native
  
  def Update(): Unit = js.native
  def Update(MakePermanent: Any): Unit = js.native
  def Update(MakePermanent: Any, Refresh: Any): Unit = js.native
  def Update(MakePermanent: Unit, Refresh: Any): Unit = js.native
  
  def UpdateFreeBusy(): Unit = js.native
  
  var YomiCompanyName: String = js.native
  
  var YomiDepartment: String = js.native
  
  var YomiDisplayName: String = js.native
  
  var YomiFirstName: String = js.native
  
  var YomiLastName: String = js.native
}
