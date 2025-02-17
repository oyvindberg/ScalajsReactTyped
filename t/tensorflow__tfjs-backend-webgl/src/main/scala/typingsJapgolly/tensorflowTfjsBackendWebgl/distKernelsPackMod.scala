package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsPackAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsPackMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Pack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pack(args: AttrsPackAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Pack", "packConfig")
  @js.native
  val packConfig: KernelConfig = js.native
}
