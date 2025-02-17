package typingsJapgolly.fridaGum.global

import typingsJapgolly.fridaGum.ArrayBuffer
import typingsJapgolly.fridaGum.UnixStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input stream backed by a file descriptor.
  *
  * Only available on UNIX-like OSes.
  */
@JSGlobal("UnixInputStream")
@js.native
open class UnixInputStream protected ()
  extends StObject
     with typingsJapgolly.fridaGum.InputStream {
  /**
    * Creates a new input stream from the specified file descriptor `fd`.
    *
    * @param fd File descriptor to read from.
    * @param options Options to customize the stream.
    */
  def this(fd: Double) = this()
  def this(fd: Double, options: UnixStreamOptions) = this()
  
  /**
    * Closes the stream, releasing resources related to it. Once the stream is closed, all other operations will fail.
    * Closing a stream multiple times is allowed and will not result in an error.
    */
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  
  /**
    * Reads up to `size` bytes from the stream. The resulting buffer is up to `size` bytes long. End of stream is
    * signalled through an empty buffer.
    */
  /* CompleteClass */
  override def read(size: Double): js.Promise[ArrayBuffer] = js.native
  
  /**
    * Keeps reading from the stream until exactly `size` bytes have been consumed. The resulting buffer is exactly
    * `size` bytes long. Premature error or end of stream results in an `Error` object with a `partialData` property
    * containing the incomplete data.
    */
  /* CompleteClass */
  override def readAll(size: Double): js.Promise[ArrayBuffer] = js.native
}
