package typingsJapgolly.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineOutputConfig extends StObject {
  
  /**
    *  The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files. Specify this value when all of the following are true:   You want to save transcoded files, thumbnails (if any), and playlists (if any) together in one bucket.   You do not want to specify the users or groups who have access to the transcoded files, thumbnails, and playlists.   You do not want to specify the permissions that Elastic Transcoder grants to the files.   You want to associate the transcoded files and thumbnails with the Amazon S3 Standard storage class.   If you want to save transcoded files and playlists in one bucket and thumbnails in another bucket, specify which users can access the transcoded files or the permissions the users have, or change the Amazon S3 storage class, omit OutputBucket and specify values for ContentConfig and ThumbnailConfig instead. 
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * Optional. The Permissions object specifies which users and/or predefined Amazon S3 groups you want to have access to transcoded files and playlists, and the type of access you want them to have. You can grant permissions to a maximum of 30 users and/or predefined Amazon S3 groups. If you include Permissions, Elastic Transcoder grants only the permissions that you specify. It does not grant full permissions to the owner of the role specified by Role. If you want that user to have full control, you must explicitly grant full control to the user.  If you omit Permissions, Elastic Transcoder grants full control over the transcoded files and playlists to the owner of the role specified by Role, and grants no other permissions to any other user or group.
    */
  var Permissions: js.UndefOr[typingsJapgolly.awsSdk.clientsElastictranscoderMod.Permissions] = js.undefined
  
  /**
    *  The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket. 
    */
  var StorageClass: js.UndefOr[typingsJapgolly.awsSdk.clientsElastictranscoderMod.StorageClass] = js.undefined
}
object PipelineOutputConfig {
  
  inline def apply(): PipelineOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineOutputConfig]
  }
  
  extension [Self <: PipelineOutputConfig](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setPermissions(value: Permissions): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}
