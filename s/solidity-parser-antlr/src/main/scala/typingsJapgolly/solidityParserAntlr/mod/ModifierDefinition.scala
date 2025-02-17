package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifierDefinition
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var name: String
  
  @JSName("type")
  var type_ModifierDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition
}
object ModifierDefinition {
  
  inline def apply(name: String): ModifierDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ModifierDefinition")
    __obj.asInstanceOf[ModifierDefinition]
  }
  
  extension [Self <: ModifierDefinition](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
