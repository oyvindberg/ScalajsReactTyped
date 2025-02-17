package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Fields
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Parent
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuiltInVariablesResource extends StObject {
  
  /** Creates one or more GTM Built-In Variables. */
  def create(): Request[CreateBuiltInVariableResponse] = js.native
  def create(request: Parent): Request[CreateBuiltInVariableResponse] = js.native
  
  /** Deletes one or more GTM Built-In Variables. */
  def delete(): Request[Unit] = js.native
  def delete(request: PrettyPrint): Request[Unit] = js.native
  
  /** Lists all the enabled Built-In Variables of a GTM Container. */
  def list(): Request[ListEnabledBuiltInVariablesResponse] = js.native
  def list(request: Fields): Request[ListEnabledBuiltInVariablesResponse] = js.native
  
  /** Reverts changes to a GTM Built-In Variables in a GTM Workspace. */
  def revert(): Request[RevertBuiltInVariableResponse] = js.native
  def revert(request: QuotaUser): Request[RevertBuiltInVariableResponse] = js.native
}
