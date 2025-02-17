package typingsJapgolly.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexQuery
  extends StObject
     with Executable[IndexEntry] {
  
  def create(): IndexCreationQuery = js.native
  def create(indexName: String): IndexCreationQuery = js.native
  
  def drop(columns: Column[Any]*): Executable[Unit] = js.native
  def drop(indexName: String): Executable[Unit] = js.native
}
