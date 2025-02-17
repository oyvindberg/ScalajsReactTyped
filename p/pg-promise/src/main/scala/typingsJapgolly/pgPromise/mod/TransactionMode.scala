package typingsJapgolly.pgPromise.mod

import typingsJapgolly.pgPromise.anon.Deferrable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TransactionMode class;
// API: http://vitaly-t.github.io/pg-promise/txMode.TransactionMode.html
@JSImport("pg-promise", "TransactionMode")
@js.native
open class TransactionMode () extends StObject {
  def this(options: Deferrable) = this()
  
  def begin(): String = js.native
  def begin(cap: Boolean): String = js.native
}
