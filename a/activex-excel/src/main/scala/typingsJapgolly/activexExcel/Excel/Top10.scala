package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top10 extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  def AppliesTo(Address: String): Range
  def AppliesTo(RowIndex: Double): Range
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("AppliesTo")
  val AppliesTo_Original: Range
  
  def Borders(Index: XlBordersIndex): Border
  @JSName("Borders")
  val Borders_Original: Borders
  
  var CalcFor: XlCalcFor
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.Top10_typekey")
  var ExcelDotTop10_typekey: Top10
  
  val Font: typingsJapgolly.activexExcel.Excel.Font
  
  val Interior: typingsJapgolly.activexExcel.Excel.Interior
  
  def ModifyAppliesToRange(Range: Range): Unit
  
  var NumberFormat: String
  
  val PTCondition: Boolean
  
  val Parent: Any
  
  var Percent: Boolean
  
  var Priority: Double
  
  var Rank: Double
  
  var ScopeType: XlPivotConditionScope
  
  def SetFirstPriority(): Unit
  
  def SetLastPriority(): Unit
  
  var StopIfTrue: Boolean
  
  var TopBottom: XlTopBottom
  
  val Type: Double
}
object Top10 {
  
  inline def apply(
    Application: Application,
    AppliesTo: Range,
    Borders: Borders,
    CalcFor: XlCalcFor,
    Creator: XlCreator,
    Delete: Callback,
    ExcelDotTop10_typekey: Top10,
    Font: Font,
    Interior: Interior,
    ModifyAppliesToRange: Range => Callback,
    NumberFormat: String,
    PTCondition: Boolean,
    Parent: Any,
    Percent: Boolean,
    Priority: Double,
    Rank: Double,
    ScopeType: XlPivotConditionScope,
    SetFirstPriority: Callback,
    SetLastPriority: Callback,
    StopIfTrue: Boolean,
    TopBottom: XlTopBottom,
    Type: Double
  ): Top10 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AppliesTo = AppliesTo.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], CalcFor = CalcFor.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Font = Font.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], ModifyAppliesToRange = js.Any.fromFunction1((t0: Range) => ModifyAppliesToRange(t0).runNow()), NumberFormat = NumberFormat.asInstanceOf[js.Any], PTCondition = PTCondition.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Percent = Percent.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Rank = Rank.asInstanceOf[js.Any], ScopeType = ScopeType.asInstanceOf[js.Any], SetFirstPriority = SetFirstPriority.toJsFn, SetLastPriority = SetLastPriority.toJsFn, StopIfTrue = StopIfTrue.asInstanceOf[js.Any], TopBottom = TopBottom.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Top10_typekey")(ExcelDotTop10_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top10]
  }
  
  extension [Self <: Top10](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAppliesTo(value: Range): Self = StObject.set(x, "AppliesTo", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setCalcFor(value: XlCalcFor): Self = StObject.set(x, "CalcFor", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setExcelDotTop10_typekey(value: Top10): Self = StObject.set(x, "Excel.Top10_typekey", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setModifyAppliesToRange(value: Range => Callback): Self = StObject.set(x, "ModifyAppliesToRange", js.Any.fromFunction1((t0: Range) => value(t0).runNow()))
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    
    inline def setPTCondition(value: Boolean): Self = StObject.set(x, "PTCondition", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPercent(value: Boolean): Self = StObject.set(x, "Percent", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "Rank", value.asInstanceOf[js.Any])
    
    inline def setScopeType(value: XlPivotConditionScope): Self = StObject.set(x, "ScopeType", value.asInstanceOf[js.Any])
    
    inline def setSetFirstPriority(value: Callback): Self = StObject.set(x, "SetFirstPriority", value.toJsFn)
    
    inline def setSetLastPriority(value: Callback): Self = StObject.set(x, "SetLastPriority", value.toJsFn)
    
    inline def setStopIfTrue(value: Boolean): Self = StObject.set(x, "StopIfTrue", value.asInstanceOf[js.Any])
    
    inline def setTopBottom(value: XlTopBottom): Self = StObject.set(x, "TopBottom", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
