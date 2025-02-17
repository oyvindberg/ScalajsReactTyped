package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressCandidate
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Address of the candidate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#address)
    */
  var address: String = js.native
  
  /**
    * Name value pairs of field name and field value as defined in `outFields` in [locator.addressToLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#attributes)
    */
  var attributes: Any = js.native
  
  /**
    * The minimum and maximum X and Y coordinates of a bounding box of the address candidate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#extent)
    */
  var extent: Extent = js.native
  
  /**
    * The [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) object representing the location of the [address](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#address).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#location)
    */
  var location: Point = js.native
  
  /**
    * Numeric score between `0` and `100` for geocode candidates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#score)
    */
  var score: Double = js.native
}
