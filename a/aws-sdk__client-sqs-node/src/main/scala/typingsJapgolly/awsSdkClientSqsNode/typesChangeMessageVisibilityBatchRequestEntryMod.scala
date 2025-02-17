package typingsJapgolly.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesChangeMessageVisibilityBatchRequestEntryMod {
  
  trait ChangeMessageVisibilityBatchRequestEntry extends StObject {
    
    /**
      * <p>An identifier for this particular receipt handle used to communicate the result.</p> <note> <p>The <code>Id</code>s of a batch request need to be unique within a request</p> </note>
      */
    var Id: String
    
    /**
      * <p>A receipt handle.</p>
      */
    var ReceiptHandle: String
    
    /**
      * <p>The new value (in seconds) for the message's visibility timeout.</p>
      */
    var VisibilityTimeout: js.UndefOr[Double] = js.undefined
  }
  object ChangeMessageVisibilityBatchRequestEntry {
    
    inline def apply(Id: String, ReceiptHandle: String): ChangeMessageVisibilityBatchRequestEntry = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeMessageVisibilityBatchRequestEntry]
    }
    
    extension [Self <: ChangeMessageVisibilityBatchRequestEntry](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
      
      inline def setVisibilityTimeout(value: Double): Self = StObject.set(x, "VisibilityTimeout", value.asInstanceOf[js.Any])
      
      inline def setVisibilityTimeoutUndefined: Self = StObject.set(x, "VisibilityTimeout", js.undefined)
    }
  }
  
  type UnmarshalledChangeMessageVisibilityBatchRequestEntry = ChangeMessageVisibilityBatchRequestEntry
}
