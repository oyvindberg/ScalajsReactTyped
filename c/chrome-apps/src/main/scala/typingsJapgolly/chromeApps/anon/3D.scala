package typingsJapgolly.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3D` extends StObject {
  
  /**
    * The '3D' requirement denotes GPU hardware acceleration.
    *
    * The 'webgl' requirement refers to the WebGL API.
    * For more information on Chrome 3D graphics support,
    * see the help article on WebGL and 3D graphics.
    * You can list the 3D-related features your app requires,
    * as demonstrated in the following example:
    * @example
    * 'requirements': {
    *   '3D': {
    *     'features': ['webgl']
    *   }
    * }
    */
  var `3D`: js.UndefOr[Features] = js.undefined
  
  /**
    * The 'plugins' requirement indicates if an app requires NPAPI to run.
    *
    * This requirement is enabled by default when the manifest includes the 'plugins' field.
    * For apps that still work when plugins aren't available,
    * you can disable this requirement by setting NPAPI to false.
    * You can also enable this requirement manually,
    * by setting NPAPI to true as shown in this example:
    * @example
    * 'requirements': {
    *   'plugins': {
    *     'npapi': true
    *   }
    * }
    */
  var plugins: js.UndefOr[Npapi] = js.undefined
}
object `3D` {
  
  inline def apply(): `3D` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3D`]
  }
  
  extension [Self <: `3D`](x: Self) {
    
    inline def set3D(value: Features): Self = StObject.set(x, "3D", value.asInstanceOf[js.Any])
    
    inline def set3DUndefined: Self = StObject.set(x, "3D", js.undefined)
    
    inline def setPlugins(value: Npapi): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
  }
}
