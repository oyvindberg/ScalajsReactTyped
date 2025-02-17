package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentMod.Document
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelFieldMaskMod.FieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcLocalOverlayedDocumentMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/overlayed_document", "OverlayedDocument")
  @js.native
  open class OverlayedDocument protected () extends StObject {
    def this(overlayedDocument: Document) = this()
    def this(
      overlayedDocument: Document,
      /**
      * The fields that are locally mutated by patch mutations. If the overlayed
      * document is from set or delete mutations, this returns null.
      */
    mutatedFields: FieldMask
    ) = this()
    
    /**
      * The fields that are locally mutated by patch mutations. If the overlayed
      * document is from set or delete mutations, this returns null.
      */
    val mutatedFields: FieldMask | Null = js.native
    
    val overlayedDocument: Document = js.native
  }
}
