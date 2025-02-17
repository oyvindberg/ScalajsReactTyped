package typingsJapgolly.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationViewBoundsMode extends StObject
/** The bounds used by the framework to lay out the contents of a window (app view). */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewBoundsMode")
@js.native
object ApplicationViewBoundsMode extends StObject {
  
  /** Lay out the window's content within the region occupied by the core window (that is, including any occluded areas). */
  @js.native
  sealed trait useCoreWindow
    extends StObject
       with ApplicationViewBoundsMode
  
  /** Lay out the window's content within the visible region (that is, the region not occluded by chrome such as the status bar and app bar). */
  @js.native
  sealed trait useVisible
    extends StObject
       with ApplicationViewBoundsMode
}
