package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.WorksheetData
import typingsJapgolly.officeJs.Excel.Interfaces.WorksheetLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.WorksheetUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientResult
import typingsJapgolly.officeJs.OfficeExtension.EventHandlers
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import typingsJapgolly.officeJs.officeJsStrings.After
import typingsJapgolly.officeJs.officeJsStrings.Before
import typingsJapgolly.officeJs.officeJsStrings.Beginning
import typingsJapgolly.officeJs.officeJsStrings.End
import typingsJapgolly.officeJs.officeJsStrings.Hidden
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.VeryHidden
import typingsJapgolly.officeJs.officeJsStrings.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Excel worksheet is a grid of cells. It can contain data, tables, charts, etc.
  To learn more about the worksheet object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-worksheets | Work with worksheets using the Excel JavaScript API}.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait Worksheet
  extends StObject
     with ClientObject {
  
  /**
    * Activate the worksheet in the Excel UI.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def activate(): Unit = js.native
  
  /**
    * Represents the `AutoFilter` object of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val autoFilter: AutoFilter = js.native
  
  /**
    * Calculates all cells on a worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    *
    * @param markAllDirty True, to mark all as dirty.
    */
  def calculate(markAllDirty: Boolean): Unit = js.native
  
  /**
    * Returns a collection of charts that are part of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val charts: ChartCollection = js.native
  
  /**
    * Returns a collection of all the Comments objects on the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  val comments: CommentCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Worksheet: RequestContext = js.native
  
  /**
    * Copies a worksheet and places it at the specified position.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param positionType The location in the workbook to place the newly created worksheet. The default value is "None", which inserts the worksheet at the beginning of the worksheet.
    * @param relativeTo The existing worksheet which determines the newly created worksheet's position. This is only needed if `positionType` is "Before" or "After".
    * @returns The newly created worksheet.
    */
  def copy(): Worksheet = js.native
  def copy(positionType: None | Before | After | Beginning | End): Worksheet = js.native
  def copy(positionType: None | Before | After | Beginning | End, relativeTo: Worksheet): Worksheet = js.native
  def copy(positionType: Unit, relativeTo: Worksheet): Worksheet = js.native
  def copy(positionType: WorksheetPositionType): Worksheet = js.native
  def copy(positionType: WorksheetPositionType, relativeTo: Worksheet): Worksheet = js.native
  
  /**
    * Gets a collection of worksheet-level custom properties.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  val customProperties: WorksheetCustomPropertyCollection = js.native
  
  /**
    * Deletes the worksheet from the workbook. Note that if the worksheet's visibility is set to "VeryHidden", the delete operation will fail with an `InvalidOperation` exception. You should first change its visibility to hidden or visible before deleting it.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    * Determines if Excel should recalculate the worksheet when necessary.
    True if Excel recalculates the worksheet when necessary. False if Excel doesn't recalculate the sheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var enableCalculation: Boolean = js.native
  
  /**
    * Finds all occurrences of the given string based on the criteria specified and returns them as a `RangeAreas` object, comprising one or more rectangular ranges.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param text The string to find.
    * @param criteria Additional search criteria, including whether the search needs to match the entire cell or be case-sensitive.
    * @returns A `RangeAreas` object, comprising one or more rectangular ranges, that matches the search criteria. If no cells meet this criteria, an `ItemNotFound` error will be thrown.
    */
  def findAll(text: String, criteria: WorksheetSearchCriteria): RangeAreas = js.native
  
  /**
    * Finds all occurrences of the given string based on the criteria specified and returns them as a `RangeAreas` object, comprising one or more rectangular ranges.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param text The string to find.
    * @param criteria Additional search criteria, including whether the search needs to match the entire cell or be case-sensitive.
    * @returns A `RangeAreas` object, comprising one or more rectangular ranges, that matches the search criteria. If there are no matches, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    */
  def findAllOrNullObject(text: String, criteria: WorksheetSearchCriteria): RangeAreas = js.native
  
  /**
    * Gets an object that can be used to manipulate frozen panes on the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val freezePanes: WorksheetFreezePanes = js.native
  
  /**
    * Gets the `Range` object containing the single cell based on row and column numbers. The cell can be outside the bounds of its parent range, so long as it stays within the worksheet grid.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param row The row number of the cell to be retrieved. Zero-indexed.
    * @param column The column number of the cell to be retrieved. Zero-indexed.
    */
  def getCell(row: Double, column: Double): Range = js.native
  
  /**
    * Gets the worksheet that follows this one. If there are no worksheets following this one, this method will throw an error.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If `true`, considers only visible worksheets, skipping over any hidden ones.
    */
  def getNext(): Worksheet = js.native
  def getNext(visibleOnly: Boolean): Worksheet = js.native
  
  /**
    * Gets the worksheet that follows this one. If there are no worksheets following this one, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If `true`, considers only visible worksheets, skipping over any hidden ones.
    */
  def getNextOrNullObject(): Worksheet = js.native
  def getNextOrNullObject(visibleOnly: Boolean): Worksheet = js.native
  
  /**
    * Gets the worksheet that precedes this one. If there are no previous worksheets, this method will throw an error.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If `true`, considers only visible worksheets, skipping over any hidden ones.
    */
  def getPrevious(): Worksheet = js.native
  def getPrevious(visibleOnly: Boolean): Worksheet = js.native
  
  /**
    * Gets the worksheet that precedes this one. If there are no previous worksheets, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If `true`, considers only visible worksheets, skipping over any hidden ones.
    */
  def getPreviousOrNullObject(): Worksheet = js.native
  def getPreviousOrNullObject(visibleOnly: Boolean): Worksheet = js.native
  
  /**
    * Gets the `Range` object, representing a single rectangular block of cells, specified by the address or name.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param address Optional. The string representing the address or name of the range. For example, "A1:B2". If not specified, the entire worksheet range is returned.
    */
  def getRange(): Range = js.native
  def getRange(address: String): Range = js.native
  
  /**
    * Gets the `Range` object beginning at a particular row index and column index, and spanning a certain number of rows and columns.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param startRow Start row (zero-indexed).
    * @param startColumn Start column (zero-indexed).
    * @param rowCount Number of rows to include in the range.
    * @param columnCount Number of columns to include in the range.
    */
  def getRangeByIndexes(startRow: Double, startColumn: Double, rowCount: Double, columnCount: Double): Range = js.native
  
  /**
    * Gets the `RangeAreas` object, representing one or more blocks of rectangular ranges, specified by the address or name.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param address Optional. A string containing the comma-separated or semicolon-separated addresses or names of the individual ranges. For example, "A1:B2, A5:B5" or "A1:B2; A5:B5". If not specified, a `RangeAreas` object for the entire worksheet is returned.
    */
  def getRanges(): RangeAreas = js.native
  def getRanges(address: String): RangeAreas = js.native
  
  /**
    * The used range is the smallest range that encompasses any cells that have a value or formatting assigned to them. If the entire worksheet is blank, this function will return the top left cell (i.e. it will *not* throw an error).
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param valuesOnly Optional. If `true`, considers only cells with values as used cells (ignoring formatting). [Api set: ExcelApi 1.2]
    */
  def getUsedRange(): Range = js.native
  def getUsedRange(valuesOnly: Boolean): Range = js.native
  
  /**
    * The used range is the smallest range that encompasses any cells that have a value or formatting assigned to them. If the entire worksheet is blank, then this method returns an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    *
    * @param valuesOnly Optional. Considers only cells with values as used cells.
    */
  def getUsedRangeOrNullObject(): Range = js.native
  def getUsedRangeOrNullObject(valuesOnly: Boolean): Range = js.native
  
  /**
    * Gets the horizontal page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val horizontalPageBreaks: PageBreakCollection = js.native
  
  /**
    * Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Worksheet = js.native
  def load(options: WorksheetLoadOptions): Worksheet = js.native
  def load(propertyNamesAndPaths: Expand): Worksheet = js.native
  def load(propertyNames: String): Worksheet = js.native
  def load(propertyNames: js.Array[String]): Worksheet = js.native
  
  /**
    * The display name of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: String = js.native
  
  /**
    * Returns a collection of sheet views that are present in the worksheet.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  val namedSheetViews: NamedSheetViewCollection = js.native
  
  /**
    * Collection of names scoped to the current worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  val names: NamedItemCollection = js.native
  
  /**
    * Occurs when the worksheet is activated.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onActivated: EventHandlers[WorksheetActivatedEventArgs] = js.native
  
  /**
    * Occurs when the worksheet is calculated.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onCalculated: EventHandlers[WorksheetCalculatedEventArgs] = js.native
  
  /**
    * Occurs when data changes in a specific worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onChanged: EventHandlers[WorksheetChangedEventArgs] = js.native
  
  /**
    * Occurs when one or more columns have been sorted. This happens as the result of a left to right sort operation.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @eventproperty
    */
  val onColumnSorted: EventHandlers[WorksheetColumnSortedEventArgs] = js.native
  
  /**
    * Occurs when the worksheet is deactivated.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onDeactivated: EventHandlers[WorksheetDeactivatedEventArgs] = js.native
  
  /**
    * Occurs when format changed on a specific worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onFormatChanged: EventHandlers[WorksheetFormatChangedEventArgs] = js.native
  
  /**
    * Occurs when one or more formulas are changed in this worksheet. This event is for when the formula itself changes, not the data value resulting from the formula's calculation.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    *
    * @eventproperty
    */
  val onFormulaChanged: EventHandlers[WorksheetFormulaChangedEventArgs] = js.native
  
  /**
    * Occurs when the worksheet name is changed.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @eventproperty
    */
  val onNameChanged: EventHandlers[WorksheetNameChangedEventArgs] = js.native
  
  /**
    * Occurs when the worksheet protection state is changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    *
    * @eventproperty
    */
  val onProtectionChanged: EventHandlers[WorksheetProtectionChangedEventArgs] = js.native
  
  /**
    * Occurs when the hidden state of one or more rows has changed on a specific worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    *
    * @eventproperty
    */
  val onRowHiddenChanged: EventHandlers[WorksheetRowHiddenChangedEventArgs] = js.native
  
  /**
    * Occurs when one or more rows have been sorted. This happens as the result of a top-to-bottom sort operation.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @eventproperty
    */
  val onRowSorted: EventHandlers[WorksheetRowSortedEventArgs] = js.native
  
  /**
    * Occurs when the selection changes on a specific worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onSelectionChanged: EventHandlers[WorksheetSelectionChangedEventArgs] = js.native
  
  /**
    * Occurs when a left-clicked/tapped action happens in the worksheet. This event will not be fired when clicking in the following cases:
    - The user drags the mouse for multi-selection.
    - The user selects a cell in the mode when cell arguments are selected for formula references.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @eventproperty
    */
  val onSingleClicked: EventHandlers[WorksheetSingleClickedEventArgs] = js.native
  
  /**
    * Occurs when the worksheet visibility is changed.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @eventproperty
    */
  val onVisibilityChanged: EventHandlers[WorksheetVisibilityChangedEventArgs] = js.native
  
  /**
    * Gets the `PageLayout` object of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val pageLayout: PageLayout = js.native
  
  /**
    * Collection of PivotTables that are part of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  val pivotTables: PivotTableCollection = js.native
  
  /**
    * The zero-based position of the worksheet within the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var position: Double = js.native
  
  /**
    * Returns the sheet protection object for a worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  val protection: WorksheetProtection = js.native
  
  /**
    * Finds and replaces the given string based on the criteria specified within the current worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param text String to find.
    * @param replacement The string that replaces the original string.
    * @param criteria Additional replacement criteria.
    * @returns The number of replacements performed.
    */
  def replaceAll(text: String, replacement: String, criteria: ReplaceCriteria): ClientResult[Double] = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: WorksheetUpdateData): Unit = js.native
  def set(properties: WorksheetUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Worksheet): Unit = js.native
  
  /**
    * Returns the collection of all the Shape objects on the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val shapes: ShapeCollection = js.native
  
  /**
    * Specifies if gridlines are visible to the user.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showGridlines: Boolean = js.native
  
  /**
    * Specifies if headings are visible to the user.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showHeadings: Boolean = js.native
  
  /**
    * Shows row or column groups by their outline levels.
    Outlines groups and summarizes a list of data in the worksheet.
    The `rowLevels` and `columnLevels` parameters specify how many levels of the outline will be displayed.
    The acceptable argument range is between 0 and 8.
    A value of 0 does not change the current display. A value greater than the current number of levels displays all the levels.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param rowLevels The number of row levels of an outline to display.
    * @param columnLevels The number of column levels of an outline to display.
    */
  def showOutlineLevels(rowLevels: Double, columnLevels: Double): Unit = js.native
  
  /**
    * Returns a collection of slicers that are part of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  val slicers: SlicerCollection = js.native
  
  /**
    * Returns the standard (default) height of all the rows in the worksheet, in points.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val standardHeight: Double = js.native
  
  /**
    * Specifies the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: Double = js.native
  
  /**
    * The tab color of the worksheet.
    When retrieving the tab color, if the worksheet is invisible, the value will be `null`. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form #RRGGBB (e.g., "FFA500").
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: String = js.native
  
  /**
    * Returns a value representing this worksheet that can be read by Open Office XML. This is an integer value, which is different from `worksheet.id` (which returns a globally unique identifier) and `worksheet.name` (which returns a value such as "Sheet1").
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  val tabId: Double = js.native
  
  /**
    * Collection of tables that are part of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val tables: TableCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Worksheet object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): WorksheetData = js.native
  
  /**
    * Gets the vertical page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val verticalPageBreaks: PageBreakCollection = js.native
  
  /**
    * The visibility of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: SheetVisibility | Visible | Hidden | VeryHidden = js.native
}
