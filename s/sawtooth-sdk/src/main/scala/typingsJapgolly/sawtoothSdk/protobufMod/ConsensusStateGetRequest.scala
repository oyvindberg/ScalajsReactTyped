package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest")
@js.native
/**
  * Constructs a new ConsensusStateGetRequest.
  * @param [properties] Properties to set
  */
open class ConsensusStateGetRequest ()
  extends StObject
     with IConsensusStateGetRequest {
  def this(properties: IConsensusStateGetRequest) = this()
  
  /** ConsensusStateGetRequest addresses. */
  @JSName("addresses")
  var addresses_ConsensusStateGetRequest: js.Array[String] = js.native
  
  /** ConsensusStateGetRequest blockId. */
  @JSName("blockId")
  var blockId_ConsensusStateGetRequest: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this ConsensusStateGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ConsensusStateGetRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusStateGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusStateGetRequest instance
    */
  inline def create(): ConsensusStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusStateGetRequest]
  inline def create(properties: IConsensusStateGetRequest): ConsensusStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateGetRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ConsensusStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateGetRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusStateGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusStateGetRequest]
  /**
    * Decodes a ConsensusStateGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateGetRequest]
  inline def decode(reader: Reader, length: Double): ConsensusStateGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusStateGetRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateGetRequest]
  /**
    * Decodes a ConsensusStateGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateGetRequest]
  
  /**
    * Encodes the specified ConsensusStateGetRequest message. Does not implicitly {@link ConsensusStateGetRequest.verify|verify} messages.
    * @param message ConsensusStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusStateGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusStateGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusStateGetRequest message, length delimited. Does not implicitly {@link ConsensusStateGetRequest.verify|verify} messages.
    * @param message ConsensusStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusStateGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusStateGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusStateGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusStateGetRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): ConsensusStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateGetRequest]
  
  /**
    * Creates a plain object from a ConsensusStateGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusStateGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusStateGetRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ConsensusStateGetRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusStateGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
