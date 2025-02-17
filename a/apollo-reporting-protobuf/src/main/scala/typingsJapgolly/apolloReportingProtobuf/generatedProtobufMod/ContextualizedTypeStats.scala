package typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/generated/protobuf", "ContextualizedTypeStats")
@js.native
/**
  * Constructs a new ContextualizedTypeStats.
  * @param [properties] Properties to set
  */
open class ContextualizedTypeStats ()
  extends StObject
     with IContextualizedTypeStats {
  def this(properties: IContextualizedTypeStats) = this()
  
  /** ContextualizedTypeStats perTypeStat. */
  @JSName("perTypeStat")
  var perTypeStat_ContextualizedTypeStats: StringDictionary[ITypeStat] = js.native
  
  /**
    * Converts this ContextualizedTypeStats to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ContextualizedTypeStats {
  
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "ContextualizedTypeStats")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ContextualizedTypeStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ContextualizedTypeStats instance
    */
  inline def create(): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ContextualizedTypeStats]
  inline def create(properties: IContextualizedTypeStats): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ContextualizedTypeStats]
  
  inline def decode(reader: js.typedarray.Uint8Array): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedTypeStats]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ContextualizedTypeStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ContextualizedTypeStats]
  /**
    * Decodes a ContextualizedTypeStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ContextualizedTypeStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedTypeStats]
  inline def decode(reader: Reader, length: Double): ContextualizedTypeStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ContextualizedTypeStats]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedTypeStats]
  /**
    * Decodes a ContextualizedTypeStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ContextualizedTypeStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ContextualizedTypeStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ContextualizedTypeStats]
  
  /**
    * Encodes the specified ContextualizedTypeStats message. Does not implicitly {@link ContextualizedTypeStats.verify|verify} messages.
    * @param message ContextualizedTypeStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IContextualizedTypeStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IContextualizedTypeStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ContextualizedTypeStats message, length delimited. Does not implicitly {@link ContextualizedTypeStats.verify|verify} messages.
    * @param message ContextualizedTypeStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IContextualizedTypeStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IContextualizedTypeStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a plain object from a ContextualizedTypeStats message. Also converts values to other types if specified.
    * @param message ContextualizedTypeStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ContextualizedTypeStats): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ContextualizedTypeStats, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ContextualizedTypeStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
