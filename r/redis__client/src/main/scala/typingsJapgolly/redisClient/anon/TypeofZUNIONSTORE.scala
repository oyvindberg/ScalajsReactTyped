package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.distLibCommandsZunionstoreMod.ZUnionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofZUNIONSTORE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(destination: RedisCommandArgument, keys: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(destination: RedisCommandArgument, keys: js.Array[RedisCommandArgument], options: ZUnionOptions): RedisCommandArguments = js.native
  def transformArguments(destination: RedisCommandArgument, keys: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(destination: RedisCommandArgument, keys: RedisCommandArgument, options: ZUnionOptions): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
