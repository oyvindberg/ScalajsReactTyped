package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedHRANDFIELD extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(key: RedisCommandArgument, count: Double): RedisCommandArguments
  
  def transformReply(reply: js.Array[RedisCommandArgument]): Record[String, RedisCommandArgument]
}
object TypeofimportedHRANDFIELD {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: (RedisCommandArgument, Double) => RedisCommandArguments,
    transformReply: js.Array[RedisCommandArgument] => Record[String, RedisCommandArgument]
  ): TypeofimportedHRANDFIELD = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofimportedHRANDFIELD]
  }
  
  extension [Self <: TypeofimportedHRANDFIELD](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, Double) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: js.Array[RedisCommandArgument] => Record[String, RedisCommandArgument]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
