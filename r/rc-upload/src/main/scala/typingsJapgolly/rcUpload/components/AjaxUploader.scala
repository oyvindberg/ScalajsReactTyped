package typingsJapgolly.rcUpload.components

import typingsJapgolly.rcUpload.esAjaxUploaderMod.default
import typingsJapgolly.rcUpload.esInterfaceMod.UploadProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AjaxUploader {
  
  @JSImport("rc-upload/es/AjaxUploader", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: AjaxUploader.type): SharedBuilder_UploadProps1578786420[default] = new SharedBuilder_UploadProps1578786420[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: UploadProps): SharedBuilder_UploadProps1578786420[default] = new SharedBuilder_UploadProps1578786420[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
