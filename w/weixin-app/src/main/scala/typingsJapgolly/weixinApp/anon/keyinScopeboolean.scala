package typingsJapgolly.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in weixin-app.wx.Scope ]: boolean} */
trait keyinScopeboolean extends StObject {
  
  @JSName("scope.address")
  var scopeDotaddress: Boolean
  
  @JSName("scope.camera")
  var scopeDotcamera: Boolean
  
  @JSName("scope.invoice")
  var scopeDotinvoice: Boolean
  
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: Boolean
  
  @JSName("scope.record")
  var scopeDotrecord: Boolean
  
  @JSName("scope.userInfo")
  var scopeDotuserInfo: Boolean
  
  @JSName("scope.userLocation")
  var scopeDotuserLocation: Boolean
  
  @JSName("scope.userLocationBackground")
  var scopeDotuserLocationBackground: Boolean
  
  @JSName("scope.werun")
  var scopeDotwerun: Boolean
  
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: Boolean
}
object keyinScopeboolean {
  
  inline def apply(
    scopeDotaddress: Boolean,
    scopeDotcamera: Boolean,
    scopeDotinvoice: Boolean,
    scopeDotinvoiceTitle: Boolean,
    scopeDotrecord: Boolean,
    scopeDotuserInfo: Boolean,
    scopeDotuserLocation: Boolean,
    scopeDotuserLocationBackground: Boolean,
    scopeDotwerun: Boolean,
    scopeDotwritePhotosAlbum: Boolean
  ): keyinScopeboolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.camera")(scopeDotcamera.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoice")(scopeDotinvoice.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocationBackground")(scopeDotuserLocationBackground.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinScopeboolean]
  }
  
  extension [Self <: keyinScopeboolean](x: Self) {
    
    inline def setScopeDotaddress(value: Boolean): Self = StObject.set(x, "scope.address", value.asInstanceOf[js.Any])
    
    inline def setScopeDotcamera(value: Boolean): Self = StObject.set(x, "scope.camera", value.asInstanceOf[js.Any])
    
    inline def setScopeDotinvoice(value: Boolean): Self = StObject.set(x, "scope.invoice", value.asInstanceOf[js.Any])
    
    inline def setScopeDotinvoiceTitle(value: Boolean): Self = StObject.set(x, "scope.invoiceTitle", value.asInstanceOf[js.Any])
    
    inline def setScopeDotrecord(value: Boolean): Self = StObject.set(x, "scope.record", value.asInstanceOf[js.Any])
    
    inline def setScopeDotuserInfo(value: Boolean): Self = StObject.set(x, "scope.userInfo", value.asInstanceOf[js.Any])
    
    inline def setScopeDotuserLocation(value: Boolean): Self = StObject.set(x, "scope.userLocation", value.asInstanceOf[js.Any])
    
    inline def setScopeDotuserLocationBackground(value: Boolean): Self = StObject.set(x, "scope.userLocationBackground", value.asInstanceOf[js.Any])
    
    inline def setScopeDotwerun(value: Boolean): Self = StObject.set(x, "scope.werun", value.asInstanceOf[js.Any])
    
    inline def setScopeDotwritePhotosAlbum(value: Boolean): Self = StObject.set(x, "scope.writePhotosAlbum", value.asInstanceOf[js.Any])
  }
}
