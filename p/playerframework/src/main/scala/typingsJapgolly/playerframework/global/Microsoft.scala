package typingsJapgolly.playerframework.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Microsoft {
  
  object PlayerFramework {
    
    object Js {
      
      object Advertising {
        
        /**
          * Provides an ad source that requires a Url to be downloaded and turned into a stream before passing to the ad handler.
          **/
        @JSGlobal("Microsoft.PlayerFramework.Js.Advertising.RemoteAdSource")
        @js.native
        open class RemoteAdSource ()
          extends StObject
             with typingsJapgolly.playerframework.Microsoft.PlayerFramework.Js.Advertising.RemoteAdSource
      }
    }
  }
  
  object VideoAdvertising {
    
    @JSGlobal("Microsoft.VideoAdvertising.Extensions")
    @js.native
    open class Extensions ()
      extends StObject
         with typingsJapgolly.playerframework.Microsoft.VideoAdvertising.Extensions
    object Extensions {
      
      @JSGlobal("Microsoft.VideoAdvertising.Extensions")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Microsoft.VideoAdvertising.Extensions.defaultUserAgent")
      @js.native
      def defaultUserAgent: String = js.native
      inline def defaultUserAgent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultUserAgent")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Microsoft.VideoAdvertising.VastAdPayloadHandler")
    @js.native
    open class VastAdPayloadHandler ()
      extends StObject
         with typingsJapgolly.playerframework.Microsoft.VideoAdvertising.VastAdPayloadHandler
    object VastAdPayloadHandler {
      
      @JSGlobal("Microsoft.VideoAdvertising.VastAdPayloadHandler")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Microsoft.VideoAdvertising.VastAdPayloadHandler.adType")
      @js.native
      def adType: String = js.native
      inline def adType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adType")(x.asInstanceOf[js.Any])
    }
  }
}
