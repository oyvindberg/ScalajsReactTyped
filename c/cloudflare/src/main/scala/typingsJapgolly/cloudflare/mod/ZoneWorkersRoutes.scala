package typingsJapgolly.cloudflare.mod

import typingsJapgolly.cloudflare.anon.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoneWorkersRoutes extends StObject {
  
  def add(zone_id: String, config: Pattern): js.Promise[js.Object]
  
  def browse(zone_id: String): js.Promise[js.Object]
  
  def del(zone_id: String, id: String): js.Promise[js.Object]
  
  def edit(zone_id: String, id: String, config: Pattern): js.Promise[js.Object]
  
  def read(zone_id: String, id: String): js.Promise[js.Object]
}
object ZoneWorkersRoutes {
  
  inline def apply(
    add: (String, Pattern) => js.Promise[js.Object],
    browse: String => js.Promise[js.Object],
    del: (String, String) => js.Promise[js.Object],
    edit: (String, String, Pattern) => js.Promise[js.Object],
    read: (String, String) => js.Promise[js.Object]
  ): ZoneWorkersRoutes = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), browse = js.Any.fromFunction1(browse), del = js.Any.fromFunction2(del), edit = js.Any.fromFunction3(edit), read = js.Any.fromFunction2(read))
    __obj.asInstanceOf[ZoneWorkersRoutes]
  }
  
  extension [Self <: ZoneWorkersRoutes](x: Self) {
    
    inline def setAdd(value: (String, Pattern) => js.Promise[js.Object]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setBrowse(value: String => js.Promise[js.Object]): Self = StObject.set(x, "browse", js.Any.fromFunction1(value))
    
    inline def setDel(value: (String, String) => js.Promise[js.Object]): Self = StObject.set(x, "del", js.Any.fromFunction2(value))
    
    inline def setEdit(value: (String, String, Pattern) => js.Promise[js.Object]): Self = StObject.set(x, "edit", js.Any.fromFunction3(value))
    
    inline def setRead(value: (String, String) => js.Promise[js.Object]): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
  }
}
