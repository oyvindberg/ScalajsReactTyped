package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `345` extends StObject {
  
  var c: js.Array[LT]
  
  var d: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`180`
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`
}
object `345` {
  
  inline def apply(c: js.Array[LT]): `345` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 180, u = 120)
    __obj.asInstanceOf[`345`]
  }
  
  extension [Self <: `345`](x: Self) {
    
    inline def setC(value: js.Array[LT]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: LT*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
