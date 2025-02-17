package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteThesaurusRequest extends StObject {
  
  /**
    * The identifier of the thesaurus you want to delete.
    */
  var Id: ThesaurusId
  
  /**
    * The identifier of the index for the thesaurus.
    */
  var IndexId: typingsJapgolly.awsSdk.clientsKendraMod.IndexId
}
object DeleteThesaurusRequest {
  
  inline def apply(Id: ThesaurusId, IndexId: IndexId): DeleteThesaurusRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThesaurusRequest]
  }
  
  extension [Self <: DeleteThesaurusRequest](x: Self) {
    
    inline def setId(value: ThesaurusId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
