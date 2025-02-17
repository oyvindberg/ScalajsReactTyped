package typingsJapgolly.ptomasroosReactNativeMultiSlider.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ptomasroosReactNativeMultiSlider.anon.BorderRadius
import typingsJapgolly.ptomasroosReactNativeMultiSlider.mod.LabelProps
import typingsJapgolly.ptomasroosReactNativeMultiSlider.mod.MarkerProps
import typingsJapgolly.ptomasroosReactNativeMultiSlider.mod.MultiSliderProps
import typingsJapgolly.ptomasroosReactNativeMultiSlider.mod.default
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeMultiSlider {
  
  @JSImport("@ptomasroos/react-native-multi-slider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def allowOverlap(value: Boolean): this.type = set("allowOverlap", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: ViewStyle): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def customLabel(value: ComponentType[LabelProps]): this.type = set("customLabel", value.asInstanceOf[js.Any])
    
    inline def customMarker(value: ComponentType[MarkerProps]): this.type = set("customMarker", value.asInstanceOf[js.Any])
    
    inline def customMarkerLeft(value: ComponentType[MarkerProps]): this.type = set("customMarkerLeft", value.asInstanceOf[js.Any])
    
    inline def customMarkerRight(value: ComponentType[MarkerProps]): this.type = set("customMarkerRight", value.asInstanceOf[js.Any])
    
    inline def enableLabel(value: Boolean): this.type = set("enableLabel", value.asInstanceOf[js.Any])
    
    inline def enabledOne(value: Boolean): this.type = set("enabledOne", value.asInstanceOf[js.Any])
    
    inline def enabledTwo(value: Boolean): this.type = set("enabledTwo", value.asInstanceOf[js.Any])
    
    inline def imageBackgroundSource(value: String): this.type = set("imageBackgroundSource", value.asInstanceOf[js.Any])
    
    inline def isMarkersSeparated(value: Boolean): this.type = set("isMarkersSeparated", value.asInstanceOf[js.Any])
    
    inline def markerContainerStyle(value: ViewStyle): this.type = set("markerContainerStyle", value.asInstanceOf[js.Any])
    
    inline def markerOffsetX(value: Double): this.type = set("markerOffsetX", value.asInstanceOf[js.Any])
    
    inline def markerOffsetY(value: Double): this.type = set("markerOffsetY", value.asInstanceOf[js.Any])
    
    inline def markerStyle(value: ViewStyle): this.type = set("markerStyle", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def minMarkerOverlapDistance(value: Double): this.type = set("minMarkerOverlapDistance", value.asInstanceOf[js.Any])
    
    inline def onToggleOne(value: Callback): this.type = set("onToggleOne", value.toJsFn)
    
    inline def onToggleTwo(value: Callback): this.type = set("onToggleTwo", value.toJsFn)
    
    inline def onValuesChange(value: /* values */ js.Array[Double] => Callback): this.type = set("onValuesChange", js.Any.fromFunction1((t0: /* values */ js.Array[Double]) => value(t0).runNow()))
    
    inline def onValuesChangeFinish(value: /* values */ js.Array[Double] => Callback): this.type = set("onValuesChangeFinish", js.Any.fromFunction1((t0: /* values */ js.Array[Double]) => value(t0).runNow()))
    
    inline def onValuesChangeStart(value: Callback): this.type = set("onValuesChangeStart", value.toJsFn)
    
    inline def optionsArray(value: js.Array[Double]): this.type = set("optionsArray", value.asInstanceOf[js.Any])
    
    inline def optionsArrayVarargs(value: Double*): this.type = set("optionsArray", js.Array(value*))
    
    inline def pressedMarkerStyle(value: ViewStyle): this.type = set("pressedMarkerStyle", value.asInstanceOf[js.Any])
    
    inline def selectedStyle(value: ViewStyle): this.type = set("selectedStyle", value.asInstanceOf[js.Any])
    
    inline def sliderLength(value: Double): this.type = set("sliderLength", value.asInstanceOf[js.Any])
    
    inline def snapped(value: Boolean): this.type = set("snapped", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def touchDimensions(value: BorderRadius): this.type = set("touchDimensions", value.asInstanceOf[js.Any])
    
    inline def trackStyle(value: ViewStyle): this.type = set("trackStyle", value.asInstanceOf[js.Any])
    
    inline def unselectedStyle(value: ViewStyle): this.type = set("unselectedStyle", value.asInstanceOf[js.Any])
    
    inline def valuePrefix(value: String): this.type = set("valuePrefix", value.asInstanceOf[js.Any])
    
    inline def valueSuffix(value: String): this.type = set("valueSuffix", value.asInstanceOf[js.Any])
    
    inline def values(value: js.Array[Double]): this.type = set("values", value.asInstanceOf[js.Any])
    
    inline def valuesVarargs(value: Double*): this.type = set("values", js.Array(value*))
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeMultiSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MultiSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
