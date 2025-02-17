package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.BasemapLayerList
import typingsJapgolly.arcgisJsApi.esri.BasemapLayerListConstructor
import typingsJapgolly.arcgisJsApi.esri.BasemapLayerListProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBasemapLayerListMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapLayerList", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BasemapLayerListConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapLayerList", JSImport.Namespace)
  @js.native
  /**
    * The BasemapLayerList widget provides a way to display a list of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) layers and switch on/off their visibility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html)
    */
  open class Class ()
    extends StObject
       with BasemapLayerList {
    def this(properties: BasemapLayerListProperties) = this()
  }
  
  type _To = js.Object & BasemapLayerListConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsBasemapLayerListMod.foo` */
  override def _to: js.Object & BasemapLayerListConstructor = ^
}
