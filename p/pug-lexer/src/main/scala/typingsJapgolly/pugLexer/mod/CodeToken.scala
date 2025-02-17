package typingsJapgolly.pugLexer.mod

import typingsJapgolly.pugLexer.pugLexerStrings.code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeToken
  extends StObject
     with LexToken[code]
     with _Token {
  
  var buffer: Boolean
  
  var mustEscape: Boolean
  
  var `val`: String
}
object CodeToken {
  
  inline def apply(buffer: Boolean, loc: Loc, mustEscape: Boolean, `val`: String): CodeToken = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], mustEscape = mustEscape.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("code")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeToken]
  }
  
  extension [Self <: CodeToken](x: Self) {
    
    inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setMustEscape(value: Boolean): Self = StObject.set(x, "mustEscape", value.asInstanceOf[js.Any])
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
