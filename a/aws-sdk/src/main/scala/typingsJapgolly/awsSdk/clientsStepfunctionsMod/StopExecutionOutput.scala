package typingsJapgolly.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopExecutionOutput extends StObject {
  
  /**
    * The date the execution is stopped.
    */
  var stopDate: js.Date
}
object StopExecutionOutput {
  
  inline def apply(stopDate: js.Date): StopExecutionOutput = {
    val __obj = js.Dynamic.literal(stopDate = stopDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopExecutionOutput]
  }
  
  extension [Self <: StopExecutionOutput](x: Self) {
    
    inline def setStopDate(value: js.Date): Self = StObject.set(x, "stopDate", value.asInstanceOf[js.Any])
  }
}
