package typingsJapgolly.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "Request")
@js.native
open class Request_ () extends StObject {
  def this(options: RequestOptions) = this()
  
  var method: String = js.native
  
  var onerror: js.UndefOr[js.Function1[/* error */ js.Error, Any]] = js.native
  
  var requestData: js.UndefOr[String] = js.native
  
  var transformRequest: js.UndefOr[js.Function1[/* xhr */ Any, Any]] = js.native
  
  var transformResponse: js.UndefOr[js.Function1[/* xhr */ Any, Any]] = js.native
}
