package typingsJapgolly.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentTemplateRequest extends StObject {
  
  /**
    * The ARN that specifies the assessment target for which you want to create the assessment template.
    */
  var assessmentTargetArn: Arn
  
  /**
    * The user-defined name that identifies the assessment template that you want to create. You can create several assessment templates for an assessment target. The names of the assessment templates that correspond to a particular assessment target must be unique.
    */
  var assessmentTemplateName: AssessmentTemplateName
  
  /**
    * The duration of the assessment run in seconds.
    */
  var durationInSeconds: AssessmentRunDuration
  
  /**
    * The ARNs that specify the rules packages that you want to attach to the assessment template.
    */
  var rulesPackageArns: AssessmentTemplateRulesPackageArnList
  
  /**
    * The user-defined attributes that are assigned to every finding that is generated by the assessment run that uses this assessment template. An attribute is a key and value pair (an Attribute object). Within an assessment template, each key must be unique.
    */
  var userAttributesForFindings: js.UndefOr[UserAttributeList] = js.undefined
}
object CreateAssessmentTemplateRequest {
  
  inline def apply(
    assessmentTargetArn: Arn,
    assessmentTemplateName: AssessmentTemplateName,
    durationInSeconds: AssessmentRunDuration,
    rulesPackageArns: AssessmentTemplateRulesPackageArnList
  ): CreateAssessmentTemplateRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any], assessmentTemplateName = assessmentTemplateName.asInstanceOf[js.Any], durationInSeconds = durationInSeconds.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentTemplateRequest]
  }
  
  extension [Self <: CreateAssessmentTemplateRequest](x: Self) {
    
    inline def setAssessmentTargetArn(value: Arn): Self = StObject.set(x, "assessmentTargetArn", value.asInstanceOf[js.Any])
    
    inline def setAssessmentTemplateName(value: AssessmentTemplateName): Self = StObject.set(x, "assessmentTemplateName", value.asInstanceOf[js.Any])
    
    inline def setDurationInSeconds(value: AssessmentRunDuration): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setRulesPackageArns(value: AssessmentTemplateRulesPackageArnList): Self = StObject.set(x, "rulesPackageArns", value.asInstanceOf[js.Any])
    
    inline def setRulesPackageArnsVarargs(value: Arn*): Self = StObject.set(x, "rulesPackageArns", js.Array(value*))
    
    inline def setUserAttributesForFindings(value: UserAttributeList): Self = StObject.set(x, "userAttributesForFindings", value.asInstanceOf[js.Any])
    
    inline def setUserAttributesForFindingsUndefined: Self = StObject.set(x, "userAttributesForFindings", js.undefined)
    
    inline def setUserAttributesForFindingsVarargs(value: Attribute*): Self = StObject.set(x, "userAttributesForFindings", js.Array(value*))
  }
}
