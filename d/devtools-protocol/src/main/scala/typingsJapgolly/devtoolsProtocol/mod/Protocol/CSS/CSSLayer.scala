package typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSLayer extends StObject {
  
  /**
    * The associated rule header range in the enclosing stylesheet (if
    * available).
    */
  var range: js.UndefOr[SourceRange] = js.undefined
  
  /**
    * Identifier of the stylesheet containing this object (if exists).
    */
  var styleSheetId: js.UndefOr[StyleSheetId] = js.undefined
  
  /**
    * Layer name.
    */
  var text: String
}
object CSSLayer {
  
  inline def apply(text: String): CSSLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSLayer]
  }
  
  extension [Self <: CSSLayer](x: Self) {
    
    inline def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetIdUndefined: Self = StObject.set(x, "styleSheetId", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
