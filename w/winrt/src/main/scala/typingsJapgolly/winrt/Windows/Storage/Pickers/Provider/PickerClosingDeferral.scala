package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerClosingDeferral
  extends StObject
     with IPickerClosingDeferral
object PickerClosingDeferral {
  
  inline def apply(complete: Callback): PickerClosingDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[PickerClosingDeferral]
  }
}
