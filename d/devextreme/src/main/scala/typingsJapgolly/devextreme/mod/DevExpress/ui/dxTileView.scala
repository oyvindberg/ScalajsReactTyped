package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.ItemInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTileView.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTileView[TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidget[dxTileViewOptions[TItem, TKey], TItem, TKey] {
  
  /**
    * Gets the current scroll position.
    */
  def scrollPosition(): Double = js.native
}
object dxTileView {
  
  type ContentReadyEvent[TItem /* <: ItemLike */, TKey] = EventInfo[dxTileView[TItem, TKey]]
  
  type DisposingEvent[TItem /* <: ItemLike */, TKey] = EventInfo[dxTileView[TItem, TKey]]
  
  trait ExplicitTypes[TItem /* <: ItemLike */, TKey] extends StObject {
    
    var ContentReadyEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTileView.ContentReadyEvent[TItem, TKey]
    
    var DisposingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTileView.DisposingEvent[TItem, TKey]
    
    var InitializedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTileView.InitializedEvent[TItem, TKey]
    
    var ItemClickEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTileView.ItemClickEvent[TItem, TKey]
    
    var ItemContextMenuEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTileView.ItemContextMenuEvent[TItem, TKey]
    
    var ItemHoldEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTileView.ItemHoldEvent[TItem, TKey]
    
    var ItemRenderedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTileView.ItemRenderedEvent[TItem, TKey]
    
    var OptionChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTileView.OptionChangedEvent[TItem, TKey]
    
    var Properties: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTileView.Properties[TItem, TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      ContentReadyEvent: ContentReadyEvent[TItem, TKey],
      DisposingEvent: DisposingEvent[TItem, TKey],
      InitializedEvent: InitializedEvent[TItem, TKey],
      ItemClickEvent: ItemClickEvent[TItem, TKey],
      ItemContextMenuEvent: ItemContextMenuEvent[TItem, TKey],
      ItemHoldEvent: ItemHoldEvent[TItem, TKey],
      ItemRenderedEvent: ItemRenderedEvent[TItem, TKey],
      OptionChangedEvent: OptionChangedEvent[TItem, TKey],
      Properties: Properties[TItem, TKey]
    ): ExplicitTypes[TItem, TKey] = {
      val __obj = js.Dynamic.literal(ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], ItemClickEvent = ItemClickEvent.asInstanceOf[js.Any], ItemContextMenuEvent = ItemContextMenuEvent.asInstanceOf[js.Any], ItemHoldEvent = ItemHoldEvent.asInstanceOf[js.Any], ItemRenderedEvent = ItemRenderedEvent.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TItem, TKey]]
    }
    
    extension [Self <: ExplicitTypes[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (ExplicitTypes[TItem, TKey])) {
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TItem, TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TItem, TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TItem, TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemClickEvent(value: ItemClickEvent[TItem, TKey]): Self = StObject.set(x, "ItemClickEvent", value.asInstanceOf[js.Any])
      
      inline def setItemContextMenuEvent(value: ItemContextMenuEvent[TItem, TKey]): Self = StObject.set(x, "ItemContextMenuEvent", value.asInstanceOf[js.Any])
      
      inline def setItemHoldEvent(value: ItemHoldEvent[TItem, TKey]): Self = StObject.set(x, "ItemHoldEvent", value.asInstanceOf[js.Any])
      
      inline def setItemRenderedEvent(value: ItemRenderedEvent[TItem, TKey]): Self = StObject.set(x, "ItemRenderedEvent", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TItem, TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TItem, TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    }
  }
  
  type InitializedEvent[TItem /* <: ItemLike */, TKey] = InitializedEventInfo[dxTileView[TItem, TKey]]
  
  type Item = dxTileViewItem
  
  trait ItemClickEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxTileView[TItem, TKey], KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[TItem]
  object ItemClickEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxTileView[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent[TItem, TKey]]
    }
  }
  
  trait ItemContextMenuEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxTileView[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TItem]
  object ItemContextMenuEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxTileView[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemContextMenuEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContextMenuEvent[TItem, TKey]]
    }
  }
  
  trait ItemHoldEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxTileView[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TItem]
  object ItemHoldEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxTileView[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemHoldEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemHoldEvent[TItem, TKey]]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type ItemLike = String | Item | Any
  
  trait ItemRenderedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxTileView[TItem, TKey]]
       with ItemInfo[TItem]
  object ItemRenderedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxTileView[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemRenderedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenderedEvent[TItem, TKey]]
    }
  }
  
  trait OptionChangedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxTileView[TItem, TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxTileView[TItem, TKey],
      element: DxElement_[HTMLElement],
      fullName: String,
      name: String
    ): OptionChangedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TItem, TKey]]
    }
  }
  
  type Properties[TItem /* <: ItemLike */, TKey] = dxTileViewOptions[TItem, TKey]
}
