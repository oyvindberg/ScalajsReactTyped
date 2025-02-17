package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerSessionEvents extends StObject {
  
  var events: js.Array[ProfilerEvent]
  
  var eventsLost: Boolean
  
  var sessionId: String
}
object ProfilerSessionEvents {
  
  inline def apply(events: js.Array[ProfilerEvent], eventsLost: Boolean, sessionId: String): ProfilerSessionEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], eventsLost = eventsLost.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionEvents]
  }
  
  extension [Self <: ProfilerSessionEvents](x: Self) {
    
    inline def setEvents(value: js.Array[ProfilerEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsLost(value: Boolean): Self = StObject.set(x, "eventsLost", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: ProfilerEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
