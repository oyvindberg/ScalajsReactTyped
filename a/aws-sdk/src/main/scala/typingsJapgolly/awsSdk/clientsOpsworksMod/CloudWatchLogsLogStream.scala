package typingsJapgolly.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsLogStream extends StObject {
  
  /**
    * Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
    */
  var BatchCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is 32768 bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.
    */
  var BatchSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value is 5000ms.
    */
  var BufferDuration: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies how the time stamp is extracted from logs. For more information, see the CloudWatch Logs Agent Reference.
    */
  var DatetimeFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the encoding of the log file so that the file can be read correctly. The default is utf_8. Encodings supported by Python codecs.decode() can be used here.
    */
  var Encoding: js.UndefOr[CloudWatchLogsEncoding] = js.undefined
  
  /**
    * Specifies log files that you want to push to CloudWatch Logs.  File can point to a specific file or multiple files (by using wild card characters such as /var/log/system.log*). Only the latest file is pushed to CloudWatch Logs, based on file modification time. We recommend that you use wild card characters to specify a series of files of the same type, such as access_log.2014-06-01-01, access_log.2014-06-01-02, and so on by using a pattern like access_log.*. Don't use a wildcard to match multiple file types, such as access_log_80 and access_log_443. To specify multiple, different file types, add another log stream entry to the configuration file, so that each log file type is stored in a different log group. Zipped files are not supported.
    */
  var File: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to calculate the fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines are available.
    */
  var FileFingerprintLines: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This setting is only used if there is no state persisted for that log stream.
    */
  var InitialPosition: js.UndefOr[CloudWatchLogsInitialPosition] = js.undefined
  
  /**
    * Specifies the destination log group. A log group is created automatically if it doesn't already exist. Log group names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
    */
  var LogGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the pattern for identifying the start of a log message.
    */
  var MultiLineStartPattern: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the time zone of log event time stamps.
    */
  var TimeZone: js.UndefOr[CloudWatchLogsTimeZone] = js.undefined
}
object CloudWatchLogsLogStream {
  
  inline def apply(): CloudWatchLogsLogStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsLogStream]
  }
  
  extension [Self <: CloudWatchLogsLogStream](x: Self) {
    
    inline def setBatchCount(value: Integer): Self = StObject.set(x, "BatchCount", value.asInstanceOf[js.Any])
    
    inline def setBatchCountUndefined: Self = StObject.set(x, "BatchCount", js.undefined)
    
    inline def setBatchSize(value: Integer): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setBufferDuration(value: Integer): Self = StObject.set(x, "BufferDuration", value.asInstanceOf[js.Any])
    
    inline def setBufferDurationUndefined: Self = StObject.set(x, "BufferDuration", js.undefined)
    
    inline def setDatetimeFormat(value: String): Self = StObject.set(x, "DatetimeFormat", value.asInstanceOf[js.Any])
    
    inline def setDatetimeFormatUndefined: Self = StObject.set(x, "DatetimeFormat", js.undefined)
    
    inline def setEncoding(value: CloudWatchLogsEncoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "Encoding", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    inline def setFileFingerprintLines(value: String): Self = StObject.set(x, "FileFingerprintLines", value.asInstanceOf[js.Any])
    
    inline def setFileFingerprintLinesUndefined: Self = StObject.set(x, "FileFingerprintLines", js.undefined)
    
    inline def setFileUndefined: Self = StObject.set(x, "File", js.undefined)
    
    inline def setInitialPosition(value: CloudWatchLogsInitialPosition): Self = StObject.set(x, "InitialPosition", value.asInstanceOf[js.Any])
    
    inline def setInitialPositionUndefined: Self = StObject.set(x, "InitialPosition", js.undefined)
    
    inline def setLogGroupName(value: String): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    inline def setMultiLineStartPattern(value: String): Self = StObject.set(x, "MultiLineStartPattern", value.asInstanceOf[js.Any])
    
    inline def setMultiLineStartPatternUndefined: Self = StObject.set(x, "MultiLineStartPattern", js.undefined)
    
    inline def setTimeZone(value: CloudWatchLogsTimeZone): Self = StObject.set(x, "TimeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "TimeZone", js.undefined)
  }
}
