package typingsJapgolly.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePhotoRequest extends StObject {
  
  /** Required. Photo object containing the new metadata. */
  var photo: js.UndefOr[Photo] = js.undefined
  
  /**
    * Required. Mask that identifies fields on the photo metadata to update. If not present, the old Photo metadata is entirely replaced with the new Photo metadata in this request. The
    * update fails if invalid fields are specified. Multiple fields can be specified in a comma-delimited list. The following fields are valid: * `pose.heading` * `pose.latLngPair` *
    * `pose.pitch` * `pose.roll` * `pose.level` * `pose.altitude` * `connections` * `places` > Note: When updateMask contains repeated fields, the entire set of repeated values get
    * replaced with the new contents. For example, if updateMask contains `connections` and `UpdatePhotoRequest.photo.connections` is empty, all connections are removed.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object UpdatePhotoRequest {
  
  inline def apply(): UpdatePhotoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePhotoRequest]
  }
  
  extension [Self <: UpdatePhotoRequest](x: Self) {
    
    inline def setPhoto(value: Photo): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
