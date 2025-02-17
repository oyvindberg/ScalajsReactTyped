package typingsJapgolly.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutJobSuccessResultInput extends StObject {
  
  /**
    * A token generated by a job worker, such as an AWS CodeDeploy deployment ID, that a successful job provides to identify a custom action in progress. Future jobs use this token to identify the running instance of the action. It can be reused to return more information about the progress of the custom action. When the action is complete, no continuation token should be supplied.
    */
  var continuationToken: js.UndefOr[ContinuationToken] = js.undefined
  
  /**
    * The ID of the current revision of the artifact successfully worked on by the job.
    */
  var currentRevision: js.UndefOr[CurrentRevision] = js.undefined
  
  /**
    * The execution details of the successful job, such as the actions taken by the job worker.
    */
  var executionDetails: js.UndefOr[ExecutionDetails] = js.undefined
  
  /**
    * The unique system-generated ID of the job that succeeded. This is the same ID returned from PollForJobs.
    */
  var jobId: JobId
  
  /**
    * Key-value pairs produced as output by a job worker that can be made available to a downstream action configuration. outputVariables can be included only when there is no continuation token on the request.
    */
  var outputVariables: js.UndefOr[OutputVariablesMap] = js.undefined
}
object PutJobSuccessResultInput {
  
  inline def apply(jobId: JobId): PutJobSuccessResultInput = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutJobSuccessResultInput]
  }
  
  extension [Self <: PutJobSuccessResultInput](x: Self) {
    
    inline def setContinuationToken(value: ContinuationToken): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
    
    inline def setCurrentRevision(value: CurrentRevision): Self = StObject.set(x, "currentRevision", value.asInstanceOf[js.Any])
    
    inline def setCurrentRevisionUndefined: Self = StObject.set(x, "currentRevision", js.undefined)
    
    inline def setExecutionDetails(value: ExecutionDetails): Self = StObject.set(x, "executionDetails", value.asInstanceOf[js.Any])
    
    inline def setExecutionDetailsUndefined: Self = StObject.set(x, "executionDetails", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setOutputVariables(value: OutputVariablesMap): Self = StObject.set(x, "outputVariables", value.asInstanceOf[js.Any])
    
    inline def setOutputVariablesUndefined: Self = StObject.set(x, "outputVariables", js.undefined)
  }
}
