package typingsJapgolly.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice extends StObject {
  
  /** Optional. Display price of the product. */
  var displayPrice: js.UndefOr[Double] = js.undefined
  
  /** Optional. Price of the product without any discount. If zero, by default set to be the 'displayPrice'. */
  var originalPrice: js.UndefOr[Double] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice](x: Self) {
    
    inline def setDisplayPrice(value: Double): Self = StObject.set(x, "displayPrice", value.asInstanceOf[js.Any])
    
    inline def setDisplayPriceUndefined: Self = StObject.set(x, "displayPrice", js.undefined)
    
    inline def setOriginalPrice(value: Double): Self = StObject.set(x, "originalPrice", value.asInstanceOf[js.Any])
    
    inline def setOriginalPriceUndefined: Self = StObject.set(x, "originalPrice", js.undefined)
  }
}
