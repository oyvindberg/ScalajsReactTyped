package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.BitValue
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSETBIT extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: RedisCommandArgument, offset: Double, value: BitValue): RedisCommandArguments
  
  def transformReply(): BitValue
}
object TypeofSETBIT {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, Double, BitValue) => RedisCommandArguments,
    transformReply: CallbackTo[BitValue]
  ): TypeofSETBIT = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofSETBIT]
  }
  
  extension [Self <: TypeofSETBIT](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, Double, BitValue) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
    
    inline def setTransformReply(value: CallbackTo[BitValue]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
