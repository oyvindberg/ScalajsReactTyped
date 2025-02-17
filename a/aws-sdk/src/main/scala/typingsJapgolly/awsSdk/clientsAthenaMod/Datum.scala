package typingsJapgolly.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datum extends StObject {
  
  /**
    * The value of the datum.
    */
  var VarCharValue: js.UndefOr[datumString] = js.undefined
}
object Datum {
  
  inline def apply(): Datum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datum]
  }
  
  extension [Self <: Datum](x: Self) {
    
    inline def setVarCharValue(value: datumString): Self = StObject.set(x, "VarCharValue", value.asInstanceOf[js.Any])
    
    inline def setVarCharValueUndefined: Self = StObject.set(x, "VarCharValue", js.undefined)
  }
}
