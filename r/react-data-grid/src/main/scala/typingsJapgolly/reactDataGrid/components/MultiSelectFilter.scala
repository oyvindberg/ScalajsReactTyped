package typingsJapgolly.reactDataGrid.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from scala.Any because couldn't resolve ClassTree. */
object MultiSelectFilter {
  
  def apply(p: Any): Default[
    typingsJapgolly.reactDataGrid.global.AdazzleReactDataGridPlugins.Filters.MultiSelectFilter
  ] = new Default[
    typingsJapgolly.reactDataGrid.global.AdazzleReactDataGridPlugins.Filters.MultiSelectFilter
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSGlobal("AdazzleReactDataGridPlugins.Filters.MultiSelectFilter")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MultiSelectFilter.type): Default[
    typingsJapgolly.reactDataGrid.global.AdazzleReactDataGridPlugins.Filters.MultiSelectFilter
  ] = new Default[
    typingsJapgolly.reactDataGrid.global.AdazzleReactDataGridPlugins.Filters.MultiSelectFilter
  ](js.Array(this.component, js.Dictionary.empty))()
}
