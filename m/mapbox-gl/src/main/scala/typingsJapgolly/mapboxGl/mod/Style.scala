package typingsJapgolly.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var bearing: js.UndefOr[Double] = js.undefined
  
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  
  var fog: js.UndefOr[Fog] = js.undefined
  
  var glyphs: js.UndefOr[String] = js.undefined
  
  var layers: js.Array[AnyLayer]
  
  var light: js.UndefOr[Light] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var sources: Sources
  
  var sprite: js.UndefOr[String] = js.undefined
  
  var terrain: js.UndefOr[TerrainSpecification] = js.undefined
  
  var transition: js.UndefOr[Transition] = js.undefined
  
  var version: Double
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object Style {
  
  inline def apply(layers: js.Array[AnyLayer], sources: Sources, version: Double): Style = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    inline def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setFog(value: Fog): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
    
    inline def setFogUndefined: Self = StObject.set(x, "fog", js.undefined)
    
    inline def setGlyphs(value: String): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
    
    inline def setGlyphsUndefined: Self = StObject.set(x, "glyphs", js.undefined)
    
    inline def setLayers(value: js.Array[AnyLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: AnyLayer*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLight(value: Light): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setSources(value: Sources): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSprite(value: String): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    
    inline def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
    
    inline def setTerrain(value: TerrainSpecification): Self = StObject.set(x, "terrain", value.asInstanceOf[js.Any])
    
    inline def setTerrainUndefined: Self = StObject.set(x, "terrain", js.undefined)
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
