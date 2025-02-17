package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is used to trigger background tasks. */
@js.native
trait ApplicationTrigger extends StObject {
  
  /**
    * This method attempts to set the trigger and start the registered background task.
    * @return Returns an ApplicationTriggerResult enumeration that indicates whether the user provided the necessary consent for the operation or the system policies didn't reject the request to trigger a background task.
    */
  def requestAsync(): IPromiseWithIAsyncOperation[ApplicationTriggerResult] = js.native
  /**
    * This method attempts to set the trigger and start the registered background task with specified arguments.
    * @param arguments The serialized arguments that are passed to the background task.
    * @return Returns an ApplicationTriggerResult enumeration that indicates whether the user provided the necessary consent for the operation or the system policies didn't reject the request to trigger a background task.
    */
  def requestAsync(args: ValueSet): IPromiseWithIAsyncOperation[ApplicationTriggerResult] = js.native
}
