package typingsJapgolly.officeJsPreview.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InsertLocation extends StObject
/**
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.InsertLocation")
@js.native
object InsertLocation extends StObject {
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait after
    extends StObject
       with InsertLocation
  
  /**
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  @js.native
  sealed trait before
    extends StObject
       with InsertLocation
}
