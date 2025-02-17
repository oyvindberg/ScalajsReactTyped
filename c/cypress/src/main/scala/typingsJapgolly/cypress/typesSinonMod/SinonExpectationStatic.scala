package typingsJapgolly.cypress.typesSinonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonExpectationStatic extends StObject {
  
  /**
    * Creates an expectation without a mock object, basically an anonymous mock function.
    * Method name is optional and is used in exception messages to make them more readable.
    * @param methodName
    */
  def create(): SinonExpectation = js.native
  def create(methodName: String): SinonExpectation = js.native
}
