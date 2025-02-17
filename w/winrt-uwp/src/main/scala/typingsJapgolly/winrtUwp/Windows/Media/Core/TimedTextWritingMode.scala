package typingsJapgolly.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedTextWritingMode extends StObject
/** Specifies the direction timed text is written. */
@JSGlobal("Windows.Media.Core.TimedTextWritingMode")
@js.native
object TimedTextWritingMode extends StObject {
  
  /** Text is written from left to right within a line. Lines are written top to bottom. */
  @js.native
  sealed trait leftRight
    extends StObject
       with TimedTextWritingMode
  
  /** Text is written from left to right within a line. Lines are written top to bottom. */
  @js.native
  sealed trait leftRightTopBottom
    extends StObject
       with TimedTextWritingMode
  
  /** Text is written from right to left within a line. Lines are written top to bottom. */
  @js.native
  sealed trait rightLeft
    extends StObject
       with TimedTextWritingMode
  
  /** Text is written from right to left within a line. Lines are written top to bottom. */
  @js.native
  sealed trait rightLeftTopBottom
    extends StObject
       with TimedTextWritingMode
  
  /** Text is written from top to bottom within a line. Lines are written left to right. */
  @js.native
  sealed trait topBottom
    extends StObject
       with TimedTextWritingMode
  
  /** Text is written from top to bottom within a line. Lines are written left to right. */
  @js.native
  sealed trait topBottomLeftRight
    extends StObject
       with TimedTextWritingMode
  
  /** Text is written from top to bottom within a line. Lines are written right to left. */
  @js.native
  sealed trait topBottomRightLeft
    extends StObject
       with TimedTextWritingMode
}
