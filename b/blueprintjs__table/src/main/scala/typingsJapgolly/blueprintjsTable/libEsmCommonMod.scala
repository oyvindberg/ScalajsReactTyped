package typingsJapgolly.blueprintjsTable

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TextMetrics
import typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.AnyRect
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonMod {
  
  object Clipboard {
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Overrides the inherited CSS of the element to make sure it is
      * selectable. This method also makes the element pseudo-invisible.
      *
      * @deprecated will be removed in v4.0
      */
    inline def applySelectableStyles(elem: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("applySelectableStyles")(elem.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /**
      * Copies table cells to the clipboard. The parameter is a row-major
      * 2-dimensional `Array` of strings and can contain nulls. We assume all
      * rows are the same length. If not, the cells will still be copied, but
      * the columns may not align.
      *
      * @returns a Promise which resolves or rejects if the copy succeeds.
      *
      * See `Clipboard.copy`
      */
    inline def copyCells(cells: js.Array[js.Array[String]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyCells")(cells.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Copies the text to the clipboard.
      *
      * @returns a Promise which resolves or rejects if the copy succeeds.
      */
    inline def copyString(value: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyString")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("@blueprintjs/table/lib/esm/common", "Grid")
  @js.native
  open class Grid protected ()
    extends typingsJapgolly.blueprintjsTable.libEsmCommonGridMod.Grid {
    /**
      * This constructor accumulates the heights and widths in `O(n)`, saving
      * time in later calculations.
      *
      * @param bleed - The number of rows/cols that we expand beyond the
      *     viewport (on all sides). This helps avoid displaying an empty
      *     viewport when the user scrolls quickly.
      */
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double]) = this()
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Double) = this()
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Double, ghostHeight: Double) = this()
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Unit, ghostHeight: Double) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: Double,
      ghostHeight: Double,
      ghostWidth: Double
    ) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: Double,
      ghostHeight: Unit,
      ghostWidth: Double
    ) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: Unit,
      ghostHeight: Double,
      ghostWidth: Double
    ) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: Unit,
      ghostHeight: Unit,
      ghostWidth: Double
    ) = this()
  }
  /* static members */
  object Grid {
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Grid")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Grid.DEFAULT_BLEED")
    @js.native
    def DEFAULT_BLEED: Double = js.native
    inline def DEFAULT_BLEED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BLEED")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Grid.DEFAULT_GHOST_HEIGHT")
    @js.native
    def DEFAULT_GHOST_HEIGHT: Double = js.native
    inline def DEFAULT_GHOST_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GHOST_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Grid.DEFAULT_GHOST_WIDTH")
    @js.native
    def DEFAULT_GHOST_WIDTH: Double = js.native
    inline def DEFAULT_GHOST_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GHOST_WIDTH")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Grid.DEFAULT_MAX_COLUMNS")
    @js.native
    def DEFAULT_MAX_COLUMNS: Double = js.native
    inline def DEFAULT_MAX_COLUMNS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_COLUMNS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Grid.DEFAULT_MAX_ROWS")
    @js.native
    def DEFAULT_MAX_ROWS: Double = js.native
    inline def DEFAULT_MAX_ROWS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_ROWS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Grid.MIN_COLUMN_HEADER_HEIGHT")
    @js.native
    def MIN_COLUMN_HEADER_HEIGHT: Double = js.native
    inline def MIN_COLUMN_HEADER_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_COLUMN_HEADER_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Grid.MIN_ROW_HEADER_WIDTH")
    @js.native
    def MIN_ROW_HEADER_WIDTH: Double = js.native
    inline def MIN_ROW_HEADER_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_ROW_HEADER_WIDTH")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table/lib/esm/common", "Rect")
  @js.native
  open class Rect protected ()
    extends typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect {
    def this(left: Double, top: Double, width: Double, height: Double) = this()
  }
  /* static members */
  object Rect {
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Rect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Rect.ORIGIN")
    @js.native
    def ORIGIN: typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect = js.native
    inline def ORIGIN_=(x: typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIGIN")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the CSS properties representing the absolute positioning of
      * this Rect.
      */
    inline def style(rect: AnyRect): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(rect.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
    
    /**
      * Returns a new Rect that subtracts the origin of the second argument
      * from the first.
      */
    inline def subtractOrigin(anyRect0: AnyRect, anyRect1: AnyRect): typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("subtractOrigin")(anyRect0.asInstanceOf[js.Any], anyRect1.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect]
    
    /**
      * Returns the smallest Rect that entirely contains the supplied rects
      */
    inline def union(anyRect0: AnyRect, anyRect1: AnyRect): typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(anyRect0.asInstanceOf[js.Any], anyRect1.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect]
    
    /**
      * Given a ClientRect or Rect object, returns a Rect object.
      */
    inline def wrap(rect: AnyRect): typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(rect.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect]
  }
  
  @JSImport("@blueprintjs/table/lib/esm/common", "RenderMode")
  @js.native
  object RenderMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode & String] = js.native
    
    /* "batch" */ val BATCH: typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode.BATCH & String = js.native
    
    /* "batch-on-update" */ val BATCH_ON_UPDATE: typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode.BATCH_ON_UPDATE & String = js.native
    
    /* "none" */ val NONE: typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode.NONE & String = js.native
  }
  
  object Utils {
    
    @JSImport("@blueprintjs/table/lib/esm/common", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes an array of numbers, returns an array of numbers of the same length in which each
      * value is the sum of current and previous values in the input array.
      *
      * Example input:  [10, 20, 50]
      *         output: [10, 30, 80]
      */
    inline def accumulate(numbers: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("accumulate")(numbers.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    /**
      * Returns a copy of the array that will have a length of the supplied parameter.
      * If the array is too long, it will be truncated. If it is too short, it will be
      * filled with the suppleid `fillValue` argument.
      *
      * @param array - the `Array` to copy and adjust
      * @param length - the target length of the array
      * @param fillValue - the value to add to the array if it is too short
      *
      * @deprecated this function is no longer used in the table component, so it will be removed in a future major version
      */
    inline def arrayOfLength[T_1](array: js.Array[T_1], length: Double, fillValue: T_1): js.Array[T_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayOfLength")(array.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[T_1]]
    
    /**
      * Takes in one full array of values and one sparse array of the same
      * length and type. Returns a copy of the `defaults` array, where each
      * value is replaced with the corresponding non-null value at the same
      * index in `sparseOverrides`.
      *
      * @param defaults - the full array of default values
      * @param sparseOverrides - the sparse array of override values
      */
    inline def assignSparseValues[T_2](defaults: js.Array[T_2], sparseOverrides: js.Array[js.UndefOr[T_2 | Null]]): js.Array[T_2] = (^.asInstanceOf[js.Dynamic].applyDynamic("assignSparseValues")(defaults.asInstanceOf[js.Any], sparseOverrides.asInstanceOf[js.Any])).asInstanceOf[js.Array[T_2]]
    
    /**
      * Performs the binary search algorithm to find the index of the `value`
      * parameter in a sorted list of numbers. If `value` is not in the list, the
      * index where `value` can be inserted to maintain the sort is returned.
      *
      * Unlike a typical binary search implementation, we use a `lookup`
      * callback to access the sorted list of numbers instead of an array. This
      * avoids additional storage overhead.
      *
      * We use this to, for example, find the index of a row/col given its client
      * coordinate.
      *
      * Adapted from lodash https://github.com/lodash/lodash/blob/4.11.2/lodash.js#L3579
      *
      * @param value - the query value
      * @param high - the length of the sorted list of numbers
      * @param lookup - returns the number from the list at the supplied index
      */
    inline def binarySearch(value: Double, high: Double, lookup: js.Function1[/* index */ Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(value.asInstanceOf[js.Any], high.asInstanceOf[js.Any], lookup.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Given a number, returns a value that is clamped within a
      * minimum/maximum bounded range. The minimum and maximum are optional. If
      * either is missing, that extrema limit is not applied.
      *
      * Assumes max >= min.
      */
    inline def clamp(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def clamp(value: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def clamp(value: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Shallow comparison of potentially sparse arrays.
      *
      * @returns true if the array values are equal
      */
    inline def compareSparseArrays(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareSparseArrays")().asInstanceOf[Boolean]
    inline def compareSparseArrays(a: js.Array[js.UndefOr[Double | Null]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareSparseArrays")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def compareSparseArrays(a: js.Array[js.UndefOr[Double | Null]], b: js.Array[js.UndefOr[Double | Null]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSparseArrays")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def compareSparseArrays(a: Unit, b: js.Array[js.UndefOr[Double | Null]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSparseArrays")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def getApproxCellHeight(
      cellText: String,
      columnWidth: Double,
      approxCharWidth: Double,
      approxLineHeight: Double,
      horizontalPadding: Double,
      numBufferLines: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getApproxCellHeight")(cellText.asInstanceOf[js.Any], columnWidth.asInstanceOf[js.Any], approxCharWidth.asInstanceOf[js.Any], approxLineHeight.asInstanceOf[js.Any], horizontalPadding.asInstanceOf[js.Any], numBufferLines.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * When reordering a contiguous block of rows or columns to a new index, we show a preview guide
      * at the absolute index in the original ordering but emit the new index in the reordered list.
      * This function converts an absolute "guide" index to a relative "reordered" index.
      *
      * Example: Say we want to move the first three columns two spots to the right. While we drag, a
      * vertical guide is shown to preview where we'll be dropping the columns. (In the following
      * ASCII art, `*` denotes a selected column, `·` denotes a cell border, and `|` denotes a
      * vertical guide).
      *
      *     Before mousedown:
      *     · 0 · 1 · 2 · 3 · 4 · 5 ·
      *       *   *   *
      *
      *     During mousemove two spots to the right:
      *     · 0 · 1 · 2 · 3 · 4 | 5 ·
      *       *   *   *
      *
      *     After mouseup:
      *     · 3 · 4 · 0 · 1 · 2 · 5 ·
      *               *   *   *
      *
      * Note that moving the three columns beyond index 4 effectively moves them two spots rightward.
      *
      * In this case, the inputs to this function would be:
      *     - oldIndex: 0 (the left-most index of the selected column range in the original ordering)
      *     - newIndex: 5 (the index on whose left boundary the guide appears in the original ordering)
      *     - length: 3 (the number of columns to move)
      *
      * The return value will then be 2, the left-most index of the columns in the new ordering.
      */
    inline def guideIndexToReorderedIndex(oldIndex: Double, newIndex: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("guideIndexToReorderedIndex")(oldIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns true if the mouse event was triggered by the left mouse button.
      */
    inline def isLeftClick(event: MouseEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeftClick")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Measures the bounds of supplied element's textContent.
      * We use the computed font from the supplied element and a non-DOM canvas
      * context to measure the text.
      */
    inline def measureElementTextContent(element: Element): TextMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("measureElementTextContent")(element.asInstanceOf[js.Any]).asInstanceOf[TextMetrics]
    
    /**
      * Returns a copy of the provided array with the `length` contiguous elements starting at the
      * `from` index reordered to start at the `to` index.
      *
      * For example, given the array [A,B,C,D,E,F], reordering the 3 contiguous elements starting at
      * index 1 (B, C, and D) to start at index 2 would yield [A,E,B,C,D,F].
      */
    inline def reorderArray[T_3](array: js.Array[T_3], from: Double, to: Double): js.UndefOr[js.Array[T_3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderArray")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T_3]]]
    inline def reorderArray[T_3](array: js.Array[T_3], from: Double, to: Double, length: Double): js.UndefOr[js.Array[T_3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderArray")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T_3]]]
    
    /**
      * When reordering a contiguous block of rows or columns to a new index, we show a preview guide
      * at the absolute index in the original ordering but emit the new index in the reordered list.
      * This function converts a relative "reordered"" index to an absolute "guide" index.
      *
      * For the scenario in the example above, the inputs to this function would be:
      *     - oldIndex: 0 (the left-most index of the selected column range in the original ordering)
      *     - newIndex: 2 (the left-most index of the selected column range in the new ordering)
      *     - length: 3 (the number of columns to move)
      *
      * The return value will then be 5, the index on whose left boundary the guide should appear in
      * the original ordering.
      */
    inline def reorderedIndexToGuideIndex(oldIndex: Double, newIndex: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderedIndexToGuideIndex")(oldIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Invokes the callback `n` times, collecting the results in an array, which
      * is the return value. Similar to _.times
      */
    inline def times[T](n: Double, callback: js.Function1[/* i */ Double, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("times")(n.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    /**
      * Returns traditional spreadsheet-style column names
      * e.g. (A, B, ..., Z, AA, AB, ..., ZZ, AAA, AAB, ...).
      *
      * Note that this isn't technically mathematically equivalent to base 26 since
      * there is no zero element.
      */
    inline def toBase26Alpha(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBase26Alpha")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns traditional spreadsheet-style cell names
      * e.g. (A1, B2, ..., Z44, AA1) with rows 1-indexed.
      */
    inline def toBase26CellName(rowIndex: Double, columnIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase26CellName")(rowIndex.asInstanceOf[js.Any], columnIndex.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
