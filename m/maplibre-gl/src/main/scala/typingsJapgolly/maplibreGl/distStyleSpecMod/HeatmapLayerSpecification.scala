package typingsJapgolly.maplibreGl.distStyleSpecMod

import typingsJapgolly.maplibreGl.anon.Heatmapintensity
import typingsJapgolly.maplibreGl.anon.Visibility
import typingsJapgolly.maplibreGl.maplibreGlStrings.heatmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapLayerSpecification
  extends StObject
     with LayerSpecification {
  
  var filter: js.UndefOr[FilterSpecification] = js.undefined
  
  var id: String
  
  var layout: js.UndefOr[Visibility] = js.undefined
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  var paint: js.UndefOr[Heatmapintensity] = js.undefined
  
  var source: String
  
  var `source-layer`: js.UndefOr[String] = js.undefined
  
  var `type`: heatmap
}
object HeatmapLayerSpecification {
  
  inline def apply(id: String, source: String): HeatmapLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[HeatmapLayerSpecification]
  }
  
  extension [Self <: HeatmapLayerSpecification](x: Self) {
    
    inline def setFilter(value: FilterSpecification): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: Visibility): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setPaint(value: Heatmapintensity): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def `setSource-layer`(value: String): Self = StObject.set(x, "source-layer", value.asInstanceOf[js.Any])
    
    inline def `setSource-layerUndefined`: Self = StObject.set(x, "source-layer", js.undefined)
    
    inline def setType(value: heatmap): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
