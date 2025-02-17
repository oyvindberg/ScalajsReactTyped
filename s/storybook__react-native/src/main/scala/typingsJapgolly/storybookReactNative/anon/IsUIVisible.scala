package typingsJapgolly.storybookReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsUIVisible extends StObject {
  
  var isUIVisible: Boolean
}
object IsUIVisible {
  
  inline def apply(isUIVisible: Boolean): IsUIVisible = {
    val __obj = js.Dynamic.literal(isUIVisible = isUIVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsUIVisible]
  }
  
  extension [Self <: IsUIVisible](x: Self) {
    
    inline def setIsUIVisible(value: Boolean): Self = StObject.set(x, "isUIVisible", value.asInstanceOf[js.Any])
  }
}
