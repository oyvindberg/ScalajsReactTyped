package typingsJapgolly.uiGrid.mod

import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.uiGrid.anon.SaveRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowEdit {
  
  trait IGridOptions extends StObject {
    
    /**
      * How long the grid should wait for another change on this row before triggering a save (in milliseconds).
      * If set to -1, then saves are never triggered by timer
      * (implying that the user will call flushDirtyRows() manually)
      */
    var rowEditWaitInterval: js.UndefOr[Double] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): typingsJapgolly.uiGrid.mod.rowEdit.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.uiGrid.mod.rowEdit.IGridOptions]
    }
    
    extension [Self <: typingsJapgolly.uiGrid.mod.rowEdit.IGridOptions](x: Self) {
      
      inline def setRowEditWaitInterval(value: Double): Self = StObject.set(x, "rowEditWaitInterval", value.asInstanceOf[js.Any])
      
      inline def setRowEditWaitIntervalUndefined: Self = StObject.set(x, "rowEditWaitInterval", js.undefined)
    }
  }
  
  @js.native
  trait IGridRowEditApi[TEntity] extends StObject {
    
    // Methods
    /**
      * Triggers a save event for all currently dirty rows.
      * Could be used where user presses a save button or navigates away from the page
      * @param grid The grid
      * @returns a promise that represents the aggregate of all of the individual save
      *          promises.  i.e. it will be resolved when all the individual save promises have been resolved.
      */
    def flushDirtyRows(): IPromise[js.Array[Any]] = js.native
    def flushDirtyRows(grid: IGridInstanceOf[TEntity]): IPromise[js.Array[Any]] = js.native
    
    /**
      * Returns all currently dirty rows
      * @param grid The target grid
      * @returns An array of gridRows that are currently dirty
      */
    def getDirtyRows(): js.Array[IGridRowOf[TEntity]] = js.native
    def getDirtyRows(grid: IGridInstanceOf[TEntity]): js.Array[IGridRowOf[TEntity]] = js.native
    
    /**
      * Returns all currently errored rows
      * @param grid The target grid
      * @returns An array of gridRows that are currently in error
      */
    def getErrorRows(): js.Array[IGridRowOf[TEntity]] = js.native
    def getErrorRows(grid: IGridInstanceOf[TEntity]): js.Array[IGridRowOf[TEntity]] = js.native
    
    // Events
    var on: SaveRow[TEntity] = js.native
    
    /**
      * Sets each of the rows passed in dataRows to be clean,
      * removing them from the dirty cache and the error cache,
      * and clearing the error flag and the dirty flag
      * @param dataRows the data entities for which the gridRows should be set clean
      */
    def setRowsClean(dataRows: js.Array[TEntity]): Unit = js.native
    
    /**
      * Sets each of the rows passed in dataRows to be dirty,
      * Note that if you have only just inserted the rows into your data,
      * you will need to wait for a $digest cycle before the gridRows are present.  As a result, this is often
      * wrapped with $interval or $timeout.
      * @param dataRows the data entities for which the gridRows should be set dirty
      */
    def setRowsDirty(dataRows: js.Array[TEntity]): Unit = js.native
    
    /**
      * Sets the promise associated with the row save, mandatory that the saveRow event handler calls this method
      * somewhere before returning
      * @param rowEntity A data row from the grid for which a save has been initiated
      * @param savePromise A promise that will be resolved when the save is successful, or
      *        rejected if the save fails
      */
    def setSavePromise(rowEntity: js.Object, savePromise: IPromise[Any]): Unit = js.native
  }
  
  type saveRowHandler[TEntity] = js.Function1[/* rowEntity */ TEntity, Unit]
}
