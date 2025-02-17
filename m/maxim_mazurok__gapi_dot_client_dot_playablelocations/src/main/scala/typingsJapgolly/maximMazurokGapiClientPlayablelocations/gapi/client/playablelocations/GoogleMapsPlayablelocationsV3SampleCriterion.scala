package typingsJapgolly.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMapsPlayablelocationsV3SampleCriterion extends StObject {
  
  /**
    * Specifies which `PlayableLocation` fields are returned. `name` (which is used for logging impressions), `center_point` and `place_id` (or `plus_code`) are always returned. The
    * following fields are omitted unless you specify them here: * snapped_point * types Note: The more fields you include, the more expensive in terms of data and associated latency your
    * query will be.
    */
  var fieldsToReturn: js.UndefOr[String] = js.undefined
  
  /** Specifies filtering options, and specifies what will be included in the result set. */
  var filter: js.UndefOr[GoogleMapsPlayablelocationsV3SampleFilter] = js.undefined
  
  /**
    * Required. An arbitrary, developer-defined identifier of the type of game object that the playable location is used for. This field allows you to specify criteria per game object
    * type when searching for playable locations. You should assign a unique `game_object_type` ID across all `request_criteria` to represent a distinct type of game object. For example,
    * 1=monster location, 2=powerup location. The response contains a map.
    */
  var gameObjectType: js.UndefOr[Double] = js.undefined
}
object GoogleMapsPlayablelocationsV3SampleCriterion {
  
  inline def apply(): GoogleMapsPlayablelocationsV3SampleCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SampleCriterion]
  }
  
  extension [Self <: GoogleMapsPlayablelocationsV3SampleCriterion](x: Self) {
    
    inline def setFieldsToReturn(value: String): Self = StObject.set(x, "fieldsToReturn", value.asInstanceOf[js.Any])
    
    inline def setFieldsToReturnUndefined: Self = StObject.set(x, "fieldsToReturn", js.undefined)
    
    inline def setFilter(value: GoogleMapsPlayablelocationsV3SampleFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGameObjectType(value: Double): Self = StObject.set(x, "gameObjectType", value.asInstanceOf[js.Any])
    
    inline def setGameObjectTypeUndefined: Self = StObject.set(x, "gameObjectType", js.undefined)
  }
}
