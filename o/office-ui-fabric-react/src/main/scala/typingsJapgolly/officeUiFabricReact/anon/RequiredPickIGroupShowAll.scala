package typingsJapgolly.officeUiFabricReact.anon

import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupShowAll.types.IGroupShowAllProps, 'theme'>> */
trait RequiredPickIGroupShowAll extends StObject {
  
  var theme: ITheme
}
object RequiredPickIGroupShowAll {
  
  inline def apply(theme: ITheme): RequiredPickIGroupShowAll = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickIGroupShowAll]
  }
  
  extension [Self <: RequiredPickIGroupShowAll](x: Self) {
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
