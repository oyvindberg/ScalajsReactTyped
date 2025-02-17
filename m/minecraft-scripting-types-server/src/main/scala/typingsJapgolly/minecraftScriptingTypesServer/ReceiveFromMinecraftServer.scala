package typingsJapgolly.minecraftScriptingTypesServer

import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonblock_destruction_started
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonblock_destruction_stopped
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonblock_interacted_with
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_acquired_item
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_carried_item_changed
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_created
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_death
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_dropped_item
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_equipped_armor
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_start_riding
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_stop_riding
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_tick
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_use_item
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonpiston_moved_block
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonplay_sound
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonplayer_attacked_entity
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonplayer_destroyed_block
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonplayer_placed_block
import typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonweather_changed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * (Server-side) Events that can be received from Minecraft
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonblock_destruction_started
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonblock_destruction_stopped
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonblock_interacted_with
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_acquired_item
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_carried_item_changed
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_created
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_death
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_dropped_item
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_equipped_armor
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_start_riding
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_stop_riding
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_tick
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonentity_use_item
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonpiston_moved_block
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonplay_sound
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonplayer_attacked_entity
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonplayer_destroyed_block
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonplayer_placed_block
  - typingsJapgolly.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonweather_changed
*/
trait ReceiveFromMinecraftServer extends StObject
object ReceiveFromMinecraftServer {
  
  /**
    * This event is triggered whenever a player starts to destroy a block.
    */
  inline def BlockDestructionStarted: minecraftColonblock_destruction_started = "minecraft:block_destruction_started".asInstanceOf[minecraftColonblock_destruction_started]
  
  /**
    * This event is triggered whenever a player stops destroying a block.
    */
  inline def BlockDestructionStopped: minecraftColonblock_destruction_stopped = "minecraft:block_destruction_stopped".asInstanceOf[minecraftColonblock_destruction_stopped]
  
  /**
    * This event is triggered whenever a player interacts with a block.
    */
  inline def BlockInteractedWith: minecraftColonblock_interacted_with = "minecraft:block_interacted_with".asInstanceOf[minecraftColonblock_interacted_with]
  
  /**
    * This event is triggered whenever an entity acquires an item.
    */
  inline def EntityAcquiredItem: minecraftColonentity_acquired_item = "minecraft:entity_acquired_item".asInstanceOf[minecraftColonentity_acquired_item]
  
  /**
    * This event is triggered whenever an entity changes the item carried in their hand.
    */
  inline def EntityCarriedItemChanged: minecraftColonentity_carried_item_changed = "minecraft:entity_carried_item_changed".asInstanceOf[minecraftColonentity_carried_item_changed]
  
  /**
    * This event is triggered whenever an entity is added to the world.
    */
  inline def EntityCreated: minecraftColonentity_created = "minecraft:entity_created".asInstanceOf[minecraftColonentity_created]
  
  /**
    * This event is triggered whenever an entity dies. This won't be triggered when an entity is removed (such as when using destroyEntity).
    */
  inline def EntityDeath: minecraftColonentity_death = "minecraft:entity_death".asInstanceOf[minecraftColonentity_death]
  
  /**
    * This event is triggered whenever an entity drops an item.
    */
  inline def EntityDroppedItem: minecraftColonentity_dropped_item = "minecraft:entity_dropped_item".asInstanceOf[minecraftColonentity_dropped_item]
  
  /**
    * This event is triggered whenever an entity equips an item in their armor slots.
    */
  inline def EntityEquippedArmor: minecraftColonentity_equipped_armor = "minecraft:entity_equipped_armor".asInstanceOf[minecraftColonentity_equipped_armor]
  
  /**
    * This event is triggered whenever an entity becomes a rider on another entity.
    */
  inline def EntityStartRiding: minecraftColonentity_start_riding = "minecraft:entity_start_riding".asInstanceOf[minecraftColonentity_start_riding]
  
  /**
    * This event is triggered whenever an entity stops riding another entity.
    */
  inline def EntityStopRiding: minecraftColonentity_stop_riding = "minecraft:entity_stop_riding".asInstanceOf[minecraftColonentity_stop_riding]
  
  /**
    * This event is triggered whenever an entity is ticked. This event will not fire when a player is ticked.
    */
  inline def EntityTick: minecraftColonentity_tick = "minecraft:entity_tick".asInstanceOf[minecraftColonentity_tick]
  
  /**
    * This event is triggered whenever an entity uses an item.
    */
  inline def EntityUseItem: minecraftColonentity_use_item = "minecraft:entity_use_item".asInstanceOf[minecraftColonentity_use_item]
  
  /**
    * This event is triggered whenever a piston moves a block.
    */
  inline def PistonMovedBlock: minecraftColonpiston_moved_block = "minecraft:piston_moved_block".asInstanceOf[minecraftColonpiston_moved_block]
  
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  inline def PlaySound: minecraftColonplay_sound = "minecraft:play_sound".asInstanceOf[minecraftColonplay_sound]
  
  /**
    * This event is triggered whenever a player attacks an entity.
    */
  inline def PlayerAttackedEntity: minecraftColonplayer_attacked_entity = "minecraft:player_attacked_entity".asInstanceOf[minecraftColonplayer_attacked_entity]
  
  /**
    * This event is triggered whenever a player destroys a block.
    */
  inline def PlayerDestroyedBlock: minecraftColonplayer_destroyed_block = "minecraft:player_destroyed_block".asInstanceOf[minecraftColonplayer_destroyed_block]
  
  /**
    * This event is triggered whenever a player places a block.
    */
  inline def PlayerPlacedBlock: minecraftColonplayer_placed_block = "minecraft:player_placed_block".asInstanceOf[minecraftColonplayer_placed_block]
  
  /**
    * This event is triggered whenever the weather changes. It contains information about the weather it is changing to.
    */
  inline def WeatherChanged: minecraftColonweather_changed = "minecraft:weather_changed".asInstanceOf[minecraftColonweather_changed]
}
