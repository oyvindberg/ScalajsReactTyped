package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeableListViewProps extends StObject {
  
  /**
    * To alert the user that swiping is possible, the first row can bounce
    * on component mount.
    */
  var bounceFirstRowOnMount: Boolean = js.native
  
  /**
    * Use `SwipeableListView.getNewDataSource()` to get a data source to use,
    * then use it just like you would a normal ListView data source
    */
  var dataSource: SwipeableListViewDataSource = js.native
  
  // Maximum distance to open to after a swipe
  var maxSwipeDistance: Double = js.native
  
  // Callback method to render the view that will be unveiled on swipe
  def renderQuickActions(rowData: Any, sectionID: String, rowID: String): Element = js.native
  def renderQuickActions(rowData: Any, sectionID: String, rowID: Double): Element = js.native
  def renderQuickActions(rowData: Any, sectionID: Double, rowID: String): Element = js.native
  def renderQuickActions(rowData: Any, sectionID: Double, rowID: Double): Element = js.native
  
  // Callback method to render the swipeable view
  def renderRow(rowData: Any, sectionID: String, rowID: String): Element = js.native
  def renderRow(rowData: Any, sectionID: String, rowID: String, highlightRow: Boolean): Element = js.native
  def renderRow(rowData: Any, sectionID: String, rowID: Double): Element = js.native
  def renderRow(rowData: Any, sectionID: String, rowID: Double, highlightRow: Boolean): Element = js.native
  def renderRow(rowData: Any, sectionID: Double, rowID: String): Element = js.native
  def renderRow(rowData: Any, sectionID: Double, rowID: String, highlightRow: Boolean): Element = js.native
  def renderRow(rowData: Any, sectionID: Double, rowID: Double): Element = js.native
  def renderRow(rowData: Any, sectionID: Double, rowID: Double, highlightRow: Boolean): Element = js.native
}
