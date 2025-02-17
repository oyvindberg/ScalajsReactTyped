package typingsJapgolly.winrt.Windows.Storage.FileProperties

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImageProperties
  extends StObject
     with IStorageItemExtraProperties {
  
  var cameraManufacturer: String = js.native
  
  var cameraModel: String = js.native
  
  var dateTaken: js.Date = js.native
  
  var height: Double = js.native
  
  var keywords: IVector[String] = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var orientation: PhotoOrientation = js.native
  
  var peopleNames: IVectorView[String] = js.native
  
  var rating: Double = js.native
  
  var title: String = js.native
  
  var width: Double = js.native
}
