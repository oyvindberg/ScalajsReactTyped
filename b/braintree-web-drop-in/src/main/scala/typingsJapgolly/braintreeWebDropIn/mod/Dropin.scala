package typingsJapgolly.braintreeWebDropIn.mod

import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.changeActiveView
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.noPaymentMethodRequestable
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.paymentMethodRequestable
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.paymentOptionSelected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dropin extends StObject {
  
  def clearSelectedPaymentMethod(): Unit = js.native
  
  def isPaymentMethodRequestable(): Boolean = js.native
  
  @JSName("off")
  def off_changeActiveView(event: changeActiveView, handler: js.Function1[/* payload */ ChangeActiveViewPayload, Unit]): Unit = js.native
  @JSName("off")
  def off_noPaymentMethodRequestable(event: noPaymentMethodRequestable, handler: js.Function0[Unit]): Unit = js.native
  @JSName("off")
  def off_paymentMethodRequestable(
    event: paymentMethodRequestable,
    handler: js.Function1[/* payload */ PaymentMethodRequestablePayload, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_paymentOptionSelected(
    event: paymentOptionSelected,
    handler: js.Function1[/* payload */ PaymentOptionSelectedPayload, Unit]
  ): Unit = js.native
  
  @JSName("on")
  def on_changeActiveView(event: changeActiveView, handler: js.Function1[/* payload */ ChangeActiveViewPayload, Unit]): Unit = js.native
  @JSName("on")
  def on_noPaymentMethodRequestable(event: noPaymentMethodRequestable, handler: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_paymentMethodRequestable(
    event: paymentMethodRequestable,
    handler: js.Function1[/* payload */ PaymentMethodRequestablePayload, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_paymentOptionSelected(
    event: paymentOptionSelected,
    handler: js.Function1[/* payload */ PaymentOptionSelectedPayload, Unit]
  ): Unit = js.native
  
  def requestPaymentMethod(): js.Promise[PaymentMethodPayload] = js.native
  def requestPaymentMethod(callback: RequestPaymentMethodCallback): Unit = js.native
  def requestPaymentMethod(options: PaymentMethodOptions): js.Promise[PaymentMethodPayload] = js.native
  def requestPaymentMethod(options: PaymentMethodOptions, callback: RequestPaymentMethodCallback): Unit = js.native
  
  def teardown(): js.Promise[Unit] = js.native
  def teardown(callback: js.Function1[/* error */ js.UndefOr[js.Object | Null], Unit]): Unit = js.native
}
