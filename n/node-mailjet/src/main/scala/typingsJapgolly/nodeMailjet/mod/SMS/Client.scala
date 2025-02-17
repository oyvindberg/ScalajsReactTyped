package typingsJapgolly.nodeMailjet.mod.SMS

import typingsJapgolly.nodeMailjet.mod.ConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends StObject {
  
  def get(action: String): GetResource = js.native
  def get(action: String, options: ConfigOptions): GetResource = js.native
  
  def post(action: String): PostResource = js.native
  def post(action: String, options: ConfigOptions): PostResource = js.native
}
