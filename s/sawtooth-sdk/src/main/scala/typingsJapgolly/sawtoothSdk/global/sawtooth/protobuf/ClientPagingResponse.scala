package typingsJapgolly.sawtoothSdk.global.sawtooth.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.IClientPagingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sawtooth.protobuf.ClientPagingResponse")
@js.native
/**
  * Constructs a new ClientPagingResponse.
  * @param [properties] Properties to set
  */
open class ClientPagingResponse ()
  extends typingsJapgolly.sawtoothSdk.mod.protobuf.ClientPagingResponse {
  def this(properties: IClientPagingResponse) = this()
}
/* static members */
object ClientPagingResponse {
  
  @JSGlobal("sawtooth.protobuf.ClientPagingResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientPagingResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPagingResponse instance
    */
  inline def create(): typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse]
  inline def create(properties: IClientPagingResponse): typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse]
  /**
    * Decodes a ClientPagingResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPagingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse]
  inline def decode(reader: Reader, length: Double): typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse]
  /**
    * Decodes a ClientPagingResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPagingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse]
  
  /**
    * Encodes the specified ClientPagingResponse message. Does not implicitly {@link ClientPagingResponse.verify|verify} messages.
    * @param message ClientPagingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientPagingResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientPagingResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientPagingResponse message, length delimited. Does not implicitly {@link ClientPagingResponse.verify|verify} messages.
    * @param message ClientPagingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientPagingResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientPagingResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientPagingResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPagingResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse]
  
  /**
    * Creates a plain object from a ClientPagingResponse message. Also converts values to other types if specified.
    * @param message ClientPagingResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: typingsJapgolly.sawtoothSdk.protobufMod.ClientPagingResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientPagingResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
