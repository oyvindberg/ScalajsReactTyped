package typingsJapgolly.googleVisualization.global.google.visualization

import typingsJapgolly.googleVisualization.google.visualization.DateFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.visualization.DateFormat")
@js.native
open class DateFormat protected ()
  extends StObject
     with typingsJapgolly.googleVisualization.google.visualization.DateFormat {
  def this(options: DateFormatOptions) = this()
  
  /**
    * Reformats the data in the specified column.
    *
    * @param data - A DataTable containing the data to reformat. You cannot use a DataView here.
    * @param columnIndex - The zero-based index of the column to format. To format multiple columns, you must call this method multiple times, with different colIndex values.
    */
  /* CompleteClass */
  override def format(data: typingsJapgolly.googleVisualization.google.visualization.DataTable, columnIndex: Double): Unit = js.native
  
  /**
    * Returns the formatted value of a given value. This method does not require a DataTable.
    */
  /* CompleteClass */
  override def formatValue(value: js.Date): String = js.native
}
