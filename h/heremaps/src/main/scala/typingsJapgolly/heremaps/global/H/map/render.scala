package typingsJapgolly.heremaps.global.H.map

import typingsJapgolly.heremaps.H.map.render.RenderEngine.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object render {
  
  /**
    * This is an abstract class representing a render engine. Render engines are used to render the geographical position from a view model on the
    * screen (viewport element). The rendered result may be different for different engines, because every engine uses its own capabilities and
    * specific implementation to present the current view model data in best possible way. For example, 2D engines create a two-dimensional flat
    * map composed of tiles, while 3D engines can generate panoramas displaying the same coordinates as a 'street view'.
    */
  @JSGlobal("H.map.render.RenderEngine")
  @js.native
  open class RenderEngine protected ()
    extends StObject
       with typingsJapgolly.heremaps.H.map.render.RenderEngine {
    /**
      * Constructor
      * @param viewPort {H.map.ViewPort} - An object representing the map viewport
      * @param viewModel {H.map.ViewModel} - An object representing a view of the map
      * @param dataModel {H.map.DataModel} - An object encapsulating the data to be rendered on the map (layers and objects)
      * @param options {H.map.render.RenderEngine.Options} - An object containing the render engine initialization options
      */
    def this(
      viewPort: typingsJapgolly.heremaps.H.map.ViewPort,
      viewModel: typingsJapgolly.heremaps.H.map.ViewModel,
      dataModel: typingsJapgolly.heremaps.H.map.DataModel,
      options: Options
    ) = this()
  }
  object RenderEngine {
    
    /**
      * This object defines the modifiers to use for H.map.ViewPort#startInteraction.
      */
    @JSGlobal("H.map.render.RenderEngine.InteractionModifiers")
    @js.native
    object InteractionModifiers extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.heremaps.H.map.render.RenderEngine.InteractionModifiers & Double] = js.native
      
      /* 4 */ val COORD: typingsJapgolly.heremaps.H.map.render.RenderEngine.InteractionModifiers.COORD & Double = js.native
      
      /* 1 */ val HEADING: typingsJapgolly.heremaps.H.map.render.RenderEngine.InteractionModifiers.HEADING & Double = js.native
      
      /* 3 */ val INCLINE: typingsJapgolly.heremaps.H.map.render.RenderEngine.InteractionModifiers.INCLINE & Double = js.native
      
      /* 2 */ val TILT: typingsJapgolly.heremaps.H.map.render.RenderEngine.InteractionModifiers.TILT & Double = js.native
      
      /* 0 */ val ZOOM: typingsJapgolly.heremaps.H.map.render.RenderEngine.InteractionModifiers.ZOOM & Double = js.native
    }
  }
  
  /**
    * The rendering states of the layer.
    */
  @JSGlobal("H.map.render.RenderState")
  @js.native
  object RenderState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.heremaps.H.map.render.RenderState & Double] = js.native
    
    /* 1 */ val ACTIVE: typingsJapgolly.heremaps.H.map.render.RenderState.ACTIVE & Double = js.native
    
    /* 2 */ val DONE: typingsJapgolly.heremaps.H.map.render.RenderState.DONE & Double = js.native
    
    /* 0 */ val PENDING: typingsJapgolly.heremaps.H.map.render.RenderState.PENDING & Double = js.native
  }
  
  /**
    * Contains functionality specific to 2D map rendering.
    */
  object p2d {
    
    /**
      * This class implements a map render engine. It presents a geographic location (camera data from a view model) and renders all map layers in
      * the order in which they are provided in a single 2D canvas element.
      */
    @JSGlobal("H.map.render.p2d.RenderEngine")
    @js.native
    open class RenderEngine protected ()
      extends StObject
         with typingsJapgolly.heremaps.H.map.render.p2d.RenderEngine {
      /**
        * Constructor
        * @param viewPort {H.map.ViewPort} - An object representing the map viewport
        * @param viewModel {H.map.ViewModel} - An object representing a view of the map
        * @param dataModel {H.map.DataModel} - An object encapsulating the data to be rendered on the map (layers and objects)
        * @param options {H.map.render.RenderEngine.Options} - An object containing the render engine initialization options
        */
      def this(
        viewPort: typingsJapgolly.heremaps.H.map.ViewPort,
        viewModel: typingsJapgolly.heremaps.H.map.ViewModel,
        dataModel: typingsJapgolly.heremaps.H.map.DataModel,
        options: Options
      ) = this()
    }
  }
}
