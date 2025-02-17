package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVocabularyRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier of the custom vocabulary.
    */
  var VocabularyId: typingsJapgolly.awsSdk.clientsConnectMod.VocabularyId
}
object DeleteVocabularyRequest {
  
  inline def apply(InstanceId: InstanceId, VocabularyId: VocabularyId): DeleteVocabularyRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], VocabularyId = VocabularyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVocabularyRequest]
  }
  
  extension [Self <: DeleteVocabularyRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setVocabularyId(value: VocabularyId): Self = StObject.set(x, "VocabularyId", value.asInstanceOf[js.Any])
  }
}
