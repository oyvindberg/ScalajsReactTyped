package typingsJapgolly.dateFns.anon

import typingsJapgolly.dateFns.dateFnsInts.`2`
import typingsJapgolly.dateFns.dateFnsInts.`3`
import typingsJapgolly.dateFns.dateFnsInts.`4`
import typingsJapgolly.dateFns.dateFnsInts.`5`
import typingsJapgolly.dateFns.dateFnsInts.`6`
import typingsJapgolly.dateFns.dateFnsInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var firstWeekContainsDate: js.UndefOr[typingsJapgolly.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
  
  var locale: js.UndefOr[typingsJapgolly.dateFns.Locale] = js.undefined
  
  var weekStartsOn: js.UndefOr[
    typingsJapgolly.dateFns.dateFnsInts.`0` | typingsJapgolly.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6`
  ] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setFirstWeekContainsDate(value: typingsJapgolly.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
    
    inline def setFirstWeekContainsDateUndefined: Self = StObject.set(x, "firstWeekContainsDate", js.undefined)
    
    inline def setLocale(value: typingsJapgolly.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setWeekStartsOn(
      value: typingsJapgolly.dateFns.dateFnsInts.`0` | typingsJapgolly.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6`
    ): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
