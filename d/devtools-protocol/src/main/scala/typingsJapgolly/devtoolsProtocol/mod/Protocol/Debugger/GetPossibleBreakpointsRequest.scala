package typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPossibleBreakpointsRequest extends StObject {
  
  /**
    * End of range to search possible breakpoint locations in (excluding). When not specified, end
    * of scripts is used as end of range.
    */
  var end: js.UndefOr[Location] = js.undefined
  
  /**
    * Only consider locations which are in the same (non-nested) function as start.
    */
  var restrictToFunction: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Start of range to search possible breakpoint locations in.
    */
  var start: Location
}
object GetPossibleBreakpointsRequest {
  
  inline def apply(start: Location): GetPossibleBreakpointsRequest = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPossibleBreakpointsRequest]
  }
  
  extension [Self <: GetPossibleBreakpointsRequest](x: Self) {
    
    inline def setEnd(value: Location): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setRestrictToFunction(value: Boolean): Self = StObject.set(x, "restrictToFunction", value.asInstanceOf[js.Any])
    
    inline def setRestrictToFunctionUndefined: Self = StObject.set(x, "restrictToFunction", js.undefined)
    
    inline def setStart(value: Location): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
