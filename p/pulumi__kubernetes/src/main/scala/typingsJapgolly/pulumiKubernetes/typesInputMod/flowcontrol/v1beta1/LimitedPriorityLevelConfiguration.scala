package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:
  *   - How are requests for this priority level limited?
  *   - What should be done with requests that exceed the limit?
  */
trait LimitedPriorityLevelConfiguration extends StObject {
  
  /**
    * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
    *
    *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
    *
    * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
    */
  var assuredConcurrencyShares: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * `limitResponse` indicates what to do with requests that can not be executed right now
    */
  var limitResponse: js.UndefOr[Input[LimitResponse]] = js.undefined
}
object LimitedPriorityLevelConfiguration {
  
  inline def apply(): LimitedPriorityLevelConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LimitedPriorityLevelConfiguration]
  }
  
  extension [Self <: LimitedPriorityLevelConfiguration](x: Self) {
    
    inline def setAssuredConcurrencyShares(value: Input[Double]): Self = StObject.set(x, "assuredConcurrencyShares", value.asInstanceOf[js.Any])
    
    inline def setAssuredConcurrencySharesUndefined: Self = StObject.set(x, "assuredConcurrencyShares", js.undefined)
    
    inline def setLimitResponse(value: Input[LimitResponse]): Self = StObject.set(x, "limitResponse", value.asInstanceOf[js.Any])
    
    inline def setLimitResponseUndefined: Self = StObject.set(x, "limitResponse", js.undefined)
  }
}
