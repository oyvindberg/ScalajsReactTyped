package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAWSServiceAccessRequest extends StObject {
  
  /**
    * The service principal name of the Amazon Web Services service for which you want to enable integration with your organization. This is typically in the form of a URL, such as  service-abbreviation.amazonaws.com.
    */
  var ServicePrincipal: typingsJapgolly.awsSdk.clientsOrganizationsMod.ServicePrincipal
}
object EnableAWSServiceAccessRequest {
  
  inline def apply(ServicePrincipal: ServicePrincipal): EnableAWSServiceAccessRequest = {
    val __obj = js.Dynamic.literal(ServicePrincipal = ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableAWSServiceAccessRequest]
  }
  
  extension [Self <: EnableAWSServiceAccessRequest](x: Self) {
    
    inline def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
  }
}
