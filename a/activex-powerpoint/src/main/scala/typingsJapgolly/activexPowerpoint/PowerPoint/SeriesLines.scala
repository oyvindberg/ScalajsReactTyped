package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesLines extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val Border: ChartBorder
  
  val Creator: Double
  
  def Delete(): Any
  
  val Format: ChartFormat
  
  val Name: String
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.SeriesLines_typekey")
  var PowerPointDotSeriesLines_typekey: SeriesLines
  
  def Select(): Any
}
object SeriesLines {
  
  inline def apply(
    Application: Application,
    Border: ChartBorder,
    Creator: Double,
    Delete: CallbackTo[Any],
    Format: ChartFormat,
    Name: String,
    Parent: Any,
    PowerPointDotSeriesLines_typekey: SeriesLines,
    Select: CallbackTo[Any]
  ): SeriesLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = Select.toJsFn)
    __obj.updateDynamic("PowerPoint.SeriesLines_typekey")(PowerPointDotSeriesLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLines]
  }
  
  extension [Self <: SeriesLines](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: CallbackTo[Any]): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotSeriesLines_typekey(value: SeriesLines): Self = StObject.set(x, "PowerPoint.SeriesLines_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: CallbackTo[Any]): Self = StObject.set(x, "Select", value.toJsFn)
  }
}
