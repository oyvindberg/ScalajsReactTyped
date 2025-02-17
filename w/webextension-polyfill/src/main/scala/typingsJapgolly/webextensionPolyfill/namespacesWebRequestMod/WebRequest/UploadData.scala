package typingsJapgolly.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data uploaded in a URL request.
  */
trait UploadData extends StObject {
  
  /**
    * An ArrayBuffer with a copy of the data.
    * Optional.
    */
  var bytes: js.UndefOr[Any] = js.undefined
  
  /**
    * A string with the file's path and name.
    * Optional.
    */
  var file: js.UndefOr[String] = js.undefined
}
object UploadData {
  
  inline def apply(): UploadData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadData]
  }
  
  extension [Self <: UploadData](x: Self) {
    
    inline def setBytes(value: Any): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
