package typingsJapgolly.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * The name part of a tag.
    */
  var Key: TagKey
  
  /**
    * The value part of a tag.
    */
  var Value: TagValue
}
object Tag {
  
  inline def apply(Key: TagKey, Value: TagValue): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
