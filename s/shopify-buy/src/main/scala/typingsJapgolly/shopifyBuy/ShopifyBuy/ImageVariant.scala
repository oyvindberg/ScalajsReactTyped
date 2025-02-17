package typingsJapgolly.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageVariant
  extends StObject
     with Image {
  
  var dimensions: String
  
  /**
    * Returns src URL for new image size/variant
    * @param image The image you would like a different size for.
    * @param options Image Max width and height configuration.
    */
  def imageForSize(image: Image, options: ImageOptions): String
  
  var name: String
}
object ImageVariant {
  
  inline def apply(
    created_at: String,
    dimensions: String,
    id: String | Double,
    imageForSize: (Image, ImageOptions) => String,
    name: String,
    position: Double,
    product_id: String,
    src: String,
    updated_at: String,
    variant_ids: js.Array[String]
  ): ImageVariant = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageForSize = js.Any.fromFunction2(imageForSize), name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], variant_ids = variant_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVariant]
  }
  
  extension [Self <: ImageVariant](x: Self) {
    
    inline def setDimensions(value: String): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setImageForSize(value: (Image, ImageOptions) => String): Self = StObject.set(x, "imageForSize", js.Any.fromFunction2(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
