package typingsJapgolly.googleProtobuf.mod

import typingsJapgolly.googleProtobuf.mod.BinaryConstants.FieldType
import typingsJapgolly.googleProtobuf.mod.BinaryConstants.WireType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "BinaryReader")
@js.native
open class BinaryReader () extends StObject {
  def this(bytes: ByteSource) = this()
  def this(bytes: Unit, start: Double) = this()
  def this(bytes: ByteSource, start: Double) = this()
  def this(bytes: Unit, start: Double, length: Double) = this()
  def this(bytes: Unit, start: Unit, length: Double) = this()
  def this(bytes: ByteSource, start: Double, length: Double) = this()
  def this(bytes: ByteSource, start: Unit, length: Double) = this()
  
  def advance(count: Double): Unit = js.native
  
  def alloc(): BinaryReader = js.native
  def alloc(bytes: Unit, start: Double): BinaryReader = js.native
  def alloc(bytes: Unit, start: Double, length: Double): BinaryReader = js.native
  def alloc(bytes: Unit, start: Unit, length: Double): BinaryReader = js.native
  def alloc(bytes: ByteSource): BinaryReader = js.native
  def alloc(bytes: ByteSource, start: Double): BinaryReader = js.native
  def alloc(bytes: ByteSource, start: Double, length: Double): BinaryReader = js.native
  def alloc(bytes: ByteSource, start: Unit, length: Double): BinaryReader = js.native
  
  def free(): Unit = js.native
  
  def getBuffer(): js.typedarray.Uint8Array = js.native
  
  def getCursor(): Double = js.native
  
  def getError(): Boolean = js.native
  
  def getFieldCursor(): Double = js.native
  
  def getFieldDecoder(): BinaryDecoder = js.native
  
  def getFieldNumber(): Double = js.native
  
  def getWireType(): WireType = js.native
  
  def isDelimited(): Boolean = js.native
  
  def isEndGroup(): Boolean = js.native
  
  def nextField(): Boolean = js.native
  
  def readAny(fieldType: FieldType): AnyFieldType = js.native
  
  def readBool(): Boolean = js.native
  
  def readBytes(): js.typedarray.Uint8Array = js.native
  
  def readDouble(): Double = js.native
  
  def readEnum(): Double = js.native
  
  def readFixed32(): Double = js.native
  
  def readFixed64(): Double = js.native
  
  def readFixed64String(): String = js.native
  
  def readFixedHash64(): String = js.native
  
  def readFloat(): Double = js.native
  
  def readGroup(field: Double, message: Message, reader: BinaryReadReader): Unit = js.native
  
  def readInt32(): Double = js.native
  
  def readInt32String(): String = js.native
  
  def readInt64(): Double = js.native
  
  def readInt64String(): String = js.native
  
  def readMessage(msg: Any, reader: BinaryReadReader): Any = js.native
  @JSName("readMessage")
  var readMessage_Original: BinaryRead = js.native
  
  def readPackedBool(): js.Array[Boolean] = js.native
  
  def readPackedDouble(): js.Array[Double] = js.native
  
  def readPackedEnum(): js.Array[Double] = js.native
  
  def readPackedFixed32(): js.Array[Double] = js.native
  
  def readPackedFixed64(): js.Array[Double] = js.native
  
  def readPackedFixed64String(): js.Array[String] = js.native
  
  def readPackedFixedHash64(): js.Array[String] = js.native
  
  def readPackedFloat(): js.Array[Double] = js.native
  
  def readPackedInt32(): js.Array[Double] = js.native
  
  def readPackedInt32String(): js.Array[String] = js.native
  
  def readPackedInt64(): js.Array[Double] = js.native
  
  def readPackedInt64String(): js.Array[String] = js.native
  
  def readPackedSfixed32(): js.Array[Double] = js.native
  
  def readPackedSfixed64(): js.Array[Double] = js.native
  
  def readPackedSfixed64String(): js.Array[String] = js.native
  
  def readPackedSint32(): js.Array[Double] = js.native
  
  def readPackedSint64(): js.Array[Double] = js.native
  
  def readPackedSint64String(): js.Array[String] = js.native
  
  def readPackedUint32(): js.Array[Double] = js.native
  
  def readPackedUint32String(): js.Array[String] = js.native
  
  def readPackedUint64(): js.Array[Double] = js.native
  
  def readPackedUint64String(): js.Array[String] = js.native
  
  def readPackedVarintHash64(): js.Array[String] = js.native
  
  def readSfixed32(): Double = js.native
  
  def readSfixed32String(): String = js.native
  
  def readSfixed64(): Double = js.native
  
  def readSfixed64String(): String = js.native
  
  def readSint32(): Double = js.native
  
  def readSint64(): Double = js.native
  
  def readSint64String(): String = js.native
  
  def readString(): String = js.native
  
  def readUint32(): Double = js.native
  
  def readUint32String(): String = js.native
  
  def readUint64(): Double = js.native
  
  def readUint64String(): String = js.native
  
  def readVarintHash64(): String = js.native
  
  def registerReadCallback(callbackName: String, callback: js.Function1[/* binaryReader */ this.type, Any]): Unit = js.native
  
  def reset(): Unit = js.native
  
  def runReadCallback(callbackName: String): Any = js.native
  
  def setBlock(): Unit = js.native
  def setBlock(bytes: Unit, start: Double): Unit = js.native
  def setBlock(bytes: Unit, start: Double, length: Double): Unit = js.native
  def setBlock(bytes: Unit, start: Unit, length: Double): Unit = js.native
  def setBlock(bytes: ByteSource): Unit = js.native
  def setBlock(bytes: ByteSource, start: Double): Unit = js.native
  def setBlock(bytes: ByteSource, start: Double, length: Double): Unit = js.native
  def setBlock(bytes: ByteSource, start: Unit, length: Double): Unit = js.native
  
  def skipDelimitedField(): Unit = js.native
  
  def skipField(): Unit = js.native
  
  def skipFixed32Field(): Unit = js.native
  
  def skipFixed64Field(): Unit = js.native
  
  def skipGroup(): Unit = js.native
  
  def skipMatchingFields(): Unit = js.native
  
  def skipVarintField(): Unit = js.native
  
  def unskipHeader(): Unit = js.native
}
/* static members */
object BinaryReader {
  
  @JSImport("google-protobuf", "BinaryReader")
  @js.native
  val ^ : js.Any = js.native
  
  inline def alloc(): BinaryReader = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")().asInstanceOf[BinaryReader]
  inline def alloc(bytes: Unit, start: Double): BinaryReader = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(bytes.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[BinaryReader]
  inline def alloc(bytes: Unit, start: Double, length: Double): BinaryReader = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(bytes.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BinaryReader]
  inline def alloc(bytes: Unit, start: Unit, length: Double): BinaryReader = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(bytes.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BinaryReader]
  inline def alloc(bytes: ByteSource): BinaryReader = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(bytes.asInstanceOf[js.Any]).asInstanceOf[BinaryReader]
  inline def alloc(bytes: ByteSource, start: Double): BinaryReader = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(bytes.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[BinaryReader]
  inline def alloc(bytes: ByteSource, start: Double, length: Double): BinaryReader = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(bytes.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BinaryReader]
  inline def alloc(bytes: ByteSource, start: Unit, length: Double): BinaryReader = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(bytes.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BinaryReader]
}
