package typingsJapgolly.dropboxjs.Dropbox

import org.scalajs.dom.Blob
import org.scalajs.dom.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  trait EventSource extends StObject {
    
    def addListener(listener: js.Function1[/* event */ Any, Unit]): EventSource
    
    def dispatch(event: js.Object): Boolean
    
    def removeListener(listener: js.Function1[/* event */ Any, Unit]): EventSource
  }
  object EventSource {
    
    inline def apply(
      addListener: js.Function1[/* event */ Any, Unit] => EventSource,
      dispatch: js.Object => Boolean,
      removeListener: js.Function1[/* event */ Any, Unit] => EventSource
    ): EventSource = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), dispatch = js.Any.fromFunction1(dispatch), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[EventSource]
    }
    
    extension [Self <: EventSource](x: Self) {
      
      inline def setAddListener(value: js.Function1[/* event */ Any, Unit] => EventSource): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      inline def setDispatch(value: js.Object => Boolean): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: js.Function1[/* event */ Any, Unit] => EventSource): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  trait Oauth extends StObject {
    
    def checkAuthStateParam(stateParam: String): Boolean
  }
  object Oauth {
    
    inline def apply(checkAuthStateParam: String => Boolean): Oauth = {
      val __obj = js.Dynamic.literal(checkAuthStateParam = js.Any.fromFunction1(checkAuthStateParam))
      __obj.asInstanceOf[Oauth]
    }
    
    extension [Self <: Oauth](x: Self) {
      
      inline def setCheckAuthStateParam(value: String => Boolean): Self = StObject.set(x, "checkAuthStateParam", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Xhr extends StObject {
    
    def addOauthHeader(oauth: Oauth): Xhr = js.native
    
    def addOauthParams(oauth: Oauth): Xhr = js.native
    
    def onError(error: ApiError, callBack: js.Function1[/* error */ ApiError, Unit]): Unit = js.native
    
    def onReadyStateChange(): Unit = js.native
    
    def onXdrError(): Unit = js.native
    
    def onXdrLoad(): Unit = js.native
    
    def prepare(): Xhr = js.native
    
    def reportResponseHeaders(): Xhr = js.native
    
    def send(
      callback: js.Function3[/* err */ ApiError, /* responseType */ String, /* metadataHeader */ js.Object, Unit]
    ): Xhr = js.native
    
    def setBody(body: String): Xhr = js.native
    def setBody(body: js.typedarray.ArrayBuffer): Xhr = js.native
    def setBody(body: Blob): Xhr = js.native
    
    def setCallback(
      callback: js.Function4[
          /* err */ ApiError, 
          /* responseType */ String, 
          /* metadataHeader */ js.Object, 
          /* headers */ js.Object, 
          Unit
        ]
    ): Xhr = js.native
    
    def setFileField(fieldName: String, fileName: String, fileData: String): Unit = js.native
    def setFileField(fieldName: String, fileName: String, fileData: String, contentType: String): Unit = js.native
    def setFileField(fieldName: String, fileName: String, fileData: Blob): Unit = js.native
    def setFileField(fieldName: String, fileName: String, fileData: Blob, contentType: String): Unit = js.native
    def setFileField(fieldName: String, fileName: String, fileData: org.scalajs.dom.File): Unit = js.native
    def setFileField(fieldName: String, fileName: String, fileData: org.scalajs.dom.File, contentType: String): Unit = js.native
    
    def setHeader(headerName: String, value: String): Xhr = js.native
    
    def setParams(params: QueryParams): Xhr = js.native
    
    def setResponseType(responseType: String): Xhr = js.native
    
    def signWithOauth(oauth: Oauth, cacheFriendly: Boolean): Xhr = js.native
    
    var xhr: XMLHttpRequest = js.native
  }
}
