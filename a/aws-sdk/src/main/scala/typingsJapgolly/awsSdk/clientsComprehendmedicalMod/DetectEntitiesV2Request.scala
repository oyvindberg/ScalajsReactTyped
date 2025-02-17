package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectEntitiesV2Request extends StObject {
  
  /**
    * A UTF-8 string containing the clinical content being examined for entities. Each string must contain fewer than 20,000 bytes of characters.
    */
  var Text: BoundedLengthString
}
object DetectEntitiesV2Request {
  
  inline def apply(Text: BoundedLengthString): DetectEntitiesV2Request = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectEntitiesV2Request]
  }
  
  extension [Self <: DetectEntitiesV2Request](x: Self) {
    
    inline def setText(value: BoundedLengthString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
