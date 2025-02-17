package typingsJapgolly.anydbSql.mod

import typingsJapgolly.anydbSql.anon.RowCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseConnection extends StObject {
  
  def queryAsync[T](query: String, params: Any*): typingsJapgolly.bluebird.mod.^[RowCount[T]] = js.native
  def queryAsync[T](query: QueryLike): typingsJapgolly.bluebird.mod.^[RowCount[T]] = js.native
}
