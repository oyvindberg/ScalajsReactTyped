package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsSpinnerMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/spinner", "Spinner")
  @js.native
  open class Spinner () extends StObject {
    def this(text: String) = this()
    
    /** When false, only fail messages will be displayed. */
    var enabled: Boolean = js.native
    
    def fail(): Unit = js.native
    def fail(text: String): Unit = js.native
    
    def isSpinning: Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    /* private */ val spinner: Any = js.native
    
    def start(): Unit = js.native
    def start(text: String): Unit = js.native
    
    def stop(): Unit = js.native
    
    def succeed(): Unit = js.native
    def succeed(text: String): Unit = js.native
    
    def text_=(text: String): Unit = js.native
  }
}
