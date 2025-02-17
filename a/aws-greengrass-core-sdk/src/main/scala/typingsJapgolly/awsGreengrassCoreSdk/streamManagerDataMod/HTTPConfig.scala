package typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "HTTPConfig")
@js.native
open class HTTPConfig protected ()
  extends StObject
     with StreamConfigBase[HTTPConfigMap] {
  /**
    * @param identifier A unique identifier to identify this individual upload stream.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    * @param uri URL for HTTP endpoint which should receive the POST requests for export.
    * @param batchSize The maximum size of a batch to send to the destination. Messages will be queued until the batch size is reached,
    * after which they will then be uploaded. If unspecified the default will be 500.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum batch size is 1 and the maximum is 500.
    * @param batchIntervalMillis The time in milliseconds between the earliest un-uploaded message and the current time.
    * If this time is exceeded, messages will be uploaded in the next batch. If unspecified messages will be eligible for upload immediately.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum value is 60000 milliseconds and the maximum is 9223372036854 milliseconds.
    * @param priority Priority for this upload stream. Lower values are higher priority. If not specified it will have the lowest priority.
    * @param startSequenceNumber The sequence number of the message to use as the starting message in the export. Default is 0.
    * The sequence number provided should be less than the newest sequence number in the stream, i.e.,
    * sequence number of the last messaged appended. To find the newest sequence number, describe the stream and then check the storage status
    * of the returned MessageStreamInfo object.
    * @param disabled Enable or disable this export. Default is false.
    * @param exportFormat Defines how messages are batched and formatted in the export payload.
    */
  def this(
    identifier: js.UndefOr[String | Null],
    uri: js.UndefOr[String | Null],
    batchSize: js.UndefOr[Double | Null],
    batchIntervalMillis: js.UndefOr[Double | Null],
    priority: js.UndefOr[Double | Null],
    startSequenceNumber: js.UndefOr[Double | Null],
    disabled: js.UndefOr[Boolean | Null],
    exportFormat: js.UndefOr[ExportFormat | Null]
  ) = this()
  
  /**
    * The maximum size of a batch to send to the destination. Messages will be queued until the batch size is reached,
    * after which they will then be uploaded.
    * If unspecified the default will be 500.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum batch size is 1 and the maximum is 500.
    * @returns
    */
  def batchSize: Double | Null = js.native
  /**
    * @param value The maximum size of a batch to send to the destination. Messages will be queued until the batch size is reached,
    * after which they will then be uploaded.
    * If unspecified the default will be 500.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum batch size is 1 and the maximum is 500.
    */
  def batchSize_=(value: Double | Null): Unit = js.native
  
  /**
    * Defines how messages are batched and formatted in the export payload.
    * @returns
    */
  def exportFormat: ExportFormat | Null = js.native
  /**
    * @param value Defines how messages are batched and formatted in the export payload.
    */
  def exportFormat_=(value: ExportFormat | Null): Unit = js.native
  
  /**
    * URL for HTTP endpoint which should receive the POST requests for export.
    * @returns
    */
  def uri: String | Null = js.native
  /**
    * @param value URL for HTTP endpoint which should receive the POST requests for export.
    */
  def uri_=(value: String | Null): Unit = js.native
  
  /**
    * @param value The maximum size of a batch to send to the destination. Messages will be queued until the batch size is reached,
    * after which they will then be uploaded.
    * If unspecified the default will be 500.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum batch size is 1 and the maximum is 500.
    */
  def withBatchSize(): HTTPConfig = js.native
  def withBatchSize(value: Double): HTTPConfig = js.native
  
  /**
    * @param value Defines how messages are batched and formatted in the export payload.
    * @returns
    */
  def withExportFormat(): HTTPConfig = js.native
  def withExportFormat(value: ExportFormat): HTTPConfig = js.native
  
  /**
    * @param value URL for HTTP endpoint which should receive the POST requests for export.
    * @returns
    */
  def withUri(): HTTPConfig = js.native
  def withUri(value: String): HTTPConfig = js.native
}
/* static members */
object HTTPConfig {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "HTTPConfig")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromMap(d: HTTPConfigMap): HTTPConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[HTTPConfig]
}
