package typingsJapgolly.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "AnswerRequiredError")
@js.native
open class AnswerRequiredError () extends SurveyError {
  def this(text: String) = this()
  def this(text: String, errorOwner: ISurveyErrorOwner) = this()
  def this(text: Unit, errorOwner: ISurveyErrorOwner) = this()
}
