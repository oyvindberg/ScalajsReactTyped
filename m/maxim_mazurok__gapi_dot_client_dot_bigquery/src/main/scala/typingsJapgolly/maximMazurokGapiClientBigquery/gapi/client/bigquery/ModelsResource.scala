package typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBigquery.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientBigquery.anon.ModelId
import typingsJapgolly.maximMazurokGapiClientBigquery.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelsResource extends StObject {
  
  /** Deletes the model specified by modelId from the dataset. */
  def delete(): Request[Unit] = js.native
  def delete(request: ModelId): Request[Unit] = js.native
  
  /** Gets the specified model resource by model ID. */
  def get(): Request[Model] = js.native
  def get(request: ModelId): Request[Model] = js.native
  
  /**
    * Lists all models in the specified dataset. Requires the READER dataset role. After retrieving the list of models, you can get information about a particular model by calling the
    * models.get method.
    */
  def list(): Request[ListModelsResponse] = js.native
  def list(request: MaxResults): Request[ListModelsResponse] = js.native
  
  def patch(request: ModelId, body: Model): Request[Model] = js.native
  /** Patch specific fields in the specified model. */
  def patch(request: QuotaUser): Request[Model] = js.native
}
