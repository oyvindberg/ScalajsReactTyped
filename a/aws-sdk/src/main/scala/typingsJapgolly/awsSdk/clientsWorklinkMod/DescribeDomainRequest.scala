package typingsJapgolly.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainRequest extends StObject {
  
  /**
    * The name of the domain.
    */
  var DomainName: typingsJapgolly.awsSdk.clientsWorklinkMod.DomainName
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsJapgolly.awsSdk.clientsWorklinkMod.FleetArn
}
object DescribeDomainRequest {
  
  inline def apply(DomainName: DomainName, FleetArn: FleetArn): DescribeDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainRequest]
  }
  
  extension [Self <: DescribeDomainRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
