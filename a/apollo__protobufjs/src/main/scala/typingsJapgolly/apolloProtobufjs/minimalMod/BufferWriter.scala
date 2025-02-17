package typingsJapgolly.apolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "BufferWriter")
@js.native
/** Constructs a new buffer writer instance. */
open class BufferWriter ()
  extends typingsJapgolly.apolloProtobufjs.mod.BufferWriter
/* static members */
object BufferWriter {
  
  @JSImport("@apollo/protobufjs/minimal", "BufferWriter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  inline def alloc(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
