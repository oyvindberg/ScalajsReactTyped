package typingsJapgolly.three

import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.three.anon.Calls
import typingsJapgolly.three.anon.Textures
import typingsJapgolly.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLInfoMod {
  
  @JSImport("three/src/renderers/webgl/WebGLInfo", "WebGLInfo")
  @js.native
  open class WebGLInfo protected () extends StObject {
    def this(gl: WebGLRenderingContext) = this()
    
    /**
      * @default true
      */
    var autoReset: Boolean = js.native
    
    /**
      * @default { geometries: 0, textures: 0 }
      */
    var memory: Textures = js.native
    
    /**
      * @default null
      */
    var programs: js.Array[WebGLProgram] | Null = js.native
    
    /**
      * @default { frame: 0, calls: 0, triangles: 0, points: 0, lines: 0 }
      */
    var render: Calls = js.native
    
    def reset(): Unit = js.native
    
    def update(count: Double, mode: Double, instanceCount: Double): Unit = js.native
  }
}
