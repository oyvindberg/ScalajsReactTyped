package typingsJapgolly.winrtUwp.Windows.Devices.Printers

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs to access a 3D printer's capabilities and print tickets. */
trait PrintSchema extends StObject {
  
  /**
    * Gets the 3D printer capabilities.
    * @param constrainTicket The print ticket.
    * @return An XML PrintCapabilities document containing 3D printer capabilities.
    */
  def getCapabilitiesAsync(constrainTicket: IRandomAccessStreamWithContentType): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
  
  /**
    * Gets the 3D printer's default print ticket.
    * @return An XML PrintTicket document containing the 3D printer's default print ticket.
    */
  def getDefaultPrintTicketAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
  
  /**
    * Creates a new print ticket by merging the user’s selection with the default print ticket and validating that it will work for the device.
    * @param deltaTicket The delta print ticket, specifies the differences between the default print ticket and the user's selections.
    * @return An XML PrintTicket document containing the suggested print ticket.
    */
  def mergeAndValidateWithDefaultPrintTicketAsync(deltaTicket: IRandomAccessStreamWithContentType): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
}
object PrintSchema {
  
  inline def apply(
    getCapabilitiesAsync: IRandomAccessStreamWithContentType => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType],
    getDefaultPrintTicketAsync: CallbackTo[IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]],
    mergeAndValidateWithDefaultPrintTicketAsync: IRandomAccessStreamWithContentType => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
  ): PrintSchema = {
    val __obj = js.Dynamic.literal(getCapabilitiesAsync = js.Any.fromFunction1(getCapabilitiesAsync), getDefaultPrintTicketAsync = getDefaultPrintTicketAsync.toJsFn, mergeAndValidateWithDefaultPrintTicketAsync = js.Any.fromFunction1(mergeAndValidateWithDefaultPrintTicketAsync))
    __obj.asInstanceOf[PrintSchema]
  }
  
  extension [Self <: PrintSchema](x: Self) {
    
    inline def setGetCapabilitiesAsync(
      value: IRandomAccessStreamWithContentType => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
    ): Self = StObject.set(x, "getCapabilitiesAsync", js.Any.fromFunction1(value))
    
    inline def setGetDefaultPrintTicketAsync(value: CallbackTo[IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]]): Self = StObject.set(x, "getDefaultPrintTicketAsync", value.toJsFn)
    
    inline def setMergeAndValidateWithDefaultPrintTicketAsync(
      value: IRandomAccessStreamWithContentType => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
    ): Self = StObject.set(x, "mergeAndValidateWithDefaultPrintTicketAsync", js.Any.fromFunction1(value))
  }
}
