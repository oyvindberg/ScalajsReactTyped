package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAction extends StObject {
  
  /**
    * Internal only - manager for action
    * @internal
    */
  var _actionManager: Nullable[AbstractActionManager] = js.native
  
  /**
    * Internal only - executes current action event
    * @internal
    */
  def _executeCurrent(): Unit = js.native
  def _executeCurrent(evt: ActionEvent): Unit = js.native
  
  /**
    * Internal only
    * @internal
    */
  def _prepare(): Unit = js.native
  
  /**
    * Gets the trigger parameters
    * @returns the trigger parameters
    */
  def getTriggerParameter(): Any = js.native
  
  /**
    * Serialize placeholder for child classes
    * @param parent of child
    * @returns the serialized object
    */
  def serialize(parent: Any): Any = js.native
  
  /**
    * Adds action to chain of actions, may be a DoNothingAction
    * @param action defines the next action to execute
    * @returns The action passed in
    * @see https://www.babylonjs-playground.com/#1T30HR#0
    */
  def `then`(action: IAction): IAction = js.native
  
  /**
    * Trigger for the action
    */
  var trigger: Double = js.native
  
  /** Options of the trigger */
  var triggerOptions: Any = js.native
}
