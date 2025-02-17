package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidPushNotificationTemplate extends StObject {
  
  /**
    * The action to occur if a recipient taps a push notification that's based on the message template. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the deep-linking features of the Android platform. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.Action] = js.undefined
  
  /**
    * The message body to use in a push notification that's based on the message template.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * The URL of the large icon image to display in the content view of a push notification that's based on the message template.
    */
  var ImageIconUrl: js.UndefOr[string] = js.undefined
  
  /**
    * The URL of an image to display in a push notification that's based on the message template.
    */
  var ImageUrl: js.UndefOr[string] = js.undefined
  
  /**
    * The raw, JSON-formatted string to use as the payload for a push notification that's based on the message template. If specified, this value overrides all other content for the message template.
    */
  var RawContent: js.UndefOr[string] = js.undefined
  
  /**
    * The URL of the small icon image to display in the status bar and the content view of a push notification that's based on the message template.
    */
  var SmallImageIconUrl: js.UndefOr[string] = js.undefined
  
  /**
    * The sound to play when a recipient receives a push notification that's based on the message template. You can use the default stream or specify the file name of a sound resource that's bundled in your app. On an Android platform, the sound file must reside in /res/raw/.
    */
  var Sound: js.UndefOr[string] = js.undefined
  
  /**
    * The title to use in a push notification that's based on the message template. This title appears above the notification message on a recipient's device.
    */
  var Title: js.UndefOr[string] = js.undefined
  
  /**
    * The URL to open in a recipient's default mobile browser, if a recipient taps a push notification that's based on the message template and the value of the Action property is URL.
    */
  var Url: js.UndefOr[string] = js.undefined
}
object AndroidPushNotificationTemplate {
  
  inline def apply(): AndroidPushNotificationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidPushNotificationTemplate]
  }
  
  extension [Self <: AndroidPushNotificationTemplate](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setImageIconUrl(value: string): Self = StObject.set(x, "ImageIconUrl", value.asInstanceOf[js.Any])
    
    inline def setImageIconUrlUndefined: Self = StObject.set(x, "ImageIconUrl", js.undefined)
    
    inline def setImageUrl(value: string): Self = StObject.set(x, "ImageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "ImageUrl", js.undefined)
    
    inline def setRawContent(value: string): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
    
    inline def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
    
    inline def setSmallImageIconUrl(value: string): Self = StObject.set(x, "SmallImageIconUrl", value.asInstanceOf[js.Any])
    
    inline def setSmallImageIconUrlUndefined: Self = StObject.set(x, "SmallImageIconUrl", js.undefined)
    
    inline def setSound(value: string): Self = StObject.set(x, "Sound", value.asInstanceOf[js.Any])
    
    inline def setSoundUndefined: Self = StObject.set(x, "Sound", js.undefined)
    
    inline def setTitle(value: string): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
