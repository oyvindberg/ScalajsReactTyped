package typingsJapgolly.aceBuilds.mod.Ace

import org.scalajs.dom.HTMLElement
import typingsJapgolly.aceBuilds.aceBuildsStrings.animatedScroll
import typingsJapgolly.aceBuilds.aceBuildsStrings.displayIndentGuides
import typingsJapgolly.aceBuilds.aceBuildsStrings.fadeFoldWidgets
import typingsJapgolly.aceBuilds.aceBuildsStrings.fixedWidthGutter
import typingsJapgolly.aceBuilds.aceBuildsStrings.fontFamily
import typingsJapgolly.aceBuilds.aceBuildsStrings.fontSize
import typingsJapgolly.aceBuilds.aceBuildsStrings.hScrollBarAlwaysVisible
import typingsJapgolly.aceBuilds.aceBuildsStrings.hasCssTransforms
import typingsJapgolly.aceBuilds.aceBuildsStrings.highlightGutterLine
import typingsJapgolly.aceBuilds.aceBuildsStrings.maxLines
import typingsJapgolly.aceBuilds.aceBuildsStrings.maxPixelHeight
import typingsJapgolly.aceBuilds.aceBuildsStrings.minLines
import typingsJapgolly.aceBuilds.aceBuildsStrings.printMargin
import typingsJapgolly.aceBuilds.aceBuildsStrings.printMarginColumn
import typingsJapgolly.aceBuilds.aceBuildsStrings.scrollPastEnd
import typingsJapgolly.aceBuilds.aceBuildsStrings.showFoldWidgets
import typingsJapgolly.aceBuilds.aceBuildsStrings.showGutter
import typingsJapgolly.aceBuilds.aceBuildsStrings.showInvisibles
import typingsJapgolly.aceBuilds.aceBuildsStrings.showLineNumbers
import typingsJapgolly.aceBuilds.aceBuildsStrings.showPrintMargin
import typingsJapgolly.aceBuilds.aceBuildsStrings.theme
import typingsJapgolly.aceBuilds.aceBuildsStrings.vScrollBarAlwaysVisible
import typingsJapgolly.aceBuilds.anon.OffsetX
import typingsJapgolly.aceBuilds.anon.PageX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualRenderer
  extends StObject
     with OptionsProvider
     with EventEmitter {
  
  @JSName("$padding")
  val $padding: Double = js.native
  
  def adjustWrapLimit(): Boolean = js.native
  
  def alignCursor(cursor: Double, alignment: Double): Double = js.native
  def alignCursor(cursor: Position, alignment: Double): Double = js.native
  
  def animateScrolling(fromValue: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def attachToShadowRoot(): Unit = js.native
  
  val characterWidth: Double = js.native
  
  val container: HTMLElement = js.native
  
  val content: HTMLElement = js.native
  
  def destroy(): Unit = js.native
  
  def freeze(): Unit = js.native
  
  def getAnimatedScroll(): Boolean = js.native
  
  def getContainerElement(): HTMLElement = js.native
  
  def getDisplayIndentGuides(): Boolean = js.native
  
  def getFadeFoldWidgets(): Boolean = js.native
  
  def getFirstFullyVisibleRow(): Double = js.native
  
  def getFirstVisibleRow(): Double = js.native
  
  def getHScrollBarAlwaysVisible(): Boolean = js.native
  
  def getHighlightGutterLine(): Boolean = js.native
  
  def getLastFullyVisibleRow(): Double = js.native
  
  def getLastVisibleRow(): Double = js.native
  
  def getMouseEventTarget(): HTMLElement = js.native
  
  @JSName("getOption")
  def getOption_animatedScroll(name: animatedScroll): Boolean = js.native
  @JSName("getOption")
  def getOption_displayIndentGuides(name: displayIndentGuides): Boolean = js.native
  @JSName("getOption")
  def getOption_fadeFoldWidgets(name: fadeFoldWidgets): Boolean = js.native
  @JSName("getOption")
  def getOption_fixedWidthGutter(name: fixedWidthGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_fontFamily(name: fontFamily): String = js.native
  @JSName("getOption")
  def getOption_fontSize(name: fontSize): Double = js.native
  @JSName("getOption")
  def getOption_hScrollBarAlwaysVisible(name: hScrollBarAlwaysVisible): Boolean = js.native
  @JSName("getOption")
  def getOption_hasCssTransforms(name: hasCssTransforms): Boolean = js.native
  @JSName("getOption")
  def getOption_highlightGutterLine(name: highlightGutterLine): Boolean = js.native
  @JSName("getOption")
  def getOption_maxLines(name: maxLines): Double = js.native
  @JSName("getOption")
  def getOption_maxPixelHeight(name: maxPixelHeight): Double = js.native
  @JSName("getOption")
  def getOption_minLines(name: minLines): Double = js.native
  @JSName("getOption")
  def getOption_printMargin(name: printMargin): Boolean | Double = js.native
  @JSName("getOption")
  def getOption_printMarginColumn(name: printMarginColumn): Double = js.native
  @JSName("getOption")
  def getOption_scrollPastEnd(name: scrollPastEnd): Boolean = js.native
  @JSName("getOption")
  def getOption_showFoldWidgets(name: showFoldWidgets): Boolean = js.native
  @JSName("getOption")
  def getOption_showGutter(name: showGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_showInvisibles(name: showInvisibles): Boolean = js.native
  @JSName("getOption")
  def getOption_showLineNumbers(name: showLineNumbers): Boolean = js.native
  @JSName("getOption")
  def getOption_showPrintMargin(name: showPrintMargin): Boolean = js.native
  @JSName("getOption")
  def getOption_theme(name: theme): String = js.native
  @JSName("getOption")
  def getOption_vScrollBarAlwaysVisible(name: vScrollBarAlwaysVisible): Boolean = js.native
  
  def getPrintMarginColumn(): Boolean = js.native
  
  def getScrollBottomRow(): Double = js.native
  
  def getScrollLeft(): Double = js.native
  
  def getScrollTop(): Double = js.native
  
  def getScrollTopRow(): Double = js.native
  
  def getShowGutter(): Boolean = js.native
  
  def getShowInvisibles(): Boolean = js.native
  
  def getShowPrintMargin(): Boolean = js.native
  
  def getTextAreaContainer(): HTMLElement = js.native
  
  def getTheme(): String = js.native
  
  def getVScrollBarAlwaysVisible(): Boolean = js.native
  
  def hideComposition(): Unit = js.native
  
  def hideCursor(): Unit = js.native
  
  def isScrollableBy(deltaX: Double, deltaY: Double): Boolean = js.native
  
  val lineHeight: Double = js.native
  
  def pixelToScreenCoordinates(x: Double, y: Double): OffsetX = js.native
  
  def scrollBy(deltaX: Double, deltaY: Double): Unit = js.native
  
  def scrollCursorIntoView(cursor: Position): Unit = js.native
  def scrollCursorIntoView(cursor: Position, offset: Double): Unit = js.native
  
  val scrollLeft: Double = js.native
  
  def scrollSelectionIntoView(anchor: Position, lead: Position): Unit = js.native
  def scrollSelectionIntoView(anchor: Position, lead: Position, offset: Double): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def scrollToLine(line: Double, center: Boolean, animate: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  def scrollToRow(row: Double): Unit = js.native
  
  def scrollToX(scrollLeft: Double): Unit = js.native
  
  def scrollToY(scrollTop: Double): Unit = js.native
  
  val scrollTop: Double = js.native
  
  val scroller: HTMLElement = js.native
  
  def setAnimatedScroll(shouldAnimate: Boolean): Unit = js.native
  
  def setAnnotations(annotations: js.Array[Annotation]): Unit = js.native
  
  def setCompositionText(text: String): Unit = js.native
  
  def setCursorStyle(style: String): Unit = js.native
  
  def setDisplayIndentGuides(display: Boolean): Unit = js.native
  
  def setFadeFoldWidgets(show: Boolean): Unit = js.native
  
  def setHScrollBarAlwaysVisible(alwaysVisible: Boolean): Unit = js.native
  
  def setHighlightGutterLine(shouldHighlight: Boolean): Unit = js.native
  
  def setMouseCursor(cursorStyle: String): Unit = js.native
  
  @JSName("setOption")
  def setOption_animatedScroll(name: animatedScroll, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_displayIndentGuides(name: displayIndentGuides, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_fadeFoldWidgets(name: fadeFoldWidgets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_fixedWidthGutter(name: fixedWidthGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_fontFamily(name: fontFamily, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_fontSize(name: fontSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_hScrollBarAlwaysVisible(name: hScrollBarAlwaysVisible, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_hasCssTransforms(name: hasCssTransforms, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_highlightGutterLine(name: highlightGutterLine, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_maxLines(name: maxLines, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_maxPixelHeight(name: maxPixelHeight, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_minLines(name: minLines, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_printMargin(name: printMargin, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_printMargin(name: printMargin, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_printMarginColumn(name: printMarginColumn, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_scrollPastEnd(name: scrollPastEnd, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showFoldWidgets(name: showFoldWidgets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showGutter(name: showGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showInvisibles(name: showInvisibles, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showLineNumbers(name: showLineNumbers, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showPrintMargin(name: showPrintMargin, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_theme(name: theme, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_vScrollBarAlwaysVisible(name: vScrollBarAlwaysVisible, value: Boolean): Unit = js.native
  
  def setPadding(padding: Double): Unit = js.native
  
  def setPrintMarginColumn(showPrintMargin: Boolean): Unit = js.native
  
  def setScrollMargin(top: Double, bottom: Double, left: Double, right: Double): Unit = js.native
  
  def setSession(session: EditSession): Unit = js.native
  
  def setShowGutter(show: Boolean): Unit = js.native
  
  def setShowInvisibles(showInvisibles: Boolean): Unit = js.native
  
  def setShowPrintMargin(showPrintMargin: Boolean): Unit = js.native
  
  def setStyle(style: String): Unit = js.native
  def setStyle(style: String, include: Boolean): Unit = js.native
  
  def setTheme(theme: String): Unit = js.native
  def setTheme(theme: String, callback: js.Function0[Unit]): Unit = js.native
  
  def setVScrollBarAlwaysVisible(alwaysVisible: Boolean): Unit = js.native
  
  def showComposition(position: Double): Unit = js.native
  
  def showCursor(): Unit = js.native
  
  def textToScreenCoordinates(row: Double, column: Double): PageX = js.native
  
  def unfreeze(): Unit = js.native
  
  def unsetStyle(style: String): Unit = js.native
  
  def updateBackMarkers(): Unit = js.native
  
  def updateBreakpoints(): Unit = js.native
  
  def updateCursor(): Unit = js.native
  
  def updateFontSize(): Unit = js.native
  
  def updateFrontMarkers(): Unit = js.native
  
  def updateFull(): Unit = js.native
  def updateFull(force: Boolean): Unit = js.native
  
  def updateLines(firstRow: Double, lastRow: Double): Unit = js.native
  def updateLines(firstRow: Double, lastRow: Double, force: Boolean): Unit = js.native
  
  def updateText(): Unit = js.native
  
  def visualizeBlur(): Unit = js.native
  
  def visualizeFocus(): Unit = js.native
}
