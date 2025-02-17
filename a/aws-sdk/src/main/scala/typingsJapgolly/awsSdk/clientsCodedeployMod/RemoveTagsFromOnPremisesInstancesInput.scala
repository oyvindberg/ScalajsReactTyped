package typingsJapgolly.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsFromOnPremisesInstancesInput extends StObject {
  
  /**
    * The names of the on-premises instances from which to remove tags.
    */
  var instanceNames: InstanceNameList
  
  /**
    * The tag key-value pairs to remove from the on-premises instances.
    */
  var tags: TagList
}
object RemoveTagsFromOnPremisesInstancesInput {
  
  inline def apply(instanceNames: InstanceNameList, tags: TagList): RemoveTagsFromOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromOnPremisesInstancesInput]
  }
  
  extension [Self <: RemoveTagsFromOnPremisesInstancesInput](x: Self) {
    
    inline def setInstanceNames(value: InstanceNameList): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    inline def setInstanceNamesVarargs(value: InstanceName*): Self = StObject.set(x, "instanceNames", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
