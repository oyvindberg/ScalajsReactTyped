package typingsJapgolly.braintreeWeb.modulesHostedFieldsMod

import typingsJapgolly.braintreeWeb.anon.BillingAddress
import typingsJapgolly.braintreeWeb.anon.Fields
import typingsJapgolly.braintreeWeb.braintreeWebStrings.binAvailable
import typingsJapgolly.braintreeWeb.braintreeWebStrings.blur
import typingsJapgolly.braintreeWeb.braintreeWebStrings.cardTypeChange
import typingsJapgolly.braintreeWeb.braintreeWebStrings.empty
import typingsJapgolly.braintreeWeb.braintreeWebStrings.focus
import typingsJapgolly.braintreeWeb.braintreeWebStrings.inputSubmitRequest
import typingsJapgolly.braintreeWeb.braintreeWebStrings.notEmpty
import typingsJapgolly.braintreeWeb.braintreeWebStrings.validityChange
import typingsJapgolly.braintreeWeb.modulesCoreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedFields extends StObject {
  
  /**
    * @description The current version of the SDK, i.e. `3.0.2`.
    */
  var VERSION: String = js.native
  
  /**
    * Add a class to a {@link module:braintree-web/hosted-fields~field field}. Useful for updating field styles when events occur elsewhere in your checkout.     *
    * @example
    * hostedFieldsInstance.addClass('number', 'custom-class', function (addClassErr) {
    *   if (addClassErr) {
    *     console.error(addClassErr);
    *   }
    * });
    */
  def addClass(field: String, classname: String): Unit = js.native
  def addClass(field: String, classname: String, callback: callback[Any]): Unit = js.native
  
  /**
    * @example
    * hostedFieldsInstance.clear('number', function (clearErr) {
    *   if (clearErr) {
    *     console.error(clearErr);
    *   }
    * });
    *
    * @example <caption>Clear several fields</caption>
    * hostedFieldsInstance.clear('number');
    * hostedFieldsInstance.clear('cvv');
    * hostedFieldsInstance.clear('expirationDate');
    */
  def clear(field: String): Unit = js.native
  def clear(field: String, callback: callback[Any]): Unit = js.native
  
  /**
    * braintree.hostedFields.create({
    *   client: clientInstance,
    *   styles: {
    *     'input': {
    *       'font-size': '16pt',
    *       'color': '#3A3A3A'
    *     },
    *     '.number': {
    *       'font-family': 'monospace'
    *     },
    *     '.valid': {
    *       'color': 'green'
    *     }
    *   },
    *   fields: {
    *     number: {
    *       selector: '#card-number'
    *     },
    *     cvv: {
    *       selector: '#cvv'
    *     },
    *     expirationDate: {
    *       selector: '#expiration-date'
    *     }
    *   }
    * }, callback);
    */
  def create(options: Fields): js.Promise[HostedFields] = js.native
  def create(options: Fields, callback: callback[HostedFields]): Unit = js.native
  
  /**
    * Programmatically focus a {@link module:braintree-web/hosted-fields-field field}.     *
    * @example
    * hostedFieldsInstance.focus('number', function (focusErr) {
    *   if (focusErr) {
    *     console.error(focusErr);
    *   }
    * });
    */
  def focus(field: HostedFieldsHostedFieldsFieldName): Unit = js.native
  def focus(field: HostedFieldsHostedFieldsFieldName, callback: callback[Any]): Unit = js.native
  
  /**
    * Returns an {@link HostedFields~stateObject|object} that includes the state of all fields and possible card types.
    * @example <caption>Check if all fields are valid</caption>
    * var state = hostedFields.getState();
    *
    * var formValid = Object.keys(state.fields).every(function (key) {
    *   return state.fields[key].isValid;
    * });
    */
  def getState(): HostedFieldsState = js.native
  
  @JSName("off")
  def off_binAvailable(event: binAvailable, handler: js.Function1[/* event */ HostedFieldsBinPayload, Unit]): Unit = js.native
  @JSName("off")
  def off_blur(event: blur, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_cardTypeChange(event: cardTypeChange, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_empty(event: empty, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_focus(event: focus, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_inputSubmitRequest(event: inputSubmitRequest, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_notEmpty(event: notEmpty, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_validityChange(event: validityChange, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  
  @JSName("on")
  def on_binAvailable(event: binAvailable, handler: js.Function1[/* event */ HostedFieldsBinPayload, Unit]): Unit = js.native
  @JSName("on")
  def on_blur(event: blur, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_cardTypeChange(event: cardTypeChange, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_empty(event: empty, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_focus(event: focus, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_inputSubmitRequest(event: inputSubmitRequest, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_notEmpty(event: notEmpty, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_validityChange(event: validityChange, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  
  /**
    * Removes a class to a {@link module:braintree-web/hosted-fields~field field}. Useful for updating field styles when events occur elsewhere in your checkout.     *
    * @example
    * hostedFieldsInstance.addClass('number', 'custom-class', function (addClassErr) {
    *   if (addClassErr) {
    *     console.error(addClassErr);
    *     return;
    *   }
    *
    *   // some time later...
    *   hostedFieldsInstance.removeClass('number', 'custom-class');
    * });
    */
  def removeClass(field: String, classname: String): Unit = js.native
  def removeClass(field: String, classname: String, callback: callback[Any]): Unit = js.native
  
  /**
    * Sets the placeholder of a {@link module:braintree-web/hosted-fields~field field}.     *
    * @example
    * hostedFieldsInstance.setPlaceholder('number', '4111 1111 1111 1111', function (placeholderErr) {
    *   if (placeholderErr) {
    *     console.error(placeholderErr);
    *   }
    * });
    *
    * @example <caption>Update CVV field on card type change</caption>
    * hostedFieldsInstance.on('cardTypeChange', function (event) {
    *   // Update the placeholder value if there is only one possible card type
    *   if (event.cards.length === 1) {
    *     hostedFields.setPlaceholder('cvv', event.cards[0].code.name, function (placeholderErr) {
    *       if (placeholderErr) {
    *         // Handle errors, such as invalid field name
    *         console.error(placeholderErr);
    *       }
    *     });
    *   }
    * });
    */
  def setPlaceholder(field: String, placeholder: String): Unit = js.native
  def setPlaceholder(field: String, placeholder: String, callback: callback[Any]): Unit = js.native
  
  /**
    * An object that represents CSS that will be applied in each hosted field. This object looks similar to CSS.
    * Typically, these styles involve fonts (such as `font-family` or `color`).
    *
    * These are the CSS properties that Hosted Fields supports. Any other CSS should be specified on your
    * page and outside of any Braintree configuration. Trying to set unsupported properties will fail and put
    * a warning in the console.
    *
    * Supported CSS properties are:
    * `color`
    * `font-family`
    * `font-size-adjust`
    * `font-size`
    * `font-stretch`
    * `font-style`
    * `font-variant-alternates`
    * `font-variant-caps`
    * `font-variant-east-asian`
    * `font-variant-ligatures`
    * `font-variant-numeric`
    * `font-variant`
    * `font-weight`
    * `font`
    * `letter-spacing`
    * `line-height`
    * `opacity`
    * `outline`
    * `text-shadow`
    * `transition`
    * `-moz-osx-font-smoothing`
    * `-moz-tap-highlight-color`
    * `-moz-transition`
    * `-webkit-font-smoothing`
    * `-webkit-tap-highlight-color`
    * `-webkit-transition`
    */
  var styleOptions: Any = js.native
  
  def teardown(): Unit = js.native
  def teardown(callback: callback[Any]): Unit = js.native
  @JSName("teardown")
  def teardown_Promise(): js.Promise[Unit] = js.native
  
  /**
    * Tokenizes fields and returns a nonce payload.     * @example <caption>Tokenize a card</caption>
    * hostedFieldsInstance.tokenize(function (tokenizeErr, payload) {
    *   if (tokenizeErr) {
    *     switch (tokenizeErr.code) {
    *       case 'HOSTED_FIELDS_FIELDS_EMPTY':
    *         console.error('All fields are empty! Please fill out the form.');
    *         break;
    *       case 'HOSTED_FIELDS_FIELDS_INVALID':
    *         console.error('Some fields are invalid:', tokenizeErr.details.invalidFieldKeys);
    *         break;
    *       case 'HOSTED_FIELDS_FAILED_TOKENIZATION':
    *         console.error('Tokenization failed server side. Is the card valid?');
    *         break;
    *       case 'HOSTED_FIELDS_TOKENIZATION_NETWORK_ERROR':
    *         console.error('Network error occurred when tokenizing.');
    *         break;
    *       default:
    *         console.error('Something bad happened!', tokenizeErr);
    *     }
    *   } else {
    *     console.log('Got nonce:', payload.nonce);
    *   }
    * });
    * @example <caption>Tokenize and vault a card</caption>
    * hostedFieldsInstance.tokenize({
    *   vault: true
    * }, function (tokenizeErr, payload) {
    *   if (tokenizeErr) {
    *     console.error(tokenizeErr);
    *   } else {
    *     console.log('Got nonce:', payload.nonce);
    *   }
    * });
    */
  def tokenize(): js.Promise[HostedFieldsTokenizePayload] = js.native
  def tokenize(callback: callback[HostedFieldsTokenizePayload]): Unit = js.native
  def tokenize(options: BillingAddress): js.Promise[HostedFieldsTokenizePayload] = js.native
  def tokenize(options: BillingAddress, callback: callback[HostedFieldsTokenizePayload]): Unit = js.native
}
