package typingsJapgolly.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonHTMLOutputProcessor extends StObject {
  
  /*This is an object that configures automatic linebreaking in the CommonHTML output. In order to be backward
    * compatible with earlier versions of MathJax, only explicit line breaks are performed by default, so you must
    * enable line breaks if you want automatic ones.
    */
  var linebreaks: js.UndefOr[LineBreaks] = js.undefined
  
  /*This gives a minimum scale (as a percent) for the scaling used by MathJax to match the equation to the
    * surrounding text. This will prevent MathJax from making the mathematics too small.
    */
  var minScaleAdjust: js.UndefOr[Double] = js.undefined
  
  /*This setting controls whether <mtext> elements will be typeset using the math fonts or the font of the
    * surrounding text. When false, the font for mathvariant="normal" will be used; when true, the font will be
    * inherited from the surrounding paragraph.
    */
  var mtextFontInherit: js.UndefOr[Boolean] = js.undefined
  
  /*The scaling factor (as a percentage) of math with respect to the surrounding text. The CommonHTML output
    * processor tries to match the ex-size of the mathematics with that of the text where it is placed, but you may
    * want to adjust the results using this scaling factor. The user can also adjust this value using the contextual
    * menu item associated with the typeset mathematics.
    */
  var scale: js.UndefOr[Double] = js.undefined
}
object CommonHTMLOutputProcessor {
  
  inline def apply(): CommonHTMLOutputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonHTMLOutputProcessor]
  }
  
  extension [Self <: CommonHTMLOutputProcessor](x: Self) {
    
    inline def setLinebreaks(value: LineBreaks): Self = StObject.set(x, "linebreaks", value.asInstanceOf[js.Any])
    
    inline def setLinebreaksUndefined: Self = StObject.set(x, "linebreaks", js.undefined)
    
    inline def setMinScaleAdjust(value: Double): Self = StObject.set(x, "minScaleAdjust", value.asInstanceOf[js.Any])
    
    inline def setMinScaleAdjustUndefined: Self = StObject.set(x, "minScaleAdjust", js.undefined)
    
    inline def setMtextFontInherit(value: Boolean): Self = StObject.set(x, "mtextFontInherit", value.asInstanceOf[js.Any])
    
    inline def setMtextFontInheritUndefined: Self = StObject.set(x, "mtextFontInherit", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
