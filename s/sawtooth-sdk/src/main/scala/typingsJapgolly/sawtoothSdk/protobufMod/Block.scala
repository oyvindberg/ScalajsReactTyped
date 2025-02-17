package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Block")
@js.native
/**
  * Constructs a new Block.
  * @param [properties] Properties to set
  */
open class Block ()
  extends StObject
     with IBlock {
  def this(properties: IBlock) = this()
  
  /** Block batches. */
  @JSName("batches")
  var batches_Block: js.Array[IBatch] = js.native
  
  /** Block headerSignature. */
  @JSName("headerSignature")
  var headerSignature_Block: String = js.native
  
  /** Block header. */
  @JSName("header")
  var header_Block: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this Block to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object Block {
  
  @JSImport("sawtooth-sdk/protobuf", "Block")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Block instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Block instance
    */
  inline def create(): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Block]
  inline def create(properties: IBlock): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Block]
  
  inline def decode(reader: js.typedarray.Uint8Array): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Block]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Block = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Block]
  /**
    * Decodes a Block message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Block
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Block]
  inline def decode(reader: Reader, length: Double): Block = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Block]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Block]
  /**
    * Decodes a Block message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Block
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Block]
  
  /**
    * Encodes the specified Block message. Does not implicitly {@link Block.verify|verify} messages.
    * @param message Block message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IBlock): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBlock, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Block message, length delimited. Does not implicitly {@link Block.verify|verify} messages.
    * @param message Block message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IBlock): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBlock, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Block message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Block
    */
  inline def fromObject(`object`: StringDictionary[Any]): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Block]
  
  /**
    * Creates a plain object from a Block message. Also converts values to other types if specified.
    * @param message Block
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: Block): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Block, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Block message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
