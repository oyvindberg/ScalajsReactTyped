package typingsJapgolly.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("k6/html", "TextAreaElement")
@js.native
open class TextAreaElement () extends Element {
  
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
  
  /** Byte length of current text value. */
  def length(): Double = js.native
}
