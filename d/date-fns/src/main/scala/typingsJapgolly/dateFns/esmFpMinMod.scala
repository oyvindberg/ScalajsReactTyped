package typingsJapgolly.dateFns

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFpMinMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/min", JSImport.Default)
    @js.native
    val ^ : CurriedFn1[js.Array[js.Date | Double], js.Date] = js.native
    
    type _To = CurriedFn1[js.Array[js.Date | Double], js.Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn1[js.Array[js.Date | Double], js.Date] = ^
  }
}
