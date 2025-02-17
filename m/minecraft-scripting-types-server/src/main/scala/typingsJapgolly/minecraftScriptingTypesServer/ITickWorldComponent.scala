package typingsJapgolly.minecraftScriptingTypesServer

import typingsJapgolly.minecraftScriptingTypesShared.IEntityTickingArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The tick world component is a read-only component that allows users to access the ticking areas on entities as well as the ticking area's data.
  */
trait ITickWorldComponent extends StObject {
  
  /**
    * distance_to_players
    */
  var distance_to_players: Double
  
  /**
    * Whether or not this ticking area will despawn when a player is out of range
    */
  var never_despawn: Boolean
  
  /**
    * The radius in chunks of the ticking area
    */
  var radius: Double
  
  /**
    * The ticking area entity that is attached to this entity
    */
  var ticking_area: IEntityTickingArea
}
object ITickWorldComponent {
  
  inline def apply(
    distance_to_players: Double,
    never_despawn: Boolean,
    radius: Double,
    ticking_area: IEntityTickingArea
  ): ITickWorldComponent = {
    val __obj = js.Dynamic.literal(distance_to_players = distance_to_players.asInstanceOf[js.Any], never_despawn = never_despawn.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], ticking_area = ticking_area.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITickWorldComponent]
  }
  
  extension [Self <: ITickWorldComponent](x: Self) {
    
    inline def setDistance_to_players(value: Double): Self = StObject.set(x, "distance_to_players", value.asInstanceOf[js.Any])
    
    inline def setNever_despawn(value: Boolean): Self = StObject.set(x, "never_despawn", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setTicking_area(value: IEntityTickingArea): Self = StObject.set(x, "ticking_area", value.asInstanceOf[js.Any])
  }
}
