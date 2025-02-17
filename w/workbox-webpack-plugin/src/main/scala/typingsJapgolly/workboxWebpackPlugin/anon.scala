package typingsJapgolly.workboxWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.workboxWebpackPlugin.mod.ManifestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ChannelName extends StObject {
    
    var channelName: js.UndefOr[String] = js.undefined
  }
  object ChannelName {
    
    inline def apply(): ChannelName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelName]
    }
    
    extension [Self <: ChannelName](x: Self) {
      
      inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    /**
      * Only cache responses with headers which match this map.
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Only cache responses with HTTP code(s) listed.
      */
    var statuses: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatuses(value: js.Array[Double]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
      
      inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
      
      inline def setStatusesVarargs(value: Double*): Self = StObject.set(x, "statuses", js.Array(value*))
    }
  }
  
  trait Integrity extends StObject {
    
    /** Integrity metadata that will be used when making the network request for the URL. */
    var integrity: js.UndefOr[String] = js.undefined
    
    /** The revision details for the file. This is a hash generated by node based on the file contents. */
    var revision: js.UndefOr[String] = js.undefined
    
    /** The URL to the asset in the manifest. */
    var url: String
  }
  object Integrity {
    
    inline def apply(url: String): Integrity = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Integrity]
    }
    
    extension [Self <: Integrity](x: Self) {
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Manifest extends StObject {
    
    var manifest: js.Array[ManifestEntry]
    
    var warnings: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Manifest {
    
    inline def apply(manifest: js.Array[ManifestEntry]): Manifest = {
      val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Manifest]
    }
    
    extension [Self <: Manifest](x: Self) {
      
      inline def setManifest(value: js.Array[ManifestEntry]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestVarargs(value: ManifestEntry*): Self = StObject.set(x, "manifest", js.Array(value*))
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait MaxAgeSeconds extends StObject {
    
    /**
      * Cache will only hold entries for X seconds.
      */
    var maxAgeSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * Cache will only hold X entries.
      */
    var maxEntries: js.UndefOr[Double] = js.undefined
  }
  object MaxAgeSeconds {
    
    inline def apply(): MaxAgeSeconds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxAgeSeconds]
    }
    
    extension [Self <: MaxAgeSeconds](x: Self) {
      
      inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
      
      inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
    }
  }
  
  trait MaxRetentionTime extends StObject {
    
    var maxRetentionTime: Double
  }
  object MaxRetentionTime {
    
    inline def apply(maxRetentionTime: Double): MaxRetentionTime = {
      val __obj = js.Dynamic.literal(maxRetentionTime = maxRetentionTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxRetentionTime]
    }
    
    extension [Self <: MaxRetentionTime](x: Self) {
      
      inline def setMaxRetentionTime(value: Double): Self = StObject.set(x, "maxRetentionTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var options: js.UndefOr[MaxRetentionTime] = js.undefined
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: MaxRetentionTime): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
