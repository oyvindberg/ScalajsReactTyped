package typingsJapgolly.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYKES extends StObject {
  
  var JPY: js.Array[String]
  
  var KES: js.Array[String]
  
  var TZS: js.Array[String]
  
  var USD: js.Array[String]
}
object JPYKES {
  
  inline def apply(JPY: js.Array[String], KES: js.Array[String], TZS: js.Array[String], USD: js.Array[String]): JPYKES = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], TZS = TZS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYKES]
  }
  
  extension [Self <: JPYKES](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setKES(value: js.Array[String]): Self = StObject.set(x, "KES", value.asInstanceOf[js.Any])
    
    inline def setKESVarargs(value: String*): Self = StObject.set(x, "KES", js.Array(value*))
    
    inline def setTZS(value: js.Array[String]): Self = StObject.set(x, "TZS", value.asInstanceOf[js.Any])
    
    inline def setTZSVarargs(value: String*): Self = StObject.set(x, "TZS", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
