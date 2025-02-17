package typingsJapgolly.johnnyFive.mod

import typingsJapgolly.johnnyFive.johnnyFiveStrings.change
import typingsJapgolly.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Gyro")
@js.native
open class Gyro protected () extends StObject {
  def this(option: GyroAnalogOption) = this()
  def this(option: GyroGeneralOption) = this()
  def this(option: GyroMPU6050Option) = this()
  
  var id: String = js.native
  
  val isCalibrated: Boolean = js.native
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ Any, Unit]): this.type = js.native
  
  var pins: js.Array[String] = js.native
  
  val pitch: Any = js.native
  
  val rate: Any = js.native
  
  def recalibrate(): Unit = js.native
  
  val roll: Any = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
  
  val yaw: Any = js.native
  
  val z: Double = js.native
}
