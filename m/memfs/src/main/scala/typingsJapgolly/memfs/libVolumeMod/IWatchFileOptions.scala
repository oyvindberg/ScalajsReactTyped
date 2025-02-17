package typingsJapgolly.memfs.libVolumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWatchFileOptions extends StObject {
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
}
object IWatchFileOptions {
  
  inline def apply(): IWatchFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWatchFileOptions]
  }
  
  extension [Self <: IWatchFileOptions](x: Self) {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
  }
}
