package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsTexturesTextureMod.Texture
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesRawTexture2DArrayMod {
  
  @JSImport("babylonjs/Materials/Textures/rawTexture2DArray", "RawTexture2DArray")
  @js.native
  open class RawTexture2DArray protected () extends Texture {
    /**
      * Create a new RawTexture2DArray
      * @param data defines the data of the texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param depth defines the number of layers of the texture
      * @param format defines the texture format to use
      * @param scene defines the hosting scene
      * @param generateMipMaps defines a boolean indicating if mip levels should be generated (true by default)
      * @param invertY defines if texture must be stored with Y axis inverted
      * @param samplingMode defines the sampling mode to use (Texture.TRILINEAR_SAMPLINGMODE by default)
      * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
      */
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Boolean
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Boolean
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      textureType: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Unit,
      textureType: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Double,
      textureType: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Unit,
      textureType: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Double,
      textureType: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Unit,
      textureType: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Double,
      textureType: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Unit,
      textureType: Double
    ) = this()
    
    /* private */ var _depth: Any = js.native
    
    /**
      * Gets the number of layers of the texture
      */
    def depth: Double = js.native
    
    /** Gets or sets the texture format to use */
    var format: Double = js.native
    
    /**
      * Update the texture with new data
      * @param data defines the data to store in the texture
      */
    def update(data: js.typedarray.ArrayBufferView): Unit = js.native
  }
  /* static members */
  object RawTexture2DArray {
    
    @JSImport("babylonjs/Materials/Textures/rawTexture2DArray", "RawTexture2DArray")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a RGBA texture from some data.
      * @param data Define the texture data
      * @param width Define the width of the texture
      * @param height Define the height of the texture
      * @param depth defines the number of layers of the texture
      * @param scene defines the scene the texture will belong to
      * @param generateMipMaps Define whether or not to create mip maps for the texture
      * @param invertY define if the data should be flipped on Y when uploaded to the GPU
      * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
      * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
      * @returns the RGBA texture
      */
    inline def CreateRGBATexture(data: js.typedarray.ArrayBufferView, width: Double, height: Double, depth: Double, scene: Scene): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Boolean
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Boolean
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      `type`: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Unit,
      `type`: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Double,
      `type`: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Unit,
      `type`: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Boolean
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Double,
      `type`: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Unit,
      `type`: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Double,
      `type`: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
    inline def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      scene: Scene,
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Unit,
      `type`: Double
    ): RawTexture2DArray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[RawTexture2DArray]
  }
}
