package typingsJapgolly.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents zoom settings that can be applied to the ZoomControl by calling the Configure method. */
@JSGlobal("Windows.Media.Devices.ZoomSettings")
@js.native
/** Initializes a new instance of the ZoomSettings class. */
open class ZoomSettings ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Devices.ZoomSettings {
  
  /** Gets or sets a ZoomTransitionMode value indicating how the capture device should transition to the new zoom value specified with the Value property. */
  /* CompleteClass */
  var mode: typingsJapgolly.winrtUwp.Windows.Media.Devices.ZoomTransitionMode = js.native
  
  /** Gets or sets the zoom value to which the ZoomControl will transition. */
  /* CompleteClass */
  var value: Double = js.native
}
