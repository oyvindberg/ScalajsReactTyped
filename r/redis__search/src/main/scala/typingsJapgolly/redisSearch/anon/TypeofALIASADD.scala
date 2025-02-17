package typingsJapgolly.redisSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofALIASADD extends StObject {
  
  def transformArguments(name: String, index: String): js.Array[String]
  
  def transformReply(): OK
}
object TypeofALIASADD {
  
  inline def apply(transformArguments: (String, String) => js.Array[String], transformReply: CallbackTo[OK]): TypeofALIASADD = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofALIASADD]
  }
  
  extension [Self <: TypeofALIASADD](x: Self) {
    
    inline def setTransformArguments(value: (String, String) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: CallbackTo[OK]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
