package typingsJapgolly.phaser.mod.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextStyle class manages all of the style settings for a Text object.
  * 
  * Text Game Objects create a TextStyle instance automatically, which is
  * accessed via the `Text.style` property. You do not normally need to
  * instantiate one yourself.
  */
@JSImport("phaser", "GameObjects.TextStyle")
@js.native
open class TextStyle protected ()
  extends StObject
     with typingsJapgolly.phaser.Phaser.GameObjects.TextStyle {
  /**
    * 
    * @param text The Text object that this TextStyle is styling.
    * @param style The style settings to set.
    */
  def this(
    text: typingsJapgolly.phaser.Phaser.GameObjects.Text,
    style: typingsJapgolly.phaser.Phaser.Types.GameObjects.Text.TextStyle
  ) = this()
}
