package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcModelDocumentComparatorMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/model/document_comparator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareByKey(doc1: Document, doc2: Document): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareByKey")(doc1.asInstanceOf[js.Any], doc2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type DocumentComparator = js.Function2[/* doc1 */ Document, /* doc2 */ Document, Double]
}
