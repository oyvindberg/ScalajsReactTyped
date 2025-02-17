package typingsJapgolly.babelPluginReactHtmlAttrs.mod

import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.baseline
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.bottom
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.center
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.char
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.justify
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.left
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.middle
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.right
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TdHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var abbr: js.UndefOr[String] = js.undefined
  
  var align: js.UndefOr[left | center | right | justify | char] = js.undefined
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var colspan: js.UndefOr[Double | String] = js.undefined
  
  var headers: js.UndefOr[String] = js.undefined
  
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  var rowspan: js.UndefOr[Double | String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var valign: js.UndefOr[top | middle | bottom | baseline] = js.undefined
}
object TdHTMLAttributes {
  
  inline def apply[T](): TdHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TdHTMLAttributes[T]]
  }
  
  extension [Self <: TdHTMLAttributes[?], T](x: Self & TdHTMLAttributes[T]) {
    
    inline def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
    
    inline def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
    
    inline def setAlign(value: left | center | right | justify | char): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setValign(value: top | middle | bottom | baseline): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
  }
}
