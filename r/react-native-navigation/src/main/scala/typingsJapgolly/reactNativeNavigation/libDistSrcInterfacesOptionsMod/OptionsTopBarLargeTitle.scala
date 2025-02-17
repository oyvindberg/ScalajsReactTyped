package typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsTopBarLargeTitle extends StObject {
  
  /**
    * Set the color of large title's text
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * Set the font family of the large title text
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  
  /**
    * Set the font size of large title's text
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Set the font style of the large title text
    */
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  
  /**
    * Enable large titles
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object OptionsTopBarLargeTitle {
  
  inline def apply(): OptionsTopBarLargeTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBarLargeTitle]
  }
  
  extension [Self <: OptionsTopBarLargeTitle](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
