package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoDownBars extends StObject {
  
  val Application: Any
  
  val Border: IMsoBorder
  
  val Creator: Double
  
  def Delete(): Any
  
  val Fill: ChartFillFormat
  
  val Format: IMsoChartFormat
  
  val Interior: IMsoInterior
  
  val Name: String
  
  /* private */ @JSName("Office.IMsoDownBars_typekey")
  var OfficeDotIMsoDownBars_typekey: IMsoDownBars
  
  val Parent: Any
  
  def Select(): Any
}
object IMsoDownBars {
  
  inline def apply(
    Application: Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: CallbackTo[Any],
    Fill: ChartFillFormat,
    Format: IMsoChartFormat,
    Interior: IMsoInterior,
    Name: String,
    OfficeDotIMsoDownBars_typekey: IMsoDownBars,
    Parent: Any,
    Select: CallbackTo[Any]
  ): IMsoDownBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = Select.toJsFn)
    __obj.updateDynamic("Office.IMsoDownBars_typekey")(OfficeDotIMsoDownBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoDownBars]
  }
  
  extension [Self <: IMsoDownBars](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: CallbackTo[Any]): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: IMsoInterior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoDownBars_typekey(value: IMsoDownBars): Self = StObject.set(x, "Office.IMsoDownBars_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: CallbackTo[Any]): Self = StObject.set(x, "Select", value.toJsFn)
  }
}
