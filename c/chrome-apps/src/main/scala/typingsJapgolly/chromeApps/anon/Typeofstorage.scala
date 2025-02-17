package typingsJapgolly.chromeApps.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chrome.storage.LocalStorageArea
import typingsJapgolly.chromeApps.chrome.storage.ManagedStorageArea
import typingsJapgolly.chromeApps.chrome.storage.StorageAreas
import typingsJapgolly.chromeApps.chrome.storage.StorageChange
import typingsJapgolly.chromeApps.chrome.storage.SyncStorageArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofstorage extends StObject {
  
  /** Items in the local storage area are local to each machine. */
  val local: LocalStorageArea
  
  /**
    * Items in the managed storage area are set by the domain administrator,
    * and are read-only for the extension; trying to modify this namespace
    * results in an error.
    * @since Chrome 33.
    */
  val managed: ManagedStorageArea
  
  /** Fired when one or more items change. */
  val onChanged: Event[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
  ]
  
  /** Items in the sync storage area are synced using Chrome Sync. */
  val sync: SyncStorageArea
}
object Typeofstorage {
  
  inline def apply(
    local: LocalStorageArea,
    managed: ManagedStorageArea,
    onChanged: Event[
      js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
    ],
    sync: SyncStorageArea
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], onChanged = onChanged.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofstorage]
  }
  
  extension [Self <: Typeofstorage](x: Self) {
    
    inline def setLocal(value: LocalStorageArea): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setManaged(value: ManagedStorageArea): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
    
    inline def setOnChanged(
      value: Event[
          js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
        ]
    ): Self = StObject.set(x, "onChanged", value.asInstanceOf[js.Any])
    
    inline def setSync(value: SyncStorageArea): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
  }
}
