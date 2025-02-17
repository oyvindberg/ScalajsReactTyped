package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert content created on the server to the client model.
  */
@js.native
trait InsertContentFromServerCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the InsertContentFromServerCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param requestId An string value identifying the request to the server.
    * @param position An integer value specifying position where to insert content to the active sub-document.
    * @param subDocumentId An integer value identifying the target sub-document.
    * @param callback A function to be executed after a content is inserted. The interval parameter returns an object that contains the inserted content's length and position.
    */
  def execute(requestId: String): Boolean = js.native
  def execute(requestId: String, position: Double): Boolean = js.native
  def execute(requestId: String, position: Double, subDocumentId: Double): Boolean = js.native
  def execute(
    requestId: String,
    position: Double,
    subDocumentId: Double,
    callback: js.Function1[/* interval */ Interval, Unit]
  ): Boolean = js.native
  def execute(
    requestId: String,
    position: Double,
    subDocumentId: Unit,
    callback: js.Function1[/* interval */ Interval, Unit]
  ): Boolean = js.native
  def execute(requestId: String, position: Unit, subDocumentId: Double): Boolean = js.native
  def execute(
    requestId: String,
    position: Unit,
    subDocumentId: Double,
    callback: js.Function1[/* interval */ Interval, Unit]
  ): Boolean = js.native
  def execute(
    requestId: String,
    position: Unit,
    subDocumentId: Unit,
    callback: js.Function1[/* interval */ Interval, Unit]
  ): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}
