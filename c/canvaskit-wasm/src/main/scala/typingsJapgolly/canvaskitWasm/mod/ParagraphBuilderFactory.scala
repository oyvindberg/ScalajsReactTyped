package typingsJapgolly.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphBuilderFactory extends StObject {
  
  /**
    * Creates a ParagraphBuilder using the fonts available from the given font manager.
    * @param style
    * @param fontManager
    */
  def Make(style: ParagraphStyle, fontManager: FontMgr): ParagraphBuilder = js.native
  
  /**
    * Creates a ParagraphBuilder using the fonts available from the given font provider.
    * @param style
    * @param fontSrc
    */
  def MakeFromFontProvider(style: ParagraphStyle, fontSrc: TypefaceFontProvider): ParagraphBuilder = js.native
  
  /**
    * Return a shaped array of lines
    */
  def ShapeText(text: String, runs: js.Array[FontBlock]): js.Array[ShapedLine] = js.native
  def ShapeText(text: String, runs: js.Array[FontBlock], width: Double): js.Array[ShapedLine] = js.native
}
