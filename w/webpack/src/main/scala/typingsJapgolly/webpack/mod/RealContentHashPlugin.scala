package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealContentHashPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
}
object RealContentHashPlugin {
  
  inline def apply(apply: Compiler => Callback): RealContentHashPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
    __obj.asInstanceOf[RealContentHashPlugin]
  }
  
  extension [Self <: RealContentHashPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
  }
}
