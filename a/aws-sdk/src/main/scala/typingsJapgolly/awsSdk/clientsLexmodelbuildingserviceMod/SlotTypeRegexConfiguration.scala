package typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotTypeRegexConfiguration extends StObject {
  
  /**
    * A regular expression used to validate the value of a slot.  Use a standard regular expression. Amazon Lex supports the following characters in the regular expression:   A-Z, a-z   0-9   Unicode characters ("\ u&lt;Unicode&gt;")   Represent Unicode characters with four digits, for example "\\u0041" or "\\u005A". The following regular expression operators are not supported:   Infinite repeaters: *, +, or {x,} with no upper bound.   Wild card (.)  
    */
  var pattern: RegexPattern
}
object SlotTypeRegexConfiguration {
  
  inline def apply(pattern: RegexPattern): SlotTypeRegexConfiguration = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotTypeRegexConfiguration]
  }
  
  extension [Self <: SlotTypeRegexConfiguration](x: Self) {
    
    inline def setPattern(value: RegexPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
