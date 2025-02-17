package typingsJapgolly.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SpeechRecognizer.StateChangedEvent event. */
trait SpeechRecognizerStateChangedEventArgs extends StObject {
  
  /** Gets the audio capture state. */
  var state: SpeechRecognizerState
}
object SpeechRecognizerStateChangedEventArgs {
  
  inline def apply(state: SpeechRecognizerState): SpeechRecognizerStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognizerStateChangedEventArgs]
  }
  
  extension [Self <: SpeechRecognizerStateChangedEventArgs](x: Self) {
    
    inline def setState(value: SpeechRecognizerState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
