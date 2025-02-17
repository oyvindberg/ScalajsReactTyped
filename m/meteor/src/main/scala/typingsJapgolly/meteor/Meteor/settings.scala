package typingsJapgolly.meteor.Meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Global props **/
/** Settings **/
trait Settings
  extends StObject
     with /* id */ StringDictionary[Any] {
  
  var public: StringDictionary[Any]
}
object Settings {
  
  inline def apply(public: StringDictionary[Any]): Settings = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setPublic(value: StringDictionary[Any]): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}
