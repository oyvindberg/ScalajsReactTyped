package typingsJapgolly.winrtUwp.Windows.ApplicationModel.DataTransfer

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.datarequested
import typingsJapgolly.winrtUwp.winrtUwpStrings.targetapplicationchosen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Programmatically initiates an exchange of content with other apps. */
@js.native
trait DataTransferManager extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datarequested(`type`: datarequested, listener: TypedEventHandler[DataTransferManager, DataRequestedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetapplicationchosen(
    `type`: targetapplicationchosen,
    listener: TypedEventHandler[DataTransferManager, TargetApplicationChosenEventArgs]
  ): Unit = js.native
  
  /** Occurs when a share operation starts. */
  def ondatarequested(ev: DataRequestedEventArgs & WinRTEvent[DataTransferManager]): Unit = js.native
  /** Occurs when a share operation starts. */
  @JSName("ondatarequested")
  var ondatarequested_Original: TypedEventHandler[DataTransferManager, DataRequestedEventArgs] = js.native
  
  /** Occurs when the user chooses a target app in the Share charm. */
  def ontargetapplicationchosen(ev: TargetApplicationChosenEventArgs & WinRTEvent[DataTransferManager]): Unit = js.native
  /** Occurs when the user chooses a target app in the Share charm. */
  @JSName("ontargetapplicationchosen")
  var ontargetapplicationchosen_Original: TypedEventHandler[DataTransferManager, TargetApplicationChosenEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datarequested(`type`: datarequested, listener: TypedEventHandler[DataTransferManager, DataRequestedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_targetapplicationchosen(
    `type`: targetapplicationchosen,
    listener: TypedEventHandler[DataTransferManager, TargetApplicationChosenEventArgs]
  ): Unit = js.native
}
