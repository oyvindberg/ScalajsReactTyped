package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexOffice.Office.MsoColorType
import typingsJapgolly.activexOffice.Office.MsoRGBType
import typingsJapgolly.activexOffice.Office.MsoThemeColorIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.ColorFormat")
@js.native
/* private */ open class ColorFormat ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.ColorFormat {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var Brightness: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.ColorFormat_typekey")
  var ExcelDotColorFormat_typekey: typingsJapgolly.activexExcel.Excel.ColorFormat = js.native
  
  /* CompleteClass */
  var ObjectThemeColor: MsoThemeColorIndex = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var RGB: MsoRGBType = js.native
  
  /* CompleteClass */
  var SchemeColor: Double = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
  
  /* CompleteClass */
  override val Type: MsoColorType = js.native
}
