package typingsJapgolly.editly.anon

import typingsJapgolly.editly.editlyStrings.canvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var `type`: canvas
}
object `15` {
  
  inline def apply(): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("canvas")
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setType(value: canvas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
