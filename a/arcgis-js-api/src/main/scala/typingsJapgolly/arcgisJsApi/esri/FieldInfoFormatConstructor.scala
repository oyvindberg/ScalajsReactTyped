package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldInfoFormatConstructor
  extends StObject
     with /**
  * The `FieldInfoFormat` class is used with numerical or date fields to provide more detail about how the value should be displayed in a popup.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html)
  */
Instantiable0[FieldInfoFormat]
     with Instantiable1[/* properties */ FieldInfoFormatProperties, FieldInfoFormat] {
  
  def fromJSON(json: Any): FieldInfoFormat = js.native
}
