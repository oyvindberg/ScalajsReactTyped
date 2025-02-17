package typingsJapgolly.phaser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Phaser.Game instance is the main controller for the entire Phaser game. It is responsible
  * for handling the boot process, parsing the configuration values, creating the renderer,
  * and setting-up all of the global Phaser systems, such as sound and input.
  * Once that is complete it will start the Scene Manager and then begin the main game loop.
  * 
  * You should generally avoid accessing any of the systems created by Game, and instead use those
  * made available to you via the Phaser.Scene Systems class instead.
  */
@JSImport("phaser", "Game")
@js.native
/**
  * 
  * @param GameConfig The configuration object for your Phaser Game instance.
  */
open class Game ()
  extends StObject
     with typingsJapgolly.phaser.Phaser.Game {
  def this(GameConfig: typingsJapgolly.phaser.Phaser.Types.Core.GameConfig) = this()
}
