package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.libStyleMod.Theme
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAccordionStyleMod {
  
  @JSImport("@ant-design/react-native/lib/accordion/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): AccordionStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[AccordionStyle]
  
  trait AccordionStyle extends StObject {
    
    var arrow: TextStyle
    
    var container: ViewStyle
    
    var content: ViewStyle
    
    var contentText: TextStyle
    
    var header: ViewStyle
    
    var headerText: TextStyle
    
    var headerWrap: ViewStyle
  }
  object AccordionStyle {
    
    inline def apply(
      arrow: TextStyle,
      container: ViewStyle,
      content: ViewStyle,
      contentText: TextStyle,
      header: ViewStyle,
      headerText: TextStyle,
      headerWrap: ViewStyle
    ): AccordionStyle = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentText = contentText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerText = headerText.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionStyle]
    }
    
    extension [Self <: AccordionStyle](x: Self) {
      
      inline def setArrow(value: TextStyle): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContent(value: ViewStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentText(value: TextStyle): Self = StObject.set(x, "contentText", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: ViewStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderText(value: TextStyle): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderWrap(value: ViewStyle): Self = StObject.set(x, "headerWrap", value.asInstanceOf[js.Any])
    }
  }
}
