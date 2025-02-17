package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesSidekiqMetricsMod {
  
  @JSImport("gitlab/dist/types/core/services/SidekiqMetrics", "SidekiqMetrics")
  @js.native
  open class SidekiqMetrics () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def compoundMetrics(): js.Promise[GetResponse] = js.native
    
    def jobStats(): js.Promise[GetResponse] = js.native
    
    def processMetrics(): js.Promise[GetResponse] = js.native
    
    def queueMetrics(): js.Promise[GetResponse] = js.native
  }
}
