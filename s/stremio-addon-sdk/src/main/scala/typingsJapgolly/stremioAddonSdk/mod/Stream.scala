package typingsJapgolly.stremioAddonSdk.mod

import typingsJapgolly.stremioAddonSdk.anon.CountryWhitelist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  var behaviorHints: js.UndefOr[CountryWhitelist] = js.undefined
  
  /**
    * Meta Link or an external URL to the video, which should be opened in a browser (webpage).
    *
    * e.g. a link to Netflix.
    */
  var externalUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The index of the video file within the torrent (from infoHash).
    *
    * If fileIdx is not specified, the largest file in the torrent will be selected.
    */
  var fileIdx: js.UndefOr[Double] = js.undefined
  
  /**
    * Info hash of a torrent file, and fileIdx is the index of the video file within the torrent.
    *
    * If fileIdx is not specified, the largest file in the torrent will be selected.
    */
  var infoHash: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the stream
    *
    * Usually a short name to identify the addon that provided the stream
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Array of Subtitle objects representing subtitles for this stream.
    */
  var subtitles: js.UndefOr[js.Array[Subtitle]] = js.undefined
  
  /**
    * Title of the stream
    *
    * Usually used for stream quality.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Direct URL to a video stream - http, https, rtmp protocols are supported.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Youtube video ID, plays using the built-in YouTube player.
    */
  var ytId: js.UndefOr[String] = js.undefined
}
object Stream {
  
  inline def apply(): Stream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stream]
  }
  
  extension [Self <: Stream](x: Self) {
    
    inline def setBehaviorHints(value: CountryWhitelist): Self = StObject.set(x, "behaviorHints", value.asInstanceOf[js.Any])
    
    inline def setBehaviorHintsUndefined: Self = StObject.set(x, "behaviorHints", js.undefined)
    
    inline def setExternalUrl(value: String): Self = StObject.set(x, "externalUrl", value.asInstanceOf[js.Any])
    
    inline def setExternalUrlUndefined: Self = StObject.set(x, "externalUrl", js.undefined)
    
    inline def setFileIdx(value: Double): Self = StObject.set(x, "fileIdx", value.asInstanceOf[js.Any])
    
    inline def setFileIdxUndefined: Self = StObject.set(x, "fileIdx", js.undefined)
    
    inline def setInfoHash(value: String): Self = StObject.set(x, "infoHash", value.asInstanceOf[js.Any])
    
    inline def setInfoHashUndefined: Self = StObject.set(x, "infoHash", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubtitles(value: js.Array[Subtitle]): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
    
    inline def setSubtitlesUndefined: Self = StObject.set(x, "subtitles", js.undefined)
    
    inline def setSubtitlesVarargs(value: Subtitle*): Self = StObject.set(x, "subtitles", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setYtId(value: String): Self = StObject.set(x, "ytId", value.asInstanceOf[js.Any])
    
    inline def setYtIdUndefined: Self = StObject.set(x, "ytId", js.undefined)
  }
}
