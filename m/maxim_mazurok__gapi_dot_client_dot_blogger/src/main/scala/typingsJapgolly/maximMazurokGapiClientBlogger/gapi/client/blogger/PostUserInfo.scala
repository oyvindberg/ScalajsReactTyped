package typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostUserInfo extends StObject {
  
  /** The kind of this entity. Always blogger#postUserInfo. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The Post resource. */
  var post: js.UndefOr[Post] = js.undefined
  
  /** Information about a User for the Post. */
  var post_user_info: js.UndefOr[PostPerUserInfo] = js.undefined
}
object PostUserInfo {
  
  inline def apply(): PostUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostUserInfo]
  }
  
  extension [Self <: PostUserInfo](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPost(value: Post): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPost_user_info(value: PostPerUserInfo): Self = StObject.set(x, "post_user_info", value.asInstanceOf[js.Any])
    
    inline def setPost_user_infoUndefined: Self = StObject.set(x, "post_user_info", js.undefined)
  }
}
