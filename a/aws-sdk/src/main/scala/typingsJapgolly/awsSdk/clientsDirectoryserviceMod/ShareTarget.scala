package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareTarget extends StObject {
  
  /**
    * Identifier of the directory consumer account.
    */
  var Id: TargetId
  
  /**
    * Type of identifier to be used in the Id field.
    */
  var Type: TargetType
}
object ShareTarget {
  
  inline def apply(Id: TargetId, Type: TargetType): ShareTarget = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTarget]
  }
  
  extension [Self <: ShareTarget](x: Self) {
    
    inline def setId(value: TargetId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setType(value: TargetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
