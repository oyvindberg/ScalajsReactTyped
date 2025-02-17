package typingsJapgolly.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterParameterGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the cluster parameter group.
    */
  var DBClusterParameterGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the name of the cluster parameter group.
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the name of the parameter group family that this cluster parameter group is compatible with.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the customer-specified description for this cluster parameter group.
    */
  var Description: js.UndefOr[String] = js.undefined
}
object DBClusterParameterGroup {
  
  inline def apply(): DBClusterParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterParameterGroup]
  }
  
  extension [Self <: DBClusterParameterGroup](x: Self) {
    
    inline def setDBClusterParameterGroupArn(value: String): Self = StObject.set(x, "DBClusterParameterGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupArnUndefined: Self = StObject.set(x, "DBClusterParameterGroupArn", js.undefined)
    
    inline def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupNameUndefined: Self = StObject.set(x, "DBClusterParameterGroupName", js.undefined)
    
    inline def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupFamilyUndefined: Self = StObject.set(x, "DBParameterGroupFamily", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
