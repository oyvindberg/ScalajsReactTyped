package typingsJapgolly.minecraftScriptingTypesClient

import typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonclient_entered_world
import typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonhit_result_changed
import typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonhit_result_continuous
import typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonpick_hit_result_changed
import typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonpick_hit_result_continuous
import typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonui_event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * (Client-side) Events that can be received from Minecraft
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonclient_entered_world
  - typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonhit_result_changed
  - typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonhit_result_continuous
  - typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonpick_hit_result_changed
  - typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonpick_hit_result_continuous
  - typingsJapgolly.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonui_event
*/
trait ReceiveFromMinecraftClient extends StObject
object ReceiveFromMinecraftClient {
  
  /**
    * This event is fired whenever a player joins the world. The event data contains the player entity object.
    */
  inline def ClientEnteredWorld: minecraftColonclient_entered_world = "minecraft:client_entered_world".asInstanceOf[minecraftColonclient_entered_world]
  
  /**
    * This event is triggered whenever the reticle changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
    */
  inline def HitResultChanged: minecraftColonhit_result_changed = "minecraft:hit_result_changed".asInstanceOf[minecraftColonhit_result_changed]
  
  /**
    * This event is triggered every update and tells you what entity the reticle is pointing to in the world up to 1000 blocks away.
    */
  inline def HitResultContinuous: minecraftColonhit_result_continuous = "minecraft:hit_result_continuous".asInstanceOf[minecraftColonhit_result_continuous]
  
  /**
    * This event is triggered whenever the mouse pointer changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
    */
  inline def PickHitResultChanged: minecraftColonpick_hit_result_changed = "minecraft:pick_hit_result_changed".asInstanceOf[minecraftColonpick_hit_result_changed]
  
  /**
    * This event is triggered every update and tells you what entity the mouse pointer is pointing to in the world up to 1000 blocks away.
    */
  inline def PickHitResultContinuous: minecraftColonpick_hit_result_continuous = "minecraft:pick_hit_result_continuous".asInstanceOf[minecraftColonpick_hit_result_continuous]
  
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  inline def UIEvent: minecraftColonui_event = "minecraft:ui_event".asInstanceOf[minecraftColonui_event]
}
