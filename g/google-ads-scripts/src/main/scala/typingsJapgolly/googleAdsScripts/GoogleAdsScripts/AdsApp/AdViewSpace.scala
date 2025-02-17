package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Starting point for viewing type-specific ad information.
  *
  * Typical usage:
  *
  *      if (ad.isType().expandedTextAd()) {
  *        var expandedTextAd = ad.asType().expandedTextAd();
  *        var headlinePart1 = expandedTextAd.getHeadlinePart1();
  *      }
  */
trait AdViewSpace extends StObject {
  
  /** Returns the ad as an ExpandedTextAd. */
  def expandedTextAd(): ExpandedTextAd
  
  /* Returns the ad as a GmailImageAd. */
  def gmailImageAd(): GmailImageAd
  
  /** Returns the ad as a GmailMultiProductAd. */
  def gmailMultiProductAd(): GmailMultiProductAd
  
  /** Returns the ad as a GmailSinglePromotionAd. */
  def gmailSinglePromotionAd(): GmailSinglePromotionAd
  
  /** Returns the ad as a Html5Ad. */
  def html5Ad(): Html5Ad
  
  /** Returns the ad as an ImageAd. */
  def imageAd(): ImageAd
  
  /** Returns the ad as a ResponsiveDisplayAd. */
  def responsiveDisplayAd(): ResponsiveDisplayAd
  
  /** Returns the ad as a ResponsiveSearchAd. */
  def responsiveSearchAd(): ResponsiveSearchAd
}
object AdViewSpace {
  
  inline def apply(
    expandedTextAd: CallbackTo[ExpandedTextAd],
    gmailImageAd: CallbackTo[GmailImageAd],
    gmailMultiProductAd: CallbackTo[GmailMultiProductAd],
    gmailSinglePromotionAd: CallbackTo[GmailSinglePromotionAd],
    html5Ad: CallbackTo[Html5Ad],
    imageAd: CallbackTo[ImageAd],
    responsiveDisplayAd: CallbackTo[ResponsiveDisplayAd],
    responsiveSearchAd: CallbackTo[ResponsiveSearchAd]
  ): AdViewSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = expandedTextAd.toJsFn, gmailImageAd = gmailImageAd.toJsFn, gmailMultiProductAd = gmailMultiProductAd.toJsFn, gmailSinglePromotionAd = gmailSinglePromotionAd.toJsFn, html5Ad = html5Ad.toJsFn, imageAd = imageAd.toJsFn, responsiveDisplayAd = responsiveDisplayAd.toJsFn, responsiveSearchAd = responsiveSearchAd.toJsFn)
    __obj.asInstanceOf[AdViewSpace]
  }
  
  extension [Self <: AdViewSpace](x: Self) {
    
    inline def setExpandedTextAd(value: CallbackTo[ExpandedTextAd]): Self = StObject.set(x, "expandedTextAd", value.toJsFn)
    
    inline def setGmailImageAd(value: CallbackTo[GmailImageAd]): Self = StObject.set(x, "gmailImageAd", value.toJsFn)
    
    inline def setGmailMultiProductAd(value: CallbackTo[GmailMultiProductAd]): Self = StObject.set(x, "gmailMultiProductAd", value.toJsFn)
    
    inline def setGmailSinglePromotionAd(value: CallbackTo[GmailSinglePromotionAd]): Self = StObject.set(x, "gmailSinglePromotionAd", value.toJsFn)
    
    inline def setHtml5Ad(value: CallbackTo[Html5Ad]): Self = StObject.set(x, "html5Ad", value.toJsFn)
    
    inline def setImageAd(value: CallbackTo[ImageAd]): Self = StObject.set(x, "imageAd", value.toJsFn)
    
    inline def setResponsiveDisplayAd(value: CallbackTo[ResponsiveDisplayAd]): Self = StObject.set(x, "responsiveDisplayAd", value.toJsFn)
    
    inline def setResponsiveSearchAd(value: CallbackTo[ResponsiveSearchAd]): Self = StObject.set(x, "responsiveSearchAd", value.toJsFn)
  }
}
