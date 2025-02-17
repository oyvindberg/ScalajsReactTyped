package typingsJapgolly.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DataSpec extends StObject {
  
  /**
    * The location of the data file(s) used by a DataSource. The URI specifies a data file or an Amazon Simple Storage Service (Amazon S3) directory or bucket containing data files.
    */
  var DataLocationS3: S3Url
  
  /**
    * A JSON string that represents the splitting and rearrangement processing to be applied to a DataSource. If the DataRearrangement parameter is not provided, all of the input data is used to create the Datasource. There are multiple parameters that control what data is used to create a datasource:     percentBegin   Use percentBegin to indicate the beginning of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource.     percentEnd   Use percentEnd to indicate the end of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource.     complement   The complement parameter instructs Amazon ML to use the data that is not included in the range of percentBegin to percentEnd to create a datasource. The complement parameter is useful if you need to create complementary datasources for training and evaluation. To create a complementary datasource, use the same values for percentBegin and percentEnd, along with the complement parameter. For example, the following two datasources do not share any data, and can be used to train and evaluate a model. The first datasource has 25 percent of the data, and the second one has 75 percent of the data. Datasource for evaluation: {"splitting":{"percentBegin":0, "percentEnd":25}}  Datasource for training: {"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}      strategy   To change how Amazon ML splits the data for a datasource, use the strategy parameter. The default value for the strategy parameter is sequential, meaning that Amazon ML takes all of the data records between the percentBegin and percentEnd parameters for the datasource, in the order that the records appear in the input data. The following two DataRearrangement lines are examples of sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}}  Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}}  To randomly split the input data into the proportions indicated by the percentBegin and percentEnd parameters, set the strategy parameter to random and provide a string that is used as the seed value for the random data splitting (for example, you can use the S3 path to your data as the random seed string). If you choose the random split strategy, Amazon ML assigns each row of data a pseudo-random number between 0 and 100, and then selects the rows that have an assigned number between percentBegin and percentEnd. Pseudo-random numbers are assigned using both the input seed string value and the byte offset as a seed, so changing the data results in a different split. Any existing ordering is preserved. The random splitting strategy ensures that variables in the training and evaluation data are distributed similarly. It is useful in the cases where the input data may have an implicit sort order, which would otherwise result in training and evaluation datasources containing non-similar data records. The following two DataRearrangement lines are examples of non-sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}}  Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}   
    */
  var DataRearrangement: js.UndefOr[typingsJapgolly.awsSdk.clientsMachinelearningMod.DataRearrangement] = js.undefined
  
  /**
    *  A JSON string that represents the schema for an Amazon S3 DataSource. The DataSchema defines the structure of the observation data in the data file(s) referenced in the DataSource. You must provide either the DataSchema or the DataSchemaLocationS3. Define your DataSchema as a series of key-value pairs. attributes and excludedVariableNames have an array of key-value pairs for their value. Use the following format to define your DataSchema. { "version": "1.0", "recordAnnotationFieldName": "F1", "recordWeightFieldName": "F2", "targetFieldName": "F3", "dataFormat": "CSV", "dataFileContainsHeader": true, "attributes": [ { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5", "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType": "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ], "excludedVariableNames": [ "F6" ] }
    */
  var DataSchema: js.UndefOr[typingsJapgolly.awsSdk.clientsMachinelearningMod.DataSchema] = js.undefined
  
  /**
    * Describes the schema location in Amazon S3. You must provide either the DataSchema or the DataSchemaLocationS3.
    */
  var DataSchemaLocationS3: js.UndefOr[S3Url] = js.undefined
}
object S3DataSpec {
  
  inline def apply(DataLocationS3: S3Url): S3DataSpec = {
    val __obj = js.Dynamic.literal(DataLocationS3 = DataLocationS3.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataSpec]
  }
  
  extension [Self <: S3DataSpec](x: Self) {
    
    inline def setDataLocationS3(value: S3Url): Self = StObject.set(x, "DataLocationS3", value.asInstanceOf[js.Any])
    
    inline def setDataRearrangement(value: DataRearrangement): Self = StObject.set(x, "DataRearrangement", value.asInstanceOf[js.Any])
    
    inline def setDataRearrangementUndefined: Self = StObject.set(x, "DataRearrangement", js.undefined)
    
    inline def setDataSchema(value: DataSchema): Self = StObject.set(x, "DataSchema", value.asInstanceOf[js.Any])
    
    inline def setDataSchemaLocationS3(value: S3Url): Self = StObject.set(x, "DataSchemaLocationS3", value.asInstanceOf[js.Any])
    
    inline def setDataSchemaLocationS3Undefined: Self = StObject.set(x, "DataSchemaLocationS3", js.undefined)
    
    inline def setDataSchemaUndefined: Self = StObject.set(x, "DataSchema", js.undefined)
  }
}
