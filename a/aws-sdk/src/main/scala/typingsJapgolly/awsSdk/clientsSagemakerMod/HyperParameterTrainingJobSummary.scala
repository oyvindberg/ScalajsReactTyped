package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTrainingJobSummary extends StObject {
  
  /**
    * The date and time that the training job was created.
    */
  var CreationTime: js.Date
  
  /**
    * The reason that the training job failed. 
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The FinalHyperParameterTuningJobObjectiveMetric object that specifies the value of the objective metric of the tuning job that launched this training job.
    */
  var FinalHyperParameterTuningJobObjectiveMetric: js.UndefOr[
    typingsJapgolly.awsSdk.clientsSagemakerMod.FinalHyperParameterTuningJobObjectiveMetric
  ] = js.undefined
  
  /**
    * The status of the objective metric for the training job:   Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job and used in the hyperparameter tuning process.     Pending: The training job is in progress and evaluation of its final objective metric is pending.     Failed: The final objective metric for the training job was not evaluated, and was not used in the hyperparameter tuning process. This typically occurs when the training job failed or did not emit an objective metric.  
    */
  var ObjectiveStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ObjectiveStatus] = js.undefined
  
  /**
    * Specifies the time when the training job ends on training instances. You are billed for the time interval between the value of TrainingStartTime and this time. For successful jobs and stopped jobs, this is the time after model artifacts are uploaded. For failed jobs, this is the time when SageMaker detects a job failure.
    */
  var TrainingEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typingsJapgolly.awsSdk.clientsSagemakerMod.TrainingJobArn
  
  /**
    * The training job definition name.
    */
  var TrainingJobDefinitionName: js.UndefOr[HyperParameterTrainingJobDefinitionName] = js.undefined
  
  /**
    * The name of the training job.
    */
  var TrainingJobName: typingsJapgolly.awsSdk.clientsSagemakerMod.TrainingJobName
  
  /**
    * The status of the training job.
    */
  var TrainingJobStatus: typingsJapgolly.awsSdk.clientsSagemakerMod.TrainingJobStatus
  
  /**
    * The date and time that the training job started.
    */
  var TrainingStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of the hyperparameters for which you specified ranges to search.
    */
  var TunedHyperParameters: HyperParameters
  
  /**
    * The HyperParameter tuning job that launched the training job.
    */
  var TuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined
}
object HyperParameterTrainingJobSummary {
  
  inline def apply(
    CreationTime: js.Date,
    TrainingJobArn: TrainingJobArn,
    TrainingJobName: TrainingJobName,
    TrainingJobStatus: TrainingJobStatus,
    TunedHyperParameters: HyperParameters
  ): HyperParameterTrainingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TrainingJobArn = TrainingJobArn.asInstanceOf[js.Any], TrainingJobName = TrainingJobName.asInstanceOf[js.Any], TrainingJobStatus = TrainingJobStatus.asInstanceOf[js.Any], TunedHyperParameters = TunedHyperParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTrainingJobSummary]
  }
  
  extension [Self <: HyperParameterTrainingJobSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setFinalHyperParameterTuningJobObjectiveMetric(value: FinalHyperParameterTuningJobObjectiveMetric): Self = StObject.set(x, "FinalHyperParameterTuningJobObjectiveMetric", value.asInstanceOf[js.Any])
    
    inline def setFinalHyperParameterTuningJobObjectiveMetricUndefined: Self = StObject.set(x, "FinalHyperParameterTuningJobObjectiveMetric", js.undefined)
    
    inline def setObjectiveStatus(value: ObjectiveStatus): Self = StObject.set(x, "ObjectiveStatus", value.asInstanceOf[js.Any])
    
    inline def setObjectiveStatusUndefined: Self = StObject.set(x, "ObjectiveStatus", js.undefined)
    
    inline def setTrainingEndTime(value: js.Date): Self = StObject.set(x, "TrainingEndTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingEndTimeUndefined: Self = StObject.set(x, "TrainingEndTime", js.undefined)
    
    inline def setTrainingJobArn(value: TrainingJobArn): Self = StObject.set(x, "TrainingJobArn", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobDefinitionName(value: HyperParameterTrainingJobDefinitionName): Self = StObject.set(x, "TrainingJobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobDefinitionNameUndefined: Self = StObject.set(x, "TrainingJobDefinitionName", js.undefined)
    
    inline def setTrainingJobName(value: TrainingJobName): Self = StObject.set(x, "TrainingJobName", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobStatus(value: TrainingJobStatus): Self = StObject.set(x, "TrainingJobStatus", value.asInstanceOf[js.Any])
    
    inline def setTrainingStartTime(value: js.Date): Self = StObject.set(x, "TrainingStartTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingStartTimeUndefined: Self = StObject.set(x, "TrainingStartTime", js.undefined)
    
    inline def setTunedHyperParameters(value: HyperParameters): Self = StObject.set(x, "TunedHyperParameters", value.asInstanceOf[js.Any])
    
    inline def setTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "TuningJobName", value.asInstanceOf[js.Any])
    
    inline def setTuningJobNameUndefined: Self = StObject.set(x, "TuningJobName", js.undefined)
  }
}
