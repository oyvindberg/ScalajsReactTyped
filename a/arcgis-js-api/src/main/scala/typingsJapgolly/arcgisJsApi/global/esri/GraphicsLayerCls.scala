package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`color-burn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`color-dodge`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-atop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-in`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-out`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-over`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`hard-light`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`soft-light`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`source-atop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`source-in`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`source-out`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`vivid-light`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.darken
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.difference
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.exclusion
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hue
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.invert
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.lighten
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.lighter
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.luminosity
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.minus
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multiply
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.normal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.overlay
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.plus
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reflect
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.saturation
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.screen
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xor
import typingsJapgolly.arcgisJsApi.esri.Effect
import typingsJapgolly.arcgisJsApi.esri.GraphicsLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.GraphicsLayer")
@js.native
/**
  * A GraphicsLayer contains one or more client-side [Graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html)
  */
open class GraphicsLayerCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.GraphicsLayer {
  def this(properties: GraphicsLayerProperties) = this()
  
  /**
    * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer.
    *
    * @default normal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#blendMode)
    */
  /* CompleteClass */
  var blendMode: average | `color-burn` | `color-dodge` | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor = js.native
  
  /**
    * Effect provides various filter functions that can be performed on the layer to achieve different visual effects similar to how image filters work.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#effect)
    */
  /* CompleteClass */
  var effect: Effect = js.native
  
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    */
  /* CompleteClass */
  var maxScale: Double = js.native
  
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    */
  /* CompleteClass */
  var minScale: Double = js.native
}
