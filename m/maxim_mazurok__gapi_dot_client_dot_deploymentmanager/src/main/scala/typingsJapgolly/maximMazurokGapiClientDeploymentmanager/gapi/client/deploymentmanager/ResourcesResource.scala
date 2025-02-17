package typingsJapgolly.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDeploymentmanager.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientDeploymentmanager.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcesResource extends StObject {
  
  /** Gets information about a single resource. */
  def get(): Request[Resource] = js.native
  def get(request: QuotaUser): Request[Resource] = js.native
  
  /** Lists all resources in a given deployment. */
  def list(): Request[ResourcesListResponse] = js.native
  def list(request: MaxResults): Request[ResourcesListResponse] = js.native
}
