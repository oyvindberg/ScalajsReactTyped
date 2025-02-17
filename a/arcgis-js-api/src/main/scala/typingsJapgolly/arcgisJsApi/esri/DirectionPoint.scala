package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bear-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bear-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`boundary-crossing`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`central-fork`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`clockwise-roundabout`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`counter-clockwise-roundabout`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`direction-point`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`down-elevator`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`down-escalator`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`down-stairs`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`general-event`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-fork`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-handed-u-turn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-ramp`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-turn-and-immediate-left-turn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-turn-and-immediate-right-turn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-turn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`off-ferry`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`on-ferry`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`pedestrian-ramp`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`restriction-violation`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`right-fork`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`right-handed-u-turn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`right-ramp`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`right-turn-and-immediate-left-turn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`right-turn-and-immediate-right-turn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`right-turn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`scaled-cost-barrier-event`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`sharp-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`sharp-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`time-zone-change`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`traffic-event`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`u-turn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`up-elevator`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`up-escalator`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`up-stairs`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.arrive
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.depart
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.door
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.elevator
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.escalator
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.header
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.landmark
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.roundabout
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.stairs
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.straight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionPoint
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Time when the action happens.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#arrivalTime)
    */
  var arrivalTime: js.Date = js.native
  
  /**
    * The type of directions event or maneuver described by the point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#directionPointType)
    */
  var directionPointType: header | arrive | depart | straight | `on-ferry` | `off-ferry` | `central-fork` | roundabout | `u-turn` | door | stairs | elevator | escalator | `pedestrian-ramp` | `left-fork` | `left-ramp` | `clockwise-roundabout` | `left-handed-u-turn` | `bear-left` | `left-turn` | `sharp-left` | `left-turn-and-immediate-left-turn` | `left-turn-and-immediate-right-turn` | `right-fork` | `right-ramp` | `counter-clockwise-roundabout` | `right-handed-u-turn` | `bear-right` | `right-turn` | `sharp-right` | `right-turn-and-immediate-left-turn` | `right-turn-and-immediate-right-turn` | `up-elevator` | `up-escalator` | `up-stairs` | `down-elevator` | `down-escalator` | `down-stairs` | `general-event` | landmark | `time-zone-change` | `traffic-event` | `scaled-cost-barrier-event` | `boundary-crossing` | `restriction-violation` = js.native
  
  /**
    * The direction item text to dispay on the screen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#displayText)
    */
  var displayText: String = js.native
  
  /**
    * The local time offset (in minutes) for the arrival time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#endTimeOffset)
    */
  var endTimeOffset: Double = js.native
  
  /**
    * Point representing the direction's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#geometry)
    */
  var geometry: Point = js.native
  
  /**
    * Sequence of the Direction items, starting with 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#sequence)
    */
  var sequence: Double = js.native
  
  /**
    * Creates a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) from the [DirectionPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#toGraphic)
    */
  def toGraphic(): Graphic = js.native
  
  val `type`: `direction-point` = js.native
}
