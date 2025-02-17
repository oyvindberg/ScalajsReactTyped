package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change a floating object's absolute position.
  */
@JSGlobal("ChangeFloatingObjectAbsolutePositionCommand")
@js.native
open class ChangeFloatingObjectAbsolutePositionCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeFloatingObjectAbsolutePositionCommand {
  
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  /* CompleteClass */
  override def execute(settings: typingsJapgolly.devexpressWeb.FloatingObjectAbsolutePositionSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[typingsJapgolly.devexpressWeb.FloatingObjectAbsolutePositionSettings] = js.native
}
