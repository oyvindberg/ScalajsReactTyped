package typingsJapgolly.winrt.Windows.System

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILauncherStatics extends StObject {
  
  def launchFileAsync(file: IStorageFile): IAsyncOperation[Boolean] = js.native
  def launchFileAsync(file: IStorageFile, options: LauncherOptions): IAsyncOperation[Boolean] = js.native
  
  def launchUriAsync(uri: Uri): IAsyncOperation[Boolean] = js.native
  def launchUriAsync(uri: Uri, options: LauncherOptions): IAsyncOperation[Boolean] = js.native
}
