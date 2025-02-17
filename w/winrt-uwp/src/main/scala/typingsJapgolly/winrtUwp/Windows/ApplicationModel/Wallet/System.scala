package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.itemschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a set of asynchronous actions and operations that manage the wallet items in the system wallet database. These can be used to read the existing items, or to add and remove items. */
object System {
  
  @js.native
  sealed trait WalletItemAppAssociation extends StObject
  /** Defines values used by the GetAppStatusForItem method indicating if an app is installed for the specified WalletItem . */
  @JSGlobal("Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation")
  @js.native
  object WalletItemAppAssociation extends StObject {
    
    /** The app for the wallet item is installed on this device. */
    @js.native
    sealed trait appInstalled
      extends StObject
         with WalletItemAppAssociation
    
    /** An app exists for the wallet item, but it is not installed on the device. */
    @js.native
    sealed trait appNotInstalled
      extends StObject
         with WalletItemAppAssociation
    
    /** There is no app associated with the wallet item. */
    @js.native
    sealed trait none
      extends StObject
         with WalletItemAppAssociation
  }
  
  /** Defines a set of asynchronous actions and operations that manage the wallet items in the system wallet database. These can be used to read the existing items, or to add and remove items. */
  @js.native
  trait WalletItemSystemStore extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_itemschanged(`type`: itemschanged, listener: TypedEventHandler[WalletItemSystemStore, Any]): Unit = js.native
    
    /**
      * Asynchronously removes a specific wallet item with the given ID from the wallet system data store.
      * @param item The ID of the wallet item to remove from the system data store.
      * @return An asynchronous action. If you use Asynchronous programming, the result type is void.
      */
    def deleteAsync(item: WalletItem): IPromiseWithIAsyncAction = js.native
    
    /**
      * Gets a WalletItemAppAssociation value indicating if an app is installed for the specified WalletItem .
      * @param item The item for which to retrieve the status.
      * @return The WalletItemAppAssociation value indicating if an app is installed for the specified WalletItem specified by the item parameter.
      */
    def getAppStatusForItem(item: WalletItem): WalletItemAppAssociation = js.native
    
    /**
      * Returns the collection of all system wallet items owned by this app.
      * @return An asynchronous operation that, on successful completion, returns the collection of wallet items accessible by this app. If you use Asynchronous programming, the result type is a read-only list/vector of WalletItem items. (You can use APIs of IVectorView<WalletItem> for C++ or JavaScript, APIs of IReadOnlyList<WalletItem> for .NET.)
      */
    def getItemsAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
    
    /**
      * Imports data from a ".mswallet" XML file into the system wallet store.
      * @param stream The ".mswallet" file to import.
      * @return An asynchronous operation that, on successful completion, returns the wallet item that was imported into the wallet. If you use Asynchronous programming, the result type on successful completion is a single WalletItem .
      */
    def importItemAsync(stream: IRandomAccessStreamReference): IPromiseWithIAsyncOperation[WalletItem] = js.native
    
    /**
      * Launches the app that is associated with the given wallet item.
      * @param item The wallet item to launch an app for.
      * @return An async action indicating that the operation has completed.
      */
    def launchAppForItemAsync(item: WalletItem): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /** Occurs when items in the WalletItemSystemStore have changed. */
    def onitemschanged(ev: Any & WinRTEvent[WalletItemSystemStore]): Unit = js.native
    /** Occurs when items in the WalletItemSystemStore have changed. */
    @JSName("onitemschanged")
    var onitemschanged_Original: TypedEventHandler[WalletItemSystemStore, Any] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_itemschanged(`type`: itemschanged, listener: TypedEventHandler[WalletItemSystemStore, Any]): Unit = js.native
  }
  
  /** Provides a static method to get an instance of the system wallet store for this app. */
  trait WalletManagerSystem extends StObject
}
