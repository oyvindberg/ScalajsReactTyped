package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a storage mechanism for Request / Response object pairs that are cached, for example as part of the ServiceWorker life cycle. Note that the Cache interface is exposed to windowed scopes as well as workers. You don't have to use it in conjunction with service workers, even though it is defined in the service worker spec.
  * Available only in secure contexts.
  */
@js.native
trait Cache extends StObject {
  
  def add(request: org.scalajs.dom.URL): js.Promise[Unit] = js.native
  /* standard dom */
  def add(request: RequestInfo): js.Promise[Unit] = js.native
  
  /* standard dom */
  def addAll(requests: js.Array[RequestInfo]): js.Promise[Unit] = js.native
  /* standard dom.iterable */
  def addAll(requests: js.Iterable[RequestInfo]): js.Promise[Unit] = js.native
  
  def delete(request: org.scalajs.dom.URL): js.Promise[scala.Boolean] = js.native
  def delete(request: org.scalajs.dom.URL, options: org.scalajs.dom.CacheQueryOptions): js.Promise[scala.Boolean] = js.native
  /* standard dom */
  def delete(request: RequestInfo): js.Promise[scala.Boolean] = js.native
  def delete(request: RequestInfo, options: org.scalajs.dom.CacheQueryOptions): js.Promise[scala.Boolean] = js.native
  
  /* standard dom */
  def keys(): js.Promise[js.Array[org.scalajs.dom.Request]] = js.native
  def keys(request: org.scalajs.dom.URL): js.Promise[js.Array[org.scalajs.dom.Request]] = js.native
  def keys(request: org.scalajs.dom.URL, options: org.scalajs.dom.CacheQueryOptions): js.Promise[js.Array[org.scalajs.dom.Request]] = js.native
  def keys(request: Unit, options: org.scalajs.dom.CacheQueryOptions): js.Promise[js.Array[org.scalajs.dom.Request]] = js.native
  def keys(request: RequestInfo): js.Promise[js.Array[org.scalajs.dom.Request]] = js.native
  def keys(request: RequestInfo, options: org.scalajs.dom.CacheQueryOptions): js.Promise[js.Array[org.scalajs.dom.Request]] = js.native
  
  def `match`(request: org.scalajs.dom.URL): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  def `match`(request: org.scalajs.dom.URL, options: org.scalajs.dom.CacheQueryOptions): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  /* standard dom */
  def `match`(request: RequestInfo): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  def `match`(request: RequestInfo, options: org.scalajs.dom.CacheQueryOptions): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  
  /* standard dom */
  def matchAll(): js.Promise[js.Array[org.scalajs.dom.Response]] = js.native
  def matchAll(request: org.scalajs.dom.URL): js.Promise[js.Array[org.scalajs.dom.Response]] = js.native
  def matchAll(request: org.scalajs.dom.URL, options: org.scalajs.dom.CacheQueryOptions): js.Promise[js.Array[org.scalajs.dom.Response]] = js.native
  def matchAll(request: Unit, options: org.scalajs.dom.CacheQueryOptions): js.Promise[js.Array[org.scalajs.dom.Response]] = js.native
  def matchAll(request: RequestInfo): js.Promise[js.Array[org.scalajs.dom.Response]] = js.native
  def matchAll(request: RequestInfo, options: org.scalajs.dom.CacheQueryOptions): js.Promise[js.Array[org.scalajs.dom.Response]] = js.native
  
  def put(request: org.scalajs.dom.URL, response: org.scalajs.dom.Response): js.Promise[Unit] = js.native
  /* standard dom */
  def put(request: RequestInfo, response: org.scalajs.dom.Response): js.Promise[Unit] = js.native
}
