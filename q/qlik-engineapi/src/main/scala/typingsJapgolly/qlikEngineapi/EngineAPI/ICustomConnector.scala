package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomConnector...
  */
trait ICustomConnector extends StObject {
  
  /**
    * Name of the custom connector as displayed in the Qlik interface.
    */
  var qDisplayName: String
  
  /**
    * Mode of the machine (64 or 32 bits).
    */
  var qMachineMode: MachineModeType
  
  /**
    * Name of the parent folder that contains the custom connector file.
    */
  var qParent: String
  
  /**
    * Name of the custom connector file.
    */
  var qProvider: String
}
object ICustomConnector {
  
  inline def apply(qDisplayName: String, qMachineMode: MachineModeType, qParent: String, qProvider: String): ICustomConnector = {
    val __obj = js.Dynamic.literal(qDisplayName = qDisplayName.asInstanceOf[js.Any], qMachineMode = qMachineMode.asInstanceOf[js.Any], qParent = qParent.asInstanceOf[js.Any], qProvider = qProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomConnector]
  }
  
  extension [Self <: ICustomConnector](x: Self) {
    
    inline def setQDisplayName(value: String): Self = StObject.set(x, "qDisplayName", value.asInstanceOf[js.Any])
    
    inline def setQMachineMode(value: MachineModeType): Self = StObject.set(x, "qMachineMode", value.asInstanceOf[js.Any])
    
    inline def setQParent(value: String): Self = StObject.set(x, "qParent", value.asInstanceOf[js.Any])
    
    inline def setQProvider(value: String): Self = StObject.set(x, "qProvider", value.asInstanceOf[js.Any])
  }
}
