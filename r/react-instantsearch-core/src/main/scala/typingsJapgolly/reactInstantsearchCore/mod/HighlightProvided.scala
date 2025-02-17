package typingsJapgolly.reactInstantsearchCore.mod

import typingsJapgolly.reactInstantsearchCore.anon.HighlightProperty
import typingsJapgolly.reactInstantsearchCore.anon.IsHighlighted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightProvided[TDoc] extends StObject {
  
  /**
    * function to retrieve and parse an attribute from a hit. It takes a configuration object with 3 attributes:
    * * highlightProperty which is the property that contains the highlight structure from the records,
    * * attribute which is the name of the attribute (it can be either a string or an array of strings) to look for,
    * * hit which is the hit from Algolia.
    * It returns an array of objects {value: string, isHighlighted: boolean}.
    * If the element that corresponds to the attribute is an array of strings, it will return a nested array of objects.
    * In this case you should cast the result:
    * ```ts
    * highlight({
    *  attribute: 'my_string_array',
    *  hit,
    *  highlightProperty: '_highlightResult'
    * }) as Array<Array<{value: string, isHighlighted: boolean}>>
    * ```
    */
  def highlight(configuration: HighlightProperty[TDoc]): js.Array[IsHighlighted]
}
object HighlightProvided {
  
  inline def apply[TDoc](highlight: HighlightProperty[TDoc] => js.Array[IsHighlighted]): HighlightProvided[TDoc] = {
    val __obj = js.Dynamic.literal(highlight = js.Any.fromFunction1(highlight))
    __obj.asInstanceOf[HighlightProvided[TDoc]]
  }
  
  extension [Self <: HighlightProvided[?], TDoc](x: Self & HighlightProvided[TDoc]) {
    
    inline def setHighlight(value: HighlightProperty[TDoc] => js.Array[IsHighlighted]): Self = StObject.set(x, "highlight", js.Any.fromFunction1(value))
  }
}
