package typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientContributionNode extends StObject {
  
  /**
    * List of ids for contributions which are children to the current contribution.
    */
  var children: js.Array[String]
  
  /**
    * Contribution associated with this node.
    */
  var contribution: ClientContribution
  
  /**
    * List of ids for contributions which are parents to the current contribution.
    */
  var parents: js.Array[String]
}
object ClientContributionNode {
  
  inline def apply(children: js.Array[String], contribution: ClientContribution, parents: js.Array[String]): ClientContributionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], contribution = contribution.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientContributionNode]
  }
  
  extension [Self <: ClientContributionNode](x: Self) {
    
    inline def setChildren(value: js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setContribution(value: ClientContribution): Self = StObject.set(x, "contribution", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value*))
  }
}
