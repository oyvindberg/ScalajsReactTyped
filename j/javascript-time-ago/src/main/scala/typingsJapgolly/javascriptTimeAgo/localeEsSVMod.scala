package typingsJapgolly.javascriptTimeAgo

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`es-SV`
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typingsJapgolly.javascriptTimeAgo.localeMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeEsSVMod extends Shortcut {
  
  @JSImport("javascript-time-ago/locale/es-SV", JSImport.Namespace)
  @js.native
  val ^ : Locale = js.native
  
  trait Locale extends StObject {
    
    var locale: `es-SV`
    
    var long: Duration
    
    def quantify(n: Double): one | two | few | other
  }
  object Locale {
    
    inline def apply(long: Duration, quantify: Double => one | two | few | other): Locale = {
      val __obj = js.Dynamic.literal(locale = "es-SV", long = long.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify))
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setLocale(value: `es-SV`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLong(value: Duration): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setQuantify(value: Double => one | two | few | other): Self = StObject.set(x, "quantify", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Locale
  
  /* This means you don't have to write `^`, but can instead just say `localeEsSVMod.foo` */
  override def _to: Locale = ^
}
