package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreTemplatesResourceMilestonesMod {
  
  @JSImport("gitlab/dist/types/core/templates/ResourceMilestones", "ResourceMilestones")
  @js.native
  open class ResourceMilestones protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(resourceId: String, title: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: Double, title: String): js.Promise[js.Object] = js.native
    def create(resourceId: Double, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(resourceId: String, milestoneId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: String, milestoneId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, milestoneId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, milestoneId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def issues(resourceId: String, milestoneId: Double): js.Promise[GetResponse] = js.native
    def issues(resourceId: String, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def issues(resourceId: Double, milestoneId: Double): js.Promise[GetResponse] = js.native
    def issues(resourceId: Double, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def mergeRequests(resourceId: String, milestoneId: Double): js.Promise[GetResponse] = js.native
    def mergeRequests(resourceId: String, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def mergeRequests(resourceId: Double, milestoneId: Double): js.Promise[GetResponse] = js.native
    def mergeRequests(resourceId: Double, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def show(resourceId: String, milestoneId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, milestoneId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
