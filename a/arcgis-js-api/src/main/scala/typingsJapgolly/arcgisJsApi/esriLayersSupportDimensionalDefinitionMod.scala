package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.DimensionalDefinition
import typingsJapgolly.arcgisJsApi.esri.DimensionalDefinitionConstructor
import typingsJapgolly.arcgisJsApi.esri.DimensionalDefinitionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportDimensionalDefinitionMod extends Shortcut {
  
  @JSImport("esri/layers/support/DimensionalDefinition", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DimensionalDefinitionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/DimensionalDefinition", JSImport.Namespace)
  @js.native
  /**
    * A dimensional definition defines a filter based on one variable and one dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html)
    */
  open class Class ()
    extends StObject
       with DimensionalDefinition {
    def this(properties: DimensionalDefinitionProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & DimensionalDefinitionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportDimensionalDefinitionMod.foo` */
  override def _to: js.Object & DimensionalDefinitionConstructor = ^
}
