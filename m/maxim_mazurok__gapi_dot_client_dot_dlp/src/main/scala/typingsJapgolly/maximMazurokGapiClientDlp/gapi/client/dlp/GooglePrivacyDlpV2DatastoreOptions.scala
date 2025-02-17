package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DatastoreOptions extends StObject {
  
  /** The kind to process. */
  var kind: js.UndefOr[GooglePrivacyDlpV2KindExpression] = js.undefined
  
  /** A partition ID identifies a grouping of entities. The grouping is always by project and namespace, however the namespace ID may be empty. */
  var partitionId: js.UndefOr[GooglePrivacyDlpV2PartitionId] = js.undefined
}
object GooglePrivacyDlpV2DatastoreOptions {
  
  inline def apply(): GooglePrivacyDlpV2DatastoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DatastoreOptions]
  }
  
  extension [Self <: GooglePrivacyDlpV2DatastoreOptions](x: Self) {
    
    inline def setKind(value: GooglePrivacyDlpV2KindExpression): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPartitionId(value: GooglePrivacyDlpV2PartitionId): Self = StObject.set(x, "partitionId", value.asInstanceOf[js.Any])
    
    inline def setPartitionIdUndefined: Self = StObject.set(x, "partitionId", js.undefined)
  }
}
