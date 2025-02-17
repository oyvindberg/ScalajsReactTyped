package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.SymbolTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType
     with Node {
  
  @JSName("type")
  var type_SymbolTypeAnnotation_ : SymbolTypeAnnotation
}
object SymbolTypeAnnotation_ {
  
  inline def apply(): SymbolTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SymbolTypeAnnotation")
    __obj.asInstanceOf[SymbolTypeAnnotation_]
  }
  
  extension [Self <: SymbolTypeAnnotation_](x: Self) {
    
    inline def setType(value: SymbolTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
