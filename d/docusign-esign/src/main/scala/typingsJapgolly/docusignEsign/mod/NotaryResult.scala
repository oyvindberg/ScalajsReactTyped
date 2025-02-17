package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotaryResult extends StObject {
  
  var jurisdictions: js.UndefOr[js.Array[Jurisdiction]] = js.undefined
  
  var notary: js.UndefOr[Notary] = js.undefined
}
object NotaryResult {
  
  inline def apply(): NotaryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryResult]
  }
  
  extension [Self <: NotaryResult](x: Self) {
    
    inline def setJurisdictions(value: js.Array[Jurisdiction]): Self = StObject.set(x, "jurisdictions", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionsUndefined: Self = StObject.set(x, "jurisdictions", js.undefined)
    
    inline def setJurisdictionsVarargs(value: Jurisdiction*): Self = StObject.set(x, "jurisdictions", js.Array(value*))
    
    inline def setNotary(value: Notary): Self = StObject.set(x, "notary", value.asInstanceOf[js.Any])
    
    inline def setNotaryUndefined: Self = StObject.set(x, "notary", js.undefined)
  }
}
