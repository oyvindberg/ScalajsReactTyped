package typingsJapgolly.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: typingsJapgolly.typedoc.distLibUtilsOptionsOptionsMod.Options
}
object Options {
  
  inline def apply(options: typingsJapgolly.typedoc.distLibUtilsOptionsOptionsMod.Options): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: typingsJapgolly.typedoc.distLibUtilsOptionsOptionsMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
