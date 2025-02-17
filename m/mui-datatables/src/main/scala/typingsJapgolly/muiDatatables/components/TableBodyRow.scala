package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableBodyRow
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBodyRow {
  
  inline def apply(options: MUIDataTableOptions): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableBodyRow]))
  }
  
  @JSImport("mui-datatables", "TableBodyRow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* args */ Any => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def rowSelected(value: Boolean): this.type = set("rowSelected", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableBodyRow): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
