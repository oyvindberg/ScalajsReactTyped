package typingsJapgolly.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportJob extends StObject {
  
  /**
    * Output only. Statement that was generated and signed by the key creator (for example, an HSM) at key creation time. Use this statement to verify attributes of the key as stored on
    * the HSM, independently of Google. Only present if the chosen ImportMethod is one with a protection level of HSM.
    */
  var attestation: js.UndefOr[KeyOperationAttestation] = js.undefined
  
  /** Output only. The time at which this ImportJob was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The time this ImportJob expired. Only present if state is EXPIRED. */
  var expireEventTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The time at which this ImportJob is scheduled for expiration and can no longer be used to import key material. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The time this ImportJob's key material was generated. */
  var generateTime: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The wrapping method to be used for incoming key material. */
  var importMethod: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name for this ImportJob in the format `projects/ *‍/locations/ *‍/keyRings/ *‍/importJobs/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The protection level of the ImportJob. This must match the protection_level of the version_template on the CryptoKey you attempt to import into. */
  var protectionLevel: js.UndefOr[String] = js.undefined
  
  /** Output only. The public key with which to wrap key material prior to import. Only returned if state is ACTIVE. */
  var publicKey: js.UndefOr[WrappingPublicKey] = js.undefined
  
  /** Output only. The current state of the ImportJob, indicating if it can be used. */
  var state: js.UndefOr[String] = js.undefined
}
object ImportJob {
  
  inline def apply(): ImportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportJob]
  }
  
  extension [Self <: ImportJob](x: Self) {
    
    inline def setAttestation(value: KeyOperationAttestation): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setExpireEventTime(value: String): Self = StObject.set(x, "expireEventTime", value.asInstanceOf[js.Any])
    
    inline def setExpireEventTimeUndefined: Self = StObject.set(x, "expireEventTime", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setGenerateTime(value: String): Self = StObject.set(x, "generateTime", value.asInstanceOf[js.Any])
    
    inline def setGenerateTimeUndefined: Self = StObject.set(x, "generateTime", js.undefined)
    
    inline def setImportMethod(value: String): Self = StObject.set(x, "importMethod", value.asInstanceOf[js.Any])
    
    inline def setImportMethodUndefined: Self = StObject.set(x, "importMethod", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
    
    inline def setPublicKey(value: WrappingPublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
