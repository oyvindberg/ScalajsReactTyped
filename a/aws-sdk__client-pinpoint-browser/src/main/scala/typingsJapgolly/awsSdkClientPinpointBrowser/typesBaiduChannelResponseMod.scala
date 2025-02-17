package typingsJapgolly.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaiduChannelResponseMod {
  
  trait BaiduChannelResponse extends StObject {
    
    /**
      * Application id
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * When was this segment created
      */
    var CreationDate: js.UndefOr[String] = js.undefined
    
    /**
      * The Baidu API key from Baidu.
      */
    var Credential: js.UndefOr[String] = js.undefined
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Who made the last change
      */
    var LastModifiedBy: js.UndefOr[String] = js.undefined
    
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[String] = js.undefined
    
    /**
      * The platform type. Will be BAIDU
      */
    var Platform: js.UndefOr[String] = js.undefined
    
    /**
      * Version of channel
      */
    var Version: js.UndefOr[Double] = js.undefined
  }
  object BaiduChannelResponse {
    
    inline def apply(): BaiduChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaiduChannelResponse]
    }
    
    extension [Self <: BaiduChannelResponse](x: Self) {
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setCredential(value: String): Self = StObject.set(x, "Credential", value.asInstanceOf[js.Any])
      
      inline def setCredentialUndefined: Self = StObject.set(x, "Credential", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      inline def setHasCredential(value: Boolean): Self = StObject.set(x, "HasCredential", value.asInstanceOf[js.Any])
      
      inline def setHasCredentialUndefined: Self = StObject.set(x, "HasCredential", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setIsArchived(value: Boolean): Self = StObject.set(x, "IsArchived", value.asInstanceOf[js.Any])
      
      inline def setIsArchivedUndefined: Self = StObject.set(x, "IsArchived", js.undefined)
      
      inline def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
      
      inline def setLastModifiedDate(value: String): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  type UnmarshalledBaiduChannelResponse = BaiduChannelResponse
}
