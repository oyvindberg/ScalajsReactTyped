package typingsJapgolly.cannon.global.CANNON

import typingsJapgolly.cannon.CANNON.IHingeConstraintOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.HingeConstraint")
@js.native
open class HingeConstraint protected ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.HingeConstraint {
  def this(bodyA: typingsJapgolly.cannon.CANNON.Body, bodyB: typingsJapgolly.cannon.CANNON.Body) = this()
  def this(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    options: IHingeConstraintOptions
  ) = this()
  
  /* CompleteClass */
  var axisA: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var axisB: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var bodyA: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var bodyB: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var collideConnected: Boolean = js.native
  
  /* CompleteClass */
  override def disable(): Unit = js.native
  
  /* CompleteClass */
  override def disableMotor(): Unit = js.native
  
  /* CompleteClass */
  override def enable(): Unit = js.native
  
  /* CompleteClass */
  override def enableMotor(): Unit = js.native
  
  /* CompleteClass */
  var equations: js.Array[Any] = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var motorEnabled: Boolean = js.native
  
  /* CompleteClass */
  var motorEquation: typingsJapgolly.cannon.CANNON.RotationalMotorEquation = js.native
  
  /* CompleteClass */
  var motorMaxForce: Double = js.native
  
  /* CompleteClass */
  var motorMinForce: Double = js.native
  
  /* CompleteClass */
  var motorTargetVelocity: Double = js.native
  
  /* CompleteClass */
  override def setMotorSpeed(speed: Double): Unit = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
