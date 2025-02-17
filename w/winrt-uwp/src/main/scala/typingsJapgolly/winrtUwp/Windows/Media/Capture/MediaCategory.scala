package typingsJapgolly.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaCategory extends StObject
/** Defines values for types of media categories. */
@JSGlobal("Windows.Media.Capture.MediaCategory")
@js.native
object MediaCategory extends StObject {
  
  /** Media is intended for real-time communications. */
  @js.native
  sealed trait communications
    extends StObject
       with MediaCategory
  
  /** Media is game chat. */
  @js.native
  sealed trait gameChat
    extends StObject
       with MediaCategory
  
  /** General media. */
  @js.native
  sealed trait media
    extends StObject
       with MediaCategory
  
  /** Media category is other. */
  @js.native
  sealed trait other
    extends StObject
       with MediaCategory
  
  /** Media is speech. */
  @js.native
  sealed trait speech
    extends StObject
       with MediaCategory
}
