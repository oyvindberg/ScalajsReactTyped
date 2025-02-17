package typingsJapgolly.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsISSNOptions extends StObject {
  
  var case_sensitive: js.UndefOr[Boolean] = js.undefined
  
  var require_hyphen: js.UndefOr[Boolean] = js.undefined
}
object IsISSNOptions {
  
  inline def apply(): IsISSNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsISSNOptions]
  }
  
  extension [Self <: IsISSNOptions](x: Self) {
    
    inline def setCase_sensitive(value: Boolean): Self = StObject.set(x, "case_sensitive", value.asInstanceOf[js.Any])
    
    inline def setCase_sensitiveUndefined: Self = StObject.set(x, "case_sensitive", js.undefined)
    
    inline def setRequire_hyphen(value: Boolean): Self = StObject.set(x, "require_hyphen", value.asInstanceOf[js.Any])
    
    inline def setRequire_hyphenUndefined: Self = StObject.set(x, "require_hyphen", js.undefined)
  }
}
