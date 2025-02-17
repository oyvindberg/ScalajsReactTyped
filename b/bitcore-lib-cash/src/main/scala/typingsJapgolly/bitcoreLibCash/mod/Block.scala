package typingsJapgolly.bitcoreLibCash.mod

import typingsJapgolly.bitcoreLibCash.anon.PrevHash
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "Block")
@js.native
open class Block protected () extends StObject {
  def this(data: js.Object) = this()
  def this(data: Buffer) = this()
  
  var hash: String = js.native
  
  var header: PrevHash = js.native
  
  var height: Double = js.native
  
  var transactions: js.Array[Transaction] = js.native
}
