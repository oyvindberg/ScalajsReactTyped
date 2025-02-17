package typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothLEAdvertisementFlags extends StObject
/** Specifies flags used to match flags contained inside a Bluetooth LE advertisement payload. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags")
@js.native
object BluetoothLEAdvertisementFlags extends StObject {
  
  /** Bluetooth BR/EDR not supported. */
  @js.native
  sealed trait classicNotSupported
    extends StObject
       with BluetoothLEAdvertisementFlags
  
  /** Simultaneous Bluetooth LE and BR/EDR to same device capable (controller). */
  @js.native
  sealed trait dualModeControllerCapable
    extends StObject
       with BluetoothLEAdvertisementFlags
  
  /** Simultaneous Bluetooth LE and BR/EDR to same device capable (host) */
  @js.native
  sealed trait dualModeHostCapable
    extends StObject
       with BluetoothLEAdvertisementFlags
  
  /** Bluetooth LE General Discoverable Mode. */
  @js.native
  sealed trait generalDiscoverableMode
    extends StObject
       with BluetoothLEAdvertisementFlags
  
  /** Bluetooth LE Limited Discoverable Mode. */
  @js.native
  sealed trait limitedDiscoverableMode
    extends StObject
       with BluetoothLEAdvertisementFlags
  
  /** None */
  @js.native
  sealed trait none
    extends StObject
       with BluetoothLEAdvertisementFlags
}
