package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsLRNGradAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsLrngradMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LRNGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LRNGrad", "LRNGradConfig")
  @js.native
  val LRNGradConfig: KernelConfig = js.native
  
  inline def lRNGrad(args: AttrsLRNGradAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("lRNGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
}
