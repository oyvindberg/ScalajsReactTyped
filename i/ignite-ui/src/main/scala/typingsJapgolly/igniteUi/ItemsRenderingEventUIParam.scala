package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsRenderingEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
    */
  var dataSource: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference to the combo performing rendering.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ItemsRenderingEventUIParam {
  
  inline def apply(): ItemsRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsRenderingEventUIParam]
  }
  
  extension [Self <: ItemsRenderingEventUIParam](x: Self) {
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
