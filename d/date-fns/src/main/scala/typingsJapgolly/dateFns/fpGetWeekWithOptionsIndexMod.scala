package typingsJapgolly.dateFns

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dateFns.anon.FirstWeekContainsDateLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpGetWeekWithOptionsIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/getWeekWithOptions/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, Double] = js.native
    
    type _To = CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, Double]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[FirstWeekContainsDateLocale, js.Date | Double, Double] = ^
  }
}
