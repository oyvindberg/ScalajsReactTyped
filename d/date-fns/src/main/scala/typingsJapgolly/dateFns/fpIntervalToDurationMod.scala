package typingsJapgolly.dateFns

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpIntervalToDurationMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/intervalToDuration", JSImport.Default)
    @js.native
    val ^ : CurriedFn1[Interval, Duration] = js.native
    
    type _To = CurriedFn1[Interval, Duration]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn1[Interval, Duration] = ^
  }
}
