package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSetupIntentConfirmP extends StObject {
  
  val MandateData1: TypeofMandateData1
  
  val MandateData2: TypeofMandateData2
  
  val PaymentMethodData: TypeofPaymentMethodData
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionSepaDebit
}
object TypeofSetupIntentConfirmP {
  
  inline def apply(
    MandateData1: TypeofMandateData1,
    MandateData2: TypeofMandateData2,
    PaymentMethodData: TypeofPaymentMethodData,
    PaymentMethodOptions: TypeofPaymentMethodOptionSepaDebit
  ): TypeofSetupIntentConfirmP = {
    val __obj = js.Dynamic.literal(MandateData1 = MandateData1.asInstanceOf[js.Any], MandateData2 = MandateData2.asInstanceOf[js.Any], PaymentMethodData = PaymentMethodData.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSetupIntentConfirmP]
  }
  
  extension [Self <: TypeofSetupIntentConfirmP](x: Self) {
    
    inline def setMandateData1(value: TypeofMandateData1): Self = StObject.set(x, "MandateData1", value.asInstanceOf[js.Any])
    
    inline def setMandateData2(value: TypeofMandateData2): Self = StObject.set(x, "MandateData2", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodData(value: TypeofPaymentMethodData): Self = StObject.set(x, "PaymentMethodData", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionSepaDebit): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
