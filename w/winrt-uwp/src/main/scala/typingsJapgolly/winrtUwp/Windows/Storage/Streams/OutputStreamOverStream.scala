package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a Windows Runtime output stream for an IStream base implementation. */
trait OutputStreamOverStream extends StObject {
  
  /** Closes the current stream and releases system resources. */
  def close(): Unit
  
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean]
  
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}
object OutputStreamOverStream {
  
  inline def apply(
    close: Callback,
    flushAsync: CallbackTo[IPromiseWithIAsyncOperation[Boolean]],
    writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): OutputStreamOverStream = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, flushAsync = flushAsync.toJsFn, writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[OutputStreamOverStream]
  }
  
  extension [Self <: OutputStreamOverStream](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setFlushAsync(value: CallbackTo[IPromiseWithIAsyncOperation[Boolean]]): Self = StObject.set(x, "flushAsync", value.toJsFn)
    
    inline def setWriteAsync(value: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeAsync", js.Any.fromFunction1(value))
  }
}
