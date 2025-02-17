package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropLines extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Border: typingsJapgolly.activexExcel.Excel.Border
  
  val Creator: XlCreator
  
  def Delete(): Any
  
  /* private */ @JSName("Excel.DropLines_typekey")
  var ExcelDotDropLines_typekey: DropLines
  
  val Format: ChartFormat
  
  val Name: String
  
  val Parent: Any
  
  def Select(): Any
}
object DropLines {
  
  inline def apply(
    Application: Application,
    Border: Border,
    Creator: XlCreator,
    Delete: CallbackTo[Any],
    ExcelDotDropLines_typekey: DropLines,
    Format: ChartFormat,
    Name: String,
    Parent: Any,
    Select: CallbackTo[Any]
  ): DropLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = Select.toJsFn)
    __obj.updateDynamic("Excel.DropLines_typekey")(ExcelDotDropLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropLines]
  }
  
  extension [Self <: DropLines](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: CallbackTo[Any]): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setExcelDotDropLines_typekey(value: DropLines): Self = StObject.set(x, "Excel.DropLines_typekey", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: CallbackTo[Any]): Self = StObject.set(x, "Select", value.toJsFn)
  }
}
