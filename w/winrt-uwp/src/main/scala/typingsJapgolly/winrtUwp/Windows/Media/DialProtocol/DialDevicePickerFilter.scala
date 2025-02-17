package typingsJapgolly.winrtUwp.Windows.Media.DialProtocol

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the filter used to determine which devices to show in a DialDevicePicker . The filter parameters are OR-ed together to build the resulting filter. */
trait DialDevicePickerFilter extends StObject {
  
  /** Gets a list of DIAL apps supported by the remote devices. Defaults to an empty list (no filter). You can add one or more app names and filter the devices list to those that can launch one the supported apps. */
  var supportedAppNames: IVector[String]
}
object DialDevicePickerFilter {
  
  inline def apply(supportedAppNames: IVector[String]): DialDevicePickerFilter = {
    val __obj = js.Dynamic.literal(supportedAppNames = supportedAppNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialDevicePickerFilter]
  }
  
  extension [Self <: DialDevicePickerFilter](x: Self) {
    
    inline def setSupportedAppNames(value: IVector[String]): Self = StObject.set(x, "supportedAppNames", value.asInstanceOf[js.Any])
  }
}
