package typingsJapgolly.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultAudioRenderDeviceChangedEventArgs
  extends StObject
     with IDefaultAudioDeviceChangedEventArgs
object DefaultAudioRenderDeviceChangedEventArgs {
  
  inline def apply(id: String, role: AudioDeviceRole): DefaultAudioRenderDeviceChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAudioRenderDeviceChangedEventArgs]
  }
}
