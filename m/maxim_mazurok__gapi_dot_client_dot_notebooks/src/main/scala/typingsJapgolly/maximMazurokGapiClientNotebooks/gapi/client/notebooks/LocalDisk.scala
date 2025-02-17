package typingsJapgolly.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalDisk extends StObject {
  
  /** Optional. Output only. Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance). */
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. Output only. Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem. */
  var boot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Output only. Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the
    * instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to
    * apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Indicates a list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list
    * of available options.
    */
  var guestOsFeatures: js.UndefOr[js.Array[RuntimeGuestOsFeature]] = js.undefined
  
  /** Output only. A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number. */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Input only. Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the
    * new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
    */
  var initializeParams: js.UndefOr[LocalDiskInitializeParams] = js.undefined
  
  /**
    * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if
    * you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD
    * performance. Valid values: * NVME * SCSI
    */
  var interface: js.UndefOr[String] = js.undefined
  
  /** Output only. Type of the resource. Always compute#attachedDisk for attached disks. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Output only. Any valid publicly visible licenses. */
  var licenses: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode. Valid values: * READ_ONLY * READ_WRITE */
  var mode: js.UndefOr[String] = js.undefined
  
  /** Specifies a valid partial or full URL to an existing Persistent Disk resource. */
  var source: js.UndefOr[String] = js.undefined
  
  /** Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT. Valid values: * PERSISTENT * SCRATCH */
  var `type`: js.UndefOr[String] = js.undefined
}
object LocalDisk {
  
  inline def apply(): LocalDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalDisk]
  }
  
  extension [Self <: LocalDisk](x: Self) {
    
    inline def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
    
    inline def setBoot(value: Boolean): Self = StObject.set(x, "boot", value.asInstanceOf[js.Any])
    
    inline def setBootUndefined: Self = StObject.set(x, "boot", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setGuestOsFeatures(value: js.Array[RuntimeGuestOsFeature]): Self = StObject.set(x, "guestOsFeatures", value.asInstanceOf[js.Any])
    
    inline def setGuestOsFeaturesUndefined: Self = StObject.set(x, "guestOsFeatures", js.undefined)
    
    inline def setGuestOsFeaturesVarargs(value: RuntimeGuestOsFeature*): Self = StObject.set(x, "guestOsFeatures", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setInitializeParams(value: LocalDiskInitializeParams): Self = StObject.set(x, "initializeParams", value.asInstanceOf[js.Any])
    
    inline def setInitializeParamsUndefined: Self = StObject.set(x, "initializeParams", js.undefined)
    
    inline def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    inline def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLicenses(value: js.Array[String]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    inline def setLicensesVarargs(value: String*): Self = StObject.set(x, "licenses", js.Array(value*))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
