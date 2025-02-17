package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldLevelEncryption extends StObject {
  
  /**
    * A complex data type that includes the profile configurations specified for field-level encryption. 
    */
  var FieldLevelEncryptionConfig: typingsJapgolly.awsSdk.clientsCloudfrontMod.FieldLevelEncryptionConfig
  
  /**
    * The configuration ID for a field-level encryption configuration which includes a set of profiles that specify certain selected data fields to be encrypted by specific public keys.
    */
  var Id: String
  
  /**
    * The last time the field-level encryption configuration was changed. 
    */
  var LastModifiedTime: js.Date
}
object FieldLevelEncryption {
  
  inline def apply(FieldLevelEncryptionConfig: FieldLevelEncryptionConfig, Id: String, LastModifiedTime: js.Date): FieldLevelEncryption = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionConfig = FieldLevelEncryptionConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryption]
  }
  
  extension [Self <: FieldLevelEncryption](x: Self) {
    
    inline def setFieldLevelEncryptionConfig(value: FieldLevelEncryptionConfig): Self = StObject.set(x, "FieldLevelEncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
