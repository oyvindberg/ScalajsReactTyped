package typingsJapgolly.hapiJoi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.hapiJoi.mod._Schema because Already inherited */ @js.native
trait SymbolSchema
  extends StObject
     with AnySchema {
  
  // TODO: support number and symbol index
  def map(iterable: js.Iterable[js.Tuple2[String | Double | Boolean | js.Symbol, js.Symbol]]): this.type = js.native
  def map(iterable: StringDictionary[js.Symbol]): this.type = js.native
}
