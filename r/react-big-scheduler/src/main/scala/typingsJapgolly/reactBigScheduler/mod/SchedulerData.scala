package typingsJapgolly.reactBigScheduler.mod

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.reactBigScheduler.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-big-scheduler", "SchedulerData")
@js.native
open class SchedulerData protected () extends StObject {
  def this(
    date: js.UndefOr[String],
    viewType: js.UndefOr[ViewTypes],
    showAgenda: js.UndefOr[Boolean],
    isEventPerspective: js.UndefOr[Boolean],
    newConfig: js.UndefOr[SchedulerDataConfig],
    newBehaviours: js.UndefOr[js.Object],
    localeMoment: js.UndefOr[FnCall]
  ) = this()
  
  var cellUnit: CellUnits = js.native
  
  def localeMoment(date: String): Moment = js.native
  
  def next(): Unit = js.native
  
  def prev(): Unit = js.native
  
  def setDate(): Unit = js.native
  def setDate(date: String): Unit = js.native
  
  def setEvents(events: js.Array[Event]): Unit = js.native
  
  def setResources(resources: js.Array[Resource]): Unit = js.native
  
  def setViewType(): Unit = js.native
  def setViewType(viewType: Unit, showAgenda: Boolean): Unit = js.native
  def setViewType(viewType: Unit, showAgenda: Boolean, isEventPerspective: Boolean): Unit = js.native
  def setViewType(viewType: Unit, showAgenda: Unit, isEventPerspective: Boolean): Unit = js.native
  def setViewType(viewType: ViewTypes): Unit = js.native
  def setViewType(viewType: ViewTypes, showAgenda: Boolean): Unit = js.native
  def setViewType(viewType: ViewTypes, showAgenda: Boolean, isEventPerspective: Boolean): Unit = js.native
  def setViewType(viewType: ViewTypes, showAgenda: Unit, isEventPerspective: Boolean): Unit = js.native
  
  var startDate: String = js.native
  
  var viewType: ViewTypes = js.native
}
