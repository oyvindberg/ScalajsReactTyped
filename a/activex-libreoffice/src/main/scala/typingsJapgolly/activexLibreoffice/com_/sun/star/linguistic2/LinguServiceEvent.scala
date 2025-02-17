package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a linguistic service event.
  *
  * This type of event may be broadcast by a spell checker or hyphenator service implementation to inform its listeners (clients) that the results of
  * previous function calls may be different now. It is possible to suggest that hyphenation should be done again and/or the spelling of previously
  * incorrect or correct words should be checked again.
  * @see com.sun.star.linguistic2.XLinguServiceEventBroadcaster
  * @see com.sun.star.linguistic2.XLinguServiceEventListener
  * @see com.sun.star.linguistic2.SpellChecker
  * @see com.sun.star.linguistic2.Hyphenator
  * @see com.sun.star.lang.EventObject
  */
trait LinguServiceEvent
  extends StObject
     with EventObject {
  
  /**
    * The type of event.
    *
    * The value may be combined via logical OR from those values defined in {@link com.sun.star.linguistic2.LinguServiceEventFlags}
    */
  var nEvent: Double
}
object LinguServiceEvent {
  
  inline def apply(Source: XInterface, nEvent: Double): LinguServiceEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], nEvent = nEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinguServiceEvent]
  }
  
  extension [Self <: LinguServiceEvent](x: Self) {
    
    inline def setNEvent(value: Double): Self = StObject.set(x, "nEvent", value.asInstanceOf[js.Any])
  }
}
