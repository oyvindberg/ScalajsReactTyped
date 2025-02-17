package typingsJapgolly.iobroker.objectsMod.global.ioBroker

import typingsJapgolly.iobroker.anon.Darwin
import typingsJapgolly.iobroker.anon.Faicon
import typingsJapgolly.iobroker.anon.PartialRecordLanguagesstr
import typingsJapgolly.iobroker.anon.RecordLanguagesstring
import typingsJapgolly.iobroker.iobrokerBooleans.`true`
import typingsJapgolly.iobroker.iobrokerStrings.JavascriptSlashNodeDotjs
import typingsJapgolly.iobroker.iobrokerStrings.assumption
import typingsJapgolly.iobroker.iobrokerStrings.cloud
import typingsJapgolly.iobroker.iobrokerStrings.darwin
import typingsJapgolly.iobroker.iobrokerStrings.linux
import typingsJapgolly.iobroker.iobrokerStrings.local
import typingsJapgolly.iobroker.iobrokerStrings.poll
import typingsJapgolly.iobroker.iobrokerStrings.push
import typingsJapgolly.iobroker.iobrokerStrings.win32
import typingsJapgolly.iobroker.mod.global.ioBroker.LogLevel
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdapterCommon
  extends StObject
     with ObjectCommon {
  
  /** Custom attributes to be shown in admin in the object browser */
  var adminColumns: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** Settings for custom Admin Tabs */
  var adminTab: js.UndefOr[Faicon] = js.undefined
  
  var allowInit: js.UndefOr[Boolean] = js.undefined
  
  /** Possible values for the instance mode (if more than one is possible) */
  var availableModes: js.UndefOr[js.Array[InstanceMode]] = js.undefined
  
  /** Whether this adapter includes custom blocks for Blockly. If true, `admin/blockly.js` must exist. */
  var blockly: js.UndefOr[Boolean] = js.undefined
  
  /** If true, this adapter can be started in compact mode (in the same process as other adpaters) */
  var compact: js.UndefOr[Boolean] = js.undefined
  
  /** Where the adapter will get its data from. Set this together with @see dataSource */
  var connectionType: js.UndefOr[local | cloud] = js.undefined
  
  // Make it possible to narrow the object type using the custom property
  var custom: Unit
  
  /** The directory relative to iobroker-data where the adapter stores the data. Supports the placeholder `%INSTANCE%`. This folder will be backed up and restored automatically. */
  var dataFolder: js.UndefOr[String] = js.undefined
  
  /** How the adapter will mainly receive its data. Set this together with @see connectionType */
  var dataSource: js.UndefOr[poll | push | assumption] = js.undefined
  
  /** A record of ioBroker adapters (including "js-controller") and version ranges which are required for this adapter. */
  var dependencies: js.UndefOr[js.Array[Record[String, String]]] = js.undefined
  
  /** Which files outside of the README.md have documentation for the adapter */
  var docs: js.UndefOr[PartialRecordLanguagesstr] = js.undefined
  
  /** Whether new instances should be enabled by default. *Should* be `false`! */
  var enabled: Boolean
  
  /** If true, all previous data in the target directory (web) should be deleted before uploading */
  var eraseOnUpload: js.UndefOr[Boolean] = js.undefined
  
  /** URL of an external icon that is shown for adapters that are not installed */
  var extIcon: js.UndefOr[String] = js.undefined
  
  /** Whether this adapter responds to `getHistory` messages */
  var getHistory: js.UndefOr[Boolean] = js.undefined
  
  /** Which version of this adapter is installed */
  var installedVersion: String
  
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @deprecated Use @see localLinks */
  var localLink: js.UndefOr[String] = js.undefined
  
  /** A dictionary of links to web services this adapter provides */
  var localLinks: js.UndefOr[Record[String, String]] = js.undefined
  
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  /** Whether this adapter receives logs from other hosts and adapters (e.g. to strore them somewhere) */
  var logTransporter: js.UndefOr[Boolean] = js.undefined
  
  /** Path to the start file of the adapter. Should be the same as in `package.json` */
  var main: js.UndefOr[String] = js.undefined
  
  /** Whether the admin configuration dialog is written in materialize style. Required for Admin 3+ */
  var materialize: Boolean
  
  /** Whether the admin tab is written in materialize style. Required for Admin 3+ */
  var materializeTab: Boolean
  
  /** If `true`, the object `system.adapter.<adaptername>.<adapterinstance>.messagebox will be created to send messages to the adapter (used for email, pushover, etc...) */
  var messagebox: js.UndefOr[`true`] = js.undefined
  
  var mode: InstanceMode
  
  /** Name of the adapter (without leading `ioBroker.`) */
  @JSName("name")
  var name_AdapterCommon: String
  
  /** If `true`, no configuration dialog will be shown */
  var noConfig: js.UndefOr[`true`] = js.undefined
  
  /** If `true`, this adapter's instances will not be shown in the admin overview screen. Useful for icon sets and widgets... */
  var noIntro: js.UndefOr[`true`] = js.undefined
  
  /** Set to `true` if the adapter is not available in the official ioBroker repositories. */
  var noRepository: js.UndefOr[`true`] = js.undefined
  
  /** If `true`, manual installation from GitHub is not possible */
  var nogit: js.UndefOr[`true`] = js.undefined
  
  /** If `true`, this adapter cannot be deleted or updated manually. */
  var nondeletable: js.UndefOr[`true`] = js.undefined
  
  /** If `true`, this "adapter" only contains HTML files and no main executable */
  var onlyWWW: js.UndefOr[Boolean] = js.undefined
  
  /** Which OSes this adapter supports */
  var os: js.UndefOr[linux | darwin | win32 | (js.Array[linux | darwin | win32])] = js.undefined
  
  /** Used to configure native (OS) dependencies of this adapter that need to be installed with system package manager before installing the adapter */
  var osDependencies: js.UndefOr[Darwin] = js.undefined
  
  var platform: JavascriptSlashNodeDotjs
  
  /** The keys of common attributes (e.g. `history`) which are not deleted in a `setObject` call even if they are not present. Deletion must be done explicitly by setting them to `null`. */
  var preserveSettings: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Which adapters must be restarted after installing or updating this adapter. */
  var restartAdapters: js.UndefOr[js.Array[String]] = js.undefined
  
  /** If the adapter runs in `schedule` mode, this contains the CRON */
  var schedule: js.UndefOr[String] = js.undefined
  
  var serviceStates: js.UndefOr[Boolean | String] = js.undefined
  
  /** Whether this adapter may only be installed once in the whole system */
  var singleton: js.UndefOr[Boolean] = js.undefined
  
  /** Whether this adapter may only be installed once per host */
  var singletonHost: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the adapter must be stopped before an update */
  var stopBeforeUpdate: js.UndefOr[Boolean] = js.undefined
  
  /** Overrides the default timeout that ioBroker will wait before force-stopping the adapter */
  var stopTimeout: js.UndefOr[Double] = js.undefined
  
  var subscribable: js.UndefOr[Boolean] = js.undefined
  
  var subscribe: js.UndefOr[Any] = js.undefined
  
  // ?
  /** If `true`, this adapter provides custom per-state settings. Requires a `custom_m.html` file in the `admin` directory. */
  var supportCustoms: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the adapter supports the signal stopInstance via messagebox */
  var supportStopInstance: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated The name of this adapter to be shown in the admin UI. Use @see titleLang instead. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The translated names of this adapter to be shown in the admin UI */
  var titleLang: js.UndefOr[RecordLanguagesstring] = js.undefined
  
  /** The type of this adapter */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** If `true`, the `npm` package must be installed with the `--unsafe-perm` flag */
  var unsafePerm: js.UndefOr[`true`] = js.undefined
  
  /** The available version in the ioBroker repo. */
  var version: String
  
  /** If `true`, the adapter will be started if any value is written into `system.adapter.<name>.<instance>.wakeup. Normally the adapter should stop after processing the event. */
  var wakeup: js.UndefOr[Boolean] = js.undefined
  
  /** Include the adapter version in the URL of the web adapter, e.g. `http://ip:port/1.2.3/material` instead of `http://ip:port/material` */
  var webByVersion: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the web server in this adapter can be extended with plugin/extensions */
  var webExtendable: js.UndefOr[Boolean] = js.undefined
  
  /** Relative path to a module that contains an extension for the web adapter. Use together with @see native.webInstance to configure which instances this affects */
  var webExtension: js.UndefOr[String] = js.undefined
  
  var webPreSettings: js.UndefOr[Any] = js.undefined
  
  // ?
  var webservers: js.UndefOr[Any] = js.undefined
  
  // ?
  /** A list of pages that should be shown on the "web" index page */
  var welcomeScreen: js.UndefOr[js.Array[WelcomeScreenEntry]] = js.undefined
  
  /** A list of pages that should be shown on the ioBroker cloud index page */
  var welcomeScreenPro: js.UndefOr[js.Array[WelcomeScreenEntry]] = js.undefined
  
  var wwwDontUpload: js.UndefOr[Boolean] = js.undefined
}
object AdapterCommon {
  
  inline def apply(
    custom: Unit,
    enabled: Boolean,
    installedVersion: String,
    materialize: Boolean,
    materializeTab: Boolean,
    mode: InstanceMode,
    name: String,
    version: String
  ): AdapterCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installedVersion = installedVersion.asInstanceOf[js.Any], materialize = materialize.asInstanceOf[js.Any], materializeTab = materializeTab.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = "Javascript/Node.js", version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdapterCommon]
  }
  
  extension [Self <: AdapterCommon](x: Self) {
    
    inline def setAdminColumns(value: js.Array[Any]): Self = StObject.set(x, "adminColumns", value.asInstanceOf[js.Any])
    
    inline def setAdminColumnsUndefined: Self = StObject.set(x, "adminColumns", js.undefined)
    
    inline def setAdminColumnsVarargs(value: Any*): Self = StObject.set(x, "adminColumns", js.Array(value*))
    
    inline def setAdminTab(value: Faicon): Self = StObject.set(x, "adminTab", value.asInstanceOf[js.Any])
    
    inline def setAdminTabUndefined: Self = StObject.set(x, "adminTab", js.undefined)
    
    inline def setAllowInit(value: Boolean): Self = StObject.set(x, "allowInit", value.asInstanceOf[js.Any])
    
    inline def setAllowInitUndefined: Self = StObject.set(x, "allowInit", js.undefined)
    
    inline def setAvailableModes(value: js.Array[InstanceMode]): Self = StObject.set(x, "availableModes", value.asInstanceOf[js.Any])
    
    inline def setAvailableModesUndefined: Self = StObject.set(x, "availableModes", js.undefined)
    
    inline def setAvailableModesVarargs(value: InstanceMode*): Self = StObject.set(x, "availableModes", js.Array(value*))
    
    inline def setBlockly(value: Boolean): Self = StObject.set(x, "blockly", value.asInstanceOf[js.Any])
    
    inline def setBlocklyUndefined: Self = StObject.set(x, "blockly", js.undefined)
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setConnectionType(value: local | cloud): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDataFolder(value: String): Self = StObject.set(x, "dataFolder", value.asInstanceOf[js.Any])
    
    inline def setDataFolderUndefined: Self = StObject.set(x, "dataFolder", js.undefined)
    
    inline def setDataSource(value: poll | push | assumption): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDependencies(value: js.Array[Record[String, String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: (Record[String, String])*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDocs(value: PartialRecordLanguagesstr): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEraseOnUpload(value: Boolean): Self = StObject.set(x, "eraseOnUpload", value.asInstanceOf[js.Any])
    
    inline def setEraseOnUploadUndefined: Self = StObject.set(x, "eraseOnUpload", js.undefined)
    
    inline def setExtIcon(value: String): Self = StObject.set(x, "extIcon", value.asInstanceOf[js.Any])
    
    inline def setExtIconUndefined: Self = StObject.set(x, "extIcon", js.undefined)
    
    inline def setGetHistory(value: Boolean): Self = StObject.set(x, "getHistory", value.asInstanceOf[js.Any])
    
    inline def setGetHistoryUndefined: Self = StObject.set(x, "getHistory", js.undefined)
    
    inline def setInstalledVersion(value: String): Self = StObject.set(x, "installedVersion", value.asInstanceOf[js.Any])
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setLocalLink(value: String): Self = StObject.set(x, "localLink", value.asInstanceOf[js.Any])
    
    inline def setLocalLinkUndefined: Self = StObject.set(x, "localLink", js.undefined)
    
    inline def setLocalLinks(value: Record[String, String]): Self = StObject.set(x, "localLinks", value.asInstanceOf[js.Any])
    
    inline def setLocalLinksUndefined: Self = StObject.set(x, "localLinks", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogTransporter(value: Boolean): Self = StObject.set(x, "logTransporter", value.asInstanceOf[js.Any])
    
    inline def setLogTransporterUndefined: Self = StObject.set(x, "logTransporter", js.undefined)
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setMaterialize(value: Boolean): Self = StObject.set(x, "materialize", value.asInstanceOf[js.Any])
    
    inline def setMaterializeTab(value: Boolean): Self = StObject.set(x, "materializeTab", value.asInstanceOf[js.Any])
    
    inline def setMessagebox(value: `true`): Self = StObject.set(x, "messagebox", value.asInstanceOf[js.Any])
    
    inline def setMessageboxUndefined: Self = StObject.set(x, "messagebox", js.undefined)
    
    inline def setMode(value: InstanceMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNoConfig(value: `true`): Self = StObject.set(x, "noConfig", value.asInstanceOf[js.Any])
    
    inline def setNoConfigUndefined: Self = StObject.set(x, "noConfig", js.undefined)
    
    inline def setNoIntro(value: `true`): Self = StObject.set(x, "noIntro", value.asInstanceOf[js.Any])
    
    inline def setNoIntroUndefined: Self = StObject.set(x, "noIntro", js.undefined)
    
    inline def setNoRepository(value: `true`): Self = StObject.set(x, "noRepository", value.asInstanceOf[js.Any])
    
    inline def setNoRepositoryUndefined: Self = StObject.set(x, "noRepository", js.undefined)
    
    inline def setNogit(value: `true`): Self = StObject.set(x, "nogit", value.asInstanceOf[js.Any])
    
    inline def setNogitUndefined: Self = StObject.set(x, "nogit", js.undefined)
    
    inline def setNondeletable(value: `true`): Self = StObject.set(x, "nondeletable", value.asInstanceOf[js.Any])
    
    inline def setNondeletableUndefined: Self = StObject.set(x, "nondeletable", js.undefined)
    
    inline def setOnlyWWW(value: Boolean): Self = StObject.set(x, "onlyWWW", value.asInstanceOf[js.Any])
    
    inline def setOnlyWWWUndefined: Self = StObject.set(x, "onlyWWW", js.undefined)
    
    inline def setOs(value: linux | darwin | win32 | (js.Array[linux | darwin | win32])): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsDependencies(value: Darwin): Self = StObject.set(x, "osDependencies", value.asInstanceOf[js.Any])
    
    inline def setOsDependenciesUndefined: Self = StObject.set(x, "osDependencies", js.undefined)
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setOsVarargs(value: (linux | darwin | win32)*): Self = StObject.set(x, "os", js.Array(value*))
    
    inline def setPlatform(value: JavascriptSlashNodeDotjs): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPreserveSettings(value: String | js.Array[String]): Self = StObject.set(x, "preserveSettings", value.asInstanceOf[js.Any])
    
    inline def setPreserveSettingsUndefined: Self = StObject.set(x, "preserveSettings", js.undefined)
    
    inline def setPreserveSettingsVarargs(value: String*): Self = StObject.set(x, "preserveSettings", js.Array(value*))
    
    inline def setRestartAdapters(value: js.Array[String]): Self = StObject.set(x, "restartAdapters", value.asInstanceOf[js.Any])
    
    inline def setRestartAdaptersUndefined: Self = StObject.set(x, "restartAdapters", js.undefined)
    
    inline def setRestartAdaptersVarargs(value: String*): Self = StObject.set(x, "restartAdapters", js.Array(value*))
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setServiceStates(value: Boolean | String): Self = StObject.set(x, "serviceStates", value.asInstanceOf[js.Any])
    
    inline def setServiceStatesUndefined: Self = StObject.set(x, "serviceStates", js.undefined)
    
    inline def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
    
    inline def setSingletonHost(value: Boolean): Self = StObject.set(x, "singletonHost", value.asInstanceOf[js.Any])
    
    inline def setSingletonHostUndefined: Self = StObject.set(x, "singletonHost", js.undefined)
    
    inline def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    
    inline def setStopBeforeUpdate(value: Boolean): Self = StObject.set(x, "stopBeforeUpdate", value.asInstanceOf[js.Any])
    
    inline def setStopBeforeUpdateUndefined: Self = StObject.set(x, "stopBeforeUpdate", js.undefined)
    
    inline def setStopTimeout(value: Double): Self = StObject.set(x, "stopTimeout", value.asInstanceOf[js.Any])
    
    inline def setStopTimeoutUndefined: Self = StObject.set(x, "stopTimeout", js.undefined)
    
    inline def setSubscribable(value: Boolean): Self = StObject.set(x, "subscribable", value.asInstanceOf[js.Any])
    
    inline def setSubscribableUndefined: Self = StObject.set(x, "subscribable", js.undefined)
    
    inline def setSubscribe(value: Any): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    
    inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    
    inline def setSupportCustoms(value: Boolean): Self = StObject.set(x, "supportCustoms", value.asInstanceOf[js.Any])
    
    inline def setSupportCustomsUndefined: Self = StObject.set(x, "supportCustoms", js.undefined)
    
    inline def setSupportStopInstance(value: Boolean): Self = StObject.set(x, "supportStopInstance", value.asInstanceOf[js.Any])
    
    inline def setSupportStopInstanceUndefined: Self = StObject.set(x, "supportStopInstance", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleLang(value: RecordLanguagesstring): Self = StObject.set(x, "titleLang", value.asInstanceOf[js.Any])
    
    inline def setTitleLangUndefined: Self = StObject.set(x, "titleLang", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnsafePerm(value: `true`): Self = StObject.set(x, "unsafePerm", value.asInstanceOf[js.Any])
    
    inline def setUnsafePermUndefined: Self = StObject.set(x, "unsafePerm", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWakeup(value: Boolean): Self = StObject.set(x, "wakeup", value.asInstanceOf[js.Any])
    
    inline def setWakeupUndefined: Self = StObject.set(x, "wakeup", js.undefined)
    
    inline def setWebByVersion(value: Boolean): Self = StObject.set(x, "webByVersion", value.asInstanceOf[js.Any])
    
    inline def setWebByVersionUndefined: Self = StObject.set(x, "webByVersion", js.undefined)
    
    inline def setWebExtendable(value: Boolean): Self = StObject.set(x, "webExtendable", value.asInstanceOf[js.Any])
    
    inline def setWebExtendableUndefined: Self = StObject.set(x, "webExtendable", js.undefined)
    
    inline def setWebExtension(value: String): Self = StObject.set(x, "webExtension", value.asInstanceOf[js.Any])
    
    inline def setWebExtensionUndefined: Self = StObject.set(x, "webExtension", js.undefined)
    
    inline def setWebPreSettings(value: Any): Self = StObject.set(x, "webPreSettings", value.asInstanceOf[js.Any])
    
    inline def setWebPreSettingsUndefined: Self = StObject.set(x, "webPreSettings", js.undefined)
    
    inline def setWebservers(value: Any): Self = StObject.set(x, "webservers", value.asInstanceOf[js.Any])
    
    inline def setWebserversUndefined: Self = StObject.set(x, "webservers", js.undefined)
    
    inline def setWelcomeScreen(value: js.Array[WelcomeScreenEntry]): Self = StObject.set(x, "welcomeScreen", value.asInstanceOf[js.Any])
    
    inline def setWelcomeScreenPro(value: js.Array[WelcomeScreenEntry]): Self = StObject.set(x, "welcomeScreenPro", value.asInstanceOf[js.Any])
    
    inline def setWelcomeScreenProUndefined: Self = StObject.set(x, "welcomeScreenPro", js.undefined)
    
    inline def setWelcomeScreenProVarargs(value: WelcomeScreenEntry*): Self = StObject.set(x, "welcomeScreenPro", js.Array(value*))
    
    inline def setWelcomeScreenUndefined: Self = StObject.set(x, "welcomeScreen", js.undefined)
    
    inline def setWelcomeScreenVarargs(value: WelcomeScreenEntry*): Self = StObject.set(x, "welcomeScreen", js.Array(value*))
    
    inline def setWwwDontUpload(value: Boolean): Self = StObject.set(x, "wwwDontUpload", value.asInstanceOf[js.Any])
    
    inline def setWwwDontUploadUndefined: Self = StObject.set(x, "wwwDontUpload", js.undefined)
  }
}
