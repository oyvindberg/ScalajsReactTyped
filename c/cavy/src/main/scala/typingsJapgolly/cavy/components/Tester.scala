package typingsJapgolly.cavy.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cavy.mod.TestHookStore
import typingsJapgolly.cavy.mod.TestReport
import typingsJapgolly.cavy.mod.TestScope
import typingsJapgolly.cavy.mod.TesterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tester {
  
  inline def apply(specs: js.Array[js.Function1[/* spec */ TestScope, Unit]], store: TestHookStore): Builder = {
    val __props = js.Dynamic.literal(specs = specs.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TesterProps]))
  }
  
  @JSImport("cavy", "Tester")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.cavy.mod.Tester] {
    
    inline def clearAsyncStorage(value: Boolean): this.type = set("clearAsyncStorage", value.asInstanceOf[js.Any])
    
    inline def reporter(value: /* report */ TestReport => Callback): this.type = set("reporter", js.Any.fromFunction1((t0: /* report */ TestReport) => value(t0).runNow()))
    
    inline def sendReport(value: Boolean): this.type = set("sendReport", value.asInstanceOf[js.Any])
    
    inline def startDelay(value: Double): this.type = set("startDelay", value.asInstanceOf[js.Any])
    
    inline def waitTime(value: Double): this.type = set("waitTime", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TesterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
