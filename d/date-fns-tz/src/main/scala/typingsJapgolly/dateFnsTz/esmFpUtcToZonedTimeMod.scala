package typingsJapgolly.dateFnsTz

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFpUtcToZonedTimeMod extends Shortcut {
  
  @JSImport("date-fns-tz/esm/fp/utcToZonedTime", JSImport.Namespace)
  @js.native
  val ^ : CurriedFn2[String, js.Date | String | Double, js.Date] = js.native
  
  object default extends Shortcut {
    
    @JSImport("date-fns-tz/esm/fp/utcToZonedTime", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[String, js.Date | String | Double, js.Date] = js.native
    
    type _To = CurriedFn2[String, js.Date | String | Double, js.Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[String, js.Date | String | Double, js.Date] = ^
  }
  
  type _To = CurriedFn2[String, js.Date | String | Double, js.Date]
  
  /* This means you don't have to write `^`, but can instead just say `esmFpUtcToZonedTimeMod.foo` */
  override def _to: CurriedFn2[String, js.Date | String | Double, js.Date] = ^
}
