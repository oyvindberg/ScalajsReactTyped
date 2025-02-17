package typingsJapgolly.officeJs.global.Excel

import typingsJapgolly.officeJs.Excel.ValueFilterCondition.equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum representing all accepted conditions by which a value filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  `PivotFilter.exclusive` can be set to `true` to invert many of these conditions.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.ValueFilterCondition")
@js.native
object ValueFilterCondition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.ValueFilterCondition & String] = js.native
  
  /* "Between" */ val between: typingsJapgolly.officeJs.Excel.ValueFilterCondition.between & String = js.native
  
  /* "BottomN" */ val bottomN: typingsJapgolly.officeJs.Excel.ValueFilterCondition.bottomN & String = js.native
  
  /* "Equals" */ @JSName("equals")
  val equals_ : equals & String = js.native
  
  /* "GreaterThan" */ val greaterThan: typingsJapgolly.officeJs.Excel.ValueFilterCondition.greaterThan & String = js.native
  
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typingsJapgolly.officeJs.Excel.ValueFilterCondition.greaterThanOrEqualTo & String = js.native
  
  /* "LessThan" */ val lessThan: typingsJapgolly.officeJs.Excel.ValueFilterCondition.lessThan & String = js.native
  
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typingsJapgolly.officeJs.Excel.ValueFilterCondition.lessThanOrEqualTo & String = js.native
  
  /* "TopN" */ val topN: typingsJapgolly.officeJs.Excel.ValueFilterCondition.topN & String = js.native
  
  /* "Unknown" */ val unknown: typingsJapgolly.officeJs.Excel.ValueFilterCondition.unknown & String = js.native
}
