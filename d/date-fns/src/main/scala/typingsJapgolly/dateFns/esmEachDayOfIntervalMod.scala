package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.anon.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmEachDayOfIntervalMod {
  
  object default {
    
    inline def apply(interval: typingsJapgolly.dateFns.mod.Interval | Interval): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
    inline def apply(interval: typingsJapgolly.dateFns.mod.Interval | Interval, options: Step): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].apply(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
    
    @JSImport("date-fns/esm/eachDayOfInterval", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
