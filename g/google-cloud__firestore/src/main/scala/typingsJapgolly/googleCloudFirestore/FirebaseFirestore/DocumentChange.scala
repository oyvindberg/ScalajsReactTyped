package typingsJapgolly.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentChange[T] extends StObject {
  
  /** The document affected by this change. */
  val doc: QueryDocumentSnapshot[T]
  
  /**
    * Returns true if the data in this `DocumentChange` is equal to the
    * provided one.
    *
    * @param other The `DocumentChange` to compare against.
    * @return true if this `DocumentChange` is equal to the provided one.
    */
  def isEqual(other: DocumentChange[T]): Boolean
  
  /**
    * The index of the changed document in the result set immediately after
    * this DocumentChange (i.e. supposing that all prior DocumentChange
    * objects and the current DocumentChange object have been applied).
    * Is -1 for 'removed' events.
    */
  val newIndex: Double
  
  /**
    * The index of the changed document in the result set immediately prior to
    * this DocumentChange (i.e. supposing that all prior DocumentChange objects
    * have been applied). Is -1 for 'added' events.
    */
  val oldIndex: Double
  
  /** The type of change ('added', 'modified', or 'removed'). */
  val `type`: DocumentChangeType
}
object DocumentChange {
  
  inline def apply[T](
    doc: QueryDocumentSnapshot[T],
    isEqual: DocumentChange[T] => Boolean,
    newIndex: Double,
    oldIndex: Double,
    `type`: DocumentChangeType
  ): DocumentChange[T] = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange[T]]
  }
  
  extension [Self <: DocumentChange[?], T](x: Self & DocumentChange[T]) {
    
    inline def setDoc(value: QueryDocumentSnapshot[T]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: DocumentChange[T] => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    inline def setType(value: DocumentChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
