package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`spacing-08`
import typingsJapgolly.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `254` extends StObject {
  
  var name: `spacing-08`
  
  var `type`: layout
}
object `254` {
  
  inline def apply(): `254` = {
    val __obj = js.Dynamic.literal(name = "spacing-08")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`254`]
  }
  
  extension [Self <: `254`](x: Self) {
    
    inline def setName(value: `spacing-08`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
