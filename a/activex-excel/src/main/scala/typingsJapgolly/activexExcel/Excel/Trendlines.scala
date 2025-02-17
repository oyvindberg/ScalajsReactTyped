package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trendlines extends StObject {
  
  def apply(Index: Double): Trendline = js.native
  
  /** @param Type [Type=-4132] */
  def Add(
    Type: js.UndefOr[XlTrendlineType],
    Order: js.UndefOr[Double],
    Period: js.UndefOr[Double],
    Forward: js.UndefOr[Double],
    Backward: js.UndefOr[Double],
    Intercept: js.UndefOr[Any],
    DisplayEquation: js.UndefOr[Boolean],
    DisplayRSquared: js.UndefOr[Boolean],
    Name: js.UndefOr[String]
  ): Trendline = js.native
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Double): Trendline = js.native
  
  val Parent: Any = js.native
  
  def _Default(): Trendline = js.native
  def _Default(Index: Any): Trendline = js.native
}
