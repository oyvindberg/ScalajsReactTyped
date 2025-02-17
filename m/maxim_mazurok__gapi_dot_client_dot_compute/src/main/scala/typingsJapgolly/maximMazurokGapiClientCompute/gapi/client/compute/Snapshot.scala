package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot extends StObject {
  
  /** [Output Only] Set to true if snapshots are automatically created by applying resource policy on the target disk. */
  var autoCreated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only
    * for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only
    * if it has a non-empty value.
    */
  var chainName: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Size of the source disk, specified in GB. */
  var diskSizeGb: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Number of bytes downloaded to restore a snapshot to a disk. */
  var downloadBytes: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of the resource. Always compute#snapshot for Snapshot resources. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by
    * Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
    * request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a snapshot.
    */
  var labelFingerprint: js.UndefOr[String] = js.undefined
  
  /** Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** [Output Only] Integer license codes indicating which licenses are attached to this snapshot. */
  var licenseCodes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** [Output Only] A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses attached (such as a Windows image). */
  var licenses: js.UndefOr[js.Array[String]] = js.undefined
  
  /** An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API. */
  var locationHint: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Reserved for future use. */
  var satisfiesPzs: js.UndefOr[Boolean] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot
    * later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect
    * access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and
    * you do not need to provide a key to use the snapshot later.
    */
  var snapshotEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  
  /** The source disk used to create this snapshot. */
  var sourceDisk: js.UndefOr[String] = js.undefined
  
  /** The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key. */
  var sourceDiskEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  
  /**
    * [Output Only] The ID value of the disk used to create this snapshot. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a
    * given disk name.
    */
  var sourceDiskId: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or UPLOADING. */
  var status: js.UndefOr[String] = js.undefined
  
  /** [Output Only] A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot creation/deletion. */
  var storageBytes: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning
    * the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
    */
  var storageBytesStatus: js.UndefOr[String] = js.undefined
  
  /** Cloud Storage bucket storage location of the snapshot (regional or multi-regional). */
  var storageLocations: js.UndefOr[js.Array[String]] = js.undefined
}
object Snapshot {
  
  inline def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  extension [Self <: Snapshot](x: Self) {
    
    inline def setAutoCreated(value: Boolean): Self = StObject.set(x, "autoCreated", value.asInstanceOf[js.Any])
    
    inline def setAutoCreatedUndefined: Self = StObject.set(x, "autoCreated", js.undefined)
    
    inline def setChainName(value: String): Self = StObject.set(x, "chainName", value.asInstanceOf[js.Any])
    
    inline def setChainNameUndefined: Self = StObject.set(x, "chainName", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDownloadBytes(value: String): Self = StObject.set(x, "downloadBytes", value.asInstanceOf[js.Any])
    
    inline def setDownloadBytesUndefined: Self = StObject.set(x, "downloadBytes", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    inline def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLicenseCodes(value: js.Array[String]): Self = StObject.set(x, "licenseCodes", value.asInstanceOf[js.Any])
    
    inline def setLicenseCodesUndefined: Self = StObject.set(x, "licenseCodes", js.undefined)
    
    inline def setLicenseCodesVarargs(value: String*): Self = StObject.set(x, "licenseCodes", js.Array(value*))
    
    inline def setLicenses(value: js.Array[String]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    inline def setLicensesVarargs(value: String*): Self = StObject.set(x, "licenses", js.Array(value*))
    
    inline def setLocationHint(value: String): Self = StObject.set(x, "locationHint", value.asInstanceOf[js.Any])
    
    inline def setLocationHintUndefined: Self = StObject.set(x, "locationHint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSatisfiesPzs(value: Boolean): Self = StObject.set(x, "satisfiesPzs", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPzsUndefined: Self = StObject.set(x, "satisfiesPzs", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSnapshotEncryptionKey(value: CustomerEncryptionKey): Self = StObject.set(x, "snapshotEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setSnapshotEncryptionKeyUndefined: Self = StObject.set(x, "snapshotEncryptionKey", js.undefined)
    
    inline def setSourceDisk(value: String): Self = StObject.set(x, "sourceDisk", value.asInstanceOf[js.Any])
    
    inline def setSourceDiskEncryptionKey(value: CustomerEncryptionKey): Self = StObject.set(x, "sourceDiskEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setSourceDiskEncryptionKeyUndefined: Self = StObject.set(x, "sourceDiskEncryptionKey", js.undefined)
    
    inline def setSourceDiskId(value: String): Self = StObject.set(x, "sourceDiskId", value.asInstanceOf[js.Any])
    
    inline def setSourceDiskIdUndefined: Self = StObject.set(x, "sourceDiskId", js.undefined)
    
    inline def setSourceDiskUndefined: Self = StObject.set(x, "sourceDisk", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStorageBytes(value: String): Self = StObject.set(x, "storageBytes", value.asInstanceOf[js.Any])
    
    inline def setStorageBytesStatus(value: String): Self = StObject.set(x, "storageBytesStatus", value.asInstanceOf[js.Any])
    
    inline def setStorageBytesStatusUndefined: Self = StObject.set(x, "storageBytesStatus", js.undefined)
    
    inline def setStorageBytesUndefined: Self = StObject.set(x, "storageBytes", js.undefined)
    
    inline def setStorageLocations(value: js.Array[String]): Self = StObject.set(x, "storageLocations", value.asInstanceOf[js.Any])
    
    inline def setStorageLocationsUndefined: Self = StObject.set(x, "storageLocations", js.undefined)
    
    inline def setStorageLocationsVarargs(value: String*): Self = StObject.set(x, "storageLocations", js.Array(value*))
  }
}
