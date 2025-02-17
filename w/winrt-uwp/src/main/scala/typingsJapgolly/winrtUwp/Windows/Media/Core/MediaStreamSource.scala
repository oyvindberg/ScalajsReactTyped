package typingsJapgolly.winrtUwp.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Media.Protection.MediaProtectionManager
import typingsJapgolly.winrtUwp.Windows.Storage.FileProperties.MusicProperties
import typingsJapgolly.winrtUwp.Windows.Storage.FileProperties.VideoProperties
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.closed
import typingsJapgolly.winrtUwp.winrtUwpStrings.paused
import typingsJapgolly.winrtUwp.winrtUwpStrings.samplerequested
import typingsJapgolly.winrtUwp.winrtUwpStrings.starting
import typingsJapgolly.winrtUwp.winrtUwpStrings.switchstreamsrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media source that delivers media samples directly to the media pipeline. */
@js.native
trait MediaStreamSource extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closed(`type`: closed, listener: TypedEventHandler[MediaStreamSource, MediaStreamSourceClosedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paused(`type`: paused, listener: TypedEventHandler[MediaStreamSource, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_samplerequested(
    `type`: samplerequested,
    listener: TypedEventHandler[MediaStreamSource, MediaStreamSourceSampleRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_starting(
    `type`: starting,
    listener: TypedEventHandler[MediaStreamSource, MediaStreamSourceStartingEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_switchstreamsrequested(
    `type`: switchstreamsrequested,
    listener: TypedEventHandler[MediaStreamSource, MediaStreamSourceSwitchStreamsRequestedEventArgs]
  ): Unit = js.native
  
  /**
    * Adds a Digital Rights Management (DRM) protection key which is used by the MediaProtectionManager to encrypt and decrypt the specified stream.
    * @param streamDescriptor The stream the key is used to encrypt and decrypt.
    * @param keyIdentifier The key used to encrypt and decrypt the stream.
    * @param licenseData The DRM licence for the media.
    */
  def addProtectionKey(
    streamDescriptor: IMediaStreamDescriptor,
    keyIdentifier: js.Array[Double],
    licenseData: js.Array[Double]
  ): Unit = js.native
  
  /**
    * Adds a new stream descriptor to the MediaStreamSource .
    * @param descriptor The descriptor to add.
    */
  def addStreamDescriptor(descriptor: IMediaStreamDescriptor): Unit = js.native
  
  /** Gets or sets the amount of data that is buffered by the MediaStreamSource . */
  var bufferTime: Double = js.native
  
  /** Gets or sets whether or not the application supports changing its position in the media time-line. */
  var canSeek: Boolean = js.native
  
  /** Gets or sets the duration of the media time-line. */
  var duration: Double = js.native
  
  /** Gets or sets the Digital Rights Management (DRM) MediaProtectionManager used to protect the media. */
  var mediaProtectionManager: MediaProtectionManager = js.native
  
  /** Gets the music properties which are used for musicrelated metadata. */
  var musicProperties: MusicProperties = js.native
  
  /**
    * Notifies the MediaStreamSource that an error has occurred which is preventing the application from continuing to deliver data to the MediaStreamSource.
    * @param errorStatus The cause of the error.
    */
  def notifyError(errorStatus: MediaStreamSourceErrorStatus): Unit = js.native
  
  /** Occurs when the MediaStreamSource is shutting down. */
  def onclosed(ev: MediaStreamSourceClosedEventArgs & WinRTEvent[MediaStreamSource]): Unit = js.native
  /** Occurs when the MediaStreamSource is shutting down. */
  @JSName("onclosed")
  var onclosed_Original: TypedEventHandler[MediaStreamSource, MediaStreamSourceClosedEventArgs] = js.native
  
  /** Occurs when the MediaStreamSource is paused and stops requesting MediaStreamSample objects for an unspecified period of time, but is expected to resume requesting MediaStreamSample objects from the current position. */
  def onpaused(ev: Any & WinRTEvent[MediaStreamSource]): Unit = js.native
  /** Occurs when the MediaStreamSource is paused and stops requesting MediaStreamSample objects for an unspecified period of time, but is expected to resume requesting MediaStreamSample objects from the current position. */
  @JSName("onpaused")
  var onpaused_Original: TypedEventHandler[MediaStreamSource, Any] = js.native
  
  /** Occurs when the MediaStreamSource request a MediaStreamSample for a specified stream. */
  def onsamplerequested(ev: MediaStreamSourceSampleRequestedEventArgs & WinRTEvent[MediaStreamSource]): Unit = js.native
  /** Occurs when the MediaStreamSource request a MediaStreamSample for a specified stream. */
  @JSName("onsamplerequested")
  var onsamplerequested_Original: TypedEventHandler[MediaStreamSource, MediaStreamSourceSampleRequestedEventArgs] = js.native
  
  /** Occurs when the MediaStreamSource is ready to start requesting MediaStreamSample objects. The event can specify a position in the media time-line from which the first MediaStreamSample should be delivered. */
  def onstarting(ev: MediaStreamSourceStartingEventArgs & WinRTEvent[MediaStreamSource]): Unit = js.native
  /** Occurs when the MediaStreamSource is ready to start requesting MediaStreamSample objects. The event can specify a position in the media time-line from which the first MediaStreamSample should be delivered. */
  @JSName("onstarting")
  var onstarting_Original: TypedEventHandler[MediaStreamSource, MediaStreamSourceStartingEventArgs] = js.native
  
  /** Occurs when the MediaStreamSource will stop requesting MediaStreamSample objects for a certain stream and will start requesting MediaStreamSample objects from a different stream instead. */
  def onswitchstreamsrequested(ev: MediaStreamSourceSwitchStreamsRequestedEventArgs & WinRTEvent[MediaStreamSource]): Unit = js.native
  /** Occurs when the MediaStreamSource will stop requesting MediaStreamSample objects for a certain stream and will start requesting MediaStreamSample objects from a different stream instead. */
  @JSName("onswitchstreamsrequested")
  var onswitchstreamsrequested_Original: TypedEventHandler[MediaStreamSource, MediaStreamSourceSwitchStreamsRequestedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closed(`type`: closed, listener: TypedEventHandler[MediaStreamSource, MediaStreamSourceClosedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paused(`type`: paused, listener: TypedEventHandler[MediaStreamSource, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_samplerequested(
    `type`: samplerequested,
    listener: TypedEventHandler[MediaStreamSource, MediaStreamSourceSampleRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_starting(
    `type`: starting,
    listener: TypedEventHandler[MediaStreamSource, MediaStreamSourceStartingEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_switchstreamsrequested(
    `type`: switchstreamsrequested,
    listener: TypedEventHandler[MediaStreamSource, MediaStreamSourceSwitchStreamsRequestedEventArgs]
  ): Unit = js.native
  
  /**
    * Sets the range of data that the application is currently buffering.
    * @param startOffset The smallest time stamp of a MediaStreamSample buffered by the application.
    * @param endOffset The largest time stamp of a MediaStreamSample buffered by the application.
    */
  def setBufferedRange(startOffset: Double, endOffset: Double): Unit = js.native
  
  /** Gets or sets the thumbnail which is a reference to a stream for a video thumbnail image or music album art. */
  var thumbnail: IRandomAccessStreamReference = js.native
  
  /** Gets the video properties which are used for video related metadata. */
  var videoProperties: VideoProperties = js.native
}
