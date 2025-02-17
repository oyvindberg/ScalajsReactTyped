package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.miscTimerMod.ITimerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "AdvancedTimer")
@js.native
open class AdvancedTimer[T] protected ()
  extends typingsJapgolly.babylonjs.miscIndexMod.AdvancedTimer[T] {
  /**
    * Will construct a new advanced timer based on the options provided. Timer will not start until start() is called.
    * @param options construction options for this advanced timer
    */
  def this(options: ITimerOptions[T]) = this()
}
