package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcRemoteConnectionMod.Connection
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcRemoteConnectivityMonitorMod.ConnectivityMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcPlatformNodeConnectionMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/platform/node/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newConnection(databaseInfo: DatabaseInfo): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnection")(databaseInfo.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  inline def newConnectivityMonitor(): ConnectivityMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnectivityMonitor")().asInstanceOf[ConnectivityMonitor]
}
