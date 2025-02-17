package typingsJapgolly.fhir.r4Mod

import typingsJapgolly.fhir.fhirStrings.`related-person`
import typingsJapgolly.fhir.fhirStrings.device_
import typingsJapgolly.fhir.fhirStrings.patient_
import typingsJapgolly.fhir.fhirStrings.practitioner_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanDefinitionActionParticipant
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The role the participant should play in performing the described action.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The type of participant in the action.
    */
  var `type`: patient_ | practitioner_ | `related-person` | device_
}
object PlanDefinitionActionParticipant {
  
  inline def apply(`type`: patient_ | practitioner_ | `related-person` | device_): PlanDefinitionActionParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinitionActionParticipant]
  }
  
  extension [Self <: PlanDefinitionActionParticipant](x: Self) {
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setType(value: patient_ | practitioner_ | `related-person` | device_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
