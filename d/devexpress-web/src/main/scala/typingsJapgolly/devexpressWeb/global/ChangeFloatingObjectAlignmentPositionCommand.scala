package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's alignment position.
  */
@JSGlobal("ChangeFloatingObjectAlignmentPositionCommand")
@js.native
open class ChangeFloatingObjectAlignmentPositionCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeFloatingObjectAlignmentPositionCommand {
  
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  /* CompleteClass */
  override def execute(settings: typingsJapgolly.devexpressWeb.FloatingObjectAlignmentPositionSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[typingsJapgolly.devexpressWeb.FloatingObjectAlignmentPositionSettings] = js.native
}
