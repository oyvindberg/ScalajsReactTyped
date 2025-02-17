package typingsJapgolly.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueuesResponse extends StObject {
  
  /**
    * Use this string to request the next batch of queues.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * List of queues.
    */
  var Queues: js.UndefOr[listOfQueue] = js.undefined
}
object ListQueuesResponse {
  
  inline def apply(): ListQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesResponse]
  }
  
  extension [Self <: ListQueuesResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueues(value: listOfQueue): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    inline def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "Queues", js.Array(value*))
  }
}
