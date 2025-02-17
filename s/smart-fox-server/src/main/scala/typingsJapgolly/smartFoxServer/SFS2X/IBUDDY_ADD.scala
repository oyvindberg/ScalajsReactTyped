package typingsJapgolly.smartFoxServer.SFS2X

import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSBuddy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBUDDY_ADD extends StObject {
  
  var buddy: SFSBuddy
}
object IBUDDY_ADD {
  
  inline def apply(buddy: SFSBuddy): IBUDDY_ADD = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_ADD]
  }
  
  extension [Self <: IBUDDY_ADD](x: Self) {
    
    inline def setBuddy(value: SFSBuddy): Self = StObject.set(x, "buddy", value.asInstanceOf[js.Any])
  }
}
