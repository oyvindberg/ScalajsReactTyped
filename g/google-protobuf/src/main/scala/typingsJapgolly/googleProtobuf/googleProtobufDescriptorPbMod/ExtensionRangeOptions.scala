package typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "ExtensionRangeOptions")
@js.native
open class ExtensionRangeOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: Unit, index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearUninterpretedOptionList(): ExtensionRangeOptions = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): ExtensionRangeOptions = js.native
}
/* static members */
object ExtensionRangeOptions {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "ExtensionRangeOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ExtensionRangeOptions]
  
  inline def deserializeBinaryFromReader(message: ExtensionRangeOptions, reader: BinaryReader): ExtensionRangeOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[ExtensionRangeOptions]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "ExtensionRangeOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "ExtensionRangeOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: ExtensionRangeOptions, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: ExtensionRangeOptions): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var uninterpretedOptionList: js.Array[
        typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
      ]
  }
  object AsObject {
    
    inline def apply(
      uninterpretedOptionList: js.Array[
          typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
        ]
    ): AsObject = {
      val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setUninterpretedOptionList(
        value: js.Array[
              typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
            ]
      ): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      inline def setUninterpretedOptionListVarargs(value: typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value*))
    }
  }
}
