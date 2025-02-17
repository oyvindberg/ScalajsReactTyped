package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofShippingRateCreateP extends StObject {
  
  val DeliveryEstimate: TypeofDeliveryEstimate
  
  val FixedAmount: TypeofFixedAmount
}
object TypeofShippingRateCreateP {
  
  inline def apply(DeliveryEstimate: TypeofDeliveryEstimate, FixedAmount: TypeofFixedAmount): TypeofShippingRateCreateP = {
    val __obj = js.Dynamic.literal(DeliveryEstimate = DeliveryEstimate.asInstanceOf[js.Any], FixedAmount = FixedAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofShippingRateCreateP]
  }
  
  extension [Self <: TypeofShippingRateCreateP](x: Self) {
    
    inline def setDeliveryEstimate(value: TypeofDeliveryEstimate): Self = StObject.set(x, "DeliveryEstimate", value.asInstanceOf[js.Any])
    
    inline def setFixedAmount(value: TypeofFixedAmount): Self = StObject.set(x, "FixedAmount", value.asInstanceOf[js.Any])
  }
}
