package typingsJapgolly.esriLeaflet.mod

import typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.DynamicMapLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Render and visualize Map Services from ArcGIS Online and ArcGIS Server. `L.esri.DynamicMapLayer` also
  * supports custom popups and identification of features.
  *
  * Map Services are used when its preferable to ask the server to draw layers at a particular location and scale
  * and pass back the image which was generated on the fly. They also expose capabilities for querying and
  * identifying individual features.
  */
@JSImport("esri-leaflet", "DynamicMapLayer")
@js.native
open class DynamicMapLayer_ protected ()
  extends typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.DynamicMapLayer_ {
  def this(options: DynamicMapLayerOptions) = this()
}
