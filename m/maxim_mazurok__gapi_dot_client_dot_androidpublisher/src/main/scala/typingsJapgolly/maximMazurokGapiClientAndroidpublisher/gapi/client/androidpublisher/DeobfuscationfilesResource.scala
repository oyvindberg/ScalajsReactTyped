package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.ApkVersionCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeobfuscationfilesResource extends StObject {
  
  /** Uploads a new deobfuscation file and attaches to the specified APK. */
  def upload(): Request[DeobfuscationFilesUploadResponse] = js.native
  def upload(request: ApkVersionCode): Request[DeobfuscationFilesUploadResponse] = js.native
}
