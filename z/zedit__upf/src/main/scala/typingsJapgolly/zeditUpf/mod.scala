package typingsJapgolly.zeditUpf

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.electron.Electron.CrossProcessExports.FileFilter
import typingsJapgolly.fsJetpack.typesMod.FSJetpack
import typingsJapgolly.xelib.mod.FileHandle
import typingsJapgolly.xelib.mod.GameMode
import typingsJapgolly.xelib.mod.RecordHandle
import typingsJapgolly.xelib.mod.XELib
import typingsJapgolly.zeditUpf.anon.Controller
import typingsJapgolly.zeditUpf.anon.Execute
import typingsJapgolly.zeditUpf.anon.Load
import typingsJapgolly.zeditUpf.anon.Patch
import typingsJapgolly.zeditUpf.anon.Records
import typingsJapgolly.zeditUpf.anon.RequiredFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * UPF modules have these variables exposed globally:
    *
    * registerPatcher, fh, info, patcherPath, patcherUrl, xelib
    * @see {@link https://z-edit.github.io#/docs?t=Modules%2FPatcher_Modules}
    */
  object global {
    
    /**
      * @see FileHelpers
      */
    @JSGlobal("fh")
    @js.native
    val fh: FileHelpers = js.native
    
    /**
      * Object containing information about your module.
      * Basically just your module.json.
      */
    @JSGlobal("info")
    @js.native
    val info: ModuleInfo = js.native
    
    /**
      * The zEdit angular application.
      *
      * @see {@link https://docs.angularjs.org/api/ng/type/angular.Module}
      * @see {@link https://docs.angularjs.org/guide/di}
      */
    @JSGlobal("ngapp")
    @js.native
    val ngapp: js.Object = js.native
    
    /**
      * Absolute path for the folder where your patcher module is installed on the user's machine.
      * Should be prepended to paths when loading/saving files.
      */
    @JSGlobal("patcherPath")
    @js.native
    val patcherPath: String = js.native
    
    /**
      * `file://` URL for the folder where your patcher module is installed on the user's machine.
      * Should be prepended to any HTML template/resource URLs.
      */
    @JSGlobal("patcherUrl")
    @js.native
    val patcherUrl: String = js.native
    
    /**
      * @deprecated The Patcher used in this call contains deprecated option types
      * @see LegacyPatcher
      */
    // tslint:disable-next-line no-unnecessary-generics
    inline def registerPatcher[L /* <: js.Object */, S /* <: js.Object */](patcher: LegacyPatcher[S, L]): Unit = js.Dynamic.global.applyDynamic("registerPatcher")(patcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /**
      * Function for registering a patcher with UPF
      *
      * Generics are needed for inference within Patcher interface to work
      */
    // tslint:disable-next-line no-unnecessary-generics unified-signatures
    inline def registerPatcher[L /* <: js.Object */, S /* <: js.Object */](patcher: Patcher[S, L]): Unit = js.Dynamic.global.applyDynamic("registerPatcher")(patcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * xelib wrapper instance exposed to zEdit modules
      *
      * @see XELib
      */
    @JSGlobal("xelib")
    @js.native
    val xelib: XELibModule = js.native
  }
  
  type ExectuteCTX[S, L] = js.Tuple4[FileHandle, Helpers, S, L]
  
  trait Executor[S, L] extends StObject {
    
    /**
      * Called after processing.
      * Can be used to perform any cleanup/final steps
      * once your patcher has finished executing.
      *
      * Note that UPF automatically removes ITPO records and unused masters,
      * so you don't need to do that here.
      */
    @JSName("finalize")
    var finalize_FExecutor: js.UndefOr[js.Function1[/* args */ ExectuteCTX[S, L], Unit]] = js.undefined
    
    /**
      * Perform anything that needs to be done once at the beginning of the
      * patcher's execution here.
      * This can be used to cache records which don't need to be patched,
      * but need to be referred to later on.  Store values
      */
    var initialize: js.UndefOr[js.Function1[/* args */ ExectuteCTX[S, L], Unit]] = js.undefined
    
    /**
      * Array of process blocks.
      *
      * The blocks are run sequentially
      */
    var process: js.Array[ProcessBlock[S, L]]
  }
  object Executor {
    
    inline def apply[S, L](process: js.Array[ProcessBlock[S, L]]): Executor[S, L] = {
      val __obj = js.Dynamic.literal(process = process.asInstanceOf[js.Any])
      __obj.asInstanceOf[Executor[S, L]]
    }
    
    extension [Self <: Executor[?, ?], S, L](x: Self & (Executor[S, L])) {
      
      inline def setFinalize_(value: /* args */ ExectuteCTX[S, L] => Callback): Self = StObject.set(x, "finalize", js.Any.fromFunction1((t0: /* args */ ExectuteCTX[S, L]) => value(t0).runNow()))
      
      inline def setFinalize_Undefined: Self = StObject.set(x, "finalize", js.undefined)
      
      inline def setInitialize(value: /* args */ ExectuteCTX[S, L] => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction1((t0: /* args */ ExectuteCTX[S, L]) => value(t0).runNow()))
      
      inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      inline def setProcess(value: js.Array[ProcessBlock[S, L]]): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setProcessVarargs(value: (ProcessBlock[S, L])*): Self = StObject.set(x, "process", js.Array(value*))
    }
  }
  
  @js.native
  trait FileHelpers extends StObject {
    
    /**
      * `fs-jetpack` instance with current working directory set to `appPath`.
      */
    var appDir: FSJetpack = js.native
    
    /**
      * Path to the application resource directory.
      * In a development environment this is just `.\app`,
      * but in production it is `.\resources\app.asar\app`.
      */
    var appPath: String = js.native
    
    /**
      * Extracts the ZIP archive at `filePath` to `destDir`.
      */
    def extractArchive(filePath: String, destDir: String): Unit = js.native
    def extractArchive(filePath: String, destDir: String, /**
      * @default false
      */
    empty: Boolean): Unit = js.native
    
    /**
      * Converts the input the `file://`` URL to a path.
      */
    def fileUrlToPath(fileUrl: String): String = js.native
    
    /**
      * @returns Date modified for the file at `filePath`.
      */
    def getDateModified(filePath: String): js.Date = js.native
    
    /**
      * @returns array of paths for all directories in the folder at `path`.
      */
    def getDirectories(path: String): js.Array[String] = js.native
    
    /**
      * Extracts and returns the parent directory path from `filePath`.
      */
    def getDirectory(filePath: String): js.UndefOr[String] = js.native
    
    def getFileBase(filePath: String): js.UndefOr[String] = js.native
    
    /**
      * Extracts and returns the file extension from `filePath`.
      * Returns undefined if the path does not end with a file extension.
      */
    def getFileExt(filePath: String): js.UndefOr[String] = js.native
    
    /**
      * Extracts and returns the filename from `filePath`.
      */
    def getFileName(filePath: String): js.UndefOr[String] = js.native
    
    /**
      * `fs-jetpack` instance with current working directroy set to the application root directory.
      */
    var jetpack: FSJetpack = js.native
    
    /**
      * If a file exists at `filePath`, it's read into memory and deserialized into a JavaScript object or array, which is then returned.
      * If a file does not exist at the specified path the `defaultValue` is returned.
      */
    def loadJsonFile[T](filePath: String, defaultValue: T): JSONAble | T = js.native
    
    /**
      * If a file exists at `filePath`, its contents are read into memory as a UTF8 string and returned.
      * If a file does not exist at the specified path the `defaultValue` is returned.
      */
    def loadTextFile[T](filePath: String, defaultValue: T): String | T = js.native
    
    /**
      * Opens the file at `filePath` with the default program configured to open it.
      */
    def openFile(filePath: String): Unit = js.native
    
    /**
      * Opens `url` in the user's web browser.
      * The URI protocol must be included in the URL. (e.g. `https://...`)
      */
    def openUrl(url: String): Unit = js.native
    
    /**
      * Converts the input `path` to a `file://` URL.
      */
    def pathToFileUrl(path: String): String = js.native
    
    /**
      * @returns path to the file saved by the user.
      * @returns undefined if the user didn't choose to save a file.
      *
      * @see {@link https://github.com/electron/electron/blob/master/docs/api/dialog.md#dialogshowsavedialogbrowserwindow-options-callback}
      */
    def saveFile(title: String, defaultPath: String): js.UndefOr[String] = js.native
    def saveFile(title: String, defaultPath: String, /**
      * @default []
      */
    filters: js.Array[FileFilter]): js.UndefOr[String] = js.native
    
    /**
      * Serializes the object passed through `value` to the file at `filePath`.
      * Creates the file if missing, else overwrites it.
      */
    def saveJsonFile(filePath: String, value: JSONAble): Unit = js.native
    def saveJsonFile(filePath: String, value: JSONAble, /**
      * @default false
      */
    minify: Boolean): Unit = js.native
    
    /**
      * Writes the text value to the file at `filePath`.
      * Creates the file if missing, else overwrites it.
      */
    def saveTextFile(filePath: String, value: String): Unit = js.native
    def saveTextFile(filePath: String, value: String, /**
      * @default utf8
      */
    encoding: String): Unit = js.native
    
    /**
      * @returns path to the directory selected by the user.
      * @returns undefined if the user didn't select a directory.
      */
    def selectDirectory(title: String): js.UndefOr[String] = js.native
    def selectDirectory(title: String, defaultPath: String): js.UndefOr[String] = js.native
    
    /**
      * @returns path to the file selected by the user.
      * @returns undefined if the user didn't select a file.
      *
      * @see {@link https://github.com/electron/electron/blob/master/docs/api/dialog.md#dialogshowopendialogbrowserwindow-options-callback}
      */
    def selectFile(title: String, defaultPath: String): js.UndefOr[String] = js.native
    def selectFile(title: String, defaultPath: String, /**
      * @default []
      */
    filters: js.Array[FileFilter]): js.UndefOr[String] = js.native
    
    /**
      * `fs-jetpack` instance with current working directory set to `userPath`.
      */
    var userDir: FSJetpack = js.native
    
    /**
      * Path to the application user data directory.
      * In a development environment this is located at `%appdata%\zEdit (Development)`,
      * and in production this is `%appdata%\zEdit`.
      */
    var userPath: String = js.native
  }
  
  @js.native
  trait Helpers extends StObject {
    
    /**
      * Uses record consistency caching to make certain the input record
      * stays at the same Form ID when the patch gets regenerated.
      * This function should be used on all records created by UPF patchers,
      * excluding overrides.
      * The id should be a unique string value for the record.
      * It is recommended to use a unique prefix for id to avoid collisions
      * with other patchers.
      * The record's editor ID will be set to id if the record
      * has an Editor ID field.
      */
    def cacheRecord(record: RecordHandle, id: String): RecordHandle = js.native
    
    /**
      * Load records from the files your patcher is targeting.
      */
    def loadRecords(search: String): js.Array[RecordHandle] = js.native
    def loadRecords(search: String, /**
      * @default false
      */
    includeOverride: Boolean): js.Array[RecordHandle] = js.native
    
    /**
      * Call this function to print a message to the progress modal's log.
      */
    def logMessage(message: String): Unit = js.native
  }
  
  type JSONAble = Double | Boolean | String | Null | js.Array[Any] | StringDictionary[Any]
  
  type LegacyPatcher[S /* <: js.Object */, L /* <: js.Object */] = (RequiredFiles & (Patcher[S, L])) | ((Execute[S, L]) & (Patcher[S, L]))
  
  trait ModuleInfo extends StObject {
    
    /**
      * The author(s) of the module.
      */
    var author: String
    
    /**
      * boolean specifying whether or not the module can be hot loaded.
      * Hot loading is when a module is loaded after zEdit has started.
      * Modules cannot be hot loaded if they use `ngapp`.
      *
      * @default false
      */
    var canHotLoad: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Short description of the module.
      */
    var description: String
    
    /**
      * The module's unique identifier.
      */
    var id: String
    
    /**
      * string specifying the module loader your module should be loaded with.
      *
      * @default default
      */
    var moduleLoader: js.UndefOr[String] = js.undefined
    
    /**
      * The module's display name.
      * This is the name displayed in the Manage Extensions Modal.
      */
    var name: String
    
    /**
      * `MM/DD/YYYY` date string corresponding to when the module was initially released.
      */
    var released: String
    
    /**
      * array of the module id strings which your module requires to function properly.
      *
      * @default []
      */
    var requires: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * `MM/DD/YYYY` date string corresponding to when the module was last updated.
      */
    var updated: String
    
    /**
      * Version string for the module.
      */
    var version: String
  }
  object ModuleInfo {
    
    inline def apply(
      author: String,
      description: String,
      id: String,
      name: String,
      released: String,
      updated: String,
      version: String
    ): ModuleInfo = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleInfo]
    }
    
    extension [Self <: ModuleInfo](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setCanHotLoad(value: Boolean): Self = StObject.set(x, "canHotLoad", value.asInstanceOf[js.Any])
      
      inline def setCanHotLoadUndefined: Self = StObject.set(x, "canHotLoad", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setModuleLoader(value: String): Self = StObject.set(x, "moduleLoader", value.asInstanceOf[js.Any])
      
      inline def setModuleLoaderUndefined: Self = StObject.set(x, "moduleLoader", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReleased(value: String): Self = StObject.set(x, "released", value.asInstanceOf[js.Any])
      
      inline def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
      
      inline def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value*))
      
      inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Patcher[S /* <: js.Object */, L /* <: js.Object */] extends StObject {
    
    /**
      * This function gets called when your patcher is executed.
      *
      * @param patchFile Handle to patch file
      * @param settings @see defaultSettings
      * @param locals Store values to refer to them later in the patching process.
      */
    var execute: (js.Function1[/* args */ ExectuteCTX[S, L], Executor[S, L]]) | (Executor[S, L])
    
    /**
      * Array of the game modes your patcher works with
      */
    var gameModes: js.Array[GameMode]
    
    /**
      * You can program strict exclusions here.
      * These exclusions cannot be overridden by the user.
      * This function can be removed if you don't want to hard-exclude any files.
      */
    var getFilesToPatch: js.UndefOr[js.Function1[/* filenames */ js.Array[String], js.Array[String]]] = js.undefined
    
    /**
      * Your patcher module information.
      * You should use the `info` variable as the value here.
      */
    var info: ModuleInfo
    
    /**
      * Optional array of required filenames.
      * Can omit if empty.
      *
      * @default []
      */
    var requiredFiles: js.UndefOr[js.Function0[js.Array[String]] | js.Array[String]] = js.undefined
    
    var settings: Controller[S]
  }
  object Patcher {
    
    inline def apply[S /* <: js.Object */, L /* <: js.Object */](
      execute: (js.Function1[/* args */ ExectuteCTX[S, L], Executor[S, L]]) | (Executor[S, L]),
      gameModes: js.Array[GameMode],
      info: ModuleInfo,
      settings: Controller[S]
    ): Patcher[S, L] = {
      val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any], gameModes = gameModes.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Patcher[S, L]]
    }
    
    extension [Self <: Patcher[?, ?], S /* <: js.Object */, L /* <: js.Object */](x: Self & (Patcher[S, L])) {
      
      inline def setExecute(value: (js.Function1[/* args */ ExectuteCTX[S, L], Executor[S, L]]) | (Executor[S, L])): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
      
      inline def setExecuteFunction1(value: /* args */ ExectuteCTX[S, L] => Executor[S, L]): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setGameModes(value: js.Array[GameMode]): Self = StObject.set(x, "gameModes", value.asInstanceOf[js.Any])
      
      inline def setGameModesVarargs(value: GameMode*): Self = StObject.set(x, "gameModes", js.Array(value*))
      
      inline def setGetFilesToPatch(value: /* filenames */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "getFilesToPatch", js.Any.fromFunction1(value))
      
      inline def setGetFilesToPatchUndefined: Self = StObject.set(x, "getFilesToPatch", js.undefined)
      
      inline def setInfo(value: ModuleInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setRequiredFiles(value: js.Function0[js.Array[String]] | js.Array[String]): Self = StObject.set(x, "requiredFiles", value.asInstanceOf[js.Any])
      
      inline def setRequiredFilesCallbackTo(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "requiredFiles", value.toJsFn)
      
      inline def setRequiredFilesUndefined: Self = StObject.set(x, "requiredFiles", js.undefined)
      
      inline def setRequiredFilesVarargs(value: String*): Self = StObject.set(x, "requiredFiles", js.Array(value*))
      
      inline def setSettings(value: Controller[S]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  type ProcessBlock[S, L] = (Load & (Patch[S, L])) | ((Records[S, L]) & (Patch[S, L]))
  
  type XELibModule = XELib
}
