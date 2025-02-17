package typingsJapgolly.winrtUwp.Windows.Media.Capture

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.photocaptured
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for taking a rapid sequence of low shutter lag photos. */
@js.native
trait LowLagPhotoSequenceCapture extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_photocaptured(
    `type`: photocaptured,
    listener: TypedEventHandler[LowLagPhotoSequenceCapture, PhotoCapturedEventArgs]
  ): Unit = js.native
  
  /**
    * Asynchronously releases the LowLagPhotoSequenceCapture object and resources used by the photo sequence capture operation.
    * @return Object that is used to control the asynchronous operation.
    */
  def finishAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Occurs when a photo has been captured. */
  def onphotocaptured(ev: PhotoCapturedEventArgs & WinRTEvent[LowLagPhotoSequenceCapture]): Unit = js.native
  /** Occurs when a photo has been captured. */
  @JSName("onphotocaptured")
  var onphotocaptured_Original: TypedEventHandler[LowLagPhotoSequenceCapture, PhotoCapturedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_photocaptured(
    `type`: photocaptured,
    listener: TypedEventHandler[LowLagPhotoSequenceCapture, PhotoCapturedEventArgs]
  ): Unit = js.native
  
  /**
    * Asynchronously starts capturing photos.
    * @return Object that is used to control the asynchronous operation.
    */
  def startAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously stops capturing photos.
    * @return Object that is used to control the asynchronous operation.
    */
  def stopAsync(): IPromiseWithIAsyncAction = js.native
}
