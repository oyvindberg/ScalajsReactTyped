package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsFillAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsFillMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Fill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fill(args: AttrsFillAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Fill", "fillConfig")
  @js.native
  val fillConfig: KernelConfig = js.native
}
