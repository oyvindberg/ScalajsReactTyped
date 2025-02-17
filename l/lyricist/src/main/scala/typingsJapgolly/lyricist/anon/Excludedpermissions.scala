package typingsJapgolly.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Excludedpermissions extends StObject {
  
  var excluded_permissions: js.Array[String]
  
  var interactions: Pyong
  
  var permissions: js.Array[String]
}
object Excludedpermissions {
  
  inline def apply(excluded_permissions: js.Array[String], interactions: Pyong, permissions: js.Array[String]): Excludedpermissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludedpermissions]
  }
  
  extension [Self <: Excludedpermissions](x: Self) {
    
    inline def setExcluded_permissions(value: js.Array[String]): Self = StObject.set(x, "excluded_permissions", value.asInstanceOf[js.Any])
    
    inline def setExcluded_permissionsVarargs(value: String*): Self = StObject.set(x, "excluded_permissions", js.Array(value*))
    
    inline def setInteractions(value: Pyong): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
