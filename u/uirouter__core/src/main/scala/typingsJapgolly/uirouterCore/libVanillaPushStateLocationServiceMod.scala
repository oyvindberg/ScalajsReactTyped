package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.libCommonCoreservicesMod.LocationConfig
import typingsJapgolly.uirouterCore.libRouterMod.UIRouter
import typingsJapgolly.uirouterCore.libVanillaBaseLocationServiceMod.BaseLocationServices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVanillaPushStateLocationServiceMod {
  
  @JSImport("@uirouter/core/lib/vanilla/pushStateLocationService", "PushStateLocationService")
  @js.native
  open class PushStateLocationService protected () extends BaseLocationServices {
    def this(router: UIRouter) = this()
    
    var _config: LocationConfig = js.native
    
    /**
      * Gets the base prefix without:
      * - trailing slash
      * - trailing filename
      * - protocol and hostname
      *
      * If <base href='/base/'>, this returns '/base'.
      * If <base href='/foo/base/'>, this returns '/foo/base'.
      * If <base href='/base/index.html'>, this returns '/base'.
      * If <base href='http://localhost:8080/base/index.html'>, this returns '/base'.
      * If <base href='/base'>, this returns ''.
      * If <base href='http://localhost:8080'>, this returns ''.
      * If <base href='http://localhost:8080/'>, this returns ''.
      *
      * See: https://html.spec.whatwg.org/dev/semantics.html#the-base-element
      */
    /* private */ var _getBasePrefix: Any = js.native
  }
}
