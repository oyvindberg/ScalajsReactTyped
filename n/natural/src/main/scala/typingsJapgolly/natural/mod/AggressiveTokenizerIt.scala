package typingsJapgolly.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggressiveTokenizerIt
  extends StObject
     with Tokenizer
object AggressiveTokenizerIt {
  
  inline def apply(tokenize: String => js.Array[String]): AggressiveTokenizerIt = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[AggressiveTokenizerIt]
  }
}
