package typingsJapgolly.reactVis.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactVis.mod.XYPlotProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.reactVis.mod.XYPlotProps & T because: IArray(Could't extract props from T because couldn't resolve ClassTree.) */
object XYPlot {
  
  def apply[T](p: XYPlotProps & T): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-vis", "XYPlot")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactVis.mod.XYPlot[T]]
  
  implicit def make[T](companion: XYPlot.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}
