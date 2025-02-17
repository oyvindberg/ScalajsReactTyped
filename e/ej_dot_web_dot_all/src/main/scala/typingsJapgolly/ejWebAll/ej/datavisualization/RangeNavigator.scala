package typingsJapgolly.ejWebAll.ej.datavisualization

import japgolly.scalajs.react.Callback
import typingsJapgolly.ejWebAll.ej.Model
import typingsJapgolly.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeNavigator
  extends StObject
     with Widget_ {
  
  /** destroy the range navigator widget
    * @returns {void}
    */
  def _destroy(): Unit = js.native
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_RangeNavigator: Model = js.native
}
object RangeNavigator {
  
  @js.native
  sealed trait FontStyle extends StObject
  @JSGlobal("ej.datavisualization.RangeNavigator.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    //string
    @js.native
    sealed trait Bold
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Italic
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Normal
      extends StObject
         with FontStyle
  }
  
  @js.native
  sealed trait FontWeight extends StObject
  @JSGlobal("ej.datavisualization.RangeNavigator.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    //string
    @js.native
    sealed trait Lighter
      extends StObject
         with FontWeight
    
    //string
    @js.native
    sealed trait Regular
      extends StObject
         with FontWeight
  }
  
  @js.native
  sealed trait HorizontalAlignment extends StObject
  @JSGlobal("ej.datavisualization.RangeNavigator.HorizontalAlignment")
  @js.native
  object HorizontalAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Left
      extends StObject
         with HorizontalAlignment
    
    //string
    @js.native
    sealed trait Middle
      extends StObject
         with HorizontalAlignment
    
    //string
    @js.native
    sealed trait Right
      extends StObject
         with HorizontalAlignment
  }
  
  @js.native
  sealed trait IntervalType extends StObject
  @JSGlobal("ej.datavisualization.RangeNavigator.IntervalType")
  @js.native
  object IntervalType extends StObject {
    
    //string
    @js.native
    sealed trait Days
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Hours
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Minutes
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Months
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Quarters
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Weeks
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Years
      extends StObject
         with IntervalType
  }
  
  @js.native
  sealed trait LabelIntersectAction extends StObject
  @JSGlobal("ej.datavisualization.RangeNavigator.LabelIntersectAction")
  @js.native
  object LabelIntersectAction extends StObject {
    
    //string
    @js.native
    sealed trait Hide
      extends StObject
         with LabelIntersectAction
    
    //string
    @js.native
    sealed trait None
      extends StObject
         with LabelIntersectAction
  }
  
  @js.native
  sealed trait LabelPlacement extends StObject
  @JSGlobal("ej.datavisualization.RangeNavigator.LabelPlacement")
  @js.native
  object LabelPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Inside
      extends StObject
         with LabelPlacement
    
    //string
    @js.native
    sealed trait Outside
      extends StObject
         with LabelPlacement
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("ej.datavisualization.RangeNavigator.Position")
  @js.native
  object Position extends StObject {
    
    //string
    @js.native
    sealed trait Bottom
      extends StObject
         with Position
    
    //string
    @js.native
    sealed trait Top
      extends StObject
         with Position
  }
  
  @js.native
  sealed trait RangePadding extends StObject
  @JSGlobal("ej.datavisualization.RangeNavigator.RangePadding")
  @js.native
  object RangePadding extends StObject {
    
    //string
    @js.native
    sealed trait Additional
      extends StObject
         with RangePadding
    
    //string
    @js.native
    sealed trait None
      extends StObject
         with RangePadding
    
    //string
    @js.native
    sealed trait Normal
      extends StObject
         with RangePadding
    
    //string
    @js.native
    sealed trait Round
      extends StObject
         with RangePadding
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSGlobal("ej.datavisualization.RangeNavigator.Type")
  @js.native
  object Type extends StObject {
    
    //string
    @js.native
    sealed trait Area
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Line
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Spline
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait SplineArea
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StepArea
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StepLine
      extends StObject
         with Type
  }
  
  @js.native
  sealed trait ValueType extends StObject
  @JSGlobal("ej.datavisualization.RangeNavigator.ValueType")
  @js.native
  object ValueType extends StObject {
    
    //string
    @js.native
    sealed trait DateTime
      extends StObject
         with ValueType
    
    //string
    @js.native
    sealed trait Numeric
      extends StObject
         with ValueType
  }
  
  trait Border extends StObject {
    
    /** Border color of rangenavigator. When enable the scrollbar, the default color will be set as &quot;#B4B4B4&quot;.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Opacity of the rangeNavigator border.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Width of the RangeNavigator border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Border {
    
    inline def apply(): Border = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Border]
    }
    
    extension [Self <: Border](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ClickEventArgs extends StObject {
    
    /** parameters from range navigator
      */
    var Data: js.UndefOr[Any] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the range navigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ClickEventArgs {
    
    inline def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    extension [Self <: ClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DoubleClickEventArgs extends StObject {
    
    /** parameters from range navigator
      */
    var Data: js.UndefOr[Any] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the range navigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DoubleClickEventArgs {
    
    inline def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    extension [Self <: DoubleClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LabelSettings extends StObject {
    
    /** Options for customizing the higher level labels in range navigator.
      */
    var higherLevel: js.UndefOr[LabelSettingsHigherLevel] = js.undefined
    
    /** Options for customizing the labels in lower level.
      */
    var lowerLevel: js.UndefOr[LabelSettingsLowerLevel] = js.undefined
    
    /** Options for customizing the style of labels in range navigator.
      */
    var style: js.UndefOr[LabelSettingsStyle] = js.undefined
  }
  object LabelSettings {
    
    inline def apply(): LabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettings]
    }
    
    extension [Self <: LabelSettings](x: Self) {
      
      inline def setHigherLevel(value: LabelSettingsHigherLevel): Self = StObject.set(x, "higherLevel", value.asInstanceOf[js.Any])
      
      inline def setHigherLevelUndefined: Self = StObject.set(x, "higherLevel", js.undefined)
      
      inline def setLowerLevel(value: LabelSettingsLowerLevel): Self = StObject.set(x, "lowerLevel", value.asInstanceOf[js.Any])
      
      inline def setLowerLevelUndefined: Self = StObject.set(x, "lowerLevel", js.undefined)
      
      inline def setStyle(value: LabelSettingsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait LabelSettingsHigherLevel extends StObject {
    
    /** Options for customizing the border of grid lines in higher level.
      */
    var border: js.UndefOr[LabelSettingsHigherLevelBorder] = js.undefined
    
    /** Specifies the fill color of higher level labels.
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the grid line colors, width, dashArray, border.
      */
    var gridLineStyle: js.UndefOr[LabelSettingsHigherLevelGridLineStyle] = js.undefined
    
    /** Specifies the intervalType for higher level labels. See
      * @Default {auto}
      */
    var intervalType: js.UndefOr[IntervalType | String] = js.undefined
    
    /** Specifies to hide the labels when it intersects with each other.
      * @Default {none}
      */
    var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.undefined
    
    /** Specifies the position of the labels to render either inside or outside of plot area
      * @Default {outside}
      */
    var labelPlacement: js.UndefOr[LabelPlacement | String] = js.undefined
    
    /** Specifies the position of the labels in higher level
      * @Default {top}
      */
    var position: js.UndefOr[Position | String] = js.undefined
    
    /** Options for customizing the style of higher level labels.
      */
    var style: js.UndefOr[LabelSettingsHigherLevelStyle] = js.undefined
    
    /** Toggles the visibility of higher level labels.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object LabelSettingsHigherLevel {
    
    inline def apply(): LabelSettingsHigherLevel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsHigherLevel]
    }
    
    extension [Self <: LabelSettingsHigherLevel](x: Self) {
      
      inline def setBorder(value: LabelSettingsHigherLevelBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGridLineStyle(value: LabelSettingsHigherLevelGridLineStyle): Self = StObject.set(x, "gridLineStyle", value.asInstanceOf[js.Any])
      
      inline def setGridLineStyleUndefined: Self = StObject.set(x, "gridLineStyle", js.undefined)
      
      inline def setIntervalType(value: IntervalType | String): Self = StObject.set(x, "intervalType", value.asInstanceOf[js.Any])
      
      inline def setIntervalTypeUndefined: Self = StObject.set(x, "intervalType", js.undefined)
      
      inline def setLabelIntersectAction(value: LabelIntersectAction | String): Self = StObject.set(x, "labelIntersectAction", value.asInstanceOf[js.Any])
      
      inline def setLabelIntersectActionUndefined: Self = StObject.set(x, "labelIntersectAction", js.undefined)
      
      inline def setLabelPlacement(value: LabelPlacement | String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setPosition(value: Position | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: LabelSettingsHigherLevelStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait LabelSettingsHigherLevelBorder extends StObject {
    
    /** Specifies the border color of grid lines.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the border width of grid lines.
      * @Default {0.5}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object LabelSettingsHigherLevelBorder {
    
    inline def apply(): LabelSettingsHigherLevelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsHigherLevelBorder]
    }
    
    extension [Self <: LabelSettingsHigherLevelBorder](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LabelSettingsHigherLevelGridLineStyle extends StObject {
    
    /** Specifies the color of grid lines in higher level.
      * @Default {#B5B5B5}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the dashArray of grid lines in higher level.
      * @Default {20 5 0}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of grid lines in higher level.
      * @Default {#B5B5B5}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object LabelSettingsHigherLevelGridLineStyle {
    
    inline def apply(): LabelSettingsHigherLevelGridLineStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsHigherLevelGridLineStyle]
    }
    
    extension [Self <: LabelSettingsHigherLevelGridLineStyle](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LabelSettingsHigherLevelStyle extends StObject {
    
    /** Options for customizing the font properties.
      */
    var font: js.UndefOr[LabelSettingsHigherLevelStyleFont] = js.undefined
    
    /** Specifies the horizontal text alignment of the text in label.
      * @Default {middle}
      */
    var horizontalAlignment: js.UndefOr[String] = js.undefined
  }
  object LabelSettingsHigherLevelStyle {
    
    inline def apply(): LabelSettingsHigherLevelStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsHigherLevelStyle]
    }
    
    extension [Self <: LabelSettingsHigherLevelStyle](x: Self) {
      
      inline def setFont(value: LabelSettingsHigherLevelStyleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    }
  }
  
  trait LabelSettingsHigherLevelStyleFont extends StObject {
    
    /** Specifies the label font color. Labels render with the specified font color.
      * @Default {black}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the label font family. Labels render with the specified font family.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the label font style. Labels render with the specified font style.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /** Specifies the label font weight. Labels render with the specified font weight.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /** Specifies the label opacity. Labels render with the specified opacity.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the label font size. Labels render with the specified font size.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object LabelSettingsHigherLevelStyleFont {
    
    inline def apply(): LabelSettingsHigherLevelStyleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsHigherLevelStyleFont]
    }
    
    extension [Self <: LabelSettingsHigherLevelStyleFont](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait LabelSettingsLowerLevel extends StObject {
    
    /** Options for customizing the border of grid lines in lower level.
      */
    var border: js.UndefOr[LabelSettingsLowerLevelBorder] = js.undefined
    
    /** Specifies the fill color of labels in lower level.
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the grid lines in lower level.
      */
    var gridLineStyle: js.UndefOr[LabelSettingsLowerLevelGridLineStyle] = js.undefined
    
    /** Specifies the intervalType of the labels in lower level.See IntervalType
      * @Default {auto}
      */
    var intervalType: js.UndefOr[IntervalType | String] = js.undefined
    
    /** Specifies to hide the labels when it intersects with each other.
      * @Default {none}
      */
    var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.undefined
    
    /** Specifies the position of the labels to render either inside or outside of plot area. See LabelPlacement
      * @Default {outside}
      */
    var labelPlacement: js.UndefOr[LabelPlacement | String] = js.undefined
    
    /** Specifies the position of the labels in lower level.See Position
      * @Default {bottom}
      */
    var position: js.UndefOr[Position | String] = js.undefined
    
    /** Options for customizing the style of labels.
      */
    var style: js.UndefOr[LabelSettingsLowerLevelStyle] = js.undefined
    
    /** Toggles the visibility of labels in lower level.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object LabelSettingsLowerLevel {
    
    inline def apply(): LabelSettingsLowerLevel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsLowerLevel]
    }
    
    extension [Self <: LabelSettingsLowerLevel](x: Self) {
      
      inline def setBorder(value: LabelSettingsLowerLevelBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGridLineStyle(value: LabelSettingsLowerLevelGridLineStyle): Self = StObject.set(x, "gridLineStyle", value.asInstanceOf[js.Any])
      
      inline def setGridLineStyleUndefined: Self = StObject.set(x, "gridLineStyle", js.undefined)
      
      inline def setIntervalType(value: IntervalType | String): Self = StObject.set(x, "intervalType", value.asInstanceOf[js.Any])
      
      inline def setIntervalTypeUndefined: Self = StObject.set(x, "intervalType", js.undefined)
      
      inline def setLabelIntersectAction(value: LabelIntersectAction | String): Self = StObject.set(x, "labelIntersectAction", value.asInstanceOf[js.Any])
      
      inline def setLabelIntersectActionUndefined: Self = StObject.set(x, "labelIntersectAction", js.undefined)
      
      inline def setLabelPlacement(value: LabelPlacement | String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setPosition(value: Position | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: LabelSettingsLowerLevelStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait LabelSettingsLowerLevelBorder extends StObject {
    
    /** Specifies the border color of grid lines.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the border width of grid lines.
      * @Default {0.5}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object LabelSettingsLowerLevelBorder {
    
    inline def apply(): LabelSettingsLowerLevelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsLowerLevelBorder]
    }
    
    extension [Self <: LabelSettingsLowerLevelBorder](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LabelSettingsLowerLevelGridLineStyle extends StObject {
    
    /** Specifies the color of grid lines in lower level.
      * @Default {#B5B5B5}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the dashArray of gridLines in lowerLevel.
      * @Default {20 5 0}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of grid lines in lower level.
      * @Default {#B5B5B5}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object LabelSettingsLowerLevelGridLineStyle {
    
    inline def apply(): LabelSettingsLowerLevelGridLineStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsLowerLevelGridLineStyle]
    }
    
    extension [Self <: LabelSettingsLowerLevelGridLineStyle](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LabelSettingsLowerLevelStyle extends StObject {
    
    /** Options for customizing the font of labels.
      */
    var font: js.UndefOr[LabelSettingsLowerLevelStyleFont] = js.undefined
    
    /** Specifies the horizontal text alignment of the text in label.
      * @Default {middle}
      */
    var horizontalAlignment: js.UndefOr[String] = js.undefined
  }
  object LabelSettingsLowerLevelStyle {
    
    inline def apply(): LabelSettingsLowerLevelStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsLowerLevelStyle]
    }
    
    extension [Self <: LabelSettingsLowerLevelStyle](x: Self) {
      
      inline def setFont(value: LabelSettingsLowerLevelStyleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    }
  }
  
  trait LabelSettingsLowerLevelStyleFont extends StObject {
    
    /** Specifies the color of labels. Label text render in this specified color.
      * @Default {black}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the font family of labels. Label text render in this specified font family.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the font style of labels. Label text render in this specified font style.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /** Specifies the font weight of labels. Label text render in this specified font weight.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /** Specifies the opacity of labels. Label text render in this specified opacity.
      * @Default {12px}
      */
    var opacity: js.UndefOr[String] = js.undefined
    
    /** Specifies the size of labels. Label text render in this specified size.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object LabelSettingsLowerLevelStyleFont {
    
    inline def apply(): LabelSettingsLowerLevelStyleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsLowerLevelStyleFont]
    }
    
    extension [Self <: LabelSettingsLowerLevelStyleFont](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait LabelSettingsStyle extends StObject {
    
    /** Options for customizing the font of labels in range navigator.
      */
    var font: js.UndefOr[LabelSettingsStyleFont] = js.undefined
    
    /** Specifies the horizontalAlignment of the label in RangeNavigator
      * @Default {middle}
      */
    var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.undefined
  }
  object LabelSettingsStyle {
    
    inline def apply(): LabelSettingsStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsStyle]
    }
    
    extension [Self <: LabelSettingsStyle](x: Self) {
      
      inline def setFont(value: LabelSettingsStyleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHorizontalAlignment(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    }
  }
  
  trait LabelSettingsStyleFont extends StObject {
    
    /** Specifies the label color. This color is applied to the labels in range navigator.
      * @Default {#333333}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the label font family. Labels render with the specified font family.
      * @Default {Segoe UI}
      */
    var family: js.UndefOr[String] = js.undefined
    
    /** Specifies the label font opacity. Labels render with the specified font opacity.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the label font size. Labels render with the specified font size.
      * @Default {1px}
      */
    var size: js.UndefOr[String] = js.undefined
    
    /** Specifies the label font style. Labels render with the specified font style..
      * @Default {Normal}
      */
    var style: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Specifies the label font weight
      * @Default {regular}
      */
    var weight: js.UndefOr[FontWeight | String] = js.undefined
  }
  object LabelSettingsStyleFont {
    
    inline def apply(): LabelSettingsStyleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettingsStyleFont]
    }
    
    extension [Self <: LabelSettingsStyleFont](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: FontStyle | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWeight(value: FontWeight | String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** parameters from range navigator
      */
    var Data: js.UndefOr[Any] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the range navigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadEventArgs {
    
    inline def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    extension [Self <: LoadEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LoadedEventArgs extends StObject {
    
    /** parameters from range navigator
      */
    var Data: js.UndefOr[Any] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the range navigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadedEventArgs {
    
    inline def apply(): LoadedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadedEventArgs]
    }
    
    extension [Self <: LoadedEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires, on clicking the range of range navigator.
      */
    var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** It allows to show the value between the particular periods (i.e) from 1st January to 31st February and so on. The default value is true. If we set the property as false, it allows
      * to show the value between the particular periods.(i.e) from 1st January to 31st January and so on.
      * @Default {true}
      */
    var allowNextValue: js.UndefOr[Boolean] = js.undefined
    
    /** Toggles the placement of slider exactly on the place it left or on the nearest interval.
      * @Default {false}
      */
    var allowSnapping: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the color, opacity and width of the chart border.
      */
    var border: js.UndefOr[Border] = js.undefined
    
    /** Specifies the data source for range navigator.
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Fires, on double clicking the range of range navigator.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
    
    /** Enable the resize option in the rangenavigator.
      * @Default {false}
      */
    var enableAutoResizing: js.UndefOr[Boolean] = js.undefined
    
    /** Toggles the redrawing of chart on moving the sliders.
      * @Default {true}
      */
    var enableDeferredUpdate: js.UndefOr[Boolean] = js.undefined
    
    /** Toggles the direction of rendering the range navigator control.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Enable the scrollbar option in the rangenavigator.
      * @Default {false}
      */
    var enableScrollbar: js.UndefOr[Boolean] = js.undefined
    
    /** Sets a value whether to make the range navigator responsive on resize.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the labels colors, font, style, size, horizontalAlignment and opacity.
      */
    var labelSettings: js.UndefOr[LabelSettings] = js.undefined
    
    /** Fires on load of range navigator.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Fires after range navigator is loaded.
      */
    var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.undefined
    
    /** This property is to specify the localization of range navigator.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the range navigator.
      */
    var navigatorStyleSettings: js.UndefOr[NavigatorStyleSettings] = js.undefined
    
    /** Padding specifies the gap between the container and the range navigator.
      * @Default {0}
      */
    var padding: js.UndefOr[String] = js.undefined
    
    /** Fires on changing the range of range navigator.
      */
    var rangeChanged: js.UndefOr[js.Function1[/* e */ RangeChangedEventArgs, Unit]] = js.undefined
    
    /** If the range is not given explicitly, range will be calculated automatically.
      * @Default {none}
      */
    var rangePadding: js.UndefOr[RangePadding | String] = js.undefined
    
    /** Options for customizing the starting and ending ranges.
      */
    var rangeSettings: js.UndefOr[RangeSettings] = js.undefined
    
    /** Fires, on right clicking the range of range navigator.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
    
    /** Fires on changing the scrollbar position of range navigator.
      */
    var scrollChanged: js.UndefOr[js.Function1[/* e */ ScrollChangedEventArgs, Unit]] = js.undefined
    
    /** Fires on changes ending the scrollbar position of range navigator.
      */
    var scrollEnd: js.UndefOr[js.Function1[/* e */ ScrollEndEventArgs, Unit]] = js.undefined
    
    /** Options for rendering scrollbar based on the start and end range values.
      */
    var scrollRangeSettings: js.UndefOr[ScrollRangeSettings] = js.undefined
    
    /** Fires on when starting to change the scrollbar position of range navigator.
      */
    var scrollStart: js.UndefOr[js.Function1[/* e */ ScrollStartEventArgs, Unit]] = js.undefined
    
    /** selectedData is for getting the data when the &quot;rangeChanged&quot; event trigger from client side.
      */
    var selectedData: js.UndefOr[Any] = js.undefined
    
    /** Fires when the selection  ends in the range navigator
      */
    var selectedRangeEnd: js.UndefOr[js.Function1[/* e */ SelectedRangeEndEventArgs, Unit]] = js.undefined
    
    /** Options for customizing the start and end range values.
      */
    var selectedRangeSettings: js.UndefOr[SelectedRangeSettings] = js.undefined
    
    /** Fires on when starting to change the slider position of range navigator.
      */
    var selectedRangeStart: js.UndefOr[js.Function1[/* e */ SelectedRangeStartEventArgs, Unit]] = js.undefined
    
    /** Specifies the properties used for customizing the range series.
      */
    var series: js.UndefOr[js.Array[Series]] = js.undefined
    
    /** Specifies the  properties used for customizing all the range series.
      */
    var seriesSettings: js.UndefOr[js.Array[SeriesSetting]] = js.undefined
    
    /** Contains property to customize the hight and width of range navigator.
      */
    var sizeSettings: js.UndefOr[SizeSettings] = js.undefined
    
    /** By specifying this property the user can change the theme of the range navigator.
      * @Default {null}
      */
    var theme: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the tooltip in range navigator.
      */
    var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
    
    /** Options for configuring minor grid lines, major grid lines, axis line of axis.
      */
    var valueAxisSettings: js.UndefOr[ValueAxisSettings] = js.undefined
    
    /** You can plot data of type date time or numeric. This property determines the type of data that this axis will handle.
      * @Default {datetime}
      */
    var valueType: js.UndefOr[ValueType | String] = js.undefined
    
    /** Specifies the xName for dataSource. This is used to take the x values from dataSource
      */
    var xName: js.UndefOr[Any] = js.undefined
    
    /** Specifies the yName for dataSource. This is used to take the y values from dataSource
      */
    var yName: js.UndefOr[Any] = js.undefined
  }
  object Model {
    
    inline def apply(): typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Model]
    }
    
    extension [Self <: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Model](x: Self) {
      
      inline def setAllowNextValue(value: Boolean): Self = StObject.set(x, "allowNextValue", value.asInstanceOf[js.Any])
      
      inline def setAllowNextValueUndefined: Self = StObject.set(x, "allowNextValue", js.undefined)
      
      inline def setAllowSnapping(value: Boolean): Self = StObject.set(x, "allowSnapping", value.asInstanceOf[js.Any])
      
      inline def setAllowSnappingUndefined: Self = StObject.set(x, "allowSnapping", js.undefined)
      
      inline def setBorder(value: Border): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setClick(value: /* e */ ClickEventArgs => Callback): Self = StObject.set(x, "Click", js.Any.fromFunction1((t0: /* e */ ClickEventArgs) => value(t0).runNow()))
      
      inline def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDoubleClick(value: /* e */ DoubleClickEventArgs => Callback): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1((t0: /* e */ DoubleClickEventArgs) => value(t0).runNow()))
      
      inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      inline def setEnableAutoResizing(value: Boolean): Self = StObject.set(x, "enableAutoResizing", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoResizingUndefined: Self = StObject.set(x, "enableAutoResizing", js.undefined)
      
      inline def setEnableDeferredUpdate(value: Boolean): Self = StObject.set(x, "enableDeferredUpdate", value.asInstanceOf[js.Any])
      
      inline def setEnableDeferredUpdateUndefined: Self = StObject.set(x, "enableDeferredUpdate", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableScrollbar(value: Boolean): Self = StObject.set(x, "enableScrollbar", value.asInstanceOf[js.Any])
      
      inline def setEnableScrollbarUndefined: Self = StObject.set(x, "enableScrollbar", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLabelSettings(value: LabelSettings): Self = StObject.set(x, "labelSettings", value.asInstanceOf[js.Any])
      
      inline def setLabelSettingsUndefined: Self = StObject.set(x, "labelSettings", js.undefined)
      
      inline def setLoad(value: /* e */ LoadEventArgs => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: /* e */ LoadEventArgs) => value(t0).runNow()))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLoaded(value: /* e */ LoadedEventArgs => Callback): Self = StObject.set(x, "loaded", js.Any.fromFunction1((t0: /* e */ LoadedEventArgs) => value(t0).runNow()))
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setNavigatorStyleSettings(value: NavigatorStyleSettings): Self = StObject.set(x, "navigatorStyleSettings", value.asInstanceOf[js.Any])
      
      inline def setNavigatorStyleSettingsUndefined: Self = StObject.set(x, "navigatorStyleSettings", js.undefined)
      
      inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRangeChanged(value: /* e */ RangeChangedEventArgs => Callback): Self = StObject.set(x, "rangeChanged", js.Any.fromFunction1((t0: /* e */ RangeChangedEventArgs) => value(t0).runNow()))
      
      inline def setRangeChangedUndefined: Self = StObject.set(x, "rangeChanged", js.undefined)
      
      inline def setRangePadding(value: RangePadding | String): Self = StObject.set(x, "rangePadding", value.asInstanceOf[js.Any])
      
      inline def setRangePaddingUndefined: Self = StObject.set(x, "rangePadding", js.undefined)
      
      inline def setRangeSettings(value: RangeSettings): Self = StObject.set(x, "rangeSettings", value.asInstanceOf[js.Any])
      
      inline def setRangeSettingsUndefined: Self = StObject.set(x, "rangeSettings", js.undefined)
      
      inline def setRightClick(value: /* e */ RightClickEventArgs => Callback): Self = StObject.set(x, "rightClick", js.Any.fromFunction1((t0: /* e */ RightClickEventArgs) => value(t0).runNow()))
      
      inline def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      inline def setScrollChanged(value: /* e */ ScrollChangedEventArgs => Callback): Self = StObject.set(x, "scrollChanged", js.Any.fromFunction1((t0: /* e */ ScrollChangedEventArgs) => value(t0).runNow()))
      
      inline def setScrollChangedUndefined: Self = StObject.set(x, "scrollChanged", js.undefined)
      
      inline def setScrollEnd(value: /* e */ ScrollEndEventArgs => Callback): Self = StObject.set(x, "scrollEnd", js.Any.fromFunction1((t0: /* e */ ScrollEndEventArgs) => value(t0).runNow()))
      
      inline def setScrollEndUndefined: Self = StObject.set(x, "scrollEnd", js.undefined)
      
      inline def setScrollRangeSettings(value: ScrollRangeSettings): Self = StObject.set(x, "scrollRangeSettings", value.asInstanceOf[js.Any])
      
      inline def setScrollRangeSettingsUndefined: Self = StObject.set(x, "scrollRangeSettings", js.undefined)
      
      inline def setScrollStart(value: /* e */ ScrollStartEventArgs => Callback): Self = StObject.set(x, "scrollStart", js.Any.fromFunction1((t0: /* e */ ScrollStartEventArgs) => value(t0).runNow()))
      
      inline def setScrollStartUndefined: Self = StObject.set(x, "scrollStart", js.undefined)
      
      inline def setSelectedData(value: Any): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      inline def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      inline def setSelectedRangeEnd(value: /* e */ SelectedRangeEndEventArgs => Callback): Self = StObject.set(x, "selectedRangeEnd", js.Any.fromFunction1((t0: /* e */ SelectedRangeEndEventArgs) => value(t0).runNow()))
      
      inline def setSelectedRangeEndUndefined: Self = StObject.set(x, "selectedRangeEnd", js.undefined)
      
      inline def setSelectedRangeSettings(value: SelectedRangeSettings): Self = StObject.set(x, "selectedRangeSettings", value.asInstanceOf[js.Any])
      
      inline def setSelectedRangeSettingsUndefined: Self = StObject.set(x, "selectedRangeSettings", js.undefined)
      
      inline def setSelectedRangeStart(value: /* e */ SelectedRangeStartEventArgs => Callback): Self = StObject.set(x, "selectedRangeStart", js.Any.fromFunction1((t0: /* e */ SelectedRangeStartEventArgs) => value(t0).runNow()))
      
      inline def setSelectedRangeStartUndefined: Self = StObject.set(x, "selectedRangeStart", js.undefined)
      
      inline def setSeries(value: js.Array[Series]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesSettings(value: js.Array[SeriesSetting]): Self = StObject.set(x, "seriesSettings", value.asInstanceOf[js.Any])
      
      inline def setSeriesSettingsUndefined: Self = StObject.set(x, "seriesSettings", js.undefined)
      
      inline def setSeriesSettingsVarargs(value: SeriesSetting*): Self = StObject.set(x, "seriesSettings", js.Array(value*))
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setSeriesVarargs(value: Series*): Self = StObject.set(x, "series", js.Array(value*))
      
      inline def setSizeSettings(value: SizeSettings): Self = StObject.set(x, "sizeSettings", value.asInstanceOf[js.Any])
      
      inline def setSizeSettingsUndefined: Self = StObject.set(x, "sizeSettings", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltipSettings(value: TooltipSettings): Self = StObject.set(x, "tooltipSettings", value.asInstanceOf[js.Any])
      
      inline def setTooltipSettingsUndefined: Self = StObject.set(x, "tooltipSettings", js.undefined)
      
      inline def setValueAxisSettings(value: ValueAxisSettings): Self = StObject.set(x, "valueAxisSettings", value.asInstanceOf[js.Any])
      
      inline def setValueAxisSettingsUndefined: Self = StObject.set(x, "valueAxisSettings", js.undefined)
      
      inline def setValueType(value: ValueType | String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
      
      inline def setXName(value: Any): Self = StObject.set(x, "xName", value.asInstanceOf[js.Any])
      
      inline def setXNameUndefined: Self = StObject.set(x, "xName", js.undefined)
      
      inline def setYName(value: Any): Self = StObject.set(x, "yName", value.asInstanceOf[js.Any])
      
      inline def setYNameUndefined: Self = StObject.set(x, "yName", js.undefined)
    }
  }
  
  trait NavigatorStyleSettings extends StObject {
    
    /** Specifies the background color of range navigator.
      * @Default {#dddddd}
      */
    var background: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the border color and width of range navigator.
      */
    var border: js.UndefOr[NavigatorStyleSettingsBorder] = js.undefined
    
    /** Contains the options for highlighting the range navigator on mouse over.
      */
    var highlightSettings: js.UndefOr[NavigatorStyleSettingsHighlightSettings] = js.undefined
    
    /** Specifies the left side thumb template in range navigator we can give either div id or HTML string
      * @Default {null}
      */
    var leftThumbTemplate: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the major grid lines.
      */
    var majorGridLineStyle: js.UndefOr[NavigatorStyleSettingsMajorGridLineStyle] = js.undefined
    
    /** Options for customizing the minor grid lines.
      */
    var minorGridLineStyle: js.UndefOr[NavigatorStyleSettingsMinorGridLineStyle] = js.undefined
    
    /** Specifies the opacity of RangeNavigator.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the right side thumb template in range navigator we can give either div id or HTML string
      * @Default {null}
      */
    var rightThumbTemplate: js.UndefOr[String] = js.undefined
    
    /** Specifies the color of the selected region in range navigator.
      * @Default {#EFEFEF}
      */
    var selectedRegionColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the opacity of Selected Region.
      * @Default {0}
      */
    var selectedRegionOpacity: js.UndefOr[Double] = js.undefined
    
    /** Contains the options for selection the range navigator on mouse over.
      */
    var selectionSettings: js.UndefOr[NavigatorStyleSettingsSelectionSettings] = js.undefined
    
    /** Specifies the color of the thumb in range navigator.
      * @Default {#2382C3}
      */
    var thumbColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the radius of the thumb in range navigator.
      * @Default {10}
      */
    var thumbRadius: js.UndefOr[Double] = js.undefined
    
    /** Specifies the stroke color of the thumb in range navigator.
      * @Default {#303030}
      */
    var thumbStroke: js.UndefOr[String] = js.undefined
    
    /** Specifies the color of the unselected region in range navigator.
      * @Default {#5EABDE}
      */
    var unselectedRegionColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the opacity of Unselected Region.
      * @Default {0.3}
      */
    var unselectedRegionOpacity: js.UndefOr[Double] = js.undefined
  }
  object NavigatorStyleSettings {
    
    inline def apply(): NavigatorStyleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigatorStyleSettings]
    }
    
    extension [Self <: NavigatorStyleSettings](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorder(value: NavigatorStyleSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setHighlightSettings(value: NavigatorStyleSettingsHighlightSettings): Self = StObject.set(x, "highlightSettings", value.asInstanceOf[js.Any])
      
      inline def setHighlightSettingsUndefined: Self = StObject.set(x, "highlightSettings", js.undefined)
      
      inline def setLeftThumbTemplate(value: String): Self = StObject.set(x, "leftThumbTemplate", value.asInstanceOf[js.Any])
      
      inline def setLeftThumbTemplateUndefined: Self = StObject.set(x, "leftThumbTemplate", js.undefined)
      
      inline def setMajorGridLineStyle(value: NavigatorStyleSettingsMajorGridLineStyle): Self = StObject.set(x, "majorGridLineStyle", value.asInstanceOf[js.Any])
      
      inline def setMajorGridLineStyleUndefined: Self = StObject.set(x, "majorGridLineStyle", js.undefined)
      
      inline def setMinorGridLineStyle(value: NavigatorStyleSettingsMinorGridLineStyle): Self = StObject.set(x, "minorGridLineStyle", value.asInstanceOf[js.Any])
      
      inline def setMinorGridLineStyleUndefined: Self = StObject.set(x, "minorGridLineStyle", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRightThumbTemplate(value: String): Self = StObject.set(x, "rightThumbTemplate", value.asInstanceOf[js.Any])
      
      inline def setRightThumbTemplateUndefined: Self = StObject.set(x, "rightThumbTemplate", js.undefined)
      
      inline def setSelectedRegionColor(value: String): Self = StObject.set(x, "selectedRegionColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedRegionColorUndefined: Self = StObject.set(x, "selectedRegionColor", js.undefined)
      
      inline def setSelectedRegionOpacity(value: Double): Self = StObject.set(x, "selectedRegionOpacity", value.asInstanceOf[js.Any])
      
      inline def setSelectedRegionOpacityUndefined: Self = StObject.set(x, "selectedRegionOpacity", js.undefined)
      
      inline def setSelectionSettings(value: NavigatorStyleSettingsSelectionSettings): Self = StObject.set(x, "selectionSettings", value.asInstanceOf[js.Any])
      
      inline def setSelectionSettingsUndefined: Self = StObject.set(x, "selectionSettings", js.undefined)
      
      inline def setThumbColor(value: String): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
      
      inline def setThumbColorUndefined: Self = StObject.set(x, "thumbColor", js.undefined)
      
      inline def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
      
      inline def setThumbRadiusUndefined: Self = StObject.set(x, "thumbRadius", js.undefined)
      
      inline def setThumbStroke(value: String): Self = StObject.set(x, "thumbStroke", value.asInstanceOf[js.Any])
      
      inline def setThumbStrokeUndefined: Self = StObject.set(x, "thumbStroke", js.undefined)
      
      inline def setUnselectedRegionColor(value: String): Self = StObject.set(x, "unselectedRegionColor", value.asInstanceOf[js.Any])
      
      inline def setUnselectedRegionColorUndefined: Self = StObject.set(x, "unselectedRegionColor", js.undefined)
      
      inline def setUnselectedRegionOpacity(value: Double): Self = StObject.set(x, "unselectedRegionOpacity", value.asInstanceOf[js.Any])
      
      inline def setUnselectedRegionOpacityUndefined: Self = StObject.set(x, "unselectedRegionOpacity", js.undefined)
    }
  }
  
  trait NavigatorStyleSettingsBorder extends StObject {
    
    /** Specifies the border color of range navigator.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the dash array of range navigator.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Specifies the border width of range navigator.
      * @Default {0.5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object NavigatorStyleSettingsBorder {
    
    inline def apply(): NavigatorStyleSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigatorStyleSettingsBorder]
    }
    
    extension [Self <: NavigatorStyleSettingsBorder](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait NavigatorStyleSettingsHighlightSettings extends StObject {
    
    /** Contains the border properties for highlighting rectangle.
      */
    var border: js.UndefOr[NavigatorStyleSettingsHighlightSettingsBorder] = js.undefined
    
    /** To set the color to the highlight.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Enable the highlight settings in range navigator.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** To set the opacity to the highlight.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object NavigatorStyleSettingsHighlightSettings {
    
    inline def apply(): NavigatorStyleSettingsHighlightSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigatorStyleSettingsHighlightSettings]
    }
    
    extension [Self <: NavigatorStyleSettingsHighlightSettings](x: Self) {
      
      inline def setBorder(value: NavigatorStyleSettingsHighlightSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait NavigatorStyleSettingsHighlightSettingsBorder extends StObject {
    
    /** To set the border color to the highlight.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** To set the border width to the highlight.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object NavigatorStyleSettingsHighlightSettingsBorder {
    
    inline def apply(): NavigatorStyleSettingsHighlightSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigatorStyleSettingsHighlightSettingsBorder]
    }
    
    extension [Self <: NavigatorStyleSettingsHighlightSettingsBorder](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait NavigatorStyleSettingsMajorGridLineStyle extends StObject {
    
    /** Specifies the color of major grid lines in range navigator.
      * @Default {#B5B5B5}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Toggles the visibility of major grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object NavigatorStyleSettingsMajorGridLineStyle {
    
    inline def apply(): NavigatorStyleSettingsMajorGridLineStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigatorStyleSettingsMajorGridLineStyle]
    }
    
    extension [Self <: NavigatorStyleSettingsMajorGridLineStyle](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait NavigatorStyleSettingsMinorGridLineStyle extends StObject {
    
    /** Specifies the color of minor grid lines in range navigator.
      * @Default {#B5B5B5}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Toggles the visibility of minor grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object NavigatorStyleSettingsMinorGridLineStyle {
    
    inline def apply(): NavigatorStyleSettingsMinorGridLineStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigatorStyleSettingsMinorGridLineStyle]
    }
    
    extension [Self <: NavigatorStyleSettingsMinorGridLineStyle](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait NavigatorStyleSettingsSelectionSettings extends StObject {
    
    /** Contains the border properties for selecting the rectangle.
      */
    var border: js.UndefOr[NavigatorStyleSettingsSelectionSettingsBorder] = js.undefined
    
    /** To set the color to the selection.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Enable the selection settings in range navigator.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** To set the opacity to the selection.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object NavigatorStyleSettingsSelectionSettings {
    
    inline def apply(): NavigatorStyleSettingsSelectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigatorStyleSettingsSelectionSettings]
    }
    
    extension [Self <: NavigatorStyleSettingsSelectionSettings](x: Self) {
      
      inline def setBorder(value: NavigatorStyleSettingsSelectionSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait NavigatorStyleSettingsSelectionSettingsBorder extends StObject {
    
    /** To set the border color to the selection.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** To set the border width to the selection.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object NavigatorStyleSettingsSelectionSettingsBorder {
    
    inline def apply(): NavigatorStyleSettingsSelectionSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigatorStyleSettingsSelectionSettingsBorder]
    }
    
    extension [Self <: NavigatorStyleSettingsSelectionSettingsBorder](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait RangeChangedEventArgs extends StObject {
    
    /** parameters from range navigator
      */
    var Data: js.UndefOr[Any] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the range navigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RangeChangedEventArgs {
    
    inline def apply(): RangeChangedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeChangedEventArgs]
    }
    
    extension [Self <: RangeChangedEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RangeSettings extends StObject {
    
    /** Specifies the ending range of range navigator.
      * @Default {null}
      */
    var end: js.UndefOr[String] = js.undefined
    
    /** Specifies the starting range of range navigator.
      * @Default {null}
      */
    var start: js.UndefOr[String] = js.undefined
  }
  object RangeSettings {
    
    inline def apply(): RangeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeSettings]
    }
    
    extension [Self <: RangeSettings](x: Self) {
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait RightClickEventArgs extends StObject {
    
    /** parameters from range navigator
      */
    var Data: js.UndefOr[Any] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the range navigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RightClickEventArgs {
    
    inline def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    extension [Self <: RightClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ScrollChangedEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** parameters from RangeNavigator
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the scrollbar position new start and end range value on changing scrollbar
      */
    var dataNewRange: js.UndefOr[Any] = js.undefined
    
    /** returns the scrollbar position old start and end range value on changing scrollbar
      */
    var dataOldRange: js.UndefOr[Any] = js.undefined
    
    /** returns the RangeNavigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ScrollChangedEventArgs {
    
    inline def apply(): ScrollChangedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollChangedEventArgs]
    }
    
    extension [Self <: ScrollChangedEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNewRange(value: Any): Self = StObject.set(x, "dataNewRange", value.asInstanceOf[js.Any])
      
      inline def setDataNewRangeUndefined: Self = StObject.set(x, "dataNewRange", js.undefined)
      
      inline def setDataOldRange(value: Any): Self = StObject.set(x, "dataOldRange", value.asInstanceOf[js.Any])
      
      inline def setDataOldRangeUndefined: Self = StObject.set(x, "dataOldRange", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ScrollEndEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** parameters from RangeNavigator
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the scrollbar position new start and end range value on change end of scrollbar
      */
    var dataNewRange: js.UndefOr[Any] = js.undefined
    
    /** returns the scrollbar position old start and end range value on change end of scrollbar
      */
    var dataOldRange: js.UndefOr[Any] = js.undefined
    
    /** returns the RangeNavigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ScrollEndEventArgs {
    
    inline def apply(): ScrollEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollEndEventArgs]
    }
    
    extension [Self <: ScrollEndEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNewRange(value: Any): Self = StObject.set(x, "dataNewRange", value.asInstanceOf[js.Any])
      
      inline def setDataNewRangeUndefined: Self = StObject.set(x, "dataNewRange", js.undefined)
      
      inline def setDataOldRange(value: Any): Self = StObject.set(x, "dataOldRange", value.asInstanceOf[js.Any])
      
      inline def setDataOldRangeUndefined: Self = StObject.set(x, "dataOldRange", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ScrollRangeSettings extends StObject {
    
    /** Specifies the ending range of range navigator scrollbar and that should be greater than the rangenavigator datasource end value.
      * @Default {null}
      */
    var end: js.UndefOr[String] = js.undefined
    
    /** Specifies the starting range of range navigator scrollbar and that should be less than the rangenavigator datasource start value.
      * @Default {null}
      */
    var start: js.UndefOr[String] = js.undefined
  }
  object ScrollRangeSettings {
    
    inline def apply(): ScrollRangeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollRangeSettings]
    }
    
    extension [Self <: ScrollRangeSettings](x: Self) {
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait ScrollStartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** parameters from RangeNavigator
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the scrollbar position end range value on changing scrollbar
      */
    var dataEndRange: js.UndefOr[String] = js.undefined
    
    /** returns the scrollbar position starting range value on changing scrollbar
      */
    var dataStartRange: js.UndefOr[String] = js.undefined
    
    /** returns the RangeNavigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ScrollStartEventArgs {
    
    inline def apply(): ScrollStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollStartEventArgs]
    }
    
    extension [Self <: ScrollStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataEndRange(value: String): Self = StObject.set(x, "dataEndRange", value.asInstanceOf[js.Any])
      
      inline def setDataEndRangeUndefined: Self = StObject.set(x, "dataEndRange", js.undefined)
      
      inline def setDataStartRange(value: String): Self = StObject.set(x, "dataStartRange", value.asInstanceOf[js.Any])
      
      inline def setDataStartRangeUndefined: Self = StObject.set(x, "dataStartRange", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SelectedRangeEndEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** parameters from RangeNavigator
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the RangeNavigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SelectedRangeEndEventArgs {
    
    inline def apply(): SelectedRangeEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectedRangeEndEventArgs]
    }
    
    extension [Self <: SelectedRangeEndEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SelectedRangeSettings extends StObject {
    
    /** Specifies the ending range of range navigator.
      * @Default {null}
      */
    var end: js.UndefOr[String] = js.undefined
    
    /** Specifies the starting range of range navigator.
      * @Default {null}
      */
    var start: js.UndefOr[String] = js.undefined
  }
  object SelectedRangeSettings {
    
    inline def apply(): SelectedRangeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectedRangeSettings]
    }
    
    extension [Self <: SelectedRangeSettings](x: Self) {
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait SelectedRangeStartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** parameters from RangeNavigator
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the RangeNavigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SelectedRangeStartEventArgs {
    
    inline def apply(): SelectedRangeStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectedRangeStartEventArgs]
    }
    
    extension [Self <: SelectedRangeStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Series extends StObject {
    
    /** Specifies the dataSource for the series. It can be an array of JSON objects or an instance of ej.DataManager.
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Enable/disable the animation of series.
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Fill color of the series.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Specifies the type of the series to render in chart.
      * @Default {column. see Type}
      */
    var `type`: js.UndefOr[typingsJapgolly.ejWebAll.ej.Type | String] = js.undefined
    
    /** Name of the property in the datasource that contains x value for the series.
      * @Default {null}
      */
    var xName: js.UndefOr[String] = js.undefined
    
    /** Name of the property in the datasource that contains y value for the series.
      * @Default {null}
      */
    var yName: js.UndefOr[String] = js.undefined
  }
  object Series {
    
    inline def apply(): Series = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Series]
    }
    
    extension [Self <: Series](x: Self) {
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setType(value: typingsJapgolly.ejWebAll.ej.Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXName(value: String): Self = StObject.set(x, "xName", value.asInstanceOf[js.Any])
      
      inline def setXNameUndefined: Self = StObject.set(x, "xName", js.undefined)
      
      inline def setYName(value: String): Self = StObject.set(x, "yName", value.asInstanceOf[js.Any])
      
      inline def setYNameUndefined: Self = StObject.set(x, "yName", js.undefined)
    }
  }
  
  trait SeriesSetting extends StObject {
    
    /** Specifies the dataSource for the series. It can be an array of JSON objects or an instance of ej.DataManager.
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Enable/disable the animation of series.
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Fill color of the series.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Specifies the type of the series to render in chart.
      * @Default {column. see Type}
      */
    var `type`: js.UndefOr[typingsJapgolly.ejWebAll.ej.Type | String] = js.undefined
    
    /** Name of the property in the datasource that contains x value for the series.
      * @Default {null}
      */
    var xName: js.UndefOr[String] = js.undefined
    
    /** Name of the property in the datasource that contains y value for the series.
      * @Default {null}
      */
    var yName: js.UndefOr[String] = js.undefined
  }
  object SeriesSetting {
    
    inline def apply(): SeriesSetting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesSetting]
    }
    
    extension [Self <: SeriesSetting](x: Self) {
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setType(value: typingsJapgolly.ejWebAll.ej.Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXName(value: String): Self = StObject.set(x, "xName", value.asInstanceOf[js.Any])
      
      inline def setXNameUndefined: Self = StObject.set(x, "xName", js.undefined)
      
      inline def setYName(value: String): Self = StObject.set(x, "yName", value.asInstanceOf[js.Any])
      
      inline def setYNameUndefined: Self = StObject.set(x, "yName", js.undefined)
    }
  }
  
  trait SizeSettings extends StObject {
    
    /** Specifies height of the range navigator.
      * @Default {null}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Specifies width of the range navigator.
      * @Default {null}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object SizeSettings {
    
    inline def apply(): SizeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeSettings]
    }
    
    extension [Self <: SizeSettings](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TooltipSettings extends StObject {
    
    /** Specifies the background color of tooltip.
      * @Default {#303030}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the font in tooltip.
      */
    var font: js.UndefOr[TooltipSettingsFont] = js.undefined
    
    /** Specifies the format of text to be displayed in tooltip.
      * @Default {MM/dd/yyyy}
      */
    var labelFormat: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode of displaying the tooltip. Neither to display the tooltip always nor on demand.
      * @Default {null}
      */
    var tooltipDisplayMode: js.UndefOr[String] = js.undefined
    
    /** Toggles the visibility of tooltip.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object TooltipSettings {
    
    inline def apply(): TooltipSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettings]
    }
    
    extension [Self <: TooltipSettings](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setFont(value: TooltipSettingsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLabelFormat(value: String): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
      
      inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
      
      inline def setTooltipDisplayMode(value: String): Self = StObject.set(x, "tooltipDisplayMode", value.asInstanceOf[js.Any])
      
      inline def setTooltipDisplayModeUndefined: Self = StObject.set(x, "tooltipDisplayMode", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait TooltipSettingsFont extends StObject {
    
    /** Specifies the color of text in tooltip. Tooltip text render in the specified color.
      * @Default {#FFFFFF}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the font family of text in tooltip. Tooltip text render in the specified font family.
      * @Default {Segoe UI}
      */
    var family: js.UndefOr[String] = js.undefined
    
    /** Specifies the font style of text in tooltip. Tooltip text render in the specified font style.
      * @Default {ej.datavisualization.RangeNavigator.fontStyle.Normal}
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /** Specifies the opacity of text in tooltip. Tooltip text render in the specified opacity.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the size of text in tooltip. Tooltip text render in the specified size.
      * @Default {10px}
      */
    var size: js.UndefOr[String] = js.undefined
    
    /** Specifies the weight of text in tooltip. Tooltip text render in the specified weight.
      * @Default {ej.datavisualization.RangeNavigator.weight.Regular}
      */
    var weight: js.UndefOr[String] = js.undefined
  }
  object TooltipSettingsFont {
    
    inline def apply(): TooltipSettingsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettingsFont]
    }
    
    extension [Self <: TooltipSettingsFont](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait ValueAxisSettings extends StObject {
    
    /** Options for customizing the axis line.
      */
    var axisLine: js.UndefOr[ValueAxisSettingsAxisLine] = js.undefined
    
    /** Options for customizing the font of the axis.
      */
    var font: js.UndefOr[ValueAxisSettingsFont] = js.undefined
    
    /** Options for customizing the major grid lines.
      */
    var majorGridLines: js.UndefOr[ValueAxisSettingsMajorGridLines] = js.undefined
    
    /** Options for customizing the major tick lines in axis.
      */
    var majorTickLines: js.UndefOr[ValueAxisSettingsMajorTickLines] = js.undefined
    
    /** You can customize the range of the axis by setting minimum , maximum and interval.
      */
    var range: js.UndefOr[ValueAxisSettingsRange] = js.undefined
    
    /** If the range is not given explicitly, range will be calculated automatically. You can customize the automatic range calculation using rangePadding.
      * @Default {none}
      */
    var rangePadding: js.UndefOr[String] = js.undefined
    
    /** Toggles the visibility of axis in range navigator.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ValueAxisSettings {
    
    inline def apply(): ValueAxisSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueAxisSettings]
    }
    
    extension [Self <: ValueAxisSettings](x: Self) {
      
      inline def setAxisLine(value: ValueAxisSettingsAxisLine): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
      
      inline def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
      
      inline def setFont(value: ValueAxisSettingsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setMajorGridLines(value: ValueAxisSettingsMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
      
      inline def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
      
      inline def setMajorTickLines(value: ValueAxisSettingsMajorTickLines): Self = StObject.set(x, "majorTickLines", value.asInstanceOf[js.Any])
      
      inline def setMajorTickLinesUndefined: Self = StObject.set(x, "majorTickLines", js.undefined)
      
      inline def setRange(value: ValueAxisSettingsRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangePadding(value: String): Self = StObject.set(x, "rangePadding", value.asInstanceOf[js.Any])
      
      inline def setRangePaddingUndefined: Self = StObject.set(x, "rangePadding", js.undefined)
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait ValueAxisSettingsAxisLine extends StObject {
    
    /** Toggles the visibility of axis line.
      * @Default {none}
      */
    var visible: js.UndefOr[String] = js.undefined
  }
  object ValueAxisSettingsAxisLine {
    
    inline def apply(): ValueAxisSettingsAxisLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueAxisSettingsAxisLine]
    }
    
    extension [Self <: ValueAxisSettingsAxisLine](x: Self) {
      
      inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait ValueAxisSettingsFont extends StObject {
    
    /** Text in axis render with the specified size.
      * @Default {0px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object ValueAxisSettingsFont {
    
    inline def apply(): ValueAxisSettingsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueAxisSettingsFont]
    }
    
    extension [Self <: ValueAxisSettingsFont](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ValueAxisSettingsMajorGridLines extends StObject {
    
    /** Toggles the visibility of major grid lines.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ValueAxisSettingsMajorGridLines {
    
    inline def apply(): ValueAxisSettingsMajorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueAxisSettingsMajorGridLines]
    }
    
    extension [Self <: ValueAxisSettingsMajorGridLines](x: Self) {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait ValueAxisSettingsMajorTickLines extends StObject {
    
    /** Specifies the size of the majorTickLines in range navigator
      * @Default {0}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Toggles the visibility of major tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies width of the major tick lines.
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ValueAxisSettingsMajorTickLines {
    
    inline def apply(): ValueAxisSettingsMajorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueAxisSettingsMajorTickLines]
    }
    
    extension [Self <: ValueAxisSettingsMajorTickLines](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ValueAxisSettingsRange extends StObject {
    
    /** Default Value
      * @Default {null}
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /** Default Value
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /** Default Value
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.undefined
  }
  object ValueAxisSettingsRange {
    
    inline def apply(): ValueAxisSettingsRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueAxisSettingsRange]
    }
    
    extension [Self <: ValueAxisSettingsRange](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
}
