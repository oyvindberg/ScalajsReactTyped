package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.ListSide
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLMOVE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(
    source: RedisCommandArgument,
    destination: RedisCommandArgument,
    sourceSide: ListSide,
    destinationSide: ListSide
  ): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument | Null
}
object TypeofLMOVE {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, RedisCommandArgument, ListSide, ListSide) => RedisCommandArguments,
    transformReply: CallbackTo[RedisCommandArgument | Null]
  ): TypeofLMOVE = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction4(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofLMOVE]
  }
  
  extension [Self <: TypeofLMOVE](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, RedisCommandArgument, ListSide, ListSide) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction4(value))
    
    inline def setTransformReply(value: CallbackTo[RedisCommandArgument | Null]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
