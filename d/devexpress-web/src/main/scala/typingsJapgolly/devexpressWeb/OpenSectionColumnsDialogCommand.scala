package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Columns dialog.
  */
trait OpenSectionColumnsDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenSectionColumnsDialogCommand command.
    */
  def execute(): Boolean
}
object OpenSectionColumnsDialogCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): OpenSectionColumnsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[OpenSectionColumnsDialogCommand]
  }
  
  extension [Self <: OpenSectionColumnsDialogCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
