package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`coded-value`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodedValueDomain
  extends StObject
     with Domain {
  
  /**
    * An array of the coded values in the domain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
    */
  var codedValues: js.Array[CodedValue] = js.native
  
  /**
    * Returns the name of the coded-value associated with the specified code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#getName)
    */
  def getName(code: String): String = js.native
  def getName(code: Double): String = js.native
  
  @JSName("type")
  val type_CodedValueDomain: `coded-value` = js.native
}
