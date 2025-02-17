package typingsJapgolly.naverWhale

import typingsJapgolly.naverWhale.chrome.downloads.StateType
import typingsJapgolly.naverWhale.whale.sidebarAction.BadgeBackgroundColorDetails
import typingsJapgolly.naverWhale.whale.sidebarAction.BrowserClickedEvent
import typingsJapgolly.naverWhale.whale.sidebarAction.ColorArray
import typingsJapgolly.naverWhale.whale.sidebarAction.SidebarBadgeDetail
import typingsJapgolly.naverWhale.whale.sidebarAction.SidebarDockDetail
import typingsJapgolly.naverWhale.whale.sidebarAction.SidebarIconDetail
import typingsJapgolly.naverWhale.whale.sidebarAction.SidebarPageDetail
import typingsJapgolly.naverWhale.whale.sidebarAction.SidebarShowDetail
import typingsJapgolly.naverWhale.whale.sidebarAction.SidebarTitleDetail
import typingsJapgolly.naverWhale.whale.topSites.MostVisitedURL
import typingsJapgolly.naverWhale.whale.topSites.MostVisitedURL2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Typeofdevtools extends StObject {
    
    ////////////////////
    // Dev Tools - Inspected Window
    ////////////////////
    /**
      * Use the chrome.devtools.inspectedWindow API to interact with the inspected window: obtain the tab ID for the inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of resources within the page.
      * Availability: Since Chrome 18.
      */
    val inspectedWindow: Any
    
    ////////////////////
    // Dev Tools - Network
    ////////////////////
    /**
      * Use the chrome.devtools.network API to retrieve the information about network requests displayed by the Developer Tools in the Network panel.
      * Availability: Since Chrome 18.
      */
    val network: Any
    
    ////////////////////
    // Dev Tools - Panels
    ////////////////////
    /**
      * Use the chrome.devtools.panels API to integrate your extension into Developer Tools window UI: create your own panels, access existing panels, and add sidebars.
      * Availability: Since Chrome 18.
      */
    val panels: Any
  }
  object Typeofdevtools {
    
    inline def apply(inspectedWindow: Any, network: Any, panels: Any): Typeofdevtools = {
      val __obj = js.Dynamic.literal(inspectedWindow = inspectedWindow.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofdevtools]
    }
    
    extension [Self <: Typeofdevtools](x: Self) {
      
      inline def setInspectedWindow(value: Any): Self = StObject.set(x, "inspectedWindow", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: Any): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setPanels(value: Any): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    }
  }
  
  trait Typeofdownloads extends StObject {
    
    val State: StateType
  }
  object Typeofdownloads {
    
    inline def apply(State: StateType): Typeofdownloads = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofdownloads]
    }
    
    extension [Self <: Typeofdownloads](x: Self) {
      
      inline def setState(value: StateType): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofsidebarAction extends StObject {
    
    def dock(popupWindowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
    def dock(
      popupWindowId: Double,
      details: SidebarDockDetail,
      callback: js.Function1[/* windowId */ Double, Unit]
    ): Unit = js.native
    
    def getBadgeBackgroundColor(callback: js.Function1[/* color */ ColorArray, Unit]): Unit = js.native
    
    def getBadgeText(callback: js.Function1[/* result */ String, Unit]): Unit = js.native
    
    def getPage(callback: js.Function1[/* result */ String, Unit]): Unit = js.native
    
    def getTitle(callback: js.Function1[/* result */ String, Unit]): Unit = js.native
    
    def hide(): Unit = js.native
    def hide(callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
    def hide(windowId: Double): Unit = js.native
    def hide(windowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
    
    var onClicked: BrowserClickedEvent = js.native
    
    def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = js.native
    
    def setBadgeText(details: SidebarBadgeDetail): Unit = js.native
    
    def setIcon(details: SidebarIconDetail): Unit = js.native
    
    def setPage(details: SidebarPageDetail): Unit = js.native
    
    def setTitle(details: SidebarTitleDetail): Unit = js.native
    
    def show(): Unit = js.native
    def show(callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
    def show(details: SidebarShowDetail): Unit = js.native
    def show(details: SidebarShowDetail, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
    def show(windowId: Double): Unit = js.native
    def show(windowId: Double, details: Unit, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
    def show(windowId: Double, details: SidebarShowDetail): Unit = js.native
    def show(windowId: Double, details: SidebarShowDetail, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
    
    def undock(popupWindowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  }
  
  trait Typeofsystem extends StObject {
    
    ////////////////////
    // System CPU
    ////////////////////
    /**
      * Use the system.cpu API to query CPU metadata.
      * Permissions: "system.cpu"
      * @since Chrome 32.
      */
    val cpu: Any
    
    ////////////////////
    // System Memory
    ////////////////////
    /**
      * The chrome.system.memory API.
      * Permissions:  "system.memory"
      * @since Chrome 32.
      */
    val memory: Any
    
    ////////////////////
    // System Storage
    ////////////////////
    /**
      * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
      * Permissions:  "system.storage"
      * @since Chrome 30.
      */
    val storage: Any
  }
  object Typeofsystem {
    
    inline def apply(cpu: Any, memory: Any, storage: Any): Typeofsystem = {
      val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofsystem]
    }
    
    extension [Self <: Typeofsystem](x: Self) {
      
      inline def setCpu(value: Any): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: Any): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setStorage(value: Any): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeoftopSites extends StObject {
    
    /**
      * 자주 가는 사이트에서 해당 url을 삭제합니다.
      * @param url 삭제할 url
      */
    def _delete(url: String): Unit = js.native
    /**
      * 자주 가는 사이트에서 해당 url을 삭제합니다.
      * @param url 삭제할 url
      */
    @JSName("_delete")
    var _delete_Original: js.Function1[/* url */ String, Unit] = js.native
    
    def add(url: String, title: String): Unit = js.native
    def add(url: String, title: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = js.native
    
    def block(url: String): Unit = js.native
    
    def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit = js.native
    
    def isBlocked(url: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = js.native
    
    def search(term: String, count: Double): Unit = js.native
    def search(term: String, count: Double, callback: js.Function1[/* result */ js.Array[MostVisitedURL2], Unit]): Unit = js.native
    
    def unblock(url: String): Unit = js.native
    
    def update(urls: js.Array[MostVisitedURL2]): Any = js.native
  }
  
  trait Typeofwhale extends StObject {
    
    ////////////////////
    // Alarms
    ////////////////////
    /**
      * Use the chrome.alarms API to schedule code to run periodically or at a specified time in the future.
      * Availability: Since Chrome 22.
      * Permissions:  "alarms"
      */
    val alarms: Any
    
    ////////////////////
    // Bookmarks
    ////////////////////
    /**
      * Use the chrome.bookmarks API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages, which you can use to create a custom Bookmark Manager page.
      * Availability: Since Chrome 5.
      * Permissions:  "bookmarks"
      */
    val bookmarks: Any
    
    ////////////////////
    // Browser Action
    ////////////////////
    /**
      * Use browser actions to put icons in the main Google Chrome toolbar, to the right of the address bar. In addition to its icon, a browser action can also have a tooltip, a badge, and a popup.
      * Availability: Since Chrome 5.
      * Manifest:  "browser_action": {...}
      */
    val browserAction: Any
    
    ////////////////////
    // Browsing Data
    ////////////////////
    /**
      * Use the chrome.browsingData API to remove browsing data from a user's local profile.
      * Availability: Since Chrome 19.
      * Permissions:  "browsingData"
      */
    val browsingData: Any
    
    ////////////////////
    // Commands
    ////////////////////
    /**
      * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to open the browser action or send a command to the extension.
      * Availability: Since Chrome 25.
      * Manifest:  "commands": {...}
      */
    val commands: Any
    
    ////////////////////
    // Content Settings
    ////////////////////
    /**
      * Use the chrome.contentSettings API to change settings that control whether websites can use features such as cookies, JavaScript, and plugins. More generally speaking, content settings allow you to customize Chrome's behavior on a per-site basis instead of globally.
      * Availability: Since Chrome 16.
      * Permissions:  "contentSettings"
      */
    val contentSettings: Any
    
    ////////////////////
    // Context Menus
    ////////////////////
    /**
      * Use the chrome.contextMenus API to add items to Google Chrome's context menu. You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages.
      * Availability: Since Chrome 6.
      * Permissions:  "contextMenus"
      */
    val contextMenus: Any
    
    ////////////////////
    // Cookies
    ////////////////////
    /**
      * Use the chrome.cookies API to query and modify cookies, and to be notified when they change.
      * Availability: Since Chrome 6.
      * Permissions:  "cookies", host permissions
      */
    val cookies: Any
    
    ////////////////////
    // Declarative Content
    ////////////////////
    /**
      * Use the chrome.declarativeContent API to take actions depending on the content of a page, without requiring permission to read the page's content.
      * Availability: Since Chrome 33.
      * Permissions:  "declarativeContent"
      */
    val declarativeContent: Any
    
    ////////////////////
    // DesktopCapture
    ////////////////////
    /**
      * Desktop Capture API that can be used to capture content of screen, individual windows or tabs.
      * Availability: Since Chrome 34.
      * Permissions:  "desktopCapture"
      */
    val desktopCapture: Any
    
    val devtools: Typeofdevtools
    
    val downloads: Typeofdownloads
    
    ////////////////////
    // Events
    ////////////////////
    /**
      * The chrome.events namespace contains common types used by APIs dispatching events to notify you when something interesting happens.
      * Availability: Since Chrome 21.
      */
    val events: Any
    
    ////////////////////
    // Extension
    ////////////////////
    /**
      * The chrome.extension API has utilities that can be used by any extension page. It includes support for exchanging messages between an extension and its content scripts or between extensions, as described in detail in Message Passing.
      * Availability: Since Chrome 5.
      */
    val `extension`: Any
    
    ////////////////////
    // Font Settings
    ////////////////////
    /**
      * Use the chrome.fontSettings API to manage Chrome's font settings.
      * Availability: Since Chrome 22.
      * Permissions:  "fontSettings"
      */
    val fontSettings: Any
    
    ////////////////////
    // Google Cloud Messaging
    ////////////////////
    /**
      * Use chrome.gcm to enable apps and extensions to send and receive messages through the Google Cloud Messaging Service.
      * Availability: Since Chrome 35.
      * Permissions:  "gcm"
      */
    val gcm: Any
    
    ////////////////////
    // History
    ////////////////////
    /**
      * Use the chrome.history API to interact with the browser's record of visited pages. You can add, remove, and query for URLs in the browser's history. To override the history page with your own version, see Override Pages.
      * Availability: Since Chrome 5.
      * Permissions:  "history"
      */
    val history: Any
    
    ////////////////////
    // i18n
    ////////////////////
    /**
      * Use the chrome.i18n infrastructure to implement internationalization across your whole app or extension.
      * @since Chrome 5.
      */
    val i18n: Any
    
    ////////////////////
    // Idle
    ////////////////////
    /**
      * Use the chrome.idle API to detect when the machine's idle state changes.
      * Permissions:  "idle"
      * @since Chrome 6.
      */
    val idle: Any
    
    ////////////////////
    // Management
    ////////////////////
    /**
      * The chrome.management API provides ways to manage the list of extensions/apps that are installed and running. It is particularly useful for extensions that override the built-in New Tab page.
      * Permissions:  "management"
      * @since Chrome 8.
      */
    val management: Any
    
    ////////////////////
    // Notifications
    // https://developer.chrome.com/extensions/notifications
    ////////////////////
    /**
      * Use the chrome.notifications API to create rich notifications using templates and show these notifications to users in the system tray.
      * Permissions:  "notifications"
      * @since Chrome 28.
      */
    val notifications: Any
    
    ////////////////////
    // Omnibox
    ////////////////////
    /**
      * The omnibox API allows you to register a keyword with Google Chrome's address bar, which is also known as the omnibox.
      * Manifest:  "omnibox": {...}
      * @since Chrome 9.
      */
    val omnibox: Any
    
    ////////////////////
    // Page Action
    ////////////////////
    /**
      * Use the chrome.pageAction API to put icons inside the address bar. Page actions represent actions that can be taken on the current page, but that aren't applicable to all pages.
      * Manifest:  "page_action": {...}
      * @since Chrome 5.
      */
    val pageAction: Any
    
    ////////////////////
    // Page Capture
    ////////////////////
    /**
      * Use the chrome.pageCapture API to save a tab as MHTML.
      * Permissions:  "pageCapture"
      * @since Chrome 18.
      */
    val pageCapture: Any
    
    ////////////////////
    // Permissions
    ////////////////////
    /**
      * Use the chrome.permissions API to request declared optional permissions at run time rather than install time, so users understand why the permissions are needed and grant only those that are necessary.
      * @since Chrome 16.
      */
    val permissions: Any
    
    ////////////////////
    // Power
    ////////////////////
    /**
      * Use the chrome.power API to override the system's power management features.
      * Permissions:  "power"
      * @since Chrome 27.
      */
    val power: Any
    
    ////////////////////
    // Printer Provider
    ////////////////////
    /**
      * The chrome.printerProvider API exposes events used by print manager to query printers controlled by extensions, to query their capabilities and to submit print jobs to these printers.
      * Permissions:  "printerProvider"
      * @since Chrome 44.
      */
    val printerProvider: Any
    
    ////////////////////
    // Privacy
    ////////////////////
    /**
      * Use the chrome.privacy API to control usage of the features in Chrome that can affect a user's privacy. This API relies on the ChromeSetting prototype of the type API for getting and setting Chrome's configuration.
      * Permissions:  "privacy"
      * The Chrome Privacy Whitepaper gives background detail regarding the features which this API can control.
      * @since Chrome 18.
      */
    val privacy: Any
    
    ////////////////////
    // Proxy
    ////////////////////
    /**
      * Use the chrome.proxy API to manage Chrome's proxy settings. This API relies on the ChromeSetting prototype of the type API for getting and setting the proxy configuration.
      * Permissions:  "proxy"
      * @since Chrome 13.
      */
    val proxy: Any
    
    ////////////////////
    // Runtime
    ////////////////////
    /**
      * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
      * @since Chrome 22
      */
    val runtime: Any
    
    val sidebarAction: TypeofsidebarAction
    
    ////////////////////
    // Storage
    ////////////////////
    /**
      * Use the chrome.storage API to store, retrieve, and track changes to user data.
      * Permissions:  "storage"
      * @since Chrome 20.
      */
    val storage: Any
    
    val system: Typeofsystem
    
    ////////////////////
    // TabCapture
    ////////////////////
    /**
      * Use the chrome.tabCapture API to interact with tab media streams.
      * Permissions:  "tabCapture"
      * @since Chrome 31.
      */
    val tabCapture: Any
    
    ////////////////////
    // Tabs
    ////////////////////
    /**
      * Use the chrome.tabs API to interact with the browser's tab system. You can use this API to create, modify, and rearrange tabs in the browser.
      * Permissions: The majority of the chrome.tabs API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab.
      * @since Chrome 5.
      */
    val tabs: Any
    
    val topSites: TypeoftopSites
    
    ////////////////////
    // Text to Speech
    ////////////////////
    /**
      * Use the chrome.tts API to play synthesized text-to-speech (TTS). See also the related ttsEngine API, which allows an extension to implement a speech engine.
      * Permissions:  "tts"
      * @since Chrome 14.
      */
    val tts: Any
    
    ////////////////////
    // Text to Speech Engine
    ////////////////////
    /**
      * Use the chrome.ttsEngine API to implement a text-to-speech(TTS) engine using an extension. If your extension registers using this API, it will receive events containing an utterance to be spoken and other parameters when any extension or Chrome App uses the tts API to generate speech. Your extension can then use any available web technology to synthesize and output the speech, and send events back to the calling function to report the status.
      * Permissions:  "ttsEngine"
      * @since Chrome 14.
      */
    val ttsEngine: Any
    
    ////////////////////
    // Types
    ////////////////////
    /**
      * The chrome.types API contains type declarations for Chrome.
      * @since Chrome 13.
      */
    val types: Any
    
    ////////////////////
    // Web Navigation
    ////////////////////
    /**
      * Use the chrome.webNavigation API to receive notifications about the status of navigation requests in-flight.
      * Permissions:  "webNavigation"
      * @since Chrome 16.
      */
    val webNavigation: Any
    
    ////////////////////
    // Web Request
    ////////////////////
    /**
      * Use the chrome.webRequest API to observe and analyze traffic and to intercept, block, or modify requests in-flight.
      * Permissions:  "webRequest", host permissions
      * @since Chrome 17.
      */
    val webRequest: Any
    
    ////////////////////
    // Windows
    ////////////////////
    /**
      * Use the chrome.windows API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
      * Permissions: The chrome.windows API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab objects.
      * @since Chrome 5.
      */
    val windows: Any
  }
  object Typeofwhale {
    
    inline def apply(
      alarms: Any,
      bookmarks: Any,
      browserAction: Any,
      browsingData: Any,
      commands: Any,
      contentSettings: Any,
      contextMenus: Any,
      cookies: Any,
      declarativeContent: Any,
      desktopCapture: Any,
      devtools: Typeofdevtools,
      downloads: Typeofdownloads,
      events: Any,
      `extension`: Any,
      fontSettings: Any,
      gcm: Any,
      history: Any,
      i18n: Any,
      idle: Any,
      management: Any,
      notifications: Any,
      omnibox: Any,
      pageAction: Any,
      pageCapture: Any,
      permissions: Any,
      power: Any,
      printerProvider: Any,
      privacy: Any,
      proxy: Any,
      runtime: Any,
      sidebarAction: TypeofsidebarAction,
      storage: Any,
      system: Typeofsystem,
      tabCapture: Any,
      tabs: Any,
      topSites: TypeoftopSites,
      tts: Any,
      ttsEngine: Any,
      types: Any,
      webNavigation: Any,
      webRequest: Any,
      windows: Any
    ): Typeofwhale = {
      val __obj = js.Dynamic.literal(alarms = alarms.asInstanceOf[js.Any], bookmarks = bookmarks.asInstanceOf[js.Any], browserAction = browserAction.asInstanceOf[js.Any], browsingData = browsingData.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], contentSettings = contentSettings.asInstanceOf[js.Any], contextMenus = contextMenus.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], declarativeContent = declarativeContent.asInstanceOf[js.Any], desktopCapture = desktopCapture.asInstanceOf[js.Any], devtools = devtools.asInstanceOf[js.Any], downloads = downloads.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], fontSettings = fontSettings.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], management = management.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], omnibox = omnibox.asInstanceOf[js.Any], pageAction = pageAction.asInstanceOf[js.Any], pageCapture = pageCapture.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], printerProvider = printerProvider.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sidebarAction = sidebarAction.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], tabCapture = tabCapture.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], topSites = topSites.asInstanceOf[js.Any], tts = tts.asInstanceOf[js.Any], ttsEngine = ttsEngine.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], webNavigation = webNavigation.asInstanceOf[js.Any], webRequest = webRequest.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofwhale]
    }
    
    extension [Self <: Typeofwhale](x: Self) {
      
      inline def setAlarms(value: Any): Self = StObject.set(x, "alarms", value.asInstanceOf[js.Any])
      
      inline def setBookmarks(value: Any): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
      
      inline def setBrowserAction(value: Any): Self = StObject.set(x, "browserAction", value.asInstanceOf[js.Any])
      
      inline def setBrowsingData(value: Any): Self = StObject.set(x, "browsingData", value.asInstanceOf[js.Any])
      
      inline def setCommands(value: Any): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setContentSettings(value: Any): Self = StObject.set(x, "contentSettings", value.asInstanceOf[js.Any])
      
      inline def setContextMenus(value: Any): Self = StObject.set(x, "contextMenus", value.asInstanceOf[js.Any])
      
      inline def setCookies(value: Any): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setDeclarativeContent(value: Any): Self = StObject.set(x, "declarativeContent", value.asInstanceOf[js.Any])
      
      inline def setDesktopCapture(value: Any): Self = StObject.set(x, "desktopCapture", value.asInstanceOf[js.Any])
      
      inline def setDevtools(value: Typeofdevtools): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      inline def setDownloads(value: Typeofdownloads): Self = StObject.set(x, "downloads", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: Any): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setFontSettings(value: Any): Self = StObject.set(x, "fontSettings", value.asInstanceOf[js.Any])
      
      inline def setGcm(value: Any): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: Any): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setI18n(value: Any): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setIdle(value: Any): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setManagement(value: Any): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
      
      inline def setNotifications(value: Any): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setOmnibox(value: Any): Self = StObject.set(x, "omnibox", value.asInstanceOf[js.Any])
      
      inline def setPageAction(value: Any): Self = StObject.set(x, "pageAction", value.asInstanceOf[js.Any])
      
      inline def setPageCapture(value: Any): Self = StObject.set(x, "pageCapture", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: Any): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPower(value: Any): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      
      inline def setPrinterProvider(value: Any): Self = StObject.set(x, "printerProvider", value.asInstanceOf[js.Any])
      
      inline def setPrivacy(value: Any): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: Any): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setSidebarAction(value: TypeofsidebarAction): Self = StObject.set(x, "sidebarAction", value.asInstanceOf[js.Any])
      
      inline def setStorage(value: Any): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setSystem(value: Typeofsystem): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setTabCapture(value: Any): Self = StObject.set(x, "tabCapture", value.asInstanceOf[js.Any])
      
      inline def setTabs(value: Any): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTopSites(value: TypeoftopSites): Self = StObject.set(x, "topSites", value.asInstanceOf[js.Any])
      
      inline def setTts(value: Any): Self = StObject.set(x, "tts", value.asInstanceOf[js.Any])
      
      inline def setTtsEngine(value: Any): Self = StObject.set(x, "ttsEngine", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: Any): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setWebNavigation(value: Any): Self = StObject.set(x, "webNavigation", value.asInstanceOf[js.Any])
      
      inline def setWebRequest(value: Any): Self = StObject.set(x, "webRequest", value.asInstanceOf[js.Any])
      
      inline def setWindows(value: Any): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    }
  }
}
