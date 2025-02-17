package typingsJapgolly.mysql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryFunction extends StObject {
  
  def apply(options: String): Query = js.native
  def apply(options: String, callback: queryCallback): Query = js.native
  def apply(options: String, values: Any): Query = js.native
  def apply(options: String, values: Any, callback: queryCallback): Query = js.native
  def apply(options: QueryOptions): Query = js.native
  def apply(options: QueryOptions, callback: queryCallback): Query = js.native
  def apply(options: QueryOptions, values: Any): Query = js.native
  def apply(options: QueryOptions, values: Any, callback: queryCallback): Query = js.native
  def apply(query: Query): Query = js.native
}
