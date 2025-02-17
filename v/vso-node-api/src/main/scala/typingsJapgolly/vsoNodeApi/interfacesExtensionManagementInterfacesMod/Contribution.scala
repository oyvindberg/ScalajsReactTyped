package typingsJapgolly.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contribution
  extends StObject
     with ContributionBase {
  
  /**
    * List of constraints (filters) that should be applied to the availability of this contribution
    */
  var constraints: js.Array[ContributionConstraint]
  
  /**
    * Includes is a set of contributions that should have this contribution included in their targets list.
    */
  var includes: js.Array[String]
  
  /**
    * Properties/attributes of this contribution
    */
  var properties: Any
  
  /**
    * List of demanded claims in order for the user to see this contribution (like anonymous, public, member...).
    */
  var restrictedTo: js.Array[String]
  
  /**
    * The ids of the contribution(s) that this contribution targets. (parent contributions)
    */
  var targets: js.Array[String]
  
  /**
    * Id of the Contribution Type
    */
  var `type`: String
}
object Contribution {
  
  inline def apply(
    constraints: js.Array[ContributionConstraint],
    description: String,
    id: String,
    includes: js.Array[String],
    properties: Any,
    restrictedTo: js.Array[String],
    targets: js.Array[String],
    `type`: String,
    visibleTo: js.Array[String]
  ): Contribution = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], restrictedTo = restrictedTo.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], visibleTo = visibleTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contribution]
  }
  
  extension [Self <: Contribution](x: Self) {
    
    inline def setConstraints(value: js.Array[ContributionConstraint]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsVarargs(value: ContributionConstraint*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setIncludes(value: js.Array[String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesVarargs(value: String*): Self = StObject.set(x, "includes", js.Array(value*))
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRestrictedTo(value: js.Array[String]): Self = StObject.set(x, "restrictedTo", value.asInstanceOf[js.Any])
    
    inline def setRestrictedToVarargs(value: String*): Self = StObject.set(x, "restrictedTo", js.Array(value*))
    
    inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
