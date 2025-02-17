package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Size")
@js.native
open class Size protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Size {
  /**
    * Creates a Size object from the given width and height (floats).
    * @param width width of the new size
    * @param height height of the new size
    */
  def this(width: Double, height: Double) = this()
  
  /**
    * Height
    */
  /* CompleteClass */
  var height: Double = js.native
  
  /**
    * Width
    */
  /* CompleteClass */
  var width: Double = js.native
}
/* static members */
object Size {
  
  @JSGlobal("BABYLON.Size")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Size set at the linear interpolation "amount" between "start" and "end"
    * @param start starting size to lerp between
    * @param end end size to lerp between
    * @param amount amount to lerp between the start and end values
    * @returns a new Size set at the linear interpolation "amount" between "start" and "end"
    */
  inline def Lerp(
    start: typingsJapgolly.babylonjs.BABYLON.Size,
    end: typingsJapgolly.babylonjs.BABYLON.Size,
    amount: Double
  ): typingsJapgolly.babylonjs.BABYLON.Size = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Size]
  
  /**
    * Create a new size of zero
    * @returns a new Size set to (0.0, 0.0)
    */
  inline def Zero(): typingsJapgolly.babylonjs.BABYLON.Size = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Size]
}
