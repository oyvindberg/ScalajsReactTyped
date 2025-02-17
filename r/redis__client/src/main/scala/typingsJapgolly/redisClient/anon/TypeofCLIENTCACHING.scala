package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLIENTCACHING extends StObject {
  
  def transformArguments(value: Boolean): RedisCommandArguments
  
  def transformReply(): OK | Buffer
}
object TypeofCLIENTCACHING {
  
  inline def apply(transformArguments: Boolean => RedisCommandArguments, transformReply: CallbackTo[OK | Buffer]): TypeofCLIENTCACHING = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofCLIENTCACHING]
  }
  
  extension [Self <: TypeofCLIENTCACHING](x: Self) {
    
    inline def setTransformArguments(value: Boolean => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[OK | Buffer]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
