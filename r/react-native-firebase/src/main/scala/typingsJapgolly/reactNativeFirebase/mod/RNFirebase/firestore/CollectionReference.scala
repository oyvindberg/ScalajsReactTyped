package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore

import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Query.Observer
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Query.ObserverOnError
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Query.ObserverOnNext
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Types.GetOptions
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Types.QueryDirection
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Types.QueryOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionReference extends StObject {
  
  def add(data: js.Object): js.Promise[DocumentReference] = js.native
  
  def doc(): DocumentReference = js.native
  def doc(documentPath: String): DocumentReference = js.native
  
  def endAt(snapshot: DocumentSnapshot): Query = js.native
  def endAt(varargs: Any*): Query = js.native
  
  def endBefore(snapshot: DocumentSnapshot): Query = js.native
  def endBefore(varargs: Any*): Query = js.native
  
  val firestore: Firestore = js.native
  
  def get(): js.Promise[QuerySnapshot] = js.native
  def get(options: GetOptions): js.Promise[QuerySnapshot] = js.native
  
  val id: String = js.native
  
  def isEqual(otherCollectionReference: CollectionReference): Boolean = js.native
  
  def limit(limit: Double): Query = js.native
  
  def onSnapshot(metadataChanges: MetadataChanges, observer: Observer): js.Function0[Unit] = js.native
  def onSnapshot(metadataChanges: MetadataChanges, onNext: ObserverOnNext): js.Function0[Unit] = js.native
  def onSnapshot(metadataChanges: MetadataChanges, onNext: ObserverOnNext, onError: ObserverOnError): js.Function0[Unit] = js.native
  def onSnapshot(observer: Observer): js.Function0[Unit] = js.native
  def onSnapshot(onNext: ObserverOnNext): js.Function0[Unit] = js.native
  def onSnapshot(onNext: ObserverOnNext, onError: ObserverOnError): js.Function0[Unit] = js.native
  
  def orderBy(fieldPath: String): Query = js.native
  def orderBy(fieldPath: String, directionStr: QueryDirection): Query = js.native
  def orderBy(fieldPath: FieldPath): Query = js.native
  def orderBy(fieldPath: FieldPath, directionStr: QueryDirection): Query = js.native
  
  val parent: DocumentReference = js.native
  
  val path: String = js.native
  
  def startAfter(snapshot: DocumentSnapshot): Query = js.native
  def startAfter(varargs: Any*): Query = js.native
  
  def startAt(snapshot: DocumentSnapshot): Query = js.native
  def startAt(varargs: Any*): Query = js.native
  
  def where(fieldPath: String, op: QueryOperator, value: Any): Query = js.native
  def where(fieldPath: FieldPath, op: QueryOperator, value: Any): Query = js.native
}
