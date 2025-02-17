package typingsJapgolly.winrtUwp.Windows.Graphics.Display

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.colorprofilechanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.dpichanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.orientationchanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.stereoenabledchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Monitors and controls physical display information. The class provides events to allow clients to monitor for changes in the display. */
@js.native
trait DisplayInformation extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorprofilechanged(`type`: colorprofilechanged, listener: TypedEventHandler[DisplayInformation, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dpichanged(`type`: dpichanged, listener: TypedEventHandler[DisplayInformation, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchanged(`type`: orientationchanged, listener: TypedEventHandler[DisplayInformation, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stereoenabledchanged(`type`: stereoenabledchanged, listener: TypedEventHandler[DisplayInformation, Any]): Unit = js.native
  
  /** Gets the current orientation of a rectangular monitor. */
  var currentOrientation: DisplayOrientations = js.native
  
  /** Diagonal size of the display in inches. */
  var diagonalSizeInInches: Double = js.native
  
  /**
    * Asynchronously gets the default International Color Consortium (ICC) color profile that is associated with the physical display.
    * @return Object that manages the asynchronous retrieval of the color profile.
    */
  def getColorProfileAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
  
  /** Gets the pixels per logical inch of the current environment. */
  var logicalDpi: Double = js.native
  
  /** Gets the native orientation of the display monitor, which is typically the orientation where the buttons on the device match the orientation of the monitor. */
  var nativeOrientation: DisplayOrientations = js.native
  
  /** Occurs when the physical display's color profile changes. */
  def oncolorprofilechanged(ev: Any & WinRTEvent[DisplayInformation]): Unit = js.native
  /** Occurs when the physical display's color profile changes. */
  @JSName("oncolorprofilechanged")
  var oncolorprofilechanged_Original: TypedEventHandler[DisplayInformation, Any] = js.native
  
  /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
  def ondpichanged(ev: Any & WinRTEvent[DisplayInformation]): Unit = js.native
  /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
  @JSName("ondpichanged")
  var ondpichanged_Original: TypedEventHandler[DisplayInformation, Any] = js.native
  
  /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
  def onorientationchanged(ev: Any & WinRTEvent[DisplayInformation]): Unit = js.native
  /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
  @JSName("onorientationchanged")
  var onorientationchanged_Original: TypedEventHandler[DisplayInformation, Any] = js.native
  
  /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
  def onstereoenabledchanged(ev: Any & WinRTEvent[DisplayInformation]): Unit = js.native
  /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
  @JSName("onstereoenabledchanged")
  var onstereoenabledchanged_Original: TypedEventHandler[DisplayInformation, Any] = js.native
  
  /** Gets the raw dots per inch (DPI) along the x axis of the display monitor. */
  var rawDpiX: Double = js.native
  
  /** Gets the raw dots per inch (DPI) along the y axis of the display monitor. */
  var rawDpiY: Double = js.native
  
  /** Gets a value representing the number of raw (physical) pixels for each view (layout) pixel. */
  var rawPixelsPerViewPixel: Double = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_colorprofilechanged(`type`: colorprofilechanged, listener: TypedEventHandler[DisplayInformation, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dpichanged(`type`: dpichanged, listener: TypedEventHandler[DisplayInformation, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchanged(`type`: orientationchanged, listener: TypedEventHandler[DisplayInformation, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stereoenabledchanged(`type`: stereoenabledchanged, listener: TypedEventHandler[DisplayInformation, Any]): Unit = js.native
  
  /** Gets the scale factor of the immersive environment. */
  var resolutionScale: ResolutionScale = js.native
  
  /** Gets a value that indicates whether the device supports stereoscopic 3D. */
  var stereoEnabled: Boolean = js.native
}
