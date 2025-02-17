package typingsJapgolly.antDesignReactNative

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSliderDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/slider/demo/basic", JSImport.Default)
  @js.native
  open class default protected () extends BasicSliderExample {
    def this(props: Any) = this()
  }
  
  @js.native
  trait BasicSliderExample extends Component[Any, Any, Any] {
    
    def handleChange(value: Any): Unit = js.native
    
    def minMaxChange(value: Any): Unit = js.native
    
    def onAfterChange(value: Any): Unit = js.native
  }
}
