package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Series extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  def ApplyCustomType(ChartType: XlChartType): Unit = js.native
  
  /** @param Type [Type=2] */
  def ApplyDataLabels(
    Type: js.UndefOr[XlDataLabelsType],
    LegendKey: js.UndefOr[Boolean],
    AutoText: js.UndefOr[Boolean],
    HasLeaderLines: js.UndefOr[Boolean],
    ShowSeriesName: js.UndefOr[Boolean],
    ShowCategoryName: js.UndefOr[Boolean],
    ShowValue: js.UndefOr[Boolean],
    ShowPercentage: js.UndefOr[Boolean],
    ShowBubbleSize: js.UndefOr[Boolean],
    Separator: js.UndefOr[String]
  ): Any = js.native
  
  var ApplyPictToEnd: Boolean = js.native
  
  var ApplyPictToFront: Boolean = js.native
  
  var ApplyPictToSides: Boolean = js.native
  
  var AxisGroup: XlAxisGroup = js.native
  
  var BarShape: XlBarShape = js.native
  
  val Border: typingsJapgolly.activexExcel.Excel.Border = js.native
  
  var BubbleSizes: String = js.native
  
  var ChartType: XlChartType = js.native
  
  def ClearFormats(): Any = js.native
  
  def Copy(): Any = js.native
  
  val Creator: XlCreator = js.native
  
  def DataLabels(Index: Double): DataLabel = js.native
  @JSName("DataLabels")
  var DataLabels_Original: DataLabels & (js.Function1[/* Index */ Double, DataLabel]) = js.native
  
  def Delete(): Any = js.native
  
  def ErrorBar(Direction: XlErrorBarDirection, Include: XlErrorBarInclude, Type: XlErrorBarType): Any = js.native
  def ErrorBar(Direction: XlErrorBarDirection, Include: XlErrorBarInclude, Type: XlErrorBarType, Amount: Any): Any = js.native
  def ErrorBar(
    Direction: XlErrorBarDirection,
    Include: XlErrorBarInclude,
    Type: XlErrorBarType,
    Amount: Any,
    MinusValues: Any
  ): Any = js.native
  def ErrorBar(
    Direction: XlErrorBarDirection,
    Include: XlErrorBarInclude,
    Type: XlErrorBarType,
    Amount: Unit,
    MinusValues: Any
  ): Any = js.native
  
  val ErrorBars: typingsJapgolly.activexExcel.Excel.ErrorBars = js.native
  
  /* private */ @JSName("Excel.Series_typekey")
  var ExcelDotSeries_typekey: Series = js.native
  
  var Explosion: Double = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Format: ChartFormat = js.native
  
  var Formula: String = js.native
  
  var FormulaLocal: String = js.native
  
  var FormulaR1C1: String = js.native
  
  var FormulaR1C1Local: String = js.native
  
  var Has3DEffect: Boolean = js.native
  
  var HasDataLabels: Boolean = js.native
  
  var HasErrorBars: Boolean = js.native
  
  var HasLeaderLines: Boolean = js.native
  
  val Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  
  var InvertColor: Double = js.native
  
  var InvertColorIndex: Double = js.native
  
  var InvertIfNegative: Boolean = js.native
  
  val LeaderLines: typingsJapgolly.activexExcel.Excel.LeaderLines = js.native
  
  var MarkerBackgroundColor: Double = js.native
  
  var MarkerBackgroundColorIndex: XlColorIndex = js.native
  
  var MarkerForegroundColor: Double = js.native
  
  var MarkerForegroundColorIndex: XlColorIndex = js.native
  
  var MarkerSize: Double = js.native
  
  var MarkerStyle: XlMarkerStyle = js.native
  
  var Name: String = js.native
  
  val Parent: Any = js.native
  
  def Paste(): Any = js.native
  
  var PictureType: XlChartPictureType = js.native
  
  var PictureUnit: Double = js.native
  
  var PictureUnit2: Double = js.native
  
  val PlotColorIndex: Double = js.native
  
  var PlotOrder: Double = js.native
  
  def Points(Index: Double): Point = js.native
  @JSName("Points")
  var Points_Original: Points & (js.Function1[/* Index */ Double, Point]) = js.native
  
  def Select(): Any = js.native
  
  var Shadow: Boolean = js.native
  
  var Smooth: Boolean = js.native
  
  def Trendlines(Index: String): Trendline = js.native
  def Trendlines(Index: Double): Trendline = js.native
  @JSName("Trendlines")
  var Trendlines_Original: Trendlines & (js.Function1[/* Index */ Double | String, Trendline]) = js.native
  
  var Type: Double = js.native
  
  var Values: Range | SafeArray[Double] = js.native
  
  var XValues: Range | SafeArray[Double] = js.native
  
  /** @param Type [Type=2] */
  def _ApplyDataLabels(): Any = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Any): Any = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Any, AutoText: Any): Any = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Any, AutoText: Any, HasLeaderLines: Any): Any = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Any, AutoText: Unit, HasLeaderLines: Any): Any = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Unit, AutoText: Any): Any = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Unit, AutoText: Any, HasLeaderLines: Any): Any = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Unit, AutoText: Unit, HasLeaderLines: Any): Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType): Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Any): Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Any, AutoText: Any): Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Any, AutoText: Any, HasLeaderLines: Any): Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Any, AutoText: Unit, HasLeaderLines: Any): Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Unit, AutoText: Any): Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Unit, AutoText: Any, HasLeaderLines: Any): Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Unit, AutoText: Unit, HasLeaderLines: Any): Any = js.native
}
