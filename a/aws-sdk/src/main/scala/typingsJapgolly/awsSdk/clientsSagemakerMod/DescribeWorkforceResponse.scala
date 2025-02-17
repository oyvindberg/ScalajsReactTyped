package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkforceResponse extends StObject {
  
  /**
    * A single private workforce, which is automatically created when you create your first private work team. You can create one private work force in each Amazon Web Services Region. By default, any workforce-related API operation used in a specific region will apply to the workforce created in that region. To learn how to create a private workforce, see Create a Private Workforce.
    */
  var Workforce: typingsJapgolly.awsSdk.clientsSagemakerMod.Workforce
}
object DescribeWorkforceResponse {
  
  inline def apply(Workforce: Workforce): DescribeWorkforceResponse = {
    val __obj = js.Dynamic.literal(Workforce = Workforce.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkforceResponse]
  }
  
  extension [Self <: DescribeWorkforceResponse](x: Self) {
    
    inline def setWorkforce(value: Workforce): Self = StObject.set(x, "Workforce", value.asInstanceOf[js.Any])
  }
}
