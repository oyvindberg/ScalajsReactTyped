package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtractHighlightsPostProcess
  extends StObject
     with PostProcess {
  
  /** @internal */
  var _exposure: Double = js.native
  
  /**
    * Post process which has the input texture to be used when performing highlight extraction
    * @internal
    */
  var _inputPostProcess: Nullable[PostProcess] = js.native
  
  /**
    * The luminance threshold, pixels below this value will be set to black.
    */
  var threshold: Double = js.native
}
