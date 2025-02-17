package typingsJapgolly.winrt.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOptionStates extends StObject
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionStates")
@js.native
object PrintOptionStates extends StObject {
  
  @js.native
  sealed trait constrained
    extends StObject
       with PrintOptionStates
  
  @js.native
  sealed trait enabled
    extends StObject
       with PrintOptionStates
  
  @js.native
  sealed trait none
    extends StObject
       with PrintOptionStates
}
