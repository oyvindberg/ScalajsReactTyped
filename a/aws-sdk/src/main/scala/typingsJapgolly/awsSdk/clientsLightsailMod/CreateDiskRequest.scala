package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDiskRequest extends StObject {
  
  /**
    * An array of objects that represent the add-ons to enable for the new disk.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.undefined
  
  /**
    * The Availability Zone where you want to create the disk (e.g., us-east-2a). Use the same Availability Zone as the Lightsail instance to which you want to attach the disk. Use the get regions operation to list the Availability Zones where Lightsail is currently available.
    */
  var availabilityZone: NonEmptyString
  
  /**
    * The unique Lightsail disk name (e.g., my-disk).
    */
  var diskName: ResourceName
  
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: integer
  
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateDiskRequest {
  
  inline def apply(availabilityZone: NonEmptyString, diskName: ResourceName, sizeInGb: integer): CreateDiskRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], diskName = diskName.asInstanceOf[js.Any], sizeInGb = sizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiskRequest]
  }
  
  extension [Self <: CreateDiskRequest](x: Self) {
    
    inline def setAddOns(value: AddOnRequestList): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    inline def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    inline def setAddOnsVarargs(value: AddOnRequest*): Self = StObject.set(x, "addOns", js.Array(value*))
    
    inline def setAvailabilityZone(value: NonEmptyString): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setDiskName(value: ResourceName): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
    
    inline def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
