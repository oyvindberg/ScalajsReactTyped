package typingsJapgolly.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesConsumedCapacityMod.UnmarshalledConsumedCapacity
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesScanOutputMod {
  
  trait ScanOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The capacity units consumed by the <code>Scan</code> operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ConsumedCapacity: js.UndefOr[UnmarshalledConsumedCapacity] = js.undefined
    
    /**
      * <p>The number of items in the response.</p> <p>If you set <code>ScanFilter</code> in the request, then <code>Count</code> is the number of items returned after the filter was applied, and <code>ScannedCount</code> is the number of matching items before the filter was applied.</p> <p>If you did not use a filter in the request, then <code>Count</code> is the same as <code>ScannedCount</code>.</p>
      */
    var Count: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>An array of item attributes that match the scan criteria. Each element in this array consists of an attribute name and the value for that attribute.</p>
      */
    var Items: js.UndefOr[js.Array[StringDictionary[UnmarshalledAttributeValue]]] = js.undefined
    
    /**
      * <p>The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request.</p> <p>If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has been processed and there is no more data to be retrieved.</p> <p>If <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when <code>LastEvaluatedKey</code> is empty.</p>
      */
    var LastEvaluatedKey: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.undefined
    
    /**
      * <p>The number of items evaluated, before any <code>ScanFilter</code> is applied. A high <code>ScannedCount</code> value with few, or no, <code>Count</code> results indicates an inefficient <code>Scan</code> operation. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p> <p>If you did not use a filter in the request, then <code>ScannedCount</code> is the same as <code>Count</code>.</p>
      */
    var ScannedCount: js.UndefOr[Double] = js.undefined
  }
  object ScanOutput {
    
    inline def apply($metadata: ResponseMetadata): ScanOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanOutput]
    }
    
    extension [Self <: ScanOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacity(value: UnmarshalledConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
      
      inline def setItems(value: js.Array[StringDictionary[UnmarshalledAttributeValue]]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
      
      inline def setItemsVarargs(value: StringDictionary[UnmarshalledAttributeValue]*): Self = StObject.set(x, "Items", js.Array(value*))
      
      inline def setLastEvaluatedKey(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
      
      inline def setScannedCount(value: Double): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
      
      inline def setScannedCountUndefined: Self = StObject.set(x, "ScannedCount", js.undefined)
    }
  }
}
