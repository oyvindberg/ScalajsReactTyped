package typingsJapgolly.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggressiveTokenizerPt
  extends StObject
     with Tokenizer
object AggressiveTokenizerPt {
  
  inline def apply(tokenize: String => js.Array[String]): AggressiveTokenizerPt = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[AggressiveTokenizerPt]
  }
}
