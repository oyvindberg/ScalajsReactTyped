package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientPagingControls")
@js.native
/**
  * Constructs a new ClientPagingControls.
  * @param [properties] Properties to set
  */
open class ClientPagingControls ()
  extends StObject
     with IClientPagingControls {
  def this(properties: IClientPagingControls) = this()
  
  /** ClientPagingControls limit. */
  @JSName("limit")
  var limit_ClientPagingControls: Double = js.native
  
  /** ClientPagingControls start. */
  @JSName("start")
  var start_ClientPagingControls: String = js.native
  
  /**
    * Converts this ClientPagingControls to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ClientPagingControls {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientPagingControls")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientPagingControls instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPagingControls instance
    */
  inline def create(): ClientPagingControls = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientPagingControls]
  inline def create(properties: IClientPagingControls): ClientPagingControls = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientPagingControls]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientPagingControls = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPagingControls]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientPagingControls = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientPagingControls]
  /**
    * Decodes a ClientPagingControls message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPagingControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientPagingControls = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPagingControls]
  inline def decode(reader: Reader, length: Double): ClientPagingControls = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientPagingControls]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientPagingControls = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPagingControls]
  /**
    * Decodes a ClientPagingControls message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPagingControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientPagingControls = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPagingControls]
  
  /**
    * Encodes the specified ClientPagingControls message. Does not implicitly {@link ClientPagingControls.verify|verify} messages.
    * @param message ClientPagingControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientPagingControls): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientPagingControls, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientPagingControls message, length delimited. Does not implicitly {@link ClientPagingControls.verify|verify} messages.
    * @param message ClientPagingControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientPagingControls): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientPagingControls, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientPagingControls message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPagingControls
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientPagingControls = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientPagingControls]
  
  /**
    * Creates a plain object from a ClientPagingControls message. Also converts values to other types if specified.
    * @param message ClientPagingControls
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientPagingControls): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientPagingControls, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientPagingControls message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
