package typingsJapgolly.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataReplicationInitiationStep extends StObject {
  
  /**
    * The name of the step.
    */
  var name: js.UndefOr[DataReplicationInitiationStepName] = js.undefined
  
  /**
    * The status of the step.
    */
  var status: js.UndefOr[DataReplicationInitiationStepStatus] = js.undefined
}
object DataReplicationInitiationStep {
  
  inline def apply(): DataReplicationInitiationStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataReplicationInitiationStep]
  }
  
  extension [Self <: DataReplicationInitiationStep](x: Self) {
    
    inline def setName(value: DataReplicationInitiationStepName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: DataReplicationInitiationStepStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
