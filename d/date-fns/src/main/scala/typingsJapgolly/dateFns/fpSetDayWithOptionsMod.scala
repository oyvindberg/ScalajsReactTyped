package typingsJapgolly.dateFns

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dateFns.anon.LocaleWeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpSetDayWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/setDayWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[LocaleWeekStartsOn, Double, js.Date | Double, js.Date] = js.native
    
    type _To = CurriedFn3[LocaleWeekStartsOn, Double, js.Date | Double, js.Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[LocaleWeekStartsOn, Double, js.Date | Double, js.Date] = ^
  }
}
