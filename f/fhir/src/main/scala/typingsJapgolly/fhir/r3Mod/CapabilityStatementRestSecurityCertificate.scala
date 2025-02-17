package typingsJapgolly.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatementRestSecurityCertificate
  extends StObject
     with BackboneElement {
  
  var _blob: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Actual certificate.
    */
  var blob: js.UndefOr[String] = js.undefined
  
  /**
    * Mime type for a certificate.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object CapabilityStatementRestSecurityCertificate {
  
  inline def apply(): CapabilityStatementRestSecurityCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilityStatementRestSecurityCertificate]
  }
  
  extension [Self <: CapabilityStatementRestSecurityCertificate](x: Self) {
    
    inline def setBlob(value: String): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_blob(value: Element): Self = StObject.set(x, "_blob", value.asInstanceOf[js.Any])
    
    inline def set_blobUndefined: Self = StObject.set(x, "_blob", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
