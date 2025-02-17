package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRequestIdResourceUploadType
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserSslCertificate
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RequestIdSslCertificate
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslCertificatesResource extends StObject {
  
  /** Retrieves the list of all SslCertificate resources, regional and global, available to the specified project. */
  def aggregatedList(): Request[SslCertificateAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[SslCertificateAggregatedList] = js.native
  
  /** Deletes the specified SslCertificate resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: RequestIdSslCertificate): Request[Operation] = js.native
  
  /** Returns the specified SslCertificate resource. Gets a list of available SSL certificates by making a list() request. */
  def get(): Request[SslCertificate] = js.native
  def get(request: QuotaUserSslCertificate): Request[SslCertificate] = js.native
  
  /** Creates a SslCertificate resource in the specified project using the data included in the request. */
  def insert(request: PrettyPrintProjectQuotaUserRequestIdResourceUploadType): Request[Operation] = js.native
  def insert(request: Xgafv, body: SslCertificate): Request[Operation] = js.native
  
  /** Retrieves the list of SslCertificate resources available to the specified project. */
  def list(): Request[SslCertificateList] = js.native
  def list(request: MaxResults): Request[SslCertificateList] = js.native
}
