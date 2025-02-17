package typingsJapgolly.plottable

import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.IAccessor
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.IRangeProjector
import typingsJapgolly.plottable.buildSrcDrawersMod.ProxyDrawer
import typingsJapgolly.plottable.buildSrcPlotsCommonsMod.ITransformableAccessorScaleBinding
import typingsJapgolly.plottable.buildSrcPlotsXyPlotMod.XYPlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlotsRectanglePlotMod {
  
  @JSImport("plottable/build/src/plots/rectanglePlot", "Rectangle")
  @js.native
  /**
    * A Rectangle Plot displays rectangles based on the data.
    * The left and right edges of each rectangle can be set with x() and x2().
    *   If only x() is set the Rectangle Plot will attempt to compute the correct left and right edge positions.
    * The top and bottom edges of each rectangle can be set with y() and y2().
    *   If only y() is set the Rectangle Plot will attempt to compute the correct top and bottom edge positions.
    *
    * @constructor
    * @param {Scale.Scale} xScale
    * @param {Scale.Scale} yScale
    */
  open class Rectangle[X, Y] () extends XYPlot[X, Y] {
    
    /* protected */ def _createDrawer(): ProxyDrawer = js.native
    
    /* private */ var _drawLabel: Any = js.native
    
    /* private */ var _drawLabels: Any = js.native
    
    /* private */ var _entityBBox: Any = js.native
    
    /* private */ var _label: Any = js.native
    
    /* private */ var _labelsEnabled: Any = js.native
    
    /* private */ var _overlayLabel: Any = js.native
    
    /* private */ var _rectangleWidth: Any = js.native
    
    /**
      * Gets the accessor for labels.
      *
      * @returns {Accessor<string>}
      */
    def label(): IAccessor[String] = js.native
    /**
      * Sets the text of labels to the result of an Accessor.
      *
      * @param {Accessor<string>} label
      * @returns {Plots.Rectangle} The calling Rectangle Plot.
      */
    def label(label: IAccessor[String]): this.type = js.native
    
    /**
      * Gets whether labels are enabled.
      *
      * @returns {boolean}
      */
    def labelsEnabled(): Boolean = js.native
    /**
      * Sets whether labels are enabled.
      * Labels too big to be contained in the rectangle, cut off by edges, or blocked by other rectangles will not be shown.
      *
      * @param {boolean} labelsEnabled
      * @returns {Rectangle} The calling Rectangle Plot.
      */
    def labelsEnabled(enabled: Boolean): this.type = js.native
    
    /**
      * Gets the AccessorScaleBinding for X2.
      */
    def x2(): ITransformableAccessorScaleBinding[X, Double] = js.native
    def x2(x2: X): this.type = js.native
    def x2(x2: X, postScale: IRangeProjector[Double]): this.type = js.native
    /**
      * Sets X2 to a constant number or the result of an Accessor.
      * If a Scale has been set for X, it will also be used to scale X2.
      *
      * @param {number|Accessor<number>|X|Accessor<X>} x2
      * @returns {Plots.Rectangle} The calling Rectangle Plot.
      */
    def x2(x2: Double): this.type = js.native
    def x2(x2: Double, postScale: IRangeProjector[Double]): this.type = js.native
    def x2(x2: IAccessor[Double | X]): this.type = js.native
    def x2(x2: IAccessor[Double | X], postScale: IRangeProjector[Double]): this.type = js.native
    
    /**
      * Gets the AccessorScaleBinding for Y2.
      */
    def y2(): ITransformableAccessorScaleBinding[Y, Double] = js.native
    def y2(y2: Y): this.type = js.native
    def y2(y2: Y, postScale: IRangeProjector[Double]): this.type = js.native
    /**
      * Sets Y2 to a constant number or the result of an Accessor.
      * If a Scale has been set for Y, it will also be used to scale Y2.
      *
      * @param {number|Accessor<number>|Y|Accessor<Y>} y2
      * @returns {Plots.Rectangle} The calling Rectangle Plot.
      */
    def y2(y2: Double): this.type = js.native
    def y2(y2: Double, postScale: IRangeProjector[Double]): this.type = js.native
    def y2(y2: IAccessor[Double | Y]): this.type = js.native
    def y2(y2: IAccessor[Double | Y], postScale: IRangeProjector[Double]): this.type = js.native
  }
  /* static members */
  object Rectangle {
    
    @JSImport("plottable/build/src/plots/rectanglePlot", "Rectangle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/rectanglePlot", "Rectangle._X2_KEY")
    @js.native
    def _X2_KEY: Any = js.native
    inline def _X2_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_X2_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/rectanglePlot", "Rectangle._Y2_KEY")
    @js.native
    def _Y2_KEY: Any = js.native
    inline def _Y2_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Y2_KEY")(x.asInstanceOf[js.Any])
  }
}
