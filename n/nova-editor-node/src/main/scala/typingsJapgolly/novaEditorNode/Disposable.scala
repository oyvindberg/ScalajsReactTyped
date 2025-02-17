package typingsJapgolly.novaEditorNode

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/disposable/
trait Disposable extends StObject {
  
  def dispose(): Unit
}
object Disposable {
  
  inline def apply(dispose: Callback): Disposable = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
    __obj.asInstanceOf[Disposable]
  }
  
  extension [Self <: Disposable](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
