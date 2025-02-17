package typingsJapgolly.giphyApi.mod

import typingsJapgolly.giphyApi.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GIFObject extends StObject {
  
  var bitly_url: String
  
  var content_url: String
  
  var create_datetime: String
  
  var embed_url: String
  
  var id: String
  
  var images: Images
  
  var import_datetime: String
  
  var rating: Rating
  
  var slug: String
  
  var source: String
  
  var source_post_url: String
  
  var source_tld: String
  
  var title: String
  
  var trending_datetime: String
  
  var `type`: String
  
  var update_datetime: String
  
  var url: String
  
  var user: js.UndefOr[Avatarurl] = js.undefined
  
  var username: String
}
object GIFObject {
  
  inline def apply(
    bitly_url: String,
    content_url: String,
    create_datetime: String,
    embed_url: String,
    id: String,
    images: Images,
    import_datetime: String,
    rating: Rating,
    slug: String,
    source: String,
    source_post_url: String,
    source_tld: String,
    title: String,
    trending_datetime: String,
    `type`: String,
    update_datetime: String,
    url: String,
    username: String
  ): GIFObject = {
    val __obj = js.Dynamic.literal(bitly_url = bitly_url.asInstanceOf[js.Any], content_url = content_url.asInstanceOf[js.Any], create_datetime = create_datetime.asInstanceOf[js.Any], embed_url = embed_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], import_datetime = import_datetime.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], source_post_url = source_post_url.asInstanceOf[js.Any], source_tld = source_tld.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trending_datetime = trending_datetime.asInstanceOf[js.Any], update_datetime = update_datetime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GIFObject]
  }
  
  extension [Self <: GIFObject](x: Self) {
    
    inline def setBitly_url(value: String): Self = StObject.set(x, "bitly_url", value.asInstanceOf[js.Any])
    
    inline def setContent_url(value: String): Self = StObject.set(x, "content_url", value.asInstanceOf[js.Any])
    
    inline def setCreate_datetime(value: String): Self = StObject.set(x, "create_datetime", value.asInstanceOf[js.Any])
    
    inline def setEmbed_url(value: String): Self = StObject.set(x, "embed_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: Images): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImport_datetime(value: String): Self = StObject.set(x, "import_datetime", value.asInstanceOf[js.Any])
    
    inline def setRating(value: Rating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSource_post_url(value: String): Self = StObject.set(x, "source_post_url", value.asInstanceOf[js.Any])
    
    inline def setSource_tld(value: String): Self = StObject.set(x, "source_tld", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTrending_datetime(value: String): Self = StObject.set(x, "trending_datetime", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdate_datetime(value: String): Self = StObject.set(x, "update_datetime", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
