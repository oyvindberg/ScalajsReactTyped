package typingsJapgolly.hasura.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONBColumnBoolExp
  extends StObject
     with ColumnBoolExp[String] {
  
  var _contained_in: js.UndefOr[String] = js.undefined
  
  var _contains: js.UndefOr[String] = js.undefined
  
  var _has_key: js.UndefOr[String] = js.undefined
  
  var _has_keys_all: js.UndefOr[String] = js.undefined
  
  var _has_keys_any: js.UndefOr[String] = js.undefined
}
object JSONBColumnBoolExp {
  
  inline def apply(): JSONBColumnBoolExp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONBColumnBoolExp]
  }
  
  extension [Self <: JSONBColumnBoolExp](x: Self) {
    
    inline def set_contained_in(value: String): Self = StObject.set(x, "_contained_in", value.asInstanceOf[js.Any])
    
    inline def set_contained_inUndefined: Self = StObject.set(x, "_contained_in", js.undefined)
    
    inline def set_contains(value: String): Self = StObject.set(x, "_contains", value.asInstanceOf[js.Any])
    
    inline def set_containsUndefined: Self = StObject.set(x, "_contains", js.undefined)
    
    inline def set_has_key(value: String): Self = StObject.set(x, "_has_key", value.asInstanceOf[js.Any])
    
    inline def set_has_keyUndefined: Self = StObject.set(x, "_has_key", js.undefined)
    
    inline def set_has_keys_all(value: String): Self = StObject.set(x, "_has_keys_all", value.asInstanceOf[js.Any])
    
    inline def set_has_keys_allUndefined: Self = StObject.set(x, "_has_keys_all", js.undefined)
    
    inline def set_has_keys_any(value: String): Self = StObject.set(x, "_has_keys_any", value.asInstanceOf[js.Any])
    
    inline def set_has_keys_anyUndefined: Self = StObject.set(x, "_has_keys_any", js.undefined)
  }
}
