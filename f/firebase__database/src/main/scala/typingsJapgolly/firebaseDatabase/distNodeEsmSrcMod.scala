package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typingsJapgolly.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseDatabase.anon.MockUserToken
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiOnDisconnectMod.OnDisconnect
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceMod.DatabaseReference
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceMod.ListenOptions
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceMod.Query
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceMod.ThenableReference
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceMod.Unsubscribe
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiTransactionMod.TransactionOptions
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreRepoMod.Repo
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreSnapIndexesIndexMod.Index
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.Node
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreViewEventMod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcMod {
  
  @JSImport("@firebase/database/dist/node-esm/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src", "DataSnapshot")
  @js.native
  open class DataSnapshot protected ()
    extends typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiMod.DataSnapshot {
    /**
      * @param _node - A SnapshotNode to wrap.
      * @param ref - The location this snapshot came from.
      * @param _index - The iteration order for this snapshot
      * @hideconstructor
      */
    def this(_node: Node, /**
      * The location of this DataSnapshot.
      */
    ref: DatabaseReference, _index: Index) = this()
  }
  
  @JSImport("@firebase/database/dist/node-esm/src", "Database")
  @js.native
  open class Database protected ()
    extends typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiMod.Database {
    /** @hideconstructor */
    def this(
      _repoInternal: Repo,
      /** The {@link @firebase/app#FirebaseApp} associated with this Realtime Database instance. */
    app: FirebaseApp
    ) = this()
  }
  
  @JSImport("@firebase/database/dist/node-esm/src", "OnDisconnect")
  @js.native
  open class OnDisconnect_ protected ()
    extends typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiMod.OnDisconnect_ {
    /** @hideconstructor */
    def this(_repo: Repo, _path: Path) = this()
  }
  
  /* note: abstract class */ @JSImport("@firebase/database/dist/node-esm/src", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiMod.QueryConstraint
  
  @JSImport("@firebase/database/dist/node-esm/src", "_QueryImpl")
  @js.native
  open class QueryImpl protected ()
    extends typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiMod.QueryImpl {
    /**
      * @hideconstructor
      */
    def this(
      _repo: Repo,
      _path: Path,
      _queryParams: typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreViewQueryParamsMod.QueryParams,
      _orderByCalled: Boolean
    ) = this()
  }
  
  @JSImport("@firebase/database/dist/node-esm/src", "_QueryParams")
  @js.native
  open class QueryParams ()
    extends typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiMod.QueryParams
  
  @JSImport("@firebase/database/dist/node-esm/src", "_ReferenceImpl")
  @js.native
  open class ReferenceImpl protected ()
    extends typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiMod.ReferenceImpl {
    /** @hideconstructor */
    def this(repo: Repo, path: Path) = this()
  }
  
  inline def TESTACCESSForceRestClient(forceRestClient: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_TEST_ACCESS_forceRestClient")(forceRestClient.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def TESTACCESSHijackHash(newHash: js.Function0[String]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_TEST_ACCESS_hijackHash")(newHash.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@firebase/database/dist/node-esm/src", "TransactionResult")
  @js.native
  open class TransactionResult protected ()
    extends typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiMod.TransactionResult {
    /** @hideconstructor */
    def this(
      /** Whether the transaction was successfully committed. */
    committed: Boolean,
      /** The resulting data snapshot. */
    snapshot: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot
    ) = this()
  }
  
  inline def child(parent: DatabaseReference, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("child")(parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def connectDatabaseEmulator(
    db: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database,
    host: String,
    port: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectDatabaseEmulator(
    db: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableLogging(enabled: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(enabled: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* message */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def endAt(): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")().asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: String, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: Boolean): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: Double): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: Double, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: Null, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  
  inline def endBefore(): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")().asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: String, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: Boolean): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: Double): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: Double, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: Null, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  
  inline def equalTo(): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")().asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: String, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: Boolean): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: Double): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: Double, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: Null, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  
  inline def forceLongPolling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLongPolling")().asInstanceOf[Unit]
  
  inline def forceWebSockets(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceWebSockets")().asInstanceOf[Unit]
  
  inline def get(query: Query): js.Promise[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot]]
  
  inline def getDatabase(): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")().asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  inline def getDatabase(app: Unit, url: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  inline def getDatabase(app: FirebaseApp): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  inline def getDatabase(app: FirebaseApp, url: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  
  inline def goOffline(db: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOffline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def goOnline(db: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOnline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def increment(delta: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(delta.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def limitToFirst(limit: Double): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToFirst")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  
  inline def off(query: Query): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(
    query: Query,
    eventType: Unit,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(query: Query, eventType: EventType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    query: Query,
    eventType: EventType,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onDisconnect(ref: DatabaseReference): OnDisconnect = ^.asInstanceOf[js.Dynamic].applyDynamic("onDisconnect")(ref.asInstanceOf[js.Any]).asInstanceOf[OnDisconnect]
  
  inline def onValue(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def orderByChild(path: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByChild")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  
  inline def orderByKey(): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByKey")().asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  
  inline def orderByPriority(): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByPriority")().asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  
  inline def orderByValue(): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByValue")().asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  
  inline def push(parent: DatabaseReference): ThenableReference = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any]).asInstanceOf[ThenableReference]
  inline def push(parent: DatabaseReference, value: Any): ThenableReference = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ThenableReference]
  
  inline def query(
    query: Query,
    queryConstraints: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint*
  ): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query]
  
  inline def ref(db: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database): DatabaseReference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any]).asInstanceOf[DatabaseReference]
  inline def ref(db: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def refFromURL(db: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database, url: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("refFromURL")(db.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def remove(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def repoManagerDatabaseFromApp(app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: String
  ): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: String,
    nodeAdmin: Boolean
  ): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: Unit,
    nodeAdmin: Boolean
  ): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName]
  ): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: String
  ): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: String,
    nodeAdmin: Boolean
  ): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: Unit,
    nodeAdmin: Boolean
  ): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database]
  
  inline def runTransaction(ref: DatabaseReference, transactionUpdate: js.Function1[/* currentData */ Any, Any]): js.Promise[
    typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiTransactionMod.TransactionResult
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiTransactionMod.TransactionResult
  ]]
  inline def runTransaction(
    ref: DatabaseReference,
    transactionUpdate: js.Function1[/* currentData */ Any, Any],
    options: TransactionOptions
  ): js.Promise[
    typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiTransactionMod.TransactionResult
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiTransactionMod.TransactionResult
  ]]
  
  inline def serverTimestamp(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[js.Object]
  
  inline def set(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPriority(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setSDKVersion(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setSDKVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setWithPriority(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startAfter(): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")().asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: String, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: Boolean): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: Double): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: Double, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: Null, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  
  inline def startAt(): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")().asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: String, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Boolean): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Double): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Double, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Null, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Unit, key: String): typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.QueryConstraint]
  
  inline def update(ref: DatabaseReference, values: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def validatePathString(fnName: String, argumentName: String, pathString: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validatePathString")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], pathString.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateWritablePath(fnName: String, path: Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateWritablePath")(fnName.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var database: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database
    }
    object NameServiceMapping {
      
      inline def apply(database: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database): NameServiceMapping = {
        val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setDatabase(value: typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiDatabaseMod.Database): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      }
    }
  }
}
