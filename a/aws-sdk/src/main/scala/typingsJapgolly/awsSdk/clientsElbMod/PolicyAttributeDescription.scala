package typingsJapgolly.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyAttributeDescription extends StObject {
  
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[typingsJapgolly.awsSdk.clientsElbMod.AttributeName] = js.undefined
  
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[typingsJapgolly.awsSdk.clientsElbMod.AttributeValue] = js.undefined
}
object PolicyAttributeDescription {
  
  inline def apply(): PolicyAttributeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAttributeDescription]
  }
  
  extension [Self <: PolicyAttributeDescription](x: Self) {
    
    inline def setAttributeName(value: AttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setAttributeValue(value: AttributeValue): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "AttributeValue", js.undefined)
  }
}
