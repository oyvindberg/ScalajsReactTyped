package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadErrorEvent
  extends StObject
     with UploadEvent {
  
  var XMLHttpRequest: js.UndefOr[Any] = js.undefined
  
  var files: js.UndefOr[js.Array[Any]] = js.undefined
  
  var operation: js.UndefOr[String] = js.undefined
}
object UploadErrorEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Upload): UploadErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadErrorEvent]
  }
  
  extension [Self <: UploadErrorEvent](x: Self) {
    
    inline def setFiles(value: js.Array[Any]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: Any*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setXMLHttpRequest(value: Any): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
    
    inline def setXMLHttpRequestUndefined: Self = StObject.set(x, "XMLHttpRequest", js.undefined)
  }
}
