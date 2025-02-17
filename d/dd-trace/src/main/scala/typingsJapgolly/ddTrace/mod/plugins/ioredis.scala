package typingsJapgolly.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [ioredis](https://github.com/luin/ioredis) module.
  */
trait ioredis
  extends StObject
     with Instrumentation {
  
  /**
    * List of commands that should be instrumented.
    *
    * @default /^.*$/
    */
  var allowlist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
  ] = js.undefined
  
  /**
    * Deprecated in favor of `blocklist`.
    *
    * @deprecated
    * @hidden
    */
  var blacklist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
  ] = js.undefined
  
  /**
    * List of commands that should not be instrumented. Takes precedence over
    * allowlist if a command matches an entry in both.
    *
    * @default []
    */
  var blocklist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
  ] = js.undefined
  
  /**
    * Whether to use a different service name for each Redis instance based
    * on the configured connection name of the client.
    *
    * @default false
    */
  var splitByInstance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated in favor of `allowlist`.
    *
    * @deprecated
    * @hidden
    */
  var whitelist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
  ] = js.undefined
}
object ioredis {
  
  inline def apply(): ioredis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ioredis]
  }
  
  extension [Self <: ioredis](x: Self) {
    
    inline def setAllowlist(
      value: String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
    ): Self = StObject.set(x, "allowlist", value.asInstanceOf[js.Any])
    
    inline def setAllowlistFunction1(value: /* command */ String => Boolean): Self = StObject.set(x, "allowlist", js.Any.fromFunction1(value))
    
    inline def setAllowlistUndefined: Self = StObject.set(x, "allowlist", js.undefined)
    
    inline def setAllowlistVarargs(value: (String | js.RegExp | (js.Function1[/* command */ String, Boolean]))*): Self = StObject.set(x, "allowlist", js.Array(value*))
    
    inline def setBlacklist(
      value: String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
    ): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    inline def setBlacklistFunction1(value: /* command */ String => Boolean): Self = StObject.set(x, "blacklist", js.Any.fromFunction1(value))
    
    inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    inline def setBlacklistVarargs(value: (String | js.RegExp | (js.Function1[/* command */ String, Boolean]))*): Self = StObject.set(x, "blacklist", js.Array(value*))
    
    inline def setBlocklist(
      value: String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
    ): Self = StObject.set(x, "blocklist", value.asInstanceOf[js.Any])
    
    inline def setBlocklistFunction1(value: /* command */ String => Boolean): Self = StObject.set(x, "blocklist", js.Any.fromFunction1(value))
    
    inline def setBlocklistUndefined: Self = StObject.set(x, "blocklist", js.undefined)
    
    inline def setBlocklistVarargs(value: (String | js.RegExp | (js.Function1[/* command */ String, Boolean]))*): Self = StObject.set(x, "blocklist", js.Array(value*))
    
    inline def setSplitByInstance(value: Boolean): Self = StObject.set(x, "splitByInstance", value.asInstanceOf[js.Any])
    
    inline def setSplitByInstanceUndefined: Self = StObject.set(x, "splitByInstance", js.undefined)
    
    inline def setWhitelist(
      value: String | js.RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* command */ String, Boolean])])
    ): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistFunction1(value: /* command */ String => Boolean): Self = StObject.set(x, "whitelist", js.Any.fromFunction1(value))
    
    inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    inline def setWhitelistVarargs(value: (String | js.RegExp | (js.Function1[/* command */ String, Boolean]))*): Self = StObject.set(x, "whitelist", js.Array(value*))
  }
}
