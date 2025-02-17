package typingsJapgolly.servicenow

import typingsJapgolly.servicenow.servicenow.GlideRecord
import typingsJapgolly.servicenow.servicenow.GlideRecordOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @js.native
  trait Workflow extends StObject {
    
    def broadcastEvent(contextId: String, eventName: String): Unit = js.native
    
    def cancel(record: GlideRecord): Unit = js.native
    
    def cancelContext(context: GlideRecord): Unit = js.native
    
    def deleteWorkflow(current: GlideRecord): Unit = js.native
    
    def fireEvent(eventRecord: GlideRecord, eventName: String): Unit = js.native
    
    def fireEventById(eventRecordId: String, eventName: String): Unit = js.native
    
    def getContexts(record: GlideRecord): GlideRecord = js.native
    
    def getEstimatedDeliveryTime(workflowId: String): String = js.native
    
    def getEstimatedDeliveryTimeFromWFVersion(wfVersion: GlideRecord): String = js.native
    
    def getReturnValue(workflowID: String, amount: Double, result: Boolean): js.Object = js.native
    
    def getRunningFlows(record: GlideRecord): GlideRecord = js.native
    
    def getVersion(workflowId: String): Unit = js.native
    
    def getVersionFromName(workflowName: String): Unit = js.native
    
    def getWorkflowFromName(workflowName: String): Unit = js.native
    
    def hasWorkflow(record: GlideRecord): Boolean = js.native
    
    def restartWorkflow(record: GlideRecord, maintainStateFlag: Boolean): Unit = js.native
    
    def runFlows(record: GlideRecord, operation: GlideRecordOperation): Unit = js.native
    
    def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation): String = js.native
    def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation, vars: js.Object): String = js.native
    def startFlow(workflowId: String, current: GlideRecord, operation: GlideRecordOperation): String = js.native
    def startFlow(workflowId: String, current: GlideRecord, operation: GlideRecordOperation, vars: js.Object): String = js.native
    
    def startFlowFromContextInsert(context: GlideRecord, operation: GlideRecordOperation): Unit = js.native
    
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: GlideRecord,
      operation: GlideRecordOperation
    ): GlideRecord = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: GlideRecord,
      operation: GlideRecordOperation,
      vars: js.Object
    ): GlideRecord = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: GlideRecord,
      operation: GlideRecordOperation,
      vars: js.Object,
      withSchedule: Any
    ): GlideRecord = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: GlideRecord,
      operation: GlideRecordOperation,
      vars: Unit,
      withSchedule: Any
    ): GlideRecord = js.native
  }
}
