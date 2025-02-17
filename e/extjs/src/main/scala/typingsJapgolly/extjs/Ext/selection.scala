package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.data.IAbstractStore
import typingsJapgolly.extjs.Ext.data.IStore
import typingsJapgolly.extjs.Ext.util.IMixedCollection
import typingsJapgolly.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selection {
  
  trait ICellModel
    extends StObject
       with IModel {
    
    /** [Method] Deselects a record instance by record instance or index
      * @param record Object
      * @param suppressEvent Object
      */
    @JSName("deselect")
    var deselect_ICellModel: js.UndefOr[
        js.Function2[/* record */ js.UndefOr[Any], /* suppressEvent */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var enableKeyNav: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns the current position in the format row row column column  */
    var getCurrentPosition: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] ("SINGLE") */
    @JSName("mode")
    var mode_ICellModel: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var preventWrap: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Selects a record instance by record instance or index
      * @param pos Object
      * @param keepExisting Object
      * @param suppressEvent Object
      */
    @JSName("select")
    var select_ICellModel: js.UndefOr[
        js.Function3[
          /* pos */ js.UndefOr[Any], 
          /* keepExisting */ js.UndefOr[Any], 
          /* suppressEvent */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Sets the current position
      * @param position Object The position to set.
      * @param suppressEvent Boolean True to suppress selection events
      */
    var setCurrentPosition: js.UndefOr[
        js.Function2[/* position */ js.UndefOr[Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
  }
  object ICellModel {
    
    inline def apply(): ICellModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICellModel]
    }
    
    extension [Self <: ICellModel](x: Self) {
      
      inline def setDeselect(value: (/* record */ js.UndefOr[Any], /* suppressEvent */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "deselect", js.Any.fromFunction2((t0: /* record */ js.UndefOr[Any], t1: /* suppressEvent */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setDeselectUndefined: Self = StObject.set(x, "deselect", js.undefined)
      
      inline def setEnableKeyNav(value: Boolean): Self = StObject.set(x, "enableKeyNav", value.asInstanceOf[js.Any])
      
      inline def setEnableKeyNavUndefined: Self = StObject.set(x, "enableKeyNav", js.undefined)
      
      inline def setGetCurrentPosition(value: Callback): Self = StObject.set(x, "getCurrentPosition", value.toJsFn)
      
      inline def setGetCurrentPositionUndefined: Self = StObject.set(x, "getCurrentPosition", js.undefined)
      
      inline def setMode(value: java.lang.String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPreventWrap(value: Boolean): Self = StObject.set(x, "preventWrap", value.asInstanceOf[js.Any])
      
      inline def setPreventWrapUndefined: Self = StObject.set(x, "preventWrap", js.undefined)
      
      inline def setSelect(
        value: (/* pos */ js.UndefOr[Any], /* keepExisting */ js.UndefOr[Any], /* suppressEvent */ js.UndefOr[Any]) => Callback
      ): Self = StObject.set(x, "select", js.Any.fromFunction3((t0: /* pos */ js.UndefOr[Any], t1: /* keepExisting */ js.UndefOr[Any], t2: /* suppressEvent */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSetCurrentPosition(value: (/* position */ js.UndefOr[Any], /* suppressEvent */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "setCurrentPosition", js.Any.fromFunction2((t0: /* position */ js.UndefOr[Any], t1: /* suppressEvent */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
      
      inline def setSetCurrentPositionUndefined: Self = StObject.set(x, "setCurrentPosition", js.undefined)
    }
  }
  
  trait ICheckboxModel
    extends StObject
       with IRowModel {
    
    /** [Config Option] (Boolean) */
    var checkOnly: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var checkSelector: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Retrieve a configuration to be used in a HeaderContainer  */
    var getHeaderConfig: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Number/String) */
    var injectCheckbox: js.UndefOr[Any] = js.undefined
    
    /** [Method] Toggle between selecting all and deselecting all when clicking on a checkbox header
      * @param headerCt Object
      * @param header Object
      * @param e Object
      */
    var onHeaderClick: js.UndefOr[
        js.Function3[
          /* headerCt */ js.UndefOr[Any], 
          /* header */ js.UndefOr[Any], 
          /* e */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Generates the HTML to be rendered in the injected checkbox column for each row
      * @param value Object
      * @param metaData Object
      * @param record Object
      * @param rowIndex Object
      * @param colIndex Object
      * @param store Object
      * @param view Object
      */
    var renderer: js.UndefOr[
        js.Function7[
          /* value */ js.UndefOr[Any], 
          /* metaData */ js.UndefOr[Any], 
          /* record */ js.UndefOr[Any], 
          /* rowIndex */ js.UndefOr[Any], 
          /* colIndex */ js.UndefOr[Any], 
          /* store */ js.UndefOr[Any], 
          /* view */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showHeaderCheckbox: js.UndefOr[Boolean] = js.undefined
  }
  object ICheckboxModel {
    
    inline def apply(): ICheckboxModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckboxModel]
    }
    
    extension [Self <: ICheckboxModel](x: Self) {
      
      inline def setCheckOnly(value: Boolean): Self = StObject.set(x, "checkOnly", value.asInstanceOf[js.Any])
      
      inline def setCheckOnlyUndefined: Self = StObject.set(x, "checkOnly", js.undefined)
      
      inline def setCheckSelector(value: java.lang.String): Self = StObject.set(x, "checkSelector", value.asInstanceOf[js.Any])
      
      inline def setCheckSelectorUndefined: Self = StObject.set(x, "checkSelector", js.undefined)
      
      inline def setGetHeaderConfig(value: Callback): Self = StObject.set(x, "getHeaderConfig", value.toJsFn)
      
      inline def setGetHeaderConfigUndefined: Self = StObject.set(x, "getHeaderConfig", js.undefined)
      
      inline def setInjectCheckbox(value: Any): Self = StObject.set(x, "injectCheckbox", value.asInstanceOf[js.Any])
      
      inline def setInjectCheckboxUndefined: Self = StObject.set(x, "injectCheckbox", js.undefined)
      
      inline def setOnHeaderClick(
        value: (/* headerCt */ js.UndefOr[Any], /* header */ js.UndefOr[Any], /* e */ js.UndefOr[Any]) => Callback
      ): Self = StObject.set(x, "onHeaderClick", js.Any.fromFunction3((t0: /* headerCt */ js.UndefOr[Any], t1: /* header */ js.UndefOr[Any], t2: /* e */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnHeaderClickUndefined: Self = StObject.set(x, "onHeaderClick", js.undefined)
      
      inline def setRenderer(
        value: (/* value */ js.UndefOr[Any], /* metaData */ js.UndefOr[Any], /* record */ js.UndefOr[Any], /* rowIndex */ js.UndefOr[Any], /* colIndex */ js.UndefOr[Any], /* store */ js.UndefOr[Any], /* view */ js.UndefOr[Any]) => Callback
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction7((t0: /* value */ js.UndefOr[Any], t1: /* metaData */ js.UndefOr[Any], t2: /* record */ js.UndefOr[Any], t3: /* rowIndex */ js.UndefOr[Any], t4: /* colIndex */ js.UndefOr[Any], t5: /* store */ js.UndefOr[Any], t6: /* view */ js.UndefOr[Any]) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setShowHeaderCheckbox(value: Boolean): Self = StObject.set(x, "showHeaderCheckbox", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderCheckboxUndefined: Self = StObject.set(x, "showHeaderCheckbox", js.undefined)
    }
  }
  
  trait IDataViewModel
    extends StObject
       with IModel {
    
    /** [Config Option] (Boolean) */
    var enableKeyNav: js.UndefOr[Boolean] = js.undefined
  }
  object IDataViewModel {
    
    inline def apply(): IDataViewModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDataViewModel]
    }
    
    extension [Self <: IDataViewModel](x: Self) {
      
      inline def setEnableKeyNav(value: Boolean): Self = StObject.set(x, "enableKeyNav", value.asInstanceOf[js.Any])
      
      inline def setEnableKeyNavUndefined: Self = StObject.set(x, "enableKeyNav", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.extjs.Ext.IClass because Already inherited
  - typingsJapgolly.extjs.Ext.IBase because Already inherited
  - typingsJapgolly.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IModel
    extends StObject
       with IObservable {
    
    /** [Config Option] (Boolean) */
    var allowDeselect: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] binds the store to the selModel
      * @param store Object
      * @param initial Object
      */
    var bindStore: js.UndefOr[
        (js.Function1[/* store */ js.UndefOr[Any], Unit]) | (js.Function2[/* store */ js.UndefOr[Any], /* initial */ js.UndefOr[Any], Unit])
      ] = js.undefined
    
    /** [Method] Binds listeners for this component to the store
      * @param store Ext.data.AbstractStore The store to bind to
      */
    var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
    
    /** [Method] Deselects a record instance by record instance or index
      * @param records Ext.data.Model[]/Number An array of records or an index
      * @param suppressEvent Boolean True to not fire a deselect event
      */
    var deselect: js.UndefOr[
        js.Function2[/* records */ js.UndefOr[Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Method] Deselects all records in the view
      * @param suppressEvent Boolean True to suppress any deselect events
      */
    var deselectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Deselects a range of rows if the selection model is not locked
      * @param startRow Ext.data.Model/Number The record or index of the first row in the range
      * @param endRow Ext.data.Model/Number The record or index of the last row in the range
      */
    var deselectRange: js.UndefOr[js.Function2[/* startRow */ js.UndefOr[Any], /* endRow */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Returns the count of selected records
      * @returns Number The number of selected records
      */
    var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method]
      * @returns Ext.data.Model Returns the last selected record.
      */
    var getLastSelected: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Returns an array of the currently selected records
      * @returns Ext.data.Model[] The selected records
      */
    var getSelection: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the current selectionMode
      * @returns String The selectionMode: 'SINGLE', 'MULTI' or 'SIMPLE'.
      */
    var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Gets the current store instance
      * @returns Ext.data.AbstractStore The store, null if one does not exist.
      */
    var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.undefined
    
    /** [Method] Gets the listeners to bind to a new store
      * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
      */
    var getStoreListeners: js.UndefOr[js.Function0[Any] | (js.Function1[/* store */ js.UndefOr[IStore], Any])] = js.undefined
    
    /** [Method] Returns true if there are any a selected records
      * @returns Boolean
      */
    var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Determines if this record is currently focused
      * @param record Ext.data.Model
      */
    var isFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[this.type], Unit]] = js.undefined
    
    /** [Method] Returns true if the selections are locked
      * @returns Boolean
      */
    var isLocked: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns true if the specified row is selected
      * @param from Ext.data.Model/Number The start of the range to check.
      * @param to Ext.data.Model/Number The end of the range to check.
      * @returns Boolean
      */
    var isRangeSelected: js.UndefOr[js.Function2[/* from */ js.UndefOr[Any], /* to */ js.UndefOr[Any], Boolean]] = js.undefined
    
    /** [Method] Returns true if the specified row is selected
      * @param record Ext.data.Model/Number The record or index of the record to check
      * @returns Boolean
      */
    var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[Any], Boolean]] = js.undefined
    
    /** [Config Option] ("SINGLE"/"SIMPLE"/"MULTI") */
    var mode: js.UndefOr[Any] = js.undefined
    
    /** [Method] Template method it is called when a new store is bound to the current instance
      * @param store Ext.data.AbstractStore The store being bound
      * @param initial Boolean True if this store is being bound as initialization of the instance.
      */
    var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Template method it is called when an existing store is unbound from the current instance
      * @param store Ext.data.AbstractStore The store being unbound
      * @param initial Boolean True if this store is being bound as initialization of the instance.
      */
    var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var pruneRemoved: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Selects a record instance by record instance or index
      * @param records Ext.data.Model[]/Number An array of records or an index
      * @param keepExisting Boolean True to retain existing selections
      * @param suppressEvent Boolean True to not fire a select event
      */
    var select: js.UndefOr[
        js.Function3[
          /* records */ js.UndefOr[Any], 
          /* keepExisting */ js.UndefOr[Boolean], 
          /* suppressEvent */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Selects all records in the view
      * @param suppressEvent Boolean True to suppress any select events
      */
    var selectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Selects a range of rows if the selection model is not locked
      * @param startRow Ext.data.Model/Number The record or index of the first row in the range
      * @param endRow Ext.data.Model/Number The record or index of the last row in the range
      * @param keepExisting Boolean True to retain existing selections
      */
    var selectRange: js.UndefOr[
        js.Function3[
          /* startRow */ js.UndefOr[Any], 
          /* endRow */ js.UndefOr[Any], 
          /* keepExisting */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    /** [Property] (Ext.util.MixedCollection) */
    var selected: js.UndefOr[IMixedCollection] = js.undefined
    
    /** [Method] Sets a record as the last focused record
      * @param record Ext.data.Model
      */
    var setLastFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[this.type], Unit]] = js.undefined
    
    /** [Method] Locks the current selection and disables any changes from happening to the selection
      * @param locked Boolean True to lock, false to unlock.
      */
    var setLocked: js.UndefOr[js.Function1[/* locked */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the current selectionMode
      * @param selMode String 'SINGLE', 'MULTI' or 'SIMPLE'.
      */
    var setSelectionMode: js.UndefOr[js.Function1[/* selMode */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var toggleOnClick: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Unbinds listeners from this component to the store
      * @param store Ext.data.AbstractStore The store to unbind from
      */
    var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  }
  object IModel {
    
    inline def apply(): IModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModel]
    }
    
    extension [Self <: IModel](x: Self) {
      
      inline def setAllowDeselect(value: Boolean): Self = StObject.set(x, "allowDeselect", value.asInstanceOf[js.Any])
      
      inline def setAllowDeselectUndefined: Self = StObject.set(x, "allowDeselect", js.undefined)
      
      inline def setBindStore(
        value: (js.Function1[/* store */ js.UndefOr[Any], Unit]) | (js.Function2[/* store */ js.UndefOr[Any], /* initial */ js.UndefOr[Any], Unit])
      ): Self = StObject.set(x, "bindStore", value.asInstanceOf[js.Any])
      
      inline def setBindStoreFunction1(value: /* store */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "bindStore", js.Any.fromFunction1((t0: /* store */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setBindStoreFunction2(value: (/* store */ js.UndefOr[Any], /* initial */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "bindStore", js.Any.fromFunction2((t0: /* store */ js.UndefOr[Any], t1: /* initial */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Callback): Self = StObject.set(x, "bindStoreListeners", js.Any.fromFunction1((t0: js.UndefOr[IAbstractStore]) => value(t0).runNow()))
      
      inline def setBindStoreListenersUndefined: Self = StObject.set(x, "bindStoreListeners", js.undefined)
      
      inline def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
      
      inline def setDeselect(value: (/* records */ js.UndefOr[Any], /* suppressEvent */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "deselect", js.Any.fromFunction2((t0: /* records */ js.UndefOr[Any], t1: /* suppressEvent */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
      
      inline def setDeselectAll(value: /* suppressEvent */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "deselectAll", js.Any.fromFunction1((t0: /* suppressEvent */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setDeselectAllUndefined: Self = StObject.set(x, "deselectAll", js.undefined)
      
      inline def setDeselectRange(value: (/* startRow */ js.UndefOr[Any], /* endRow */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "deselectRange", js.Any.fromFunction2((t0: /* startRow */ js.UndefOr[Any], t1: /* endRow */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setDeselectRangeUndefined: Self = StObject.set(x, "deselectRange", js.undefined)
      
      inline def setDeselectUndefined: Self = StObject.set(x, "deselect", js.undefined)
      
      inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCount", value.toJsFn)
      
      inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
      
      inline def setGetLastSelected(value: CallbackTo[IModel]): Self = StObject.set(x, "getLastSelected", value.toJsFn)
      
      inline def setGetLastSelectedUndefined: Self = StObject.set(x, "getLastSelected", js.undefined)
      
      inline def setGetSelection(value: CallbackTo[Array]): Self = StObject.set(x, "getSelection", value.toJsFn)
      
      inline def setGetSelectionMode(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getSelectionMode", value.toJsFn)
      
      inline def setGetSelectionModeUndefined: Self = StObject.set(x, "getSelectionMode", js.undefined)
      
      inline def setGetSelectionUndefined: Self = StObject.set(x, "getSelection", js.undefined)
      
      inline def setGetStore(value: CallbackTo[IAbstractStore]): Self = StObject.set(x, "getStore", value.toJsFn)
      
      inline def setGetStoreListeners(value: js.Function0[Any] | (js.Function1[/* store */ js.UndefOr[IStore], Any])): Self = StObject.set(x, "getStoreListeners", value.asInstanceOf[js.Any])
      
      inline def setGetStoreListenersCallbackTo(value: CallbackTo[Any]): Self = StObject.set(x, "getStoreListeners", value.toJsFn)
      
      inline def setGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => Any): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction1(value))
      
      inline def setGetStoreListenersUndefined: Self = StObject.set(x, "getStoreListeners", js.undefined)
      
      inline def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
      
      inline def setHasSelection(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasSelection", value.toJsFn)
      
      inline def setHasSelectionUndefined: Self = StObject.set(x, "hasSelection", js.undefined)
      
      inline def setIsFocused(value: /* record */ js.UndefOr[IModel] => Callback): Self = StObject.set(x, "isFocused", js.Any.fromFunction1((t0: /* record */ js.UndefOr[IModel]) => value(t0).runNow()))
      
      inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      inline def setIsLocked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLocked", value.toJsFn)
      
      inline def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
      
      inline def setIsRangeSelected(value: (/* from */ js.UndefOr[Any], /* to */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "isRangeSelected", js.Any.fromFunction2(value))
      
      inline def setIsRangeSelectedUndefined: Self = StObject.set(x, "isRangeSelected", js.undefined)
      
      inline def setIsSelected(value: /* record */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setMode(value: Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "onBindStore", js.Any.fromFunction2((t0: js.UndefOr[IAbstractStore], t1: js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
      
      inline def setOnBindStoreUndefined: Self = StObject.set(x, "onBindStore", js.undefined)
      
      inline def setOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction2((t0: js.UndefOr[IAbstractStore], t1: js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
      
      inline def setOnUnbindStoreUndefined: Self = StObject.set(x, "onUnbindStore", js.undefined)
      
      inline def setPruneRemoved(value: Boolean): Self = StObject.set(x, "pruneRemoved", value.asInstanceOf[js.Any])
      
      inline def setPruneRemovedUndefined: Self = StObject.set(x, "pruneRemoved", js.undefined)
      
      inline def setSelect(
        value: (/* records */ js.UndefOr[Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Callback
      ): Self = StObject.set(x, "select", js.Any.fromFunction3((t0: /* records */ js.UndefOr[Any], t1: /* keepExisting */ js.UndefOr[Boolean], t2: /* suppressEvent */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setSelectAll(value: /* suppressEvent */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "selectAll", js.Any.fromFunction1((t0: /* suppressEvent */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
      
      inline def setSelectRange(
        value: (/* startRow */ js.UndefOr[Any], /* endRow */ js.UndefOr[Any], /* keepExisting */ js.UndefOr[Boolean]) => Callback
      ): Self = StObject.set(x, "selectRange", js.Any.fromFunction3((t0: /* startRow */ js.UndefOr[Any], t1: /* endRow */ js.UndefOr[Any], t2: /* keepExisting */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setSelectRangeUndefined: Self = StObject.set(x, "selectRange", js.undefined)
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelected(value: IMixedCollection): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSetLastFocused(value: /* record */ js.UndefOr[IModel] => Callback): Self = StObject.set(x, "setLastFocused", js.Any.fromFunction1((t0: /* record */ js.UndefOr[IModel]) => value(t0).runNow()))
      
      inline def setSetLastFocusedUndefined: Self = StObject.set(x, "setLastFocused", js.undefined)
      
      inline def setSetLocked(value: /* locked */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setLocked", js.Any.fromFunction1((t0: /* locked */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetLockedUndefined: Self = StObject.set(x, "setLocked", js.undefined)
      
      inline def setSetSelectionMode(value: /* selMode */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setSelectionMode", js.Any.fromFunction1((t0: /* selMode */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetSelectionModeUndefined: Self = StObject.set(x, "setSelectionMode", js.undefined)
      
      inline def setToggleOnClick(value: Boolean): Self = StObject.set(x, "toggleOnClick", value.asInstanceOf[js.Any])
      
      inline def setToggleOnClickUndefined: Self = StObject.set(x, "toggleOnClick", js.undefined)
      
      inline def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Callback): Self = StObject.set(x, "unbindStoreListeners", js.Any.fromFunction1((t0: js.UndefOr[IAbstractStore]) => value(t0).runNow()))
      
      inline def setUnbindStoreListenersUndefined: Self = StObject.set(x, "unbindStoreListeners", js.undefined)
    }
  }
  
  trait IRowModel
    extends StObject
       with IModel {
    
    /** [Config Option] (Boolean) */
    var enableKeyNav: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns position of the first selected cell in the selection in the format row row column column  */
    var getCurrentPosition: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var ignoreRightMouseSelection: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Selects the record immediately following the currently selected record
      * @param keepExisting Boolean True to retain existing selections
      * @param suppressEvent Boolean Set to false to not fire a select event
      * @returns Boolean true if there is a next record, else false
      */
    var selectNext: js.UndefOr[
        js.Function2[
          /* keepExisting */ js.UndefOr[Boolean], 
          /* suppressEvent */ js.UndefOr[Boolean], 
          Boolean
        ]
      ] = js.undefined
    
    /** [Method] Selects the record that precedes the currently selected record
      * @param keepExisting Boolean True to retain existing selections
      * @param suppressEvent Boolean Set to false to not fire a select event
      * @returns Boolean true if there is a previous record, else false
      */
    var selectPrevious: js.UndefOr[
        js.Function2[
          /* keepExisting */ js.UndefOr[Boolean], 
          /* suppressEvent */ js.UndefOr[Boolean], 
          Boolean
        ]
      ] = js.undefined
  }
  object IRowModel {
    
    inline def apply(): IRowModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowModel]
    }
    
    extension [Self <: IRowModel](x: Self) {
      
      inline def setEnableKeyNav(value: Boolean): Self = StObject.set(x, "enableKeyNav", value.asInstanceOf[js.Any])
      
      inline def setEnableKeyNavUndefined: Self = StObject.set(x, "enableKeyNav", js.undefined)
      
      inline def setGetCurrentPosition(value: Callback): Self = StObject.set(x, "getCurrentPosition", value.toJsFn)
      
      inline def setGetCurrentPositionUndefined: Self = StObject.set(x, "getCurrentPosition", js.undefined)
      
      inline def setIgnoreRightMouseSelection(value: Boolean): Self = StObject.set(x, "ignoreRightMouseSelection", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRightMouseSelectionUndefined: Self = StObject.set(x, "ignoreRightMouseSelection", js.undefined)
      
      inline def setSelectNext(
        value: (/* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "selectNext", js.Any.fromFunction2(value))
      
      inline def setSelectNextUndefined: Self = StObject.set(x, "selectNext", js.undefined)
      
      inline def setSelectPrevious(
        value: (/* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "selectPrevious", js.Any.fromFunction2(value))
      
      inline def setSelectPreviousUndefined: Self = StObject.set(x, "selectPrevious", js.undefined)
    }
  }
  
  trait ITreeModel
    extends StObject
       with IRowModel {
    
    /** [Method] binds the store to the selModel
      * @param store Object
      * @param initial Object
      */
    @JSName("bindStore")
    var bindStore_ITreeModel: js.UndefOr[js.Function2[/* store */ js.UndefOr[Any], /* initial */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object ITreeModel {
    
    inline def apply(): ITreeModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITreeModel]
    }
    
    extension [Self <: ITreeModel](x: Self) {
      
      inline def setBindStore(value: (/* store */ js.UndefOr[Any], /* initial */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "bindStore", js.Any.fromFunction2((t0: /* store */ js.UndefOr[Any], t1: /* initial */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    }
  }
}
