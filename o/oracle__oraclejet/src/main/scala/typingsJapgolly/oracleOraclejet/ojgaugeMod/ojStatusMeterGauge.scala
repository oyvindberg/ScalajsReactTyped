package typingsJapgolly.oracleOraclejet.ojgaugeMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.oracleOraclejet.anon.BorderColorBorderRadius
import typingsJapgolly.oracleOraclejet.anon.ConverterPosition
import typingsJapgolly.oracleOraclejet.anon.PositionStyle
import typingsJapgolly.oracleOraclejet.anon.`12`
import typingsJapgolly.oracleOraclejet.anon.`13`
import typingsJapgolly.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.ReferenceLine
import typingsJapgolly.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.Threshold
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.angleExtent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.angleExtentChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationDuration
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationDurationChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.borderColor
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.borderColorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.borderRadius
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.borderRadiusChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.centerChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circular
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.color
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.currentOnly
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.indicatorSize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.indicatorSizeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.innerRadius
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.innerRadiusChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.label
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.max
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.metricLabel
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.metricLabelChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.min
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.onIndicator
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.plotArea
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.plotAreaChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readonly_
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.referenceLines
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.referenceLinesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.startAngle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.startAngleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.step
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thresholdDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thresholdDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thresholds
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thresholdsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transientValueChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.value
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojStatusMeterGauge
  extends StObject
     with dvtBaseGauge[ojStatusMeterGaugeSettableProperties] {
  
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: orientationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: svgStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: thresholdDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: thresholdDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: visualEffectsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_angleExtentChanged(`type`: angleExtentChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_angleExtentChanged(
    `type`: angleExtentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(`type`: borderColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: borderColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderRadiusChanged(`type`: borderRadiusChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderRadiusChanged(
    `type`: borderRadiusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_centerChanged(`type`: centerChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_centerChanged(
    `type`: centerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(`type`: colorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_indicatorSizeChanged(`type`: indicatorSizeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_indicatorSizeChanged(
    `type`: indicatorSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_innerRadiusChanged(`type`: innerRadiusChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_innerRadiusChanged(
    `type`: innerRadiusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(`type`: labelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(`type`: maxChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metricLabelChanged(`type`: metricLabelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metricLabelChanged(
    `type`: metricLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(`type`: minChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(`type`: plotAreaChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(`type`: readonlyChanged_, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceLinesChanged(
    `type`: referenceLinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceLinesChanged(
    `type`: referenceLinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startAngleChanged(`type`: startAngleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startAngleChanged(
    `type`: startAngleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepChanged(`type`: stepChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepChanged(
    `type`: stepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(`type`: svgClassNameChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(`type`: thresholdsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: thresholdsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(`type`: tooltipChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(`type`: valueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  var angleExtent: Double = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var animationOnDataChange: auto | none = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var borderColor: String = js.native
  
  var borderRadius: String = js.native
  
  var center: `12` = js.native
  
  var color: String = js.native
  
  def getMetricLabel(): String = js.native
  
  @JSName("getProperty")
  def getProperty_angleExtent(property: angleExtent): Double = js.native
  @JSName("getProperty")
  def getProperty_animationDuration(property: animationDuration): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_borderColor(property: borderColor): String = js.native
  @JSName("getProperty")
  def getProperty_borderRadius(property: borderRadius): String = js.native
  @JSName("getProperty")
  def getProperty_center(property: center): `12` = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): String = js.native
  @JSName("getProperty")
  def getProperty_indicatorSize(property: indicatorSize): Double = js.native
  @JSName("getProperty")
  def getProperty_innerRadius(property: innerRadius): Double = js.native
  @JSName("getProperty")
  def getProperty_label(property: label): PositionStyle = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_metricLabel(property: metricLabel): ConverterPosition = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): circular | vertical | horizontal = js.native
  @JSName("getProperty")
  def getProperty_plotArea(property: plotArea): BorderColorBorderRadius = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  @JSName("getProperty")
  def getProperty_referenceLines(property: referenceLines): js.Array[ReferenceLine] = js.native
  @JSName("getProperty")
  def getProperty_startAngle(property: startAngle): Double = js.native
  @JSName("getProperty")
  def getProperty_step(property: step): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_thresholdDisplay(property: thresholdDisplay): currentOnly | all | onIndicator = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: thresholds): js.Array[Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `13` = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transientValue): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  
  var indicatorSize: Double = js.native
  
  var innerRadius: Double = js.native
  
  var label: PositionStyle = js.native
  
  var max: Double = js.native
  
  var metricLabel: ConverterPosition = js.native
  
  var min: Double = js.native
  
  var onAngleExtentChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAnimationDurationChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onBorderColorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onBorderRadiusChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onCenterChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onColorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onIndicatorSizeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onInnerRadiusChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onLabelChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMaxChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMetricLabelChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMinChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOrientationChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onPlotAreaChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onReadonlyChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onReferenceLinesChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onStartAngleChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onStepChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSvgClassNameChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSvgStyleChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onThresholdDisplayChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onThresholdsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTransientValueChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onValueChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onVisualEffectsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var orientation: circular | vertical | horizontal = js.native
  
  var plotArea: BorderColorBorderRadius = js.native
  
  var readonly: Boolean = js.native
  
  var referenceLines: js.Array[ReferenceLine] = js.native
  
  def setProperties(properties: ojStatusMeterGaugeSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: animationOnDataChange, value: auto | none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto | none): Unit = js.native
  def setProperty(property: orientation, value: circular | vertical | horizontal): Unit = js.native
  def setProperty(property: thresholdDisplay, value: currentOnly | all | onIndicator): Unit = js.native
  def setProperty(property: visualEffects, value: none | auto): Unit = js.native
  @JSName("setProperty")
  def setProperty_angleExtent(property: angleExtent, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: borderColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderRadius(property: borderRadius, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_center(property: center, value: `12`): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_indicatorSize(property: indicatorSize, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_innerRadius(property: innerRadius, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: label, value: PositionStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_metricLabel(property: metricLabel, value: ConverterPosition): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_plotArea(property: plotArea, value: BorderColorBorderRadius): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceLines(property: referenceLines, value: js.Array[ReferenceLine]): Unit = js.native
  @JSName("setProperty")
  def setProperty_startAngle(property: startAngle, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(property: thresholds, value: js.Array[Threshold]): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `13`): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transientValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transientValue, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
  
  var startAngle: Double = js.native
  
  var step: Double | Null = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var thresholdDisplay: currentOnly | all | onIndicator = js.native
  
  var thresholds: js.Array[Threshold] = js.native
  
  var tooltip: `13` = js.native
  
  val transientValue: Double | Null = js.native
  
  var value: Double | Null = js.native
  
  var visualEffects: none | auto = js.native
}
object ojStatusMeterGauge {
  
  // tslint:disable-next-line interface-over-type-literal
  trait Bounds extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Bounds {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Bounds = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds]
    }
    
    extension [Self <: Bounds](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait CenterContext extends StObject {
    
    var componentElement: Element
    
    var innerBounds: Bounds
    
    var metricLabel: String
    
    var outerBounds: Bounds
  }
  object CenterContext {
    
    inline def apply(componentElement: Element, innerBounds: Bounds, metricLabel: String, outerBounds: Bounds): CenterContext = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
      __obj.asInstanceOf[CenterContext]
    }
    
    extension [Self <: CenterContext](x: Self) {
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setInnerBounds(value: Bounds): Self = StObject.set(x, "innerBounds", value.asInstanceOf[js.Any])
      
      inline def setMetricLabel(value: String): Self = StObject.set(x, "metricLabel", value.asInstanceOf[js.Any])
      
      inline def setOuterBounds(value: Bounds): Self = StObject.set(x, "outerBounds", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait ReferenceLine extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object ReferenceLine {
    
    inline def apply(): ReferenceLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReferenceLine]
    }
    
    extension [Self <: ReferenceLine](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait Threshold extends StObject {
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var shortDesc: js.UndefOr[String] = js.undefined
  }
  object Threshold {
    
    inline def apply(): Threshold = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Threshold]
    }
    
    extension [Self <: Threshold](x: Self) {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
      
      inline def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait TooltipContext extends StObject {
    
    var color: String
    
    var componentElement: Element
    
    var label: String
    
    var parentElement: Element
  }
  object TooltipContext {
    
    inline def apply(color: String, componentElement: Element, label: String, parentElement: Element): TooltipContext = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipContext]
    }
    
    extension [Self <: TooltipContext](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    }
  }
}
