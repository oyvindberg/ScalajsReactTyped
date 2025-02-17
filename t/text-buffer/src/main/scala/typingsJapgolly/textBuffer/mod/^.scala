package typingsJapgolly.textBuffer.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.textBuffer.anon.ShouldDestroyOnFileDelete
import typingsJapgolly.textBuffer.mod.global.TextBuffer.TextBuffer
import typingsJapgolly.textBuffer.mod.global.TextBuffer.TextBufferStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("text-buffer", JSImport.Namespace)
@js.native
/** Create a new buffer with the given params. */
open class ^ ()
  extends StObject
     with TextBuffer {
  def this(params: ShouldDestroyOnFileDelete) = this()
  /** Create a new buffer with the given starting text. */
  def this(text: String) = this()
}
@JSImport("text-buffer", JSImport.Namespace)
@js.native
object ^
  extends StObject
     with TopLevel[js.Object & TextBufferStatic]
