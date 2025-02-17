package typingsJapgolly.servicenow

import typingsJapgolly.servicenow.servicenow.GlideRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideEvaluator extends StObject {
  
  def evaluateScript(grObj: GlideRecord): js.Object = js.native
  def evaluateScript(grObj: GlideRecord, scriptField: String): js.Object = js.native
  def evaluateScript(grObj: GlideRecord, scriptField: String, variables: js.Object): js.Object = js.native
  def evaluateScript(grObj: GlideRecord, scriptField: Unit, variables: js.Object): js.Object = js.native
  
  def getVariable(name: String): js.Object = js.native
  
  def putVariable(name: String, value: js.Object): Unit = js.native
}
