package typingsJapgolly.babylonjs.meshesIndexMod

import typingsJapgolly.babylonjs.meshesCompressionMeshoptCompressionMod.IMeshoptCompressionConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "MeshoptCompression")
@js.native
/**
  * Constructor
  */
open class MeshoptCompression ()
  extends typingsJapgolly.babylonjs.meshesCompressionIndexMod.MeshoptCompression
/* static members */
object MeshoptCompression {
  
  @JSImport("babylonjs/Meshes/index", "MeshoptCompression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The configuration. Defaults to the following:
    * ```javascript
    * decoder: {
    *   url: "https://preview.babylonjs.com/meshopt_decoder.js"
    * }
    * ```
    */
  @JSImport("babylonjs/Meshes/index", "MeshoptCompression.Configuration")
  @js.native
  def Configuration: IMeshoptCompressionConfiguration = js.native
  inline def Configuration_=(x: IMeshoptCompressionConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Meshes/index", "MeshoptCompression._Default")
  @js.native
  def _Default: Any = js.native
  inline def _Default_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Default")(x.asInstanceOf[js.Any])
}
