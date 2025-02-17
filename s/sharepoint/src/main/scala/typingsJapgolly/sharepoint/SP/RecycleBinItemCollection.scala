package typingsJapgolly.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecycleBinItemCollection
  extends StObject
     with ClientObjectCollection[RecycleBinItem] {
  
  def deleteAll(): Unit = js.native
  
  def getById(id: Guid): RecycleBinItem = js.native
  
  def get_item(index: Double): RecycleBinItem = js.native
  
  def itemAt(index: Double): RecycleBinItem = js.native
  
  def restoreAll(): Unit = js.native
}
