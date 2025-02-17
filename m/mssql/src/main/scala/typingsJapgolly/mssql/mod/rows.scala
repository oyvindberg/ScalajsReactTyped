package typingsJapgolly.mssql.mod

import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait rows
  extends StObject
     with Array[IRow] {
  
  def add(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param row because its type IRow is not an array type */ row: IRow
  ): Double = js.native
}
