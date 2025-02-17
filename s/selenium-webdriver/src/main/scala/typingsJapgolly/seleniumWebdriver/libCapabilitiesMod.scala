package typingsJapgolly.seleniumWebdriver

import typingsJapgolly.seleniumWebdriver.mod.CreateSessionCapabilities
import typingsJapgolly.seleniumWebdriver.mod.ProxyConfig
import typingsJapgolly.seleniumWebdriver.mod.logging.Preferences
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCapabilitiesMod {
  
  @JSImport("selenium-webdriver/lib/capabilities", "Browser")
  @js.native
  val Browser: IBrowser = js.native
  
  @JSImport("selenium-webdriver/lib/capabilities", "Capabilities")
  @js.native
  // region Constructors
  /**
    * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
    *     capabilities to initialize this instance from.
    */
  open class Capabilities ()
    extends StObject
       with CreateSessionCapabilities {
    def this(other: js.Object) = this()
    def this(other: Capabilities) = this()
    def this(other: Map[String, Any]) = this()
    
    /**
      * Deletes an entry from this set of capabilities.
      *
      * @param {string} key the capability key to delete.
      */
    def delete(key: String): Boolean = js.native
    
    /**
      * @param {string} key The capability to return.
      * @return {*} The capability with the given key, or {@code null} if it has
      *     not been set.
      */
    def get(key: String): Any = js.native
    
    /**
      * @return {boolean} whether the session is configured to accept insecure
      *     TLS certificates.
      */
    def getAcceptInsecureCerts(): Boolean = js.native
    
    /**
      * @return {(UserPromptHandler|undefined)} the behavior pattern for responding
      *     to unhandled user prompts, or undefined if not set.
      */
    def getAlertBehavior(): js.UndefOr[String] = js.native
    
    /**
      * @return {(string|undefined)} the configured browser name, or undefined if
      *     not set.
      */
    def getBrowserName(): js.UndefOr[String] = js.native
    
    /**
      * @return {(string|undefined)} the configured browser version, or undefined
      *     if not set.
      */
    def getBrowserVersion(): js.UndefOr[String] = js.native
    
    /**
      * Returns the configured page load strategy.
      *
      * @return {(string|undefined)} the page load strategy.
      */
    def getPageLoadStrategy(): js.UndefOr[String] = js.native
    
    /**
      * @return {(string|undefined)} the configured platform or undefined if not
      *     set.
      */
    def getPlatform(): js.UndefOr[String] = js.native
    
    /**
      * @return {(proxy.Config|undefined)} the configured proxy settings, or
      *     undefined if not set.
      */
    def getProxy(): js.UndefOr[ProxyConfig] = js.native
    
    /**
      * @param {string} key The capability to check.
      * @return {boolean} Whether the specified capability is set.
      */
    def has(key: String): Boolean = js.native
    
    /**
      * @return {!Iterator<string>} an iterator of the keys set.
      */
    def keys(): IterableIterator[String] = js.native
    
    def merge(other: js.Object): Capabilities = js.native
    /**
      * Merges another set of capabilities into this instance.
      * @param {!(Capabilities|Map<String, ?>|Object<string, ?>)} other The other
      *     set of capabilities to merge.
      * @return {!Capabilities} A self reference.
      */
    def merge(other: Capabilities): Capabilities = js.native
    def merge(other: Map[String, Any]): Capabilities = js.native
    
    /**
      * @param {string} key The capability key.
      * @param {*} value The capability value.
      * @return {!Capabilities} A self reference.
      * @throws {TypeError} If the `key` is not a string.
      */
    def set(key: String, value: Any): Capabilities = js.native
    
    /**
      * Sets whether a WebDriver session should implicitly accept self-signed, or
      * other untrusted TLS certificates on navigation.
      *
      * @param {boolean} accept whether to accept insecure certs.
      * @return {!Capabilities} a self reference.
      */
    def setAcceptInsecureCerts(accept: Boolean): Capabilities = js.native
    
    /**
      * Sets the default action to take with an unexpected alert before returning
      * an error. If unspecified, WebDriver will default to
      * {@link UserPromptHandler.DISMISS_AND_NOTIFY}.
      *
      * @param {?UserPromptHandler} behavior The way WebDriver should respond to
      *     unhandled user prompts.
      * @return {!Capabilities} A self reference.
      */
    def setAlertBehavior(behavior: String): Capabilities = js.native
    
    /**
      * Sets the name of the target browser.
      *
      * @param {(Browser|string)} name the browser name.
      * @return {!Capabilities} a self reference.
      */
    def setBrowserName(name: String): Capabilities = js.native
    
    /**
      * Sets the desired version of the target browser.
      *
      * @param {string} version the desired version.
      * @return {!Capabilities} a self reference.
      */
    def setBrowserVersion(version: String): Capabilities = js.native
    
    def setLoggingPrefs(prefs: js.Object): Capabilities = js.native
    /**
      * Sets the logging preferences. Preferences may be specified as a
      * {@link ./logging.Preferences} instance, or as a map of log-type to
      * log-level.
      * @param {!(./logging.Preferences|Object<string>)} prefs The logging
      *     preferences.
      * @return {!Capabilities} A self reference.
      */
    def setLoggingPrefs(prefs: Preferences): Capabilities = js.native
    
    /**
      * Sets the desired page loading strategy for a new WebDriver session.
      *
      * @param {PageLoadStrategy} strategy the desired strategy.
      * @return {!Capabilities} a self reference.
      */
    def setPageLoadStrategy(strategy: String): Capabilities = js.native
    
    /**
      * Sets the target platform.
      *
      * @param {(Platform|string)} platform the target platform.
      * @return {!Capabilities} a self reference.
      */
    def setPlatform(platform: String): Capabilities = js.native
    
    /**
      * Sets the proxy configuration for this instance.
      * @param {proxy.Config} proxy The desired proxy configuration.
      * @return {!Capabilities} A self reference.
      */
    def setProxy(proxy: ProxyConfig): Capabilities = js.native
  }
  /* static members */
  object Capabilities {
    
    @JSImport("selenium-webdriver/lib/capabilities", "Capabilities")
    @js.native
    val ^ : js.Any = js.native
    
    // endregion
    // region Static Methods
    /**
      * @return {!Capabilities} A basic set of capabilities for Chrome.
      */
    inline def chrome(): Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("chrome")().asInstanceOf[Capabilities]
    
    /**
      * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
      */
    inline def edge(): Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("edge")().asInstanceOf[Capabilities]
    
    /**
      * @return {!Capabilities} A basic set of capabilities for Firefox.
      */
    inline def firefox(): Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("firefox")().asInstanceOf[Capabilities]
    
    /**
      * @return {!Capabilities} A basic set of capabilities for
      *     Internet Explorer.
      */
    inline def ie(): Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("ie")().asInstanceOf[Capabilities]
    
    /**
      * @return {!Capabilities} A basic set of capabilities for Safari.
      */
    inline def safari(): Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("safari")().asInstanceOf[Capabilities]
  }
  
  @JSImport("selenium-webdriver/lib/capabilities", "Capability")
  @js.native
  val Capability: ICapability = js.native
  
  @JSImport("selenium-webdriver/lib/capabilities", "PageLoadStrategy")
  @js.native
  val PageLoadStrategy: IPageLoadStrategy = js.native
  
  @JSImport("selenium-webdriver/lib/capabilities", "Platform")
  @js.native
  val Platform: IPlatform = js.native
  
  @JSImport("selenium-webdriver/lib/capabilities", "UserPromptHandler")
  @js.native
  val UserPromptHandler: IUserPromptHandler = js.native
  
  trait IBrowser extends StObject {
    
    var CHROME: String
    
    var EDGE: String
    
    var FIREFOX: String
    
    var IE: String
    
    var INTERNET_EXPLORER: String
    
    var SAFARI: String
  }
  object IBrowser {
    
    inline def apply(
      CHROME: String,
      EDGE: String,
      FIREFOX: String,
      IE: String,
      INTERNET_EXPLORER: String,
      SAFARI: String
    ): IBrowser = {
      val __obj = js.Dynamic.literal(CHROME = CHROME.asInstanceOf[js.Any], EDGE = EDGE.asInstanceOf[js.Any], FIREFOX = FIREFOX.asInstanceOf[js.Any], IE = IE.asInstanceOf[js.Any], INTERNET_EXPLORER = INTERNET_EXPLORER.asInstanceOf[js.Any], SAFARI = SAFARI.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBrowser]
    }
    
    extension [Self <: IBrowser](x: Self) {
      
      inline def setCHROME(value: String): Self = StObject.set(x, "CHROME", value.asInstanceOf[js.Any])
      
      inline def setEDGE(value: String): Self = StObject.set(x, "EDGE", value.asInstanceOf[js.Any])
      
      inline def setFIREFOX(value: String): Self = StObject.set(x, "FIREFOX", value.asInstanceOf[js.Any])
      
      inline def setIE(value: String): Self = StObject.set(x, "IE", value.asInstanceOf[js.Any])
      
      inline def setINTERNET_EXPLORER(value: String): Self = StObject.set(x, "INTERNET_EXPLORER", value.asInstanceOf[js.Any])
      
      inline def setSAFARI(value: String): Self = StObject.set(x, "SAFARI", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICapability extends StObject {
    
    /**
      * Indicates whether a WebDriver session implicitly trusts otherwise untrusted
      * and self-signed TLS certificates during navigation.
      */
    var ACCEPT_INSECURE_TLS_CERTS: String
    
    /**
      * The browser name. Common browser names are defined in the
      * {@link ./capabilities.Browser Browser} enum.
      */
    var BROWSER_NAME: String
    
    /** Identifies the browser version. */
    var BROWSER_VERSION: String
    
    /**
      * Key for the logging driver logging preferences.
      */
    var LOGGING_PREFS: String
    
    /**
      * Defines the session's
      * {@linkplain ./capabilities.PageLoadStrategy page loading strategy}.
      */
    var PAGE_LOAD_STRATEGY: String
    
    /**
      * Identifies the operating system of the endpoint node. Common values
      * recognized by the most WebDriver server implementations are predefined in
      * the {@link ./capabilities.Platform Platform} enum.
      */
    var PLATFORM_NAME: String
    
    /**
      * Describes the proxy configuration to use for a new WebDriver session.
      */
    var PROXY: String
    
    /**
      * Indicates whether the remote end supports all of the window resizing and
      * positioning commands:
      *
      * -  {@linkplain ./webdriver.Window#getRect Window.getRect()}
      * -  {@linkplain ./webdriver.Window#setRect Window.setRect()}
      * -  {@linkplain ./webdriver.Window#maximize Window.maximize()}
      * -  {@linkplain ./webdriver.Window#minimize Window.minimize()}
      * -  {@linkplain ./webdriver.Window#fullscreen Window.fullscreen()}
      */
    var SET_WINDOW_RECT: String
    
    /**
      * Describes the {@linkplain ./capabilities.Timeouts timeouts} imposed on
      * certain session operations.
      */
    var TIMEOUTS: String
    
    /**
      * Defines how a WebDriver session should
      * {@linkplain ./capabilities.UserPromptHandler respond} to unhandled user
      * prompts.
      */
    var UNHANDLED_PROMPT_BEHAVIOR: String
  }
  object ICapability {
    
    inline def apply(
      ACCEPT_INSECURE_TLS_CERTS: String,
      BROWSER_NAME: String,
      BROWSER_VERSION: String,
      LOGGING_PREFS: String,
      PAGE_LOAD_STRATEGY: String,
      PLATFORM_NAME: String,
      PROXY: String,
      SET_WINDOW_RECT: String,
      TIMEOUTS: String,
      UNHANDLED_PROMPT_BEHAVIOR: String
    ): ICapability = {
      val __obj = js.Dynamic.literal(ACCEPT_INSECURE_TLS_CERTS = ACCEPT_INSECURE_TLS_CERTS.asInstanceOf[js.Any], BROWSER_NAME = BROWSER_NAME.asInstanceOf[js.Any], BROWSER_VERSION = BROWSER_VERSION.asInstanceOf[js.Any], LOGGING_PREFS = LOGGING_PREFS.asInstanceOf[js.Any], PAGE_LOAD_STRATEGY = PAGE_LOAD_STRATEGY.asInstanceOf[js.Any], PLATFORM_NAME = PLATFORM_NAME.asInstanceOf[js.Any], PROXY = PROXY.asInstanceOf[js.Any], SET_WINDOW_RECT = SET_WINDOW_RECT.asInstanceOf[js.Any], TIMEOUTS = TIMEOUTS.asInstanceOf[js.Any], UNHANDLED_PROMPT_BEHAVIOR = UNHANDLED_PROMPT_BEHAVIOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICapability]
    }
    
    extension [Self <: ICapability](x: Self) {
      
      inline def setACCEPT_INSECURE_TLS_CERTS(value: String): Self = StObject.set(x, "ACCEPT_INSECURE_TLS_CERTS", value.asInstanceOf[js.Any])
      
      inline def setBROWSER_NAME(value: String): Self = StObject.set(x, "BROWSER_NAME", value.asInstanceOf[js.Any])
      
      inline def setBROWSER_VERSION(value: String): Self = StObject.set(x, "BROWSER_VERSION", value.asInstanceOf[js.Any])
      
      inline def setLOGGING_PREFS(value: String): Self = StObject.set(x, "LOGGING_PREFS", value.asInstanceOf[js.Any])
      
      inline def setPAGE_LOAD_STRATEGY(value: String): Self = StObject.set(x, "PAGE_LOAD_STRATEGY", value.asInstanceOf[js.Any])
      
      inline def setPLATFORM_NAME(value: String): Self = StObject.set(x, "PLATFORM_NAME", value.asInstanceOf[js.Any])
      
      inline def setPROXY(value: String): Self = StObject.set(x, "PROXY", value.asInstanceOf[js.Any])
      
      inline def setSET_WINDOW_RECT(value: String): Self = StObject.set(x, "SET_WINDOW_RECT", value.asInstanceOf[js.Any])
      
      inline def setTIMEOUTS(value: String): Self = StObject.set(x, "TIMEOUTS", value.asInstanceOf[js.Any])
      
      inline def setUNHANDLED_PROMPT_BEHAVIOR(value: String): Self = StObject.set(x, "UNHANDLED_PROMPT_BEHAVIOR", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPageLoadStrategy extends StObject {
    
    /**
      * Indicates WebDriver should wait for the document readiness state to
      * become "interactive" after navigation.
      */
    var EAGER: String
    
    /**
      * Indicates WebDriver should not wait on the document readiness state after a
      * navigation event.
      */
    var NONE: String
    
    /**
      * Indicates WebDriver should wait for the document readiness state to
      * be "complete" after navigation. This is the default page loading strategy.
      */
    var NORMAL: String
  }
  object IPageLoadStrategy {
    
    inline def apply(EAGER: String, NONE: String, NORMAL: String): IPageLoadStrategy = {
      val __obj = js.Dynamic.literal(EAGER = EAGER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageLoadStrategy]
    }
    
    extension [Self <: IPageLoadStrategy](x: Self) {
      
      inline def setEAGER(value: String): Self = StObject.set(x, "EAGER", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: String): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setNORMAL(value: String): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPlatform extends StObject {
    
    var LINUX: String
    
    var MAC: String
    
    var WINDOWS: String
  }
  object IPlatform {
    
    inline def apply(LINUX: String, MAC: String, WINDOWS: String): IPlatform = {
      val __obj = js.Dynamic.literal(LINUX = LINUX.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], WINDOWS = WINDOWS.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlatform]
    }
    
    extension [Self <: IPlatform](x: Self) {
      
      inline def setLINUX(value: String): Self = StObject.set(x, "LINUX", value.asInstanceOf[js.Any])
      
      inline def setMAC(value: String): Self = StObject.set(x, "MAC", value.asInstanceOf[js.Any])
      
      inline def setWINDOWS(value: String): Self = StObject.set(x, "WINDOWS", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITimeouts extends StObject {
    
    /**
      * The maximum amount of time, in milliseconds, to spend attempting to
      * {@linkplain ./webdriver.IWebDriver#findElement locate} an element on the
      * current page.
      */
    var `implicit`: js.UndefOr[Double] = js.undefined
    
    /**
      * The timeout, in milliseconds, to apply to navigation events along with the
      * {@link PageLoadStrategy}.
      */
    var pageLoad: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines when, in milliseconds, to interrupt a script that is being
      * {@linkplain ./webdriver.IWebDriver#executeScript evaluated}.
      */
    var script: js.UndefOr[Double] = js.undefined
  }
  object ITimeouts {
    
    inline def apply(): ITimeouts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimeouts]
    }
    
    extension [Self <: ITimeouts](x: Self) {
      
      inline def setImplicit(value: Double): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
      
      inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
      
      inline def setPageLoad(value: Double): Self = StObject.set(x, "pageLoad", value.asInstanceOf[js.Any])
      
      inline def setPageLoadUndefined: Self = StObject.set(x, "pageLoad", js.undefined)
      
      inline def setScript(value: Double): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    }
  }
  
  trait IUserPromptHandler extends StObject {
    
    /** All prompts should be silently accepted. */
    var ACCEPT: String
    
    /**
      * All prompts should be automatically accepted, but an error should be
      * returned to the next (or currently executing) WebDriver command.
      */
    var ACCEPT_AND_NOTIFY: String
    
    /** All prompts should be silently dismissed. */
    var DISMISS: String
    
    /**
      * All prompts should be automatically dismissed, but an error should be
      * returned to the next (or currently executing) WebDriver command.
      */
    var DISMISS_AND_NOTIFY: String
    
    /** All prompts should be left unhandled. */
    var IGNORE: String
  }
  object IUserPromptHandler {
    
    inline def apply(
      ACCEPT: String,
      ACCEPT_AND_NOTIFY: String,
      DISMISS: String,
      DISMISS_AND_NOTIFY: String,
      IGNORE: String
    ): IUserPromptHandler = {
      val __obj = js.Dynamic.literal(ACCEPT = ACCEPT.asInstanceOf[js.Any], ACCEPT_AND_NOTIFY = ACCEPT_AND_NOTIFY.asInstanceOf[js.Any], DISMISS = DISMISS.asInstanceOf[js.Any], DISMISS_AND_NOTIFY = DISMISS_AND_NOTIFY.asInstanceOf[js.Any], IGNORE = IGNORE.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUserPromptHandler]
    }
    
    extension [Self <: IUserPromptHandler](x: Self) {
      
      inline def setACCEPT(value: String): Self = StObject.set(x, "ACCEPT", value.asInstanceOf[js.Any])
      
      inline def setACCEPT_AND_NOTIFY(value: String): Self = StObject.set(x, "ACCEPT_AND_NOTIFY", value.asInstanceOf[js.Any])
      
      inline def setDISMISS(value: String): Self = StObject.set(x, "DISMISS", value.asInstanceOf[js.Any])
      
      inline def setDISMISS_AND_NOTIFY(value: String): Self = StObject.set(x, "DISMISS_AND_NOTIFY", value.asInstanceOf[js.Any])
      
      inline def setIGNORE(value: String): Self = StObject.set(x, "IGNORE", value.asInstanceOf[js.Any])
    }
  }
}
