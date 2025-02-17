package typingsJapgolly.ionicReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ionicReact.distTypesComponentsIonRedirectMod.IonRedirectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IonRedirect {
  
  inline def apply(to: String): Builder = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IonRedirectProps]))
  }
  
  @JSImport("@ionic/react", "IonRedirect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.ionicReact.mod.IonRedirect] {
    
    inline def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    
    inline def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    
    inline def routerOptions(value: Any): this.type = set("routerOptions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IonRedirectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
