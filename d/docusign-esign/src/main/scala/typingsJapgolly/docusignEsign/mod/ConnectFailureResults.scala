package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectFailureResults extends StObject {
  
  /**
    * Details about a Connect failure result.
    */
  var retryQueue: js.UndefOr[
    js.Array[
      /* This object contains details about a Connect failure result. */ ConnectFailureResult
    ]
  ] = js.undefined
}
object ConnectFailureResults {
  
  inline def apply(): ConnectFailureResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectFailureResults]
  }
  
  extension [Self <: ConnectFailureResults](x: Self) {
    
    inline def setRetryQueue(
      value: js.Array[
          /* This object contains details about a Connect failure result. */ ConnectFailureResult
        ]
    ): Self = StObject.set(x, "retryQueue", value.asInstanceOf[js.Any])
    
    inline def setRetryQueueUndefined: Self = StObject.set(x, "retryQueue", js.undefined)
    
    inline def setRetryQueueVarargs(value: (/* This object contains details about a Connect failure result. */ ConnectFailureResult)*): Self = StObject.set(x, "retryQueue", js.Array(value*))
  }
}
