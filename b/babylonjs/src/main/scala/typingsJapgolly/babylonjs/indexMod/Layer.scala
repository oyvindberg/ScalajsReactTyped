package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Layer")
@js.native
open class Layer protected ()
  extends typingsJapgolly.babylonjs.layersIndexMod.Layer {
  /**
    * Instantiates a new layer.
    * This represents a full screen 2d layer.
    * This can be useful to display a picture in the  background of your scene for instance.
    * @see https://www.babylonjs-playground.com/#08A2BS#1
    * @param name Define the name of the layer in the scene
    * @param imgUrl Define the url of the texture to display in the layer
    * @param scene Define the scene the layer belongs to
    * @param isBackground Defines whether the layer is displayed in front or behind the scene
    * @param color Defines a color for the layer
    */
  def this(
    /**
    * Define the name of the layer.
    */
  name: String,
    imgUrl: Nullable[String],
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]
  ) = this()
  def this(
    /**
    * Define the name of the layer.
    */
  name: String,
    imgUrl: Nullable[String],
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    isBackground: Boolean
  ) = this()
  def this(
    /**
    * Define the name of the layer.
    */
  name: String,
    imgUrl: Nullable[String],
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    isBackground: Boolean,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color4
  ) = this()
  def this(
    /**
    * Define the name of the layer.
    */
  name: String,
    imgUrl: Nullable[String],
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    isBackground: Unit,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color4
  ) = this()
}
