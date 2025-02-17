package typingsJapgolly.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedWorkspaceMembers extends StObject {
  
  def apply(Index: Double): SharedWorkspaceMember = js.native
  
  def Add(Email: String, DomainName: String, DisplayName: String): SharedWorkspaceMember = js.native
  def Add(Email: String, DomainName: String, DisplayName: String, Role: String): SharedWorkspaceMember = js.native
  
  val Application: Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): SharedWorkspaceMember = js.native
  
  val ItemCountExceeded: Boolean = js.native
  
  val Parent: Any = js.native
}
