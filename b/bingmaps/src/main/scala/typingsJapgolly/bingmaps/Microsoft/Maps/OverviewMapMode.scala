package typingsJapgolly.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverviewMapMode extends StObject
@JSGlobal("Microsoft.Maps.OverviewMapMode")
@js.native
object OverviewMapMode extends StObject {
  
  /** Shows the overview map in an expanded state. */
  @js.native
  sealed trait expanded
    extends StObject
       with OverviewMapMode
  
  /** Hides the overview map. */
  @js.native
  sealed trait hidden
    extends StObject
       with OverviewMapMode
  
  /** Shows the overview map in a minimized state. */
  @js.native
  sealed trait minimized
    extends StObject
       with OverviewMapMode
}
