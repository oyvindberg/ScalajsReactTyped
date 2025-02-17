package typingsJapgolly.fflate.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "AsyncZlib")
@js.native
/**
  * Creates an asynchronous DEFLATE stream
  * @param cb The callback to call whenever data is deflated
  */
open class AsyncZlib () extends StObject {
  def this(cb: AsyncFlateStreamHandler) = this()
  /**
    * Creates an asynchronous DEFLATE stream
    * @param opts The compression options
    * @param cb The callback to call whenever data is deflated
    */
  def this(opts: ZlibOptions) = this()
  def this(opts: ZlibOptions, cb: AsyncFlateStreamHandler) = this()
  
  def ondata(err: Null, data: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  /**
    * The handler to call whenever data is available
    */
  def ondata(err: FlateError, data: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  /**
    * The handler to call whenever data is available
    */
  @JSName("ondata")
  var ondata_Original: AsyncFlateStreamHandler = js.native
  
  /**
    * Pushes a chunk to be deflated
    * @param chunk The chunk to push
    * @param final Whether this is the last chunk
    */
  def push(chunk: js.typedarray.Uint8Array): Unit = js.native
  def push(chunk: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  
  /**
    * A method to terminate the stream's internal worker. Subsequent calls to
    * push() will silently fail.
    */
  def terminate(): Unit = js.native
  /**
    * A method to terminate the stream's internal worker. Subsequent calls to
    * push() will silently fail.
    */
  @JSName("terminate")
  var terminate_Original: AsyncTerminable = js.native
}
