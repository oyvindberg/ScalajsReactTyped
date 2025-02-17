package typingsJapgolly.antvG2plot

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CanvasPattern
import typingsJapgolly.antvG2.libChartLayoutPaddingCalMod.PaddingCalCtor
import typingsJapgolly.antvG2.libChartViewMod.View
import typingsJapgolly.antvG2.libInterfaceMod.SyncViewPaddingFn
import typingsJapgolly.antvG2plot.anon.FixedValue
import typingsJapgolly.antvG2plot.anon.Target
import typingsJapgolly.antvG2plot.antvG2plotStrings.`node-link`
import typingsJapgolly.antvG2plot.antvG2plotStrings.auto
import typingsJapgolly.antvG2plot.antvG2plotStrings.canvas
import typingsJapgolly.antvG2plot.antvG2plotStrings.center
import typingsJapgolly.antvG2plot.antvG2plotStrings.detail
import typingsJapgolly.antvG2plot.antvG2plotStrings.justify
import typingsJapgolly.antvG2plot.antvG2plotStrings.left
import typingsJapgolly.antvG2plot.antvG2plotStrings.right
import typingsJapgolly.antvG2plot.antvG2plotStrings.svg
import typingsJapgolly.antvG2plot.libPlotsSankeyLayoutMod.NodeDepth
import typingsJapgolly.antvG2plot.libPlotsSankeyLayoutMod.NodeSort
import typingsJapgolly.antvG2plot.libTypesAnimationMod.Animation
import typingsJapgolly.antvG2plot.libTypesAnnotationMod.Annotation
import typingsJapgolly.antvG2plot.libTypesAttrMod.ColorAttr
import typingsJapgolly.antvG2plot.libTypesAttrMod.PatternAttr
import typingsJapgolly.antvG2plot.libTypesAttrMod.ShapeStyle
import typingsJapgolly.antvG2plot.libTypesAttrMod.StyleAttr
import typingsJapgolly.antvG2plot.libTypesCommonMod.Data
import typingsJapgolly.antvG2plot.libTypesCommonMod.Datum
import typingsJapgolly.antvG2plot.libTypesInteractionMod.Interaction
import typingsJapgolly.antvG2plot.libTypesLabelMod.Label
import typingsJapgolly.antvG2plot.libTypesLegendMod.Legend
import typingsJapgolly.antvG2plot.libTypesMetaMod.Meta
import typingsJapgolly.antvG2plot.libTypesScrollbarMod.Scrollbar
import typingsJapgolly.antvG2plot.libTypesSliderMod.Slider
import typingsJapgolly.antvG2plot.libTypesStateMod.State
import typingsJapgolly.antvG2plot.libTypesTooltipMod.Tooltip
import typingsJapgolly.antvG2plot.libUtilsPatternMod.PatternOption
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsSankeyTypesMod {
  
  trait NodeLinkData extends StObject {
    
    val links: js.Array[Target]
    
    /**
      * @title 节点数据
      */
    val nodes: js.Array[FixedValue]
  }
  object NodeLinkData {
    
    inline def apply(links: js.Array[Target], nodes: js.Array[FixedValue]): NodeLinkData = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeLinkData]
    }
    
    extension [Self <: NodeLinkData](x: Self) {
      
      inline def setLinks(value: js.Array[Target]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: Target*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[FixedValue]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: FixedValue*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  /* Inlined parent std.Omit<@antv/g2plot.@antv/g2plot/lib/types.Options, 'data' | 'xField' | 'yField' | 'xAxis' | 'yAxis'> */
  trait SankeyOptions extends StObject {
    
    var animation: js.UndefOr[Animation] = js.undefined
    
    var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
    
    var appendPadding: js.UndefOr[js.Array[Double] | Double] = js.undefined
    
    var autoFit: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[ColorAttr] = js.undefined
    
    /**
      * @title 数据
      */
    val data: Data | NodeLinkData
    
    /**
      * @title 数据集的类型
      * @description 数据集的类型 'node-link' | 'detail'
      * @default "detail"
      */
    val dataType: js.UndefOr[`node-link` | detail] = js.undefined
    
    var defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @title 边交互
      */
    val edgeInteractions: js.UndefOr[js.Array[Interaction]] = js.undefined
    
    /**
      * @title 边状态样式
      */
    val edgeState: js.UndefOr[State] = js.undefined
    
    /**
      * @title 边样式
      */
    val edgeStyle: js.UndefOr[StyleAttr] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
    
    var label: js.UndefOr[Label] = js.undefined
    
    var legend: js.UndefOr[Legend] = js.undefined
    
    var limitInPlot: js.UndefOr[Boolean] = js.undefined
    
    var localRefresh: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[Record[String, Meta]] = js.undefined
    
    /**
      * @title 节点对齐的方式
      * @description 节点对齐的方式 'left' | 'right' | 'center' | 'justify'
      * @default "justify"
      */
    val nodeAlign: js.UndefOr[left | right | center | justify] = js.undefined
    
    /**
      * @title 节点排放分层的顺序
      * @description 从 0 开始，并且返回值需要保证所有的层级都有节点
      */
    val nodeDepth: js.UndefOr[NodeDepth] = js.undefined
    
    /**
      * @title 节点位置是否可以拖拽
      * @default false
      */
    val nodeDraggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 节点交互
      */
    val nodeInteractions: js.UndefOr[js.Array[Interaction]] = js.undefined
    
    /**
      * @title 节点间距的像素设置
      * @description 优先级高于 nodePaddingRatio
      */
    val nodePadding: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 节点之间的间距比例
      * @description 参考画布高度
      * @default 0.03
      */
    val nodePaddingRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 节点排序方式
      */
    val nodeSort: js.UndefOr[NodeSort] = js.undefined
    
    /**
      * @title 节点状态样式
      */
    val nodeState: js.UndefOr[State] = js.undefined
    
    /**
      * @title 节点样式
      */
    val nodeStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title 节点宽度的像素设置
      * @description 优先级高于 nodeWidthRatio
      */
    val nodeWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 节点宽度
      * @description 参考画布的宽度
      * @default 0.008
      */
    val nodeWidthRatio: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[js.Array[Double] | Double | auto] = js.undefined
    
    var pattern: js.UndefOr[PatternAttr] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 附加的元字段
      */
    val rawFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var renderer: js.UndefOr[svg | canvas] = js.undefined
    
    var scrollbar: js.UndefOr[Scrollbar] = js.undefined
    
    var slider: js.UndefOr[Slider] = js.undefined
    
    /**
      * @title 来源字段
      * @description dataType = 'node-link' 的时候，不用传
      */
    val sourceField: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
    
    var supportCSSTransform: js.UndefOr[Boolean] = js.undefined
    
    var syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
    
    /**
      * @title 去向字段
      * @description dataType = 'node-link' 的时候，不用传
      */
    val targetField: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[String | js.Object] = js.undefined
    
    var tooltip: js.UndefOr[Tooltip] = js.undefined
    
    var useDeferredLabel: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * @title 权重字段
      * @description dataType = 'node-link' 的时候，不用传
      */
    val weightField: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SankeyOptions {
    
    inline def apply(data: Data | NodeLinkData): SankeyOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyOptions]
    }
    
    extension [Self <: SankeyOptions](x: Self) {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setAppendPadding(value: js.Array[Double] | Double): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
      
      inline def setAppendPaddingUndefined: Self = StObject.set(x, "appendPadding", js.undefined)
      
      inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
      
      inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
      
      inline def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
      
      inline def setColor(value: ColorAttr): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setData(value: Data | NodeLinkData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: `node-link` | detail): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaultInteractions(value: js.Array[String]): Self = StObject.set(x, "defaultInteractions", value.asInstanceOf[js.Any])
      
      inline def setDefaultInteractionsUndefined: Self = StObject.set(x, "defaultInteractions", js.undefined)
      
      inline def setDefaultInteractionsVarargs(value: String*): Self = StObject.set(x, "defaultInteractions", js.Array(value*))
      
      inline def setEdgeInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "edgeInteractions", value.asInstanceOf[js.Any])
      
      inline def setEdgeInteractionsUndefined: Self = StObject.set(x, "edgeInteractions", js.undefined)
      
      inline def setEdgeInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "edgeInteractions", js.Array(value*))
      
      inline def setEdgeState(value: State): Self = StObject.set(x, "edgeState", value.asInstanceOf[js.Any])
      
      inline def setEdgeStateUndefined: Self = StObject.set(x, "edgeState", js.undefined)
      
      inline def setEdgeStyle(value: StyleAttr): Self = StObject.set(x, "edgeStyle", value.asInstanceOf[js.Any])
      
      inline def setEdgeStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "edgeStyle", js.Any.fromFunction1(value))
      
      inline def setEdgeStyleUndefined: Self = StObject.set(x, "edgeStyle", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value*))
      
      inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLimitInPlot(value: Boolean): Self = StObject.set(x, "limitInPlot", value.asInstanceOf[js.Any])
      
      inline def setLimitInPlotUndefined: Self = StObject.set(x, "limitInPlot", js.undefined)
      
      inline def setLocalRefresh(value: Boolean): Self = StObject.set(x, "localRefresh", value.asInstanceOf[js.Any])
      
      inline def setLocalRefreshUndefined: Self = StObject.set(x, "localRefresh", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMeta(value: Record[String, Meta]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNodeAlign(value: left | right | center | justify): Self = StObject.set(x, "nodeAlign", value.asInstanceOf[js.Any])
      
      inline def setNodeAlignUndefined: Self = StObject.set(x, "nodeAlign", js.undefined)
      
      inline def setNodeDepth(value: (/* datum */ Datum, /* maxDepth */ Double) => Double): Self = StObject.set(x, "nodeDepth", js.Any.fromFunction2(value))
      
      inline def setNodeDepthUndefined: Self = StObject.set(x, "nodeDepth", js.undefined)
      
      inline def setNodeDraggable(value: Boolean): Self = StObject.set(x, "nodeDraggable", value.asInstanceOf[js.Any])
      
      inline def setNodeDraggableUndefined: Self = StObject.set(x, "nodeDraggable", js.undefined)
      
      inline def setNodeInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "nodeInteractions", value.asInstanceOf[js.Any])
      
      inline def setNodeInteractionsUndefined: Self = StObject.set(x, "nodeInteractions", js.undefined)
      
      inline def setNodeInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "nodeInteractions", js.Array(value*))
      
      inline def setNodePadding(value: Double): Self = StObject.set(x, "nodePadding", value.asInstanceOf[js.Any])
      
      inline def setNodePaddingRatio(value: Double): Self = StObject.set(x, "nodePaddingRatio", value.asInstanceOf[js.Any])
      
      inline def setNodePaddingRatioUndefined: Self = StObject.set(x, "nodePaddingRatio", js.undefined)
      
      inline def setNodePaddingUndefined: Self = StObject.set(x, "nodePadding", js.undefined)
      
      inline def setNodeSort(value: (/* a */ Datum, /* b */ Datum) => Double): Self = StObject.set(x, "nodeSort", js.Any.fromFunction2(value))
      
      inline def setNodeSortUndefined: Self = StObject.set(x, "nodeSort", js.undefined)
      
      inline def setNodeState(value: State): Self = StObject.set(x, "nodeState", value.asInstanceOf[js.Any])
      
      inline def setNodeStateUndefined: Self = StObject.set(x, "nodeState", js.undefined)
      
      inline def setNodeStyle(value: StyleAttr): Self = StObject.set(x, "nodeStyle", value.asInstanceOf[js.Any])
      
      inline def setNodeStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "nodeStyle", js.Any.fromFunction1(value))
      
      inline def setNodeStyleUndefined: Self = StObject.set(x, "nodeStyle", js.undefined)
      
      inline def setNodeWidth(value: Double): Self = StObject.set(x, "nodeWidth", value.asInstanceOf[js.Any])
      
      inline def setNodeWidthRatio(value: Double): Self = StObject.set(x, "nodeWidthRatio", value.asInstanceOf[js.Any])
      
      inline def setNodeWidthRatioUndefined: Self = StObject.set(x, "nodeWidthRatio", js.undefined)
      
      inline def setNodeWidthUndefined: Self = StObject.set(x, "nodeWidth", js.undefined)
      
      inline def setPadding(value: js.Array[Double] | Double | auto): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPattern(value: PatternAttr): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternFunction2(value: (/* datum */ Datum, /* color */ String) => PatternOption | CanvasPattern): Self = StObject.set(x, "pattern", js.Any.fromFunction2(value))
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setRawFields(value: js.Array[String]): Self = StObject.set(x, "rawFields", value.asInstanceOf[js.Any])
      
      inline def setRawFieldsUndefined: Self = StObject.set(x, "rawFields", js.undefined)
      
      inline def setRawFieldsVarargs(value: String*): Self = StObject.set(x, "rawFields", js.Array(value*))
      
      inline def setRenderer(value: svg | canvas): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setScrollbar(value: Scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setSourceField(value: String): Self = StObject.set(x, "sourceField", value.asInstanceOf[js.Any])
      
      inline def setSourceFieldUndefined: Self = StObject.set(x, "sourceField", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSupportCSSTransform(value: Boolean): Self = StObject.set(x, "supportCSSTransform", value.asInstanceOf[js.Any])
      
      inline def setSupportCSSTransformUndefined: Self = StObject.set(x, "supportCSSTransform", js.undefined)
      
      inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
      
      inline def setSyncViewPaddingFunction3(value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => Callback): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3((t0: /* chart */ View, t1: /* views */ js.Array[View], t2: /* PC */ PaddingCalCtor) => (value(t0, t1, t2)).runNow()))
      
      inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
      
      inline def setTargetField(value: String): Self = StObject.set(x, "targetField", value.asInstanceOf[js.Any])
      
      inline def setTargetFieldUndefined: Self = StObject.set(x, "targetField", js.undefined)
      
      inline def setTheme(value: String | js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUseDeferredLabel(value: Boolean | Double): Self = StObject.set(x, "useDeferredLabel", value.asInstanceOf[js.Any])
      
      inline def setUseDeferredLabelUndefined: Self = StObject.set(x, "useDeferredLabel", js.undefined)
      
      inline def setWeightField(value: String): Self = StObject.set(x, "weightField", value.asInstanceOf[js.Any])
      
      inline def setWeightFieldUndefined: Self = StObject.set(x, "weightField", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
