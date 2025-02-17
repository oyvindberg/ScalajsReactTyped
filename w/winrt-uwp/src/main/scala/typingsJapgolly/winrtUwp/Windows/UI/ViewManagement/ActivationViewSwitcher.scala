package typingsJapgolly.winrtUwp.Windows.UI.ViewManagement

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivationViewSwitcher extends StObject {
  
  var isViewPresentedOnActivationVirtualDesktop: Any = js.native
  
  /**
    * Shows the view in a new standalone window.
    * @param viewId The identifier for the view.
    * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
    */
  def showAsStandaloneAsync(viewId: Double): IPromiseWithIAsyncAction = js.native
  /* unmapped type */
  /**
    * Shows the view in a new standalone window and sets the size preference for the view.
    * @param viewId The identifier for the view.
    * @param sizePreference The preferred size of the view.
    * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
    */
  def showAsStandaloneAsync(viewId: Double, sizePreference: ViewSizePreference): IPromiseWithIAsyncAction = js.native
}
