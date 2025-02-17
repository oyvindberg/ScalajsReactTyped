package typingsJapgolly.wechatMiniprogram.DB

import typingsJapgolly.std.Record
import typingsJapgolly.wechatMiniprogram.OQ
import typingsJapgolly.wechatMiniprogram.anon.RQICountDocumentOptions
import typingsJapgolly.wechatMiniprogram.anon.RQIGetDocumentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  def count(): js.Promise[ICountResult] = js.native
  def count(options: OQ[ICountDocumentOptions]): Unit = js.native
  def count(options: RQICountDocumentOptions): js.Promise[ICountResult] = js.native
  
  def field(`object`: Record[String, Any]): Query = js.native
  
  def get(): js.Promise[IQueryResult] = js.native
  def get(options: OQ[IGetDocumentOptions]): Unit = js.native
  def get(options: RQIGetDocumentOptions): js.Promise[IQueryResult] = js.native
  
  def limit(max: Double): Query = js.native
  
  def orderBy(fieldPath: String, order: String): Query = js.native
  
  def skip(offset: Double): Query = js.native
  
  def watch(options: IWatchOptions): RealtimeListener = js.native
  
  def where(condition: IQueryCondition): Query = js.native
}
