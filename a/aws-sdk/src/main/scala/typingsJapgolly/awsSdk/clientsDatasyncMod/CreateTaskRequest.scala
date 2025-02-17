package typingsJapgolly.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTaskRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events in the task. 
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Web Services storage resource's location. 
    */
  var DestinationLocationArn: LocationArn
  
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example, "/folder1|/folder2".   
    */
  var Excludes: js.UndefOr[FilterList] = js.undefined
  
  /**
    * A list of filter rules that determines which files to include when running a task. The pattern contains a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe), for example, "/folder1|/folder2".
    */
  var Includes: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The name of a task. This value is a text reference that is used to identify the task in the console. 
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  
  /**
    * The set of configuration options that control the behavior of a single execution of the task that occurs when you call StartTaskExecution. You can configure these options to preserve metadata such as user ID (UID) and group ID (GID), file permissions, data integrity verification, and so on. For each individual task execution, you can override these options by specifying the OverrideOptions before starting the task execution. For more information, see the StartTaskExecution operation. 
    */
  var Options: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.Options] = js.undefined
  
  /**
    * Specifies a schedule used to periodically transfer files from a source to a destination location. The schedule should be specified in UTC time. For more information, see Scheduling your task.
    */
  var Schedule: js.UndefOr[TaskSchedule] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source location for the task.
    */
  var SourceLocationArn: LocationArn
  
  /**
    * The key-value pair that represents the tag that you want to add to the resource. The value can be an empty string. 
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
}
object CreateTaskRequest {
  
  inline def apply(DestinationLocationArn: LocationArn, SourceLocationArn: LocationArn): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(DestinationLocationArn = DestinationLocationArn.asInstanceOf[js.Any], SourceLocationArn = SourceLocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskRequest]
  }
  
  extension [Self <: CreateTaskRequest](x: Self) {
    
    inline def setCloudWatchLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    inline def setDestinationLocationArn(value: LocationArn): Self = StObject.set(x, "DestinationLocationArn", value.asInstanceOf[js.Any])
    
    inline def setExcludes(value: FilterList): Self = StObject.set(x, "Excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "Excludes", js.undefined)
    
    inline def setExcludesVarargs(value: FilterRule*): Self = StObject.set(x, "Excludes", js.Array(value*))
    
    inline def setIncludes(value: FilterList): Self = StObject.set(x, "Includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "Includes", js.undefined)
    
    inline def setIncludesVarargs(value: FilterRule*): Self = StObject.set(x, "Includes", js.Array(value*))
    
    inline def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOptions(value: Options): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setSchedule(value: TaskSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setSourceLocationArn(value: LocationArn): Self = StObject.set(x, "SourceLocationArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
