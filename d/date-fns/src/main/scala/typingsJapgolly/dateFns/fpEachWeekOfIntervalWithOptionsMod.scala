package typingsJapgolly.dateFns

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dateFns.anon.LocaleWeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpEachWeekOfIntervalWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/eachWeekOfIntervalWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[LocaleWeekStartsOn, Interval, js.Array[js.Date]] = js.native
    
    type _To = CurriedFn2[LocaleWeekStartsOn, Interval, js.Array[js.Date]]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[LocaleWeekStartsOn, Interval, js.Array[js.Date]] = ^
  }
}
