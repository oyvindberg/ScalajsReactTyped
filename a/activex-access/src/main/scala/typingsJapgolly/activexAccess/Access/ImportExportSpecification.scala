package typingsJapgolly.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportExportSpecification extends StObject {
  
  /* private */ @JSName("Access.ImportExportSpecification_typekey")
  var AccessDotImportExportSpecification_typekey: ImportExportSpecification = js.native
  
  val Application: typingsJapgolly.activexAccess.Access.Application = js.native
  
  def Delete(): Unit = js.native
  
  var Description: String = js.native
  
  def Execute(): Unit = js.native
  def Execute(Prompt: Boolean): Unit = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var Name: String = js.native
  
  val Parent: Any = js.native
  
  var XML: String = js.native
}
