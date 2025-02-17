package typingsJapgolly.valerieBrowser

import typingsJapgolly.valerieBrowser.Valerie.PropertyValidationState
import typingsJapgolly.valerieBrowser.Valerie.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutComputed[T] extends StObject {
  
  // starts validation for observable
  def validate(): PropertyValidationState[KnockoutComputed[T]] = js.native
  def validate(validationOptions: ValidationOptions): PropertyValidationState[KnockoutComputed[T]] = js.native
}
