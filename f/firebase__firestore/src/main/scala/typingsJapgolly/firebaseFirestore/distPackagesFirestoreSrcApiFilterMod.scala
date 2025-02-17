package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcApiFilterMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint
  
  inline def endAt(fieldValues: Any*): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endAt(snapshot: DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endBefore(snapshot: DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def limit(limit: Double): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def orderBy(fieldPath: String): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: FieldPath): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: FieldPath, directionStr: OrderByDirection): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def query[T](
    query: Query[T],
    queryConstraints: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint*
  ): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def startAfter(fieldValues: Any*): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAfter(snapshot: DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def startAt(fieldValues: Any*): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAt(snapshot: DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def where(fieldPath: FieldPath, opStr: WhereFilterOp, value: Any): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
}
