package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleAssignmentScheduleRequest
  extends StObject
     with Request {
  
  /**
    * Represents the type of the operation on the role assignment request. The possible values are: adminAssign, adminUpdate,
    * adminRemove, selfActivate, selfDeactivate, adminExtend, adminRenew, selfExtend, selfRenew, unknownFutureValue.
    * adminAssign: For administrators to assign roles to principals.adminRemove: For administrators to remove principals from
    * roles. adminUpdate: For administrators to change existing role assignments.adminExtend: For administrators to extend
    * expiring assignments.adminRenew: For administrators to renew expired assignments.selfActivate: For principals to
    * activate their assignments.selfDeactivate: For principals to deactivate their active assignments.selfExtend: For
    * principals to request to extend their expiring assignments.selfRenew: For principals to request to renew their expired
    * assignments.
    */
  var action: js.UndefOr[NullableOption[UnifiedRoleScheduleRequestActions]] = js.undefined
  
  /**
    * If the request is from an eligible administrator to activate a role, this parameter will show the related eligible
    * assignment for that activation. Otherwise, it's null. Supports $expand.
    */
  var activatedUsing: js.UndefOr[NullableOption[UnifiedRoleEligibilitySchedule]] = js.undefined
  
  /**
    * Read-only property with details of the app-specific scope when the assignment is scoped to an app. Nullable. Supports
    * $expand.
    */
  var appScope: js.UndefOr[NullableOption[AppScope]] = js.undefined
  
  /**
    * Identifier of the app-specific scope when the assignment is scoped to an app. The scope of an assignment determines the
    * set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood
    * by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular
    * directory objects, for example, administrative units. Supports $filter (eq, ne, and on null values).
    */
  var appScopeId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The directory object that is the scope of the assignment. Read-only. Supports $expand.
  var directoryScope: js.UndefOr[NullableOption[DirectoryObject]] = js.undefined
  
  /**
    * Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the
    * set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the
    * directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope
    * to an application only. Supports $filter (eq, ne, and on null values).
    */
  var directoryScopeId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Determines whether the call is a validation or an actual call. Only set this property if you want to check whether an
    * activation is subject to additional rules like MFA before actually submitting the request.
    */
  var isValidationOnly: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // A message provided by users and administrators when create they create the unifiedRoleAssignmentScheduleRequest object.
  var justification: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The principal that's getting a role assignment through the request. Supports $expand.
  var principal: js.UndefOr[NullableOption[DirectoryObject]] = js.undefined
  
  // Identifier of the principal that has been granted the assignment. Supports $filter (eq, ne).
  var principalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Detailed information for the unifiedRoleDefinition object that is referenced through the roleDefinitionId property.
    * Supports $expand.
    */
  var roleDefinition: js.UndefOr[NullableOption[UnifiedRoleDefinition]] = js.undefined
  
  // Identifier of the unifiedRoleDefinition object that is being assigned to the principal. Supports $filter (eq, ne).
  var roleDefinitionId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The period of the role assignment. Recurring schedules are currently unsupported.
  var scheduleInfo: js.UndefOr[NullableOption[RequestSchedule]] = js.undefined
  
  /**
    * The schedule for an eligible role assignment that is referenced through the targetScheduleId property. Supports
    * $expand.
    */
  var targetSchedule: js.UndefOr[NullableOption[UnifiedRoleAssignmentSchedule]] = js.undefined
  
  // Identifier of the schedule object that's linked to the assignment request. Supports $filter (eq, ne).
  var targetScheduleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Ticket details linked to the role assignment request including details of the ticket number and ticket system.
  var ticketInfo: js.UndefOr[NullableOption[TicketInfo]] = js.undefined
}
object UnifiedRoleAssignmentScheduleRequest {
  
  inline def apply(): UnifiedRoleAssignmentScheduleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleAssignmentScheduleRequest]
  }
  
  extension [Self <: UnifiedRoleAssignmentScheduleRequest](x: Self) {
    
    inline def setAction(value: NullableOption[UnifiedRoleScheduleRequestActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActivatedUsing(value: NullableOption[UnifiedRoleEligibilitySchedule]): Self = StObject.set(x, "activatedUsing", value.asInstanceOf[js.Any])
    
    inline def setActivatedUsingNull: Self = StObject.set(x, "activatedUsing", null)
    
    inline def setActivatedUsingUndefined: Self = StObject.set(x, "activatedUsing", js.undefined)
    
    inline def setAppScope(value: NullableOption[AppScope]): Self = StObject.set(x, "appScope", value.asInstanceOf[js.Any])
    
    inline def setAppScopeId(value: NullableOption[String]): Self = StObject.set(x, "appScopeId", value.asInstanceOf[js.Any])
    
    inline def setAppScopeIdNull: Self = StObject.set(x, "appScopeId", null)
    
    inline def setAppScopeIdUndefined: Self = StObject.set(x, "appScopeId", js.undefined)
    
    inline def setAppScopeNull: Self = StObject.set(x, "appScope", null)
    
    inline def setAppScopeUndefined: Self = StObject.set(x, "appScope", js.undefined)
    
    inline def setDirectoryScope(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "directoryScope", value.asInstanceOf[js.Any])
    
    inline def setDirectoryScopeId(value: NullableOption[String]): Self = StObject.set(x, "directoryScopeId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryScopeIdNull: Self = StObject.set(x, "directoryScopeId", null)
    
    inline def setDirectoryScopeIdUndefined: Self = StObject.set(x, "directoryScopeId", js.undefined)
    
    inline def setDirectoryScopeNull: Self = StObject.set(x, "directoryScope", null)
    
    inline def setDirectoryScopeUndefined: Self = StObject.set(x, "directoryScope", js.undefined)
    
    inline def setIsValidationOnly(value: NullableOption[Boolean]): Self = StObject.set(x, "isValidationOnly", value.asInstanceOf[js.Any])
    
    inline def setIsValidationOnlyNull: Self = StObject.set(x, "isValidationOnly", null)
    
    inline def setIsValidationOnlyUndefined: Self = StObject.set(x, "isValidationOnly", js.undefined)
    
    inline def setJustification(value: NullableOption[String]): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationNull: Self = StObject.set(x, "justification", null)
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setPrincipal(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalId(value: NullableOption[String]): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdNull: Self = StObject.set(x, "principalId", null)
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    inline def setPrincipalNull: Self = StObject.set(x, "principal", null)
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setRoleDefinition(value: NullableOption[UnifiedRoleDefinition]): Self = StObject.set(x, "roleDefinition", value.asInstanceOf[js.Any])
    
    inline def setRoleDefinitionId(value: NullableOption[String]): Self = StObject.set(x, "roleDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setRoleDefinitionIdNull: Self = StObject.set(x, "roleDefinitionId", null)
    
    inline def setRoleDefinitionIdUndefined: Self = StObject.set(x, "roleDefinitionId", js.undefined)
    
    inline def setRoleDefinitionNull: Self = StObject.set(x, "roleDefinition", null)
    
    inline def setRoleDefinitionUndefined: Self = StObject.set(x, "roleDefinition", js.undefined)
    
    inline def setScheduleInfo(value: NullableOption[RequestSchedule]): Self = StObject.set(x, "scheduleInfo", value.asInstanceOf[js.Any])
    
    inline def setScheduleInfoNull: Self = StObject.set(x, "scheduleInfo", null)
    
    inline def setScheduleInfoUndefined: Self = StObject.set(x, "scheduleInfo", js.undefined)
    
    inline def setTargetSchedule(value: NullableOption[UnifiedRoleAssignmentSchedule]): Self = StObject.set(x, "targetSchedule", value.asInstanceOf[js.Any])
    
    inline def setTargetScheduleId(value: NullableOption[String]): Self = StObject.set(x, "targetScheduleId", value.asInstanceOf[js.Any])
    
    inline def setTargetScheduleIdNull: Self = StObject.set(x, "targetScheduleId", null)
    
    inline def setTargetScheduleIdUndefined: Self = StObject.set(x, "targetScheduleId", js.undefined)
    
    inline def setTargetScheduleNull: Self = StObject.set(x, "targetSchedule", null)
    
    inline def setTargetScheduleUndefined: Self = StObject.set(x, "targetSchedule", js.undefined)
    
    inline def setTicketInfo(value: NullableOption[TicketInfo]): Self = StObject.set(x, "ticketInfo", value.asInstanceOf[js.Any])
    
    inline def setTicketInfoNull: Self = StObject.set(x, "ticketInfo", null)
    
    inline def setTicketInfoUndefined: Self = StObject.set(x, "ticketInfo", js.undefined)
  }
}
