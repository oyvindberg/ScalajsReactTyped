package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesKeepBothFiles extends StObject {
  
  var enumValues: KeepBothFiles
}
object EnumValuesKeepBothFiles {
  
  inline def apply(enumValues: KeepBothFiles): EnumValuesKeepBothFiles = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesKeepBothFiles]
  }
  
  extension [Self <: EnumValuesKeepBothFiles](x: Self) {
    
    inline def setEnumValues(value: KeepBothFiles): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
