package typingsJapgolly.pulumiKubernetes.typesOutputMod.flowcontrol.v1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:
  *  * How are requests for this priority level limited?
  *  * What should be done with requests that exceed the limit?
  */
trait LimitedPriorityLevelConfigurationPatch extends StObject {
  
  /**
    * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
    *
    *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
    *
    * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
    */
  var assuredConcurrencyShares: Double
  
  /**
    * `limitResponse` indicates what to do with requests that can not be executed right now
    */
  var limitResponse: LimitResponsePatch
}
object LimitedPriorityLevelConfigurationPatch {
  
  inline def apply(assuredConcurrencyShares: Double, limitResponse: LimitResponsePatch): LimitedPriorityLevelConfigurationPatch = {
    val __obj = js.Dynamic.literal(assuredConcurrencyShares = assuredConcurrencyShares.asInstanceOf[js.Any], limitResponse = limitResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitedPriorityLevelConfigurationPatch]
  }
  
  extension [Self <: LimitedPriorityLevelConfigurationPatch](x: Self) {
    
    inline def setAssuredConcurrencyShares(value: Double): Self = StObject.set(x, "assuredConcurrencyShares", value.asInstanceOf[js.Any])
    
    inline def setLimitResponse(value: LimitResponsePatch): Self = StObject.set(x, "limitResponse", value.asInstanceOf[js.Any])
  }
}
