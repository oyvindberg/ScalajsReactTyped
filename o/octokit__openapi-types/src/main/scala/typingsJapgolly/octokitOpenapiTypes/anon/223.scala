package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `223` extends StObject {
  
  /** Response */
  var `200`: Content36Headers
}
object `223` {
  
  inline def apply(`200`: Content36Headers): `223` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`223`]
  }
  
  extension [Self <: `223`](x: Self) {
    
    inline def set200(value: Content36Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
