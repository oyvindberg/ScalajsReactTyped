package typingsJapgolly.videoJs.mod.default

import typingsJapgolly.videoJs.mod.videojs.Component.ReadyCallback
import typingsJapgolly.videoJs.mod.videojs.DescriptionsButton
import typingsJapgolly.videoJs.mod.videojs.TrackButtonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js", "default.DescriptionsButton")
@js.native
open class DescriptionsButtonCls protected ()
  extends StObject
     with DescriptionsButton {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param [ready]
    *        The function to call when this component is ready.
    */
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player) = this()
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: TrackButtonOptions) = this()
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: Unit, ready: ReadyCallback) = this()
  def this(
    player: typingsJapgolly.videoJs.mod.videojs.Player,
    options: TrackButtonOptions,
    ready: ReadyCallback
  ) = this()
}
