package typingsJapgolly.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphStyle extends StObject
/** Specifies the paragraph style. */
@JSGlobal("Windows.UI.Text.ParagraphStyle")
@js.native
object ParagraphStyle extends StObject {
  
  /** The top level heading. */
  @js.native
  sealed trait heading1
    extends StObject
       with ParagraphStyle
  
  /** The second level heading. */
  @js.native
  sealed trait heading2
    extends StObject
       with ParagraphStyle
  
  /** Third level heading. */
  @js.native
  sealed trait heading3
    extends StObject
       with ParagraphStyle
  
  /** Fourth level heading. */
  @js.native
  sealed trait heading4
    extends StObject
       with ParagraphStyle
  
  /** Fifth level heading. */
  @js.native
  sealed trait heading5
    extends StObject
       with ParagraphStyle
  
  /** Sixth level heading. */
  @js.native
  sealed trait heading6
    extends StObject
       with ParagraphStyle
  
  /** Seventh level heading. */
  @js.native
  sealed trait heading7
    extends StObject
       with ParagraphStyle
  
  /** Eighth level heading. */
  @js.native
  sealed trait heading8
    extends StObject
       with ParagraphStyle
  
  /** Ninth level heading. */
  @js.native
  sealed trait heading9
    extends StObject
       with ParagraphStyle
  
  /** There is no paragraph style. */
  @js.native
  sealed trait none
    extends StObject
       with ParagraphStyle
  
  /** The paragraph style is normal. */
  @js.native
  sealed trait normal
    extends StObject
       with ParagraphStyle
  
  /** The paragraph style is undefined. */
  @js.native
  sealed trait undefined
    extends StObject
       with ParagraphStyle
}
