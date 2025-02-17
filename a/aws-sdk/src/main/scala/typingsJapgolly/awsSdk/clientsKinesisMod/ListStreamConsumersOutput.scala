package typingsJapgolly.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamConsumersOutput extends StObject {
  
  /**
    * An array of JSON objects. Each object represents one registered consumer.
    */
  var Consumers: js.UndefOr[ConsumerList] = js.undefined
  
  /**
    * When the number of consumers that are registered with the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of registered consumers, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListStreamConsumers to list the next set of registered consumers. For more information about the use of this pagination token when calling the ListStreamConsumers operation, see ListStreamConsumersInput$NextToken.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListStreamConsumers, you have 300 seconds to use that value. If you specify an expired token in a call to ListStreamConsumers, you get ExpiredNextTokenException. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisMod.NextToken] = js.undefined
}
object ListStreamConsumersOutput {
  
  inline def apply(): ListStreamConsumersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamConsumersOutput]
  }
  
  extension [Self <: ListStreamConsumersOutput](x: Self) {
    
    inline def setConsumers(value: ConsumerList): Self = StObject.set(x, "Consumers", value.asInstanceOf[js.Any])
    
    inline def setConsumersUndefined: Self = StObject.set(x, "Consumers", js.undefined)
    
    inline def setConsumersVarargs(value: Consumer*): Self = StObject.set(x, "Consumers", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
