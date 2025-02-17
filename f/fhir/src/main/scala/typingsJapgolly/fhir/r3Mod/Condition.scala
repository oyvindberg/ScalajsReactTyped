package typingsJapgolly.fhir.r3Mod

import typingsJapgolly.fhir.fhirStrings.`entered-in-error`
import typingsJapgolly.fhir.fhirStrings.active
import typingsJapgolly.fhir.fhirStrings.confirmed
import typingsJapgolly.fhir.fhirStrings.differential
import typingsJapgolly.fhir.fhirStrings.inactive
import typingsJapgolly.fhir.fhirStrings.provisional
import typingsJapgolly.fhir.fhirStrings.recurrence
import typingsJapgolly.fhir.fhirStrings.refuted
import typingsJapgolly.fhir.fhirStrings.remission
import typingsJapgolly.fhir.fhirStrings.resolved
import typingsJapgolly.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _abatementBoolean: js.UndefOr[Element] = js.undefined
  
  var _abatementDateTime: js.UndefOr[Element] = js.undefined
  
  var _abatementString: js.UndefOr[Element] = js.undefined
  
  var _assertedDate: js.UndefOr[Element] = js.undefined
  
  var _clinicalStatus: js.UndefOr[Element] = js.undefined
  
  var _onsetDateTime: js.UndefOr[Element] = js.undefined
  
  var _onsetString: js.UndefOr[Element] = js.undefined
  
  var _verificationStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * There is no explicit distinction between resolution and remission because in many cases the distinction is not clear. Age is generally used when the patient reports an age at which the Condition abated.  If there is no abatement element, it is unknown whether the condition has resolved or entered remission; applications and users should generally assume that the condition is still valid.  When abatementString exists, it implies the condition is abated.
    */
  var abatementAge: js.UndefOr[Age] = js.undefined
  
  /**
    * There is no explicit distinction between resolution and remission because in many cases the distinction is not clear. Age is generally used when the patient reports an age at which the Condition abated.  If there is no abatement element, it is unknown whether the condition has resolved or entered remission; applications and users should generally assume that the condition is still valid.  When abatementString exists, it implies the condition is abated.
    */
  var abatementBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * There is no explicit distinction between resolution and remission because in many cases the distinction is not clear. Age is generally used when the patient reports an age at which the Condition abated.  If there is no abatement element, it is unknown whether the condition has resolved or entered remission; applications and users should generally assume that the condition is still valid.  When abatementString exists, it implies the condition is abated.
    */
  var abatementDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * There is no explicit distinction between resolution and remission because in many cases the distinction is not clear. Age is generally used when the patient reports an age at which the Condition abated.  If there is no abatement element, it is unknown whether the condition has resolved or entered remission; applications and users should generally assume that the condition is still valid.  When abatementString exists, it implies the condition is abated.
    */
  var abatementPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * There is no explicit distinction between resolution and remission because in many cases the distinction is not clear. Age is generally used when the patient reports an age at which the Condition abated.  If there is no abatement element, it is unknown whether the condition has resolved or entered remission; applications and users should generally assume that the condition is still valid.  When abatementString exists, it implies the condition is abated.
    */
  var abatementRange: js.UndefOr[Range] = js.undefined
  
  /**
    * There is no explicit distinction between resolution and remission because in many cases the distinction is not clear. Age is generally used when the patient reports an age at which the Condition abated.  If there is no abatement element, it is unknown whether the condition has resolved or entered remission; applications and users should generally assume that the condition is still valid.  When abatementString exists, it implies the condition is abated.
    */
  var abatementString: js.UndefOr[String] = js.undefined
  
  /**
    * The assertedDate represents the date when this particular Condition record was created in the EHR, not the date of the most recent update in terms of when severity, abatement, etc. were specified.  The date of the last record modification can be retrieved from the resource metadata.
    */
  var assertedDate: js.UndefOr[String] = js.undefined
  
  /**
    * Individual who is making the condition statement.
    */
  var asserter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Only used if not implicit in code found in Condition.code. If the use case requires attributes from the BodySite resource (e.g. to identify and track separately) then use the standard extension [body-site-instance](extension-body-site-instance.html).  May be a summary code, or a reference to a very precise definition of the location, or both.
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The categorization is often highly contextual and may appear poorly differentiated or not very useful in other contexts.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the condition as not currently valid or of concern.
    */
  var clinicalStatus: js.UndefOr[active | recurrence | inactive | remission | resolved] = js.undefined
  
  /**
    * Identification of the condition, problem or diagnosis.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This record indicates the encounter this particular record is associated with.  In the case of a "new" diagnosis reflecting ongoing/revised information about the condition, this might be distinct from the first encounter in which the underlying condition was first "known".
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * The evidence may be a simple list of coded symptoms/manifestations, or references to observations or formal assessments, or both.
    */
  var evidence: js.UndefOr[js.Array[ConditionEvidence]] = js.undefined
  
  /**
    * This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the Condition began to occur.
    */
  var onsetAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the Condition began to occur.
    */
  var onsetDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the Condition began to occur.
    */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the Condition began to occur.
    */
  var onsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the Condition began to occur.
    */
  var onsetString: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Condition: typingsJapgolly.fhir.fhirStrings.Condition
  
  /**
    * Coding of the severity with a terminology is preferred, where possible.
    */
  var severity: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Clinical stage or grade of a condition. May include formal severity assessments.
    */
  var stage: js.UndefOr[ConditionStage] = js.undefined
  
  /**
    * Indicates the patient or group who the condition record is associated with.
    */
  var subject: Reference
  
  /**
    * verificationStatus is not required.  For example, when a patient has abdominal pain in the ED, there is not likely going to be a verification status.
    * This element is labeled as a modifier because the status contains the code refuted and entered-in-error that mark the Condition as not currently valid.
    */
  var verificationStatus: js.UndefOr[provisional | differential | confirmed | refuted | `entered-in-error` | unknown] = js.undefined
}
object Condition {
  
  inline def apply(subject: Reference): Condition = {
    val __obj = js.Dynamic.literal(resourceType = "Condition", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  extension [Self <: Condition](x: Self) {
    
    inline def setAbatementAge(value: Age): Self = StObject.set(x, "abatementAge", value.asInstanceOf[js.Any])
    
    inline def setAbatementAgeUndefined: Self = StObject.set(x, "abatementAge", js.undefined)
    
    inline def setAbatementBoolean(value: Boolean): Self = StObject.set(x, "abatementBoolean", value.asInstanceOf[js.Any])
    
    inline def setAbatementBooleanUndefined: Self = StObject.set(x, "abatementBoolean", js.undefined)
    
    inline def setAbatementDateTime(value: String): Self = StObject.set(x, "abatementDateTime", value.asInstanceOf[js.Any])
    
    inline def setAbatementDateTimeUndefined: Self = StObject.set(x, "abatementDateTime", js.undefined)
    
    inline def setAbatementPeriod(value: Period): Self = StObject.set(x, "abatementPeriod", value.asInstanceOf[js.Any])
    
    inline def setAbatementPeriodUndefined: Self = StObject.set(x, "abatementPeriod", js.undefined)
    
    inline def setAbatementRange(value: Range): Self = StObject.set(x, "abatementRange", value.asInstanceOf[js.Any])
    
    inline def setAbatementRangeUndefined: Self = StObject.set(x, "abatementRange", js.undefined)
    
    inline def setAbatementString(value: String): Self = StObject.set(x, "abatementString", value.asInstanceOf[js.Any])
    
    inline def setAbatementStringUndefined: Self = StObject.set(x, "abatementString", js.undefined)
    
    inline def setAssertedDate(value: String): Self = StObject.set(x, "assertedDate", value.asInstanceOf[js.Any])
    
    inline def setAssertedDateUndefined: Self = StObject.set(x, "assertedDate", js.undefined)
    
    inline def setAsserter(value: Reference): Self = StObject.set(x, "asserter", value.asInstanceOf[js.Any])
    
    inline def setAsserterUndefined: Self = StObject.set(x, "asserter", js.undefined)
    
    inline def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setClinicalStatus(value: active | recurrence | inactive | remission | resolved): Self = StObject.set(x, "clinicalStatus", value.asInstanceOf[js.Any])
    
    inline def setClinicalStatusUndefined: Self = StObject.set(x, "clinicalStatus", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEvidence(value: js.Array[ConditionEvidence]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setEvidenceVarargs(value: ConditionEvidence*): Self = StObject.set(x, "evidence", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOnsetAge(value: Age): Self = StObject.set(x, "onsetAge", value.asInstanceOf[js.Any])
    
    inline def setOnsetAgeUndefined: Self = StObject.set(x, "onsetAge", js.undefined)
    
    inline def setOnsetDateTime(value: String): Self = StObject.set(x, "onsetDateTime", value.asInstanceOf[js.Any])
    
    inline def setOnsetDateTimeUndefined: Self = StObject.set(x, "onsetDateTime", js.undefined)
    
    inline def setOnsetPeriod(value: Period): Self = StObject.set(x, "onsetPeriod", value.asInstanceOf[js.Any])
    
    inline def setOnsetPeriodUndefined: Self = StObject.set(x, "onsetPeriod", js.undefined)
    
    inline def setOnsetRange(value: Range): Self = StObject.set(x, "onsetRange", value.asInstanceOf[js.Any])
    
    inline def setOnsetRangeUndefined: Self = StObject.set(x, "onsetRange", js.undefined)
    
    inline def setOnsetString(value: String): Self = StObject.set(x, "onsetString", value.asInstanceOf[js.Any])
    
    inline def setOnsetStringUndefined: Self = StObject.set(x, "onsetString", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.Condition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: CodeableConcept): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStage(value: ConditionStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setVerificationStatus(value: provisional | differential | confirmed | refuted | `entered-in-error` | unknown): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    inline def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
    
    inline def set_abatementBoolean(value: Element): Self = StObject.set(x, "_abatementBoolean", value.asInstanceOf[js.Any])
    
    inline def set_abatementBooleanUndefined: Self = StObject.set(x, "_abatementBoolean", js.undefined)
    
    inline def set_abatementDateTime(value: Element): Self = StObject.set(x, "_abatementDateTime", value.asInstanceOf[js.Any])
    
    inline def set_abatementDateTimeUndefined: Self = StObject.set(x, "_abatementDateTime", js.undefined)
    
    inline def set_abatementString(value: Element): Self = StObject.set(x, "_abatementString", value.asInstanceOf[js.Any])
    
    inline def set_abatementStringUndefined: Self = StObject.set(x, "_abatementString", js.undefined)
    
    inline def set_assertedDate(value: Element): Self = StObject.set(x, "_assertedDate", value.asInstanceOf[js.Any])
    
    inline def set_assertedDateUndefined: Self = StObject.set(x, "_assertedDate", js.undefined)
    
    inline def set_clinicalStatus(value: Element): Self = StObject.set(x, "_clinicalStatus", value.asInstanceOf[js.Any])
    
    inline def set_clinicalStatusUndefined: Self = StObject.set(x, "_clinicalStatus", js.undefined)
    
    inline def set_onsetDateTime(value: Element): Self = StObject.set(x, "_onsetDateTime", value.asInstanceOf[js.Any])
    
    inline def set_onsetDateTimeUndefined: Self = StObject.set(x, "_onsetDateTime", js.undefined)
    
    inline def set_onsetString(value: Element): Self = StObject.set(x, "_onsetString", value.asInstanceOf[js.Any])
    
    inline def set_onsetStringUndefined: Self = StObject.set(x, "_onsetString", js.undefined)
    
    inline def set_verificationStatus(value: Element): Self = StObject.set(x, "_verificationStatus", value.asInstanceOf[js.Any])
    
    inline def set_verificationStatusUndefined: Self = StObject.set(x, "_verificationStatus", js.undefined)
  }
}
