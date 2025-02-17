package typingsJapgolly.themeUiComponents.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcContainerMod.ContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Container {
  
  @JSImport("@theme-ui/components", "Container")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Container.type): Default[HTMLDivElement] = new Default[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[ContainerProps] & RefAttributes[HTMLDivElement]): Default[HTMLDivElement] = new Default[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
