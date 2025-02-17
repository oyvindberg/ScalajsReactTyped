package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "PowerFormsApi")
@js.native
open class PowerFormsApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def createPowerForm(accountId: String): js.Promise[PowerForm] = js.native
  def createPowerForm(accountId: String, optsOrCallback: Any): js.Promise[PowerForm] = js.native
  def createPowerForm(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[PowerForm] = js.native
  def createPowerForm(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[PowerForm] = js.native
  
  def deletePowerForm(accountId: String, powerFormId: String): js.Promise[Unit] = js.native
  def deletePowerForm(accountId: String, powerFormId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def deletePowerForms(accountId: String): js.Promise[PowerFormsResponse] = js.native
  def deletePowerForms(accountId: String, optsOrCallback: Any): js.Promise[PowerFormsResponse] = js.native
  def deletePowerForms(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[PowerFormsResponse] = js.native
  def deletePowerForms(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[PowerFormsResponse] = js.native
  
  def getPowerForm(accountId: String, powerFormId: String): js.Promise[PowerForm] = js.native
  def getPowerForm(accountId: String, powerFormId: String, callback: js.Function0[Unit]): js.Promise[PowerForm] = js.native
  
  def getPowerFormData(accountId: String, powerFormId: String): js.Promise[PowerFormsFormDataResponse] = js.native
  def getPowerFormData(accountId: String, powerFormId: String, optsOrCallback: Any): js.Promise[PowerFormsFormDataResponse] = js.native
  def getPowerFormData(accountId: String, powerFormId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[PowerFormsFormDataResponse] = js.native
  def getPowerFormData(accountId: String, powerFormId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[PowerFormsFormDataResponse] = js.native
  
  def listPowerFormSenders(accountId: String): js.Promise[PowerFormSendersResponse] = js.native
  def listPowerFormSenders(accountId: String, optsOrCallback: Any): js.Promise[PowerFormSendersResponse] = js.native
  def listPowerFormSenders(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[PowerFormSendersResponse] = js.native
  def listPowerFormSenders(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[PowerFormSendersResponse] = js.native
  
  def listPowerForms(accountId: String): js.Promise[PowerFormsResponse] = js.native
  def listPowerForms(accountId: String, optsOrCallback: Any): js.Promise[PowerFormsResponse] = js.native
  def listPowerForms(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[PowerFormsResponse] = js.native
  def listPowerForms(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[PowerFormsResponse] = js.native
  
  def updatePowerForm(accountId: String, powerFormId: String): js.Promise[PowerForm] = js.native
  def updatePowerForm(accountId: String, powerFormId: String, optsOrCallback: Any): js.Promise[PowerForm] = js.native
  def updatePowerForm(accountId: String, powerFormId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[PowerForm] = js.native
  def updatePowerForm(accountId: String, powerFormId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[PowerForm] = js.native
}
