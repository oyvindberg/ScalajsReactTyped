package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideEffectsFlagPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
}
object SideEffectsFlagPlugin {
  
  inline def apply(apply: Compiler => Callback): SideEffectsFlagPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
    __obj.asInstanceOf[SideEffectsFlagPlugin]
  }
  
  extension [Self <: SideEffectsFlagPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
  }
}
