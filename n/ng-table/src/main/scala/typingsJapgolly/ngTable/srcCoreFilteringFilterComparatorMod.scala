package typingsJapgolly.ngTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreFilteringFilterComparatorMod {
  
  type FilterComparator[T] = Boolean | IFilterComparatorFunc[T]
  
  type IFilterComparatorFunc[T] = js.Function2[/* actual */ T, /* expected */ T, Boolean]
}
