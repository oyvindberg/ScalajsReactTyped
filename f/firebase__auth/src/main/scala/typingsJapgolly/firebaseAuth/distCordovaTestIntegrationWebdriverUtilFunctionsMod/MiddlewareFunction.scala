package typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MiddlewareFunction extends StObject
@JSImport("@firebase/auth/dist/cordova/test/integration/webdriver/util/functions", "MiddlewareFunction")
@js.native
object MiddlewareFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MiddlewareFunction & String] = js.native
  
  @js.native
  sealed trait ATTACH_BLOCKING_MIDDLEWARE
    extends StObject
       with MiddlewareFunction
  /* "middleware.attachBlockingMiddleware" */ val ATTACH_BLOCKING_MIDDLEWARE: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.MiddlewareFunction.ATTACH_BLOCKING_MIDDLEWARE & String = js.native
  
  @js.native
  sealed trait ATTACH_BLOCKING_MIDDLEWARE_ON_START
    extends StObject
       with MiddlewareFunction
  /* "middleware.attachBlockingMiddlewareOnStart" */ val ATTACH_BLOCKING_MIDDLEWARE_ON_START: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.MiddlewareFunction.ATTACH_BLOCKING_MIDDLEWARE_ON_START & String = js.native
}
