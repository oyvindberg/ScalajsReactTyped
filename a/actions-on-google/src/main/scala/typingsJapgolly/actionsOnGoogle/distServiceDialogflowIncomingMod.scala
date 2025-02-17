package typingsJapgolly.actionsOnGoogle

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.string
import typingsJapgolly.actionsOnGoogle.distCommonMod.JsonObject
import typingsJapgolly.actionsOnGoogle.distServiceDialogflowApiV1Mod.DialogflowV1Fulfillment
import typingsJapgolly.actionsOnGoogle.distServiceDialogflowApiV2Mod.GoogleCloudDialogflowV2IntentMessage
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceDialogflowIncomingMod {
  
  @JSImport("actions-on-google/dist/service/dialogflow/incoming", "Incoming")
  @js.native
  /** @hidden */
  open class Incoming () extends StObject {
    def this(fulfillment: js.Array[GoogleCloudDialogflowV2IntentMessage]) = this()
    def this(fulfillment: DialogflowV1Fulfillment) = this()
    
    /**
      * Gets the first Dialogflow incoming message with the given type.
      * Messages are converted into client library class instances or a string.
      *
      * Only messages with the platform field unlabeled (for generic use)
      * or labeled `ACTIONS_ON_GOOGLE` (`google` in v1) will be converted and read.
      *
      * The conversation is detailed below for a specific message oneof:
      * * Generic Platform Response
      *   * `text` -> `typeof string`
      *   * `image` -> `Image`
      *   * `quickReplies` -> `Suggestions`
      *   * `card` -> `BasicCard`
      * * Actions on Google Response
      *   * `simpleResponses` -> `SimpleResponse[]`
      *   * `basicCard` -> `BasicCard`
      *   * `suggestions` -> `Suggestions`
      *   * `linkOutSuggestion` -> `LinkOutSuggestion`
      *   * `listSelect` -> `List`
      *   * `carouselSelect` -> `Carousel`
      *   * `payload` -> `typeof object`
      *
      * Dialogflow v1:
      * * Generic Platform Response
      *   * `0` (text) -> `typeof string`
      *   * `3` (image) -> `Image`
      *   * `1` (card) -> `BasicCard`
      *   * `2` (quick replies) -> `Suggestions`
      *   * `4` (custom payload) -> `typeof object`
      * * Actions on Google Response
      *   * `simple_response` -> `SimpleResponse`
      *   * `basic_card` -> `BasicCard`
      *   * `list_card` -> `List`
      *   * `suggestion_chips` -> `Suggestions`
      *   * `carousel_card` -> `Carousel`
      *   * `link_out_chip` -> `LinkOutSuggestion`
      *   * `custom_payload` -> `typeof object`
      *
      * @example
      * ```javascript
      *
      * // Dialogflow
      * const { dialogflow, BasicCard } = require('actions-on-google')
      *
      * const app = dialogflow()
      *
      * // Create an Actions on Google Basic Card in the Dialogflow Console Intent Responses section
      * app.intent('Default Welcome Intent', conv => {
      *   const str = conv.incoming.get('string') // get the first text response
      *   const card = conv.incoming.get(BasicCard) // gets the instance of BasicCard
      *   // Do something with the Basic Card
      * })
      * ```
      *
      * @param type A string checking for the typeof message or a class checking for instanceof message
      * @public
      */
    def get[TMessage /* <: IncomingMessage */](`type`: Instantiable1[/* args (repeated) */ Any, TMessage]): TMessage = js.native
    /** @public */
    @JSName("get")
    def get_string(`type`: string): String = js.native
    
    /**
      * Gets the Dialogflow incoming messages as an iterator.
      * Messages are converted into client library class instances or a string.
      * See {@link Incoming#get|conv.incoming.get} for details on how the conversion works.
      *
      * @example
      * ```javascript
      *
      * // Dialogflow
      * const app = dialogflow()
      *
      * // Create messages in the Dialogflow Console Intent Responses section
      * app.intent('Default Welcome Intent', conv => {
      *   const messages = [...conv.incoming]
      *   // do something with the messages
      *   // or just spread them out back to the user
      *   conv.ask(`Here's what was set in the Dialogflow console`)
      *   conv.ask(...conv.incoming)
      * }
      * ```
      *
      * @public
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[IncomingMessage]] = js.native
    
    /** @public */
    var parsed: js.Array[IncomingMessage] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Image
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Suggestions
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.BasicCard
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.SimpleResponse
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.LinkOutSuggestion
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.List
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Carousel
    - typingsJapgolly.actionsOnGoogle.distCommonMod.JsonObject
  */
  type IncomingMessage = _IncomingMessage | String | JsonObject
  
  trait _IncomingMessage extends StObject
}
