package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendProps
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendType
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendValue
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveBreakpoint extends StObject {
  
  var extend: js.UndefOr[ExtendType[Record[String, Any]]] = js.undefined
  
  var responsiveBreakpoint: js.UndefOr[String] = js.undefined
}
object ResponsiveBreakpoint {
  
  inline def apply(): ResponsiveBreakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveBreakpoint]
  }
  
  extension [Self <: ResponsiveBreakpoint](x: Self) {
    
    inline def setExtend(value: ExtendType[Record[String, Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(value: /* props */ ExtendProps[Record[String, Any]] => ExtendValue[Record[String, Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setResponsiveBreakpoint(value: String): Self = StObject.set(x, "responsiveBreakpoint", value.asInstanceOf[js.Any])
    
    inline def setResponsiveBreakpointUndefined: Self = StObject.set(x, "responsiveBreakpoint", js.undefined)
  }
}
