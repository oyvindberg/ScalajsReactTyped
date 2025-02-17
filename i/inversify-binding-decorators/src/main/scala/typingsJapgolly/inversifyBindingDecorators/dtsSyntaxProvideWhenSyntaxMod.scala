package typingsJapgolly.inversifyBindingDecorators

import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Bind
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.BindingWhenSyntax
import typingsJapgolly.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideDoneSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsSyntaxProvideWhenSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_when_syntax", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with ProvideWhenSyntax[T] {
    def this(
      bindingWhenSyntax: js.Function2[/* bind */ Bind, /* target */ Any, BindingWhenSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
  
  @js.native
  trait ProvideWhenSyntax[T]
    extends StObject
       with typingsJapgolly.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideWhenSyntax[T] {
    
    /* private */ var _bindingWhenSyntax: Any = js.native
    
    /* private */ var _provideDoneSyntax: Any = js.native
  }
}
