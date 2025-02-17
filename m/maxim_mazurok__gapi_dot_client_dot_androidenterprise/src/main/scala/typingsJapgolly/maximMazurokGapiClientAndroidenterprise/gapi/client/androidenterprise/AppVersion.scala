package typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppVersion extends StObject {
  
  /** True if this version is a production APK. */
  var isProduction: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated, use trackId instead. */
  var track: js.UndefOr[String] = js.undefined
  
  /** Track ids that the app version is published in. Replaces the track field (deprecated), but doesn't include the production track (see isProduction instead). */
  var trackId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Unique increasing identifier for the app version. */
  var versionCode: js.UndefOr[Double] = js.undefined
  
  /** The string used in the Play store by the app developer to identify the version. The string is not necessarily unique or localized (for example, the string could be "1.4"). */
  var versionString: js.UndefOr[String] = js.undefined
}
object AppVersion {
  
  inline def apply(): AppVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppVersion]
  }
  
  extension [Self <: AppVersion](x: Self) {
    
    inline def setIsProduction(value: Boolean): Self = StObject.set(x, "isProduction", value.asInstanceOf[js.Any])
    
    inline def setIsProductionUndefined: Self = StObject.set(x, "isProduction", js.undefined)
    
    inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackId(value: js.Array[String]): Self = StObject.set(x, "trackId", value.asInstanceOf[js.Any])
    
    inline def setTrackIdUndefined: Self = StObject.set(x, "trackId", js.undefined)
    
    inline def setTrackIdVarargs(value: String*): Self = StObject.set(x, "trackId", js.Array(value*))
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    inline def setVersionString(value: String): Self = StObject.set(x, "versionString", value.asInstanceOf[js.Any])
    
    inline def setVersionStringUndefined: Self = StObject.set(x, "versionString", js.undefined)
  }
}
