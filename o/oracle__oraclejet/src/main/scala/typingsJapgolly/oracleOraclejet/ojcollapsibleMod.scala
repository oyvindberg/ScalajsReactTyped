package typingsJapgolly.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.mod.baseComponentEventMap
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disclosureIcon
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.expandArea
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.expandAreaChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.expanded
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.header
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojCollapse
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojExpand
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcollapsibleMod {
  
  @js.native
  trait ojCollapsible
    extends StObject
       with baseComponent[ojCollapsibleSettableProperties] {
    
    def addEventListener(`type`: expandAreaChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    def addEventListener(
      `type`: expandAreaChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_disabledChanged(`type`: disabledChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_disabledChanged(
      `type`: disabledChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_expandedChanged(`type`: expandedChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_expandedChanged(
      `type`: expandedChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCollapse(`type`: ojBeforeCollapse, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCollapse(
      `type`: ojBeforeCollapse,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeExpand(`type`: ojBeforeExpand, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeExpand(
      `type`: ojBeforeExpand,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojCollapse(`type`: ojCollapse, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojCollapse(
      `type`: ojCollapse,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojExpand(`type`: ojExpand, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojExpand(
      `type`: ojExpand,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    
    var disabled: Boolean = js.native
    
    var expandArea: header | disclosureIcon = js.native
    
    var expanded: Boolean = js.native
    
    @JSName("getProperty")
    def getProperty_disabled(property: disabled): Boolean = js.native
    @JSName("getProperty")
    def getProperty_expandArea(property: expandArea): header | disclosureIcon = js.native
    @JSName("getProperty")
    def getProperty_expanded(property: expanded): Boolean = js.native
    
    var onDisabledChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onExpandAreaChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onExpandedChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjBeforeCollapse: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjBeforeExpand: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjCollapse: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjExpand: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    def setProperties(properties: ojCollapsibleSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: expandArea, value: header | disclosureIcon): Unit = js.native
    @JSName("setProperty")
    def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_expanded(property: expanded, value: Boolean): Unit = js.native
  }
  object ojCollapsible {
    
    type ojBeforeCollapse = CustomEvent
    
    type ojBeforeExpand = CustomEvent
    
    type ojCollapse = CustomEvent
    
    type ojExpand = CustomEvent
  }
  
  trait ojCollapsibleEventMap
    extends StObject
       with baseComponentEventMap[ojCollapsibleSettableProperties] {
    
    var disabledChanged: CustomEvent
    
    var expandAreaChanged: CustomEvent
    
    var expandedChanged: CustomEvent
    
    var ojBeforeCollapse: CustomEvent
    
    var ojBeforeExpand: CustomEvent
    
    var ojCollapse: CustomEvent
    
    var ojExpand: CustomEvent
  }
  object ojCollapsibleEventMap {
    
    inline def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      disabledChanged: CustomEvent,
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      expandAreaChanged: CustomEvent,
      expandedChanged: CustomEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      formdata: FormDataEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojBeforeCollapse: CustomEvent,
      ojBeforeExpand: CustomEvent,
      ojCollapse: CustomEvent,
      ojExpand: CustomEvent,
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent,
      ratechange: Event,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      slotchange: Event,
      stalled: Event,
      submit: SubmitEvent,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      translationsChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): ojCollapsibleEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandAreaChanged = expandAreaChanged.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojCollapsibleEventMap]
    }
    
    extension [Self <: ojCollapsibleEventMap](x: Self) {
      
      inline def setDisabledChanged(value: CustomEvent): Self = StObject.set(x, "disabledChanged", value.asInstanceOf[js.Any])
      
      inline def setExpandAreaChanged(value: CustomEvent): Self = StObject.set(x, "expandAreaChanged", value.asInstanceOf[js.Any])
      
      inline def setExpandedChanged(value: CustomEvent): Self = StObject.set(x, "expandedChanged", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeCollapse(value: CustomEvent): Self = StObject.set(x, "ojBeforeCollapse", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeExpand(value: CustomEvent): Self = StObject.set(x, "ojBeforeExpand", value.asInstanceOf[js.Any])
      
      inline def setOjCollapse(value: CustomEvent): Self = StObject.set(x, "ojCollapse", value.asInstanceOf[js.Any])
      
      inline def setOjExpand(value: CustomEvent): Self = StObject.set(x, "ojExpand", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojCollapsibleSettableProperties
    extends StObject
       with baseComponentSettableProperties {
    
    var disabled: Boolean
    
    var expandArea: header | disclosureIcon
    
    var expanded: Boolean
  }
  object ojCollapsibleSettableProperties {
    
    inline def apply(disabled: Boolean, expandArea: header | disclosureIcon, expanded: Boolean): ojCollapsibleSettableProperties = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], expandArea = expandArea.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], translations = null)
      __obj.asInstanceOf[ojCollapsibleSettableProperties]
    }
    
    extension [Self <: ojCollapsibleSettableProperties](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setExpandArea(value: header | disclosureIcon): Self = StObject.set(x, "expandArea", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcollapsible.ojCollapsibleSettableProperties> */
  trait ojCollapsibleSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var expandArea: js.UndefOr[header | disclosureIcon] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var translations: js.UndefOr[js.Object | Null] = js.undefined
  }
  object ojCollapsibleSettablePropertiesLenient {
    
    inline def apply(): ojCollapsibleSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojCollapsibleSettablePropertiesLenient]
    }
    
    extension [Self <: ojCollapsibleSettablePropertiesLenient](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpandArea(value: header | disclosureIcon): Self = StObject.set(x, "expandArea", value.asInstanceOf[js.Any])
      
      inline def setExpandAreaUndefined: Self = StObject.set(x, "expandArea", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsNull: Self = StObject.set(x, "translations", null)
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
