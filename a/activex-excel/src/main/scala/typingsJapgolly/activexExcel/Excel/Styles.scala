package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styles extends StObject {
  
  def apply(Index: Any): Style = js.native
  
  def Add(Name: String): Style = js.native
  def Add(Name: String, BasedOn: Any): Style = js.native
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Style = js.native
  def Item(Index: Double): Style = js.native
  
  def Merge(Workbook: Workbook): Any = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): Style = js.native
}
