package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.FC
import typingsJapgolly.semanticUiReact.distCommonjsModulesAccordionAccordionAccordionMod.AccordionAccordionProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesAccordionAccordionAccordionMod.StrictAccordionAccordionProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesAccordionAccordionContentMod.AccordionContentProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesAccordionAccordionMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[AccordionProps, js.Object, Any] {
    def this(props: AccordionProps) = this()
    def this(props: AccordionProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", JSImport.Default)
    @js.native
    val ^ : AccordionComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", "default.Accordion")
    @js.native
    open class Accordion protected ()
      extends Component[AccordionAccordionProps, js.Object, Any] {
      def this(props: AccordionAccordionProps) = this()
      def this(props: AccordionAccordionProps, context: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", "default.Panel")
    @js.native
    open class Panel ()
      extends typingsJapgolly.semanticUiReact.distCommonjsModulesAccordionAccordionPanelMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", "default.Title")
    @js.native
    open class Title protected ()
      extends Component[AccordionTitleProps, js.Object, Any] {
      def this(props: AccordionTitleProps) = this()
      def this(props: AccordionTitleProps, context: Any) = this()
    }
    
    type _To = AccordionComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: AccordionComponent = ^
  }
  
  @js.native
  trait AccordionComponent
    extends StObject
       with ComponentClass[AccordionProps, js.Object] {
    
    var Accordion: ComponentClassP[AccordionAccordionProps & js.Object] = js.native
    
    var Content: FC[AccordionContentProps] = js.native
    
    var Panel: Instantiable0[
        typingsJapgolly.semanticUiReact.distCommonjsModulesAccordionAccordionPanelMod.default
      ] = js.native
    
    var Title: ComponentClassP[AccordionTitleProps & js.Object] = js.native
  }
  
  trait AccordionProps
    extends StObject
       with StrictAccordionProps
       with /* key */ StringDictionary[Any]
  object AccordionProps {
    
    inline def apply(): AccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionProps]
    }
  }
  
  trait StrictAccordionProps
    extends StObject
       with StrictAccordionAccordionProps {
    
    /** Format to take up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** Format for dark backgrounds. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Adds some basic styling to accordion panels. */
    var styled: js.UndefOr[Boolean] = js.undefined
  }
  object StrictAccordionProps {
    
    inline def apply(): StrictAccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionProps]
    }
    
    extension [Self <: StrictAccordionProps](x: Self) {
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setStyled(value: Boolean): Self = StObject.set(x, "styled", value.asInstanceOf[js.Any])
      
      inline def setStyledUndefined: Self = StObject.set(x, "styled", js.undefined)
    }
  }
}
