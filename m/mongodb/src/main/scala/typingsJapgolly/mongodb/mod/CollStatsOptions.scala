package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollStatsOptions
  extends StObject
     with CommandOperationOptions {
  
  /** Divide the returned sizes by scale value. */
  var scale: js.UndefOr[scala.Double] = js.undefined
}
object CollStatsOptions {
  
  inline def apply(): CollStatsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollStatsOptions]
  }
  
  extension [Self <: CollStatsOptions](x: Self) {
    
    inline def setScale(value: scala.Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
