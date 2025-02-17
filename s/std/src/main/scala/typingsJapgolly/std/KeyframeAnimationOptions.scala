package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyframeAnimationOptions
  extends StObject
     with KeyframeEffectOptions {
  
  /* standard dom */
  var id: js.UndefOr[java.lang.String] = js.undefined
}
object KeyframeAnimationOptions {
  
  inline def apply(): KeyframeAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframeAnimationOptions]
  }
  
  extension [Self <: KeyframeAnimationOptions](x: Self) {
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
