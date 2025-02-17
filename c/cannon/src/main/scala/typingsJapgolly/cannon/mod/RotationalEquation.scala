package typingsJapgolly.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "RotationalEquation")
@js.native
open class RotationalEquation protected ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.RotationalEquation {
  def this(bodyA: typingsJapgolly.cannon.CANNON.Body, bodyB: typingsJapgolly.cannon.CANNON.Body) = this()
  
  /* CompleteClass */
  var a: Double = js.native
  
  /* CompleteClass */
  override def addToWlamda(deltalambda: Double): Double = js.native
  
  /* CompleteClass */
  var b: Double = js.native
  
  /* CompleteClass */
  var bi: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var bj: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  override def computeB(a: Double, b: Double, h: Double): Double = js.native
  
  /* CompleteClass */
  override def computeC(): Double = js.native
  
  /* CompleteClass */
  override def computeGW(): Double = js.native
  
  /* CompleteClass */
  override def computeGWlamda(): Double = js.native
  
  /* CompleteClass */
  override def computeGiMGt(): Double = js.native
  
  /* CompleteClass */
  override def computeGiMf(): Double = js.native
  
  /* CompleteClass */
  override def computeGq(): Double = js.native
  
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /* CompleteClass */
  var eps: Double = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var invIi: typingsJapgolly.cannon.CANNON.Mat3 = js.native
  
  /* CompleteClass */
  var invIj: typingsJapgolly.cannon.CANNON.Mat3 = js.native
  
  /* CompleteClass */
  var jacobianElementA: typingsJapgolly.cannon.CANNON.JacobianElement = js.native
  
  /* CompleteClass */
  var jacobianElementB: typingsJapgolly.cannon.CANNON.JacobianElement = js.native
  
  /* CompleteClass */
  var maxForce: Double = js.native
  
  /* CompleteClass */
  var minForce: Double = js.native
  
  /* CompleteClass */
  var ni: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var nixnj: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var nj: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var njxni: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var relForce: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var relVel: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def setSpookParams(stiffness: Double, relaxation: Double, timeStep: Double): Unit = js.native
}
