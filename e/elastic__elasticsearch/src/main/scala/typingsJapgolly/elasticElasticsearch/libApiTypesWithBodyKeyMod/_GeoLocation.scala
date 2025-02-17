package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _GeoLocation extends StObject
object _GeoLocation {
  
  inline def GeoHashLocation(geohash: GeoHash): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GeoHashLocation = {
    val __obj = js.Dynamic.literal(geohash = geohash.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GeoHashLocation]
  }
  
  inline def LatLonGeoLocation(lat: double, lon: double): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LatLonGeoLocation = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LatLonGeoLocation]
  }
}
