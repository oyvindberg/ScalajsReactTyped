package typingsJapgolly.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlTagConfigurationType extends StObject {
  
  var normalizeIdentifier: js.UndefOr[IdentifierNormalizerType] = js.undefined
}
object SqlTagConfigurationType {
  
  inline def apply(): SqlTagConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlTagConfigurationType]
  }
  
  extension [Self <: SqlTagConfigurationType](x: Self) {
    
    inline def setNormalizeIdentifier(value: /* identifierName */ String => String): Self = StObject.set(x, "normalizeIdentifier", js.Any.fromFunction1(value))
    
    inline def setNormalizeIdentifierUndefined: Self = StObject.set(x, "normalizeIdentifier", js.undefined)
  }
}
