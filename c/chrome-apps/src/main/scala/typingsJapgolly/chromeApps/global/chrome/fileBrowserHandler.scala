package typingsJapgolly.chromeApps.global.chrome

import typingsJapgolly.chromeApps.anon.Entries
import typingsJapgolly.chromeApps.chrome.fileBrowserHandler.FileBrowserHandleExecuteId
import typingsJapgolly.chromeApps.chrome.fileBrowserHandler.SelectFileParameters
import typingsJapgolly.chromeApps.chrome.fileBrowserHandler.SelectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.fileBrowserHandle
/////////////////////////
// File Browser Handle //
/////////////////////////
/**
  * @requires(CrOS) Chrome OS Only
  * @requires Permissions: 'fileBrowserHandler'
  * @requires Manifest: 'file_browser_handlers'
  * @description
  * Use the chrome.fileBrowserHandler API to extend the Chrome OS file browser.
  * For example, you can use this API to enable users to upload files to your website.
  * @see[Documentation]{@link https://developer.chrome.com/extensions/fileBrowserHandler}
  */
object fileBrowserHandler {
  
  @JSGlobal("chrome.fileBrowserHandler")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fired when file system action is executed from ChromeOS file browser.
    */
  @JSGlobal("chrome.fileBrowserHandler.onExecute")
  @js.native
  val onExecute: typingsJapgolly.chromeApps.chrome.events.Event[js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ Entries, Unit]] = js.native
  
  /**
    * Prompts user to select file path under which file should be saved.
    * When the file is selected, file access permission required to use
    * the file (read, write and create) are granted to the caller.
    * The file will not actually get created during the function call,
    * so function caller must ensure its existence before using it.
    * The function has to be invoked with a user gesture.
    * @param params Parameters that will be used while selecting the file.
    * @param callback Function called upon completion.
    */
  inline def selectFile(params: SelectFileParameters, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectFile")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
