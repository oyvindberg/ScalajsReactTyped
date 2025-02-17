package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickOutside extends StObject {
  
  def click(): Any
  
  def clickOutside(): Unit
  
  def dropdownContentDisplayed(): Boolean
  
  def exists(): Boolean
  
  def getArrowElement(): org.scalajs.dom.Element
  
  def getArrowOffset(): Bottom
  
  def getContentElement(): Any
  
  def getElementId(): Any
  
  def getOptionsCount(): Any
  
  def getSelectedOptionsCount(): Double
  
  def getTargetElement(): org.scalajs.dom.Element
  
  def hasStyleState(state: Any): Boolean
  
  def inlineStyles(): Any
  
  def isContentElementExists(): Boolean
  
  def isTargetElementExists(): Boolean
  
  def mouseEnter(): Any
  
  def mouseLeave(): Any
  
  def optionAt(index: Double): ClassName
  
  def triggerMouseDownOnDropdownContent(): Any
}
object ClickOutside {
  
  inline def apply(
    click: CallbackTo[Any],
    clickOutside: Callback,
    dropdownContentDisplayed: CallbackTo[Boolean],
    exists: CallbackTo[Boolean],
    getArrowElement: CallbackTo[org.scalajs.dom.Element],
    getArrowOffset: CallbackTo[Bottom],
    getContentElement: CallbackTo[Any],
    getElementId: CallbackTo[Any],
    getOptionsCount: CallbackTo[Any],
    getSelectedOptionsCount: CallbackTo[Double],
    getTargetElement: CallbackTo[org.scalajs.dom.Element],
    hasStyleState: Any => Boolean,
    inlineStyles: CallbackTo[Any],
    isContentElementExists: CallbackTo[Boolean],
    isTargetElementExists: CallbackTo[Boolean],
    mouseEnter: CallbackTo[Any],
    mouseLeave: CallbackTo[Any],
    optionAt: Double => ClassName,
    triggerMouseDownOnDropdownContent: CallbackTo[Any]
  ): ClickOutside = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, clickOutside = clickOutside.toJsFn, dropdownContentDisplayed = dropdownContentDisplayed.toJsFn, exists = exists.toJsFn, getArrowElement = getArrowElement.toJsFn, getArrowOffset = getArrowOffset.toJsFn, getContentElement = getContentElement.toJsFn, getElementId = getElementId.toJsFn, getOptionsCount = getOptionsCount.toJsFn, getSelectedOptionsCount = getSelectedOptionsCount.toJsFn, getTargetElement = getTargetElement.toJsFn, hasStyleState = js.Any.fromFunction1(hasStyleState), inlineStyles = inlineStyles.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn, optionAt = js.Any.fromFunction1(optionAt), triggerMouseDownOnDropdownContent = triggerMouseDownOnDropdownContent.toJsFn)
    __obj.asInstanceOf[ClickOutside]
  }
  
  extension [Self <: ClickOutside](x: Self) {
    
    inline def setClick(value: CallbackTo[Any]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setClickOutside(value: Callback): Self = StObject.set(x, "clickOutside", value.toJsFn)
    
    inline def setDropdownContentDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "dropdownContentDisplayed", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetArrowElement(value: CallbackTo[org.scalajs.dom.Element]): Self = StObject.set(x, "getArrowElement", value.toJsFn)
    
    inline def setGetArrowOffset(value: CallbackTo[Bottom]): Self = StObject.set(x, "getArrowOffset", value.toJsFn)
    
    inline def setGetContentElement(value: CallbackTo[Any]): Self = StObject.set(x, "getContentElement", value.toJsFn)
    
    inline def setGetElementId(value: CallbackTo[Any]): Self = StObject.set(x, "getElementId", value.toJsFn)
    
    inline def setGetOptionsCount(value: CallbackTo[Any]): Self = StObject.set(x, "getOptionsCount", value.toJsFn)
    
    inline def setGetSelectedOptionsCount(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectedOptionsCount", value.toJsFn)
    
    inline def setGetTargetElement(value: CallbackTo[org.scalajs.dom.Element]): Self = StObject.set(x, "getTargetElement", value.toJsFn)
    
    inline def setHasStyleState(value: Any => Boolean): Self = StObject.set(x, "hasStyleState", js.Any.fromFunction1(value))
    
    inline def setInlineStyles(value: CallbackTo[Any]): Self = StObject.set(x, "inlineStyles", value.toJsFn)
    
    inline def setIsContentElementExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isContentElementExists", value.toJsFn)
    
    inline def setIsTargetElementExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTargetElementExists", value.toJsFn)
    
    inline def setMouseEnter(value: CallbackTo[Any]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    
    inline def setMouseLeave(value: CallbackTo[Any]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
    
    inline def setOptionAt(value: Double => ClassName): Self = StObject.set(x, "optionAt", js.Any.fromFunction1(value))
    
    inline def setTriggerMouseDownOnDropdownContent(value: CallbackTo[Any]): Self = StObject.set(x, "triggerMouseDownOnDropdownContent", value.toJsFn)
  }
}
