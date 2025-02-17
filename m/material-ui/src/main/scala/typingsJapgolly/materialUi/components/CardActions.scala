package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Card.CardActionsProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardActions {
  
  @JSImport("material-ui", "CardActions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.CardActions] {
    
    inline def actAsExpander(value: Boolean): this.type = set("actAsExpander", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    inline def showExpandableButton(value: Boolean): this.type = set("showExpandableButton", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CardActions.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardActionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
