package typingsJapgolly.winrtUwp.Windows.Storage.Provider

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.fileupdaterequested
import typingsJapgolly.winrtUwp.winrtUwpStrings.uirequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to interact with the file picker if your app provides file updates through the Cached File Updater contract. */
@js.native
trait CachedFileUpdaterUI extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fileupdaterequested(
    `type`: fileupdaterequested,
    listener: TypedEventHandler[CachedFileUpdaterUI, FileUpdateRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_uirequested(`type`: uirequested, listener: TypedEventHandler[CachedFileUpdaterUI, Any]): Unit = js.native
  
  /**
    * Gets an object used to complete a file update request asynchronously.
    * @return The object that the app uses to indicate, asynchronously, that it has finished responding to a FileUpdateRequested event and that the Request is complete.
    */
  def getDeferral(): FileUpdateRequestDeferral = js.native
  
  /** Fires when the Windows requests a file update. This event fires once for each requested update. */
  def onfileupdaterequested(ev: FileUpdateRequestedEventArgs & WinRTEvent[CachedFileUpdaterUI]): Unit = js.native
  /** Fires when the Windows requests a file update. This event fires once for each requested update. */
  @JSName("onfileupdaterequested")
  var onfileupdaterequested_Original: TypedEventHandler[CachedFileUpdaterUI, FileUpdateRequestedEventArgs] = js.native
  
  /** Fires when the calling app needs to display the file picker letterbox UI that is represented by the CachedFileUpdaterUI object. */
  def onuirequested(ev: Any & WinRTEvent[CachedFileUpdaterUI]): Unit = js.native
  /** Fires when the calling app needs to display the file picker letterbox UI that is represented by the CachedFileUpdaterUI object. */
  @JSName("onuirequested")
  var onuirequested_Original: TypedEventHandler[CachedFileUpdaterUI, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fileupdaterequested(
    `type`: fileupdaterequested,
    listener: TypedEventHandler[CachedFileUpdaterUI, FileUpdateRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_uirequested(`type`: uirequested, listener: TypedEventHandler[CachedFileUpdaterUI, Any]): Unit = js.native
  
  /** Gets or sets the title to display in the top-left the file picker UI. The title identifies the location or context of the app's page (which is hosted in the file picker UI) for the user. */
  var title: String = js.native
  
  /** Gets an enum value that indicates the status of the file picker UI. */
  var uiStatus: UIStatus = js.native
  
  /** Gets the file update request currently being processed by the cached file updater. */
  var updateRequest: FileUpdateRequest = js.native
  
  /** Gets a value that indicates which version of the file needs to be updated: the local version or the version in the app's repository. */
  var updateTarget: CachedFileTarget = js.native
}
