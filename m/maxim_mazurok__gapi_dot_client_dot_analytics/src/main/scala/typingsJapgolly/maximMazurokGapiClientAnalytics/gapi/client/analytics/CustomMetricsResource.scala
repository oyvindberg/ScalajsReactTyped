package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AccountIdAlt
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AltCustomMetricId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AltFields
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.CustomMetricId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.CustomMetricIdFields
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Startindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMetricsResource extends StObject {
  
  /** Get a custom metric to which the user has access. */
  def get(): Request[CustomMetric] = js.native
  def get(request: CustomMetricId): Request[CustomMetric] = js.native
  
  def insert(request: AccountIdAlt, body: CustomMetric): Request[CustomMetric] = js.native
  /** Create a new custom metric. */
  def insert(request: AltFields): Request[CustomMetric] = js.native
  
  /** Lists custom metrics to which the user has access. */
  def list(): Request[CustomMetrics] = js.native
  def list(request: Startindex): Request[CustomMetrics] = js.native
  
  /** Updates an existing custom metric. This method supports patch semantics. */
  def patch(request: AltCustomMetricId): Request[CustomMetric] = js.native
  def patch(request: CustomMetricIdFields, body: CustomMetric): Request[CustomMetric] = js.native
  
  /** Updates an existing custom metric. */
  def update(request: AltCustomMetricId): Request[CustomMetric] = js.native
  def update(request: CustomMetricIdFields, body: CustomMetric): Request[CustomMetric] = js.native
}
