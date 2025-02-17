package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectedViewWindow extends StObject {
  
  def Activate(): Unit = js.native
  
  val Active: MsoTriState = js.native
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  val Caption: String = js.native
  
  def Close(): Unit = js.native
  
  /** @param string [ModifyPassword=''] */
  def Edit(): typingsJapgolly.activexPowerpoint.PowerPoint.Presentation = js.native
  def Edit(ModifyPassword: String): typingsJapgolly.activexPowerpoint.PowerPoint.Presentation = js.native
  
  var Height: Double = js.native
  
  var Left: Double = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.ProtectedViewWindow_typekey")
  var PowerPointDotProtectedViewWindow_typekey: ProtectedViewWindow = js.native
  
  val Presentation: typingsJapgolly.activexPowerpoint.PowerPoint.Presentation = js.native
  
  val SourceName: String = js.native
  
  val SourcePath: String = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
  
  var WindowState: PpWindowState = js.native
}
