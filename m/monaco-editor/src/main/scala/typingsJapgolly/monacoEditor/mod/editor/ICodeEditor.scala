package typingsJapgolly.monacoEditor.mod.editor

import org.scalajs.dom.HTMLElement
import typingsJapgolly.monacoEditor.anon.Height
import typingsJapgolly.monacoEditor.anon.LineEnding
import typingsJapgolly.monacoEditor.mod.IDisposable
import typingsJapgolly.monacoEditor.mod.IKeyboardEvent
import typingsJapgolly.monacoEditor.mod.IPosition
import typingsJapgolly.monacoEditor.mod.IScrollEvent
import typingsJapgolly.monacoEditor.mod.Range
import typingsJapgolly.monacoEditor.mod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICodeEditor
  extends StObject
     with IEditor {
  
  /**
    * Add a content widget. Widgets must have unique ids, otherwise they will be overwritten.
    */
  def addContentWidget(widget: IContentWidget): Unit = js.native
  
  /**
    * Add an overlay widget. Widgets must have unique ids, otherwise they will be overwritten.
    */
  def addOverlayWidget(widget: IOverlayWidget): Unit = js.native
  
  /**
    * Apply the same font settings as the editor to `target`.
    */
  def applyFontInfo(target: HTMLElement): Unit = js.native
  
  /**
    * Change the view zones. View zones are lost when a new model is attached to the editor.
    */
  def changeViewZones(callback: js.Function1[/* accessor */ IViewZoneChangeAccessor, Unit]): Unit = js.native
  
  /**
    * All decorations added through this call will get the ownerId of this editor.
    * @deprecated
    */
  def deltaDecorations(oldDecorations: js.Array[String], newDecorations: js.Array[IModelDeltaDecoration]): js.Array[String] = js.native
  
  /**
    * Execute a command on the editor.
    * The edits will land on the undo-redo stack, but no "undo stop" will be pushed.
    * @param source The source of the call.
    * @param command The command to execute
    */
  def executeCommand(source: String, command: ICommand): Unit = js.native
  def executeCommand(source: Null, command: ICommand): Unit = js.native
  def executeCommand(source: Unit, command: ICommand): Unit = js.native
  
  /**
    * Execute multiple (concomitant) commands on the editor.
    * @param source The source of the call.
    * @param command The commands to execute
    */
  def executeCommands(source: String, commands: js.Array[ICommand | Null]): Unit = js.native
  def executeCommands(source: Null, commands: js.Array[ICommand | Null]): Unit = js.native
  def executeCommands(source: Unit, commands: js.Array[ICommand | Null]): Unit = js.native
  
  /**
    * Execute edits on the editor.
    * The edits will land on the undo-redo stack, but no "undo stop" will be pushed.
    * @param source The source of the call.
    * @param edits The edits to execute.
    * @param endCursorState Cursor state after the edits were applied.
    */
  def executeEdits(source: String, edits: js.Array[IIdentifiedSingleEditOperation]): Boolean = js.native
  def executeEdits(
    source: String,
    edits: js.Array[IIdentifiedSingleEditOperation],
    endCursorState: js.Array[Selection]
  ): Boolean = js.native
  def executeEdits(
    source: String,
    edits: js.Array[IIdentifiedSingleEditOperation],
    endCursorState: ICursorStateComputer
  ): Boolean = js.native
  def executeEdits(source: Null, edits: js.Array[IIdentifiedSingleEditOperation]): Boolean = js.native
  def executeEdits(source: Null, edits: js.Array[IIdentifiedSingleEditOperation], endCursorState: js.Array[Selection]): Boolean = js.native
  def executeEdits(
    source: Null,
    edits: js.Array[IIdentifiedSingleEditOperation],
    endCursorState: ICursorStateComputer
  ): Boolean = js.native
  def executeEdits(source: Unit, edits: js.Array[IIdentifiedSingleEditOperation]): Boolean = js.native
  def executeEdits(source: Unit, edits: js.Array[IIdentifiedSingleEditOperation], endCursorState: js.Array[Selection]): Boolean = js.native
  def executeEdits(
    source: Unit,
    edits: js.Array[IIdentifiedSingleEditOperation],
    endCursorState: ICursorStateComputer
  ): Boolean = js.native
  
  /**
    * Get an action that is a contribution to this editor.
    * @id Unique identifier of the contribution.
    * @return The action or null if action not found.
    */
  def getAction(id: String): IEditorAction = js.native
  
  /**
    * Get the vertical position (top offset) for the line's bottom w.r.t. to the first line.
    */
  def getBottomForLineNumber(lineNumber: Double): Double = js.native
  
  /**
    * Returns the editor's container dom node
    */
  def getContainerDomNode(): HTMLElement = js.native
  
  /**
    * Get the height of the editor's content.
    * This is information that is "erased" when computing `scrollHeight = Math.max(contentHeight, height)`
    */
  def getContentHeight(): Double = js.native
  
  /**
    * Get the width of the editor's content.
    * This is information that is "erased" when computing `scrollWidth = Math.max(contentWidth, width)`
    */
  def getContentWidth(): Double = js.native
  
  /**
    * Get a contribution of this editor.
    * @id Unique identifier of the contribution.
    * @return The contribution or null if contribution not found.
    */
  def getContribution[T /* <: IEditorContribution */](id: String): T | Null = js.native
  
  /**
    * Get all the decorations for a range (filtering out decorations from other editors).
    */
  def getDecorationsInRange(range: Range): js.Array[IModelDecoration] | Null = js.native
  
  /**
    * Returns the editor's dom node
    */
  def getDomNode(): HTMLElement | Null = js.native
  
  /**
    * Get the layout info for the editor.
    */
  def getLayoutInfo(): EditorLayoutInfo = js.native
  
  /**
    * Get all the decorations on a line (filtering out decorations from other editors).
    */
  def getLineDecorations(lineNumber: Double): js.Array[IModelDecoration] | Null = js.native
  
  /**
    * Get the horizontal position (left offset) for the column w.r.t to the beginning of the line.
    * This method works only if the line `lineNumber` is currently rendered (in the editor's viewport).
    * Use this method with caution.
    */
  def getOffsetForColumn(lineNumber: Double, column: Double): Double = js.native
  
  /**
    * Gets a specific editor option.
    */
  def getOption[T /* <: EditorOption */](id: T): FindComputedEditorOptionValueById[T] = js.native
  
  /**
    * Gets all the editor computed options.
    */
  def getOptions(): IComputedEditorOptions = js.native
  
  /**
    * Returns the editor's configuration (without any validation or defaults).
    */
  def getRawOptions(): IEditorOptions = js.native
  
  /**
    * Get the scrollHeight of the editor's viewport.
    */
  def getScrollHeight(): Double = js.native
  
  /**
    * Get the scrollLeft of the editor's viewport.
    */
  def getScrollLeft(): Double = js.native
  
  /**
    * Get the scrollTop of the editor's viewport.
    */
  def getScrollTop(): Double = js.native
  
  /**
    * Get the scrollWidth of the editor's viewport.
    */
  def getScrollWidth(): Double = js.native
  
  /**
    * Get the visible position for `position`.
    * The result position takes scrolling into account and is relative to the top left corner of the editor.
    * Explanation 1: the results of this method will change for the same `position` if the user scrolls the editor.
    * Explanation 2: the results of this method will not change if the container of the editor gets repositioned.
    * Warning: the results of this method are inaccurate for positions that are outside the current editor viewport.
    */
  def getScrolledVisiblePosition(position: IPosition): Height | Null = js.native
  
  /**
    * Get the hit test target at coordinates `clientX` and `clientY`.
    * The coordinates are relative to the top-left of the viewport.
    *
    * @returns Hit test target or null if the coordinates fall outside the editor or the editor has no model.
    */
  def getTargetAtClientPoint(clientX: Double, clientY: Double): IMouseTarget | Null = js.native
  
  /**
    * Get the vertical position (top offset) for the line's top w.r.t. to the first line.
    */
  def getTopForLineNumber(lineNumber: Double): Double = js.native
  
  /**
    * Get the vertical position (top offset) for the position w.r.t. to the first line.
    */
  def getTopForPosition(lineNumber: Double, column: Double): Double = js.native
  
  /**
    * Get value of the current model attached to this editor.
    * @see {@link ITextModel.getValue}
    */
  def getValue(): String = js.native
  def getValue(options: LineEnding): String = js.native
  
  /**
    * Returns the ranges that are currently visible.
    * Does not account for horizontal scrolling.
    */
  def getVisibleRanges(): js.Array[Range] = js.native
  
  /**
    * Returns true if the text inside this editor or an editor widget has focus.
    */
  def hasWidgetFocus(): Boolean = js.native
  
  /**
    * Layout/Reposition a content widget. This is a ping to the editor to call widget.getPosition()
    * and update appropriately.
    */
  def layoutContentWidget(widget: IContentWidget): Unit = js.native
  
  /**
    * Layout/Reposition an overlay widget. This is a ping to the editor to call widget.getPosition()
    * and update appropriately.
    */
  def layoutOverlayWidget(widget: IOverlayWidget): Unit = js.native
  
  /**
    * An event emitted on a "contextmenu".
    * @event
    */
  def onContextMenu(listener: js.Function1[/* e */ IEditorMouseEvent, Any]): IDisposable = js.native
  def onContextMenu(listener: js.Function1[/* e */ IEditorMouseEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when editing failed because the editor is read-only.
    * @event
    */
  def onDidAttemptReadOnlyEdit(listener: js.Function1[/* e */ Unit, Any]): IDisposable = js.native
  def onDidAttemptReadOnlyEdit(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the text inside this editor lost focus (i.e. cursor stops blinking).
    * @event
    */
  def onDidBlurEditorText(listener: js.Function1[/* e */ Unit, Any]): IDisposable = js.native
  def onDidBlurEditorText(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the text inside this editor or an editor widget lost focus.
    * @event
    */
  def onDidBlurEditorWidget(listener: js.Function1[/* e */ Unit, Any]): IDisposable = js.native
  def onDidBlurEditorWidget(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the configuration of the editor has changed. (e.g. `editor.updateOptions()`)
    * @event
    */
  def onDidChangeConfiguration(listener: js.Function1[/* e */ ConfigurationChangedEvent, Any]): IDisposable = js.native
  def onDidChangeConfiguration(listener: js.Function1[/* e */ ConfigurationChangedEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the cursor position has changed.
    * @event
    */
  def onDidChangeCursorPosition(listener: js.Function1[/* e */ ICursorPositionChangedEvent, Any]): IDisposable = js.native
  def onDidChangeCursorPosition(listener: js.Function1[/* e */ ICursorPositionChangedEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the cursor selection has changed.
    * @event
    */
  def onDidChangeCursorSelection(listener: js.Function1[/* e */ ICursorSelectionChangedEvent, Any]): IDisposable = js.native
  def onDidChangeCursorSelection(listener: js.Function1[/* e */ ICursorSelectionChangedEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when hidden areas change in the editor (e.g. due to folding).
    * @event
    */
  def onDidChangeHiddenAreas(listener: js.Function1[/* e */ Unit, Any]): IDisposable = js.native
  def onDidChangeHiddenAreas(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the model of this editor has changed (e.g. `editor.setModel()`).
    * @event
    */
  def onDidChangeModel(listener: js.Function1[/* e */ IModelChangedEvent, Any]): IDisposable = js.native
  def onDidChangeModel(listener: js.Function1[/* e */ IModelChangedEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the content of the current model has changed.
    * @event
    */
  def onDidChangeModelContent(listener: js.Function1[/* e */ IModelContentChangedEvent, Any]): IDisposable = js.native
  def onDidChangeModelContent(listener: js.Function1[/* e */ IModelContentChangedEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the decorations of the current model have changed.
    * @event
    */
  def onDidChangeModelDecorations(listener: js.Function1[/* e */ IModelDecorationsChangedEvent, Any]): IDisposable = js.native
  def onDidChangeModelDecorations(listener: js.Function1[/* e */ IModelDecorationsChangedEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the language of the current model has changed.
    * @event
    */
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ IModelLanguageChangedEvent, Any]): IDisposable = js.native
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ IModelLanguageChangedEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the language configuration of the current model has changed.
    * @event
    */
  def onDidChangeModelLanguageConfiguration(listener: js.Function1[/* e */ IModelLanguageConfigurationChangedEvent, Any]): IDisposable = js.native
  def onDidChangeModelLanguageConfiguration(listener: js.Function1[/* e */ IModelLanguageConfigurationChangedEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the options of the current model has changed.
    * @event
    */
  def onDidChangeModelOptions(listener: js.Function1[/* e */ IModelOptionsChangedEvent, Any]): IDisposable = js.native
  def onDidChangeModelOptions(listener: js.Function1[/* e */ IModelOptionsChangedEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted after composition has ended.
    */
  def onDidCompositionEnd(listener: js.Function1[/* e */ Unit, Any]): IDisposable = js.native
  def onDidCompositionEnd(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted after composition has started.
    */
  def onDidCompositionStart(listener: js.Function1[/* e */ Unit, Any]): IDisposable = js.native
  def onDidCompositionStart(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the content width or content height in the editor has changed.
    * @event
    */
  def onDidContentSizeChange(listener: js.Function1[/* e */ IContentSizeChangedEvent, Any]): IDisposable = js.native
  def onDidContentSizeChange(listener: js.Function1[/* e */ IContentSizeChangedEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the text inside this editor gained focus (i.e. cursor starts blinking).
    * @event
    */
  def onDidFocusEditorText(listener: js.Function1[/* e */ Unit, Any]): IDisposable = js.native
  def onDidFocusEditorText(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the text inside this editor or an editor widget gained focus.
    * @event
    */
  def onDidFocusEditorWidget(listener: js.Function1[/* e */ Unit, Any]): IDisposable = js.native
  def onDidFocusEditorWidget(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the layout of the editor has changed.
    * @event
    */
  def onDidLayoutChange(listener: js.Function1[/* e */ EditorLayoutInfo, Any]): IDisposable = js.native
  def onDidLayoutChange(listener: js.Function1[/* e */ EditorLayoutInfo, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when users paste text in the editor.
    * @event
    */
  def onDidPaste(listener: js.Function1[/* e */ IPasteEvent, Any]): IDisposable = js.native
  def onDidPaste(listener: js.Function1[/* e */ IPasteEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted when the scroll in the editor has changed.
    * @event
    */
  def onDidScrollChange(listener: js.Function1[/* e */ IScrollEvent, Any]): IDisposable = js.native
  def onDidScrollChange(listener: js.Function1[/* e */ IScrollEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted on a "keydown".
    * @event
    */
  def onKeyDown(listener: js.Function1[/* e */ IKeyboardEvent, Any]): IDisposable = js.native
  def onKeyDown(listener: js.Function1[/* e */ IKeyboardEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted on a "keyup".
    * @event
    */
  def onKeyUp(listener: js.Function1[/* e */ IKeyboardEvent, Any]): IDisposable = js.native
  def onKeyUp(listener: js.Function1[/* e */ IKeyboardEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted on a "mousedown".
    * @event
    */
  def onMouseDown(listener: js.Function1[/* e */ IEditorMouseEvent, Any]): IDisposable = js.native
  def onMouseDown(listener: js.Function1[/* e */ IEditorMouseEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted on a "mouseleave".
    * @event
    */
  def onMouseLeave(listener: js.Function1[/* e */ IPartialEditorMouseEvent, Any]): IDisposable = js.native
  def onMouseLeave(listener: js.Function1[/* e */ IPartialEditorMouseEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted on a "mousemove".
    * @event
    */
  def onMouseMove(listener: js.Function1[/* e */ IEditorMouseEvent, Any]): IDisposable = js.native
  def onMouseMove(listener: js.Function1[/* e */ IEditorMouseEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * An event emitted on a "mouseup".
    * @event
    */
  def onMouseUp(listener: js.Function1[/* e */ IEditorMouseEvent, Any]): IDisposable = js.native
  def onMouseUp(listener: js.Function1[/* e */ IEditorMouseEvent, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * Remove the "undo stop" in the undo-redo stack.
    */
  def popUndoStop(): Boolean = js.native
  
  /**
    * Create an "undo stop" in the undo-redo stack.
    */
  def pushUndoStop(): Boolean = js.native
  
  /**
    * Remove a content widget.
    */
  def removeContentWidget(widget: IContentWidget): Unit = js.native
  
  /**
    * Remove previously added decorations.
    */
  def removeDecorations(decorationIds: js.Array[String]): Unit = js.native
  
  /**
    * Remove an overlay widget.
    */
  def removeOverlayWidget(widget: IOverlayWidget): Unit = js.native
  
  /**
    * Force an editor render now.
    */
  def render(): Unit = js.native
  def render(forceRedraw: Boolean): Unit = js.native
  
  def restoreViewState(state: ICodeEditorViewState): Unit = js.native
  
  def setBanner(bannerDomNode: HTMLElement, height: Double): Unit = js.native
  def setBanner(bannerDomNode: Null, height: Double): Unit = js.native
  
  def setModel(model: ITextModel): Unit = js.native
  
  /**
    * Change the scrollLeft of the editor's viewport.
    */
  def setScrollLeft(newScrollLeft: Double): Unit = js.native
  def setScrollLeft(newScrollLeft: Double, scrollType: ScrollType): Unit = js.native
  
  /**
    * Change the scroll position of the editor's viewport.
    */
  def setScrollPosition(position: INewScrollPosition): Unit = js.native
  def setScrollPosition(position: INewScrollPosition, scrollType: ScrollType): Unit = js.native
  
  /**
    * Change the scrollTop of the editor's viewport.
    */
  def setScrollTop(newScrollTop: Double): Unit = js.native
  def setScrollTop(newScrollTop: Double, scrollType: ScrollType): Unit = js.native
  
  /**
    * Set the value of the current model attached to this editor.
    * @see {@link ITextModel.setValue}
    */
  def setValue(newValue: String): Unit = js.native
}
