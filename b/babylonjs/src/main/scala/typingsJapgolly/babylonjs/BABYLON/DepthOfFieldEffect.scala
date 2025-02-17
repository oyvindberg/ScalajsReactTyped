package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthOfFieldEffect
  extends StObject
     with PostProcessRenderEffect {
  
  /* private */ var _circleOfConfusion: Any = js.native
  
  /**
    * @internal Internal, blurs from high to low
    */
  var _depthOfFieldBlurX: js.Array[DepthOfFieldBlurPostProcess] = js.native
  
  /* private */ var _depthOfFieldBlurY: Any = js.native
  
  /* private */ var _dofMerge: Any = js.native
  
  /**
    * @internal Internal post processes in depth of field effect
    */
  var _effects: js.Array[PostProcess] = js.native
  
  /**
    * Internal
    * @returns if all the contained post processes are ready.
    * @internal
    */
  def _isReady(): Boolean = js.native
  
  /**
    * @internal Internal
    */
  def _updateEffects(): Unit = js.native
  
  /**
    * Depth texture to be used to compute the circle of confusion. This must be set here or in the constructor in order for the post process to function.
    */
  def depthTexture_=(value: RenderTargetTexture): Unit = js.native
  
  /**
    * Disposes each of the internal effects for a given camera.
    * @param camera The camera to dispose the effect on.
    */
  def disposeEffects(camera: Camera): Unit = js.native
  
  def fStop: Double = js.native
  /**
    * F-Stop of the effect's camera. The diameter of the resulting aperture can be computed by lensSize/fStop. (default: 1.4)
    */
  def fStop_=(value: Double): Unit = js.native
  
  def focalLength: Double = js.native
  /**
    * The focal the length of the camera used in the effect in scene units/1000 (eg. millimeter)
    */
  def focalLength_=(value: Double): Unit = js.native
  
  def focusDistance: Double = js.native
  /**
    * Distance away from the camera to focus on in scene units/1000 (eg. millimeter). (default: 2000)
    */
  def focusDistance_=(value: Double): Unit = js.native
  
  /**
    * Get the current class name of the current effect
    * @returns "DepthOfFieldEffect"
    */
  def getClassName(): String = js.native
  
  def lensSize: Double = js.native
  /**
    * Max lens size in scene units/1000 (eg. millimeter). Standard cameras are 50mm. (default: 50) The diameter of the resulting aperture can be computed by lensSize/fStop.
    */
  def lensSize_=(value: Double): Unit = js.native
}
