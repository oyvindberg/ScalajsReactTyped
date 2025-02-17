package typingsJapgolly.protonNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.protonNative.anon.H
import typingsJapgolly.protonNative.anon.X
import typingsJapgolly.protonNative.mod.AreaLineProps
import typingsJapgolly.protonNative.protonNativeStrings.bevel
import typingsJapgolly.protonNative.protonNativeStrings.flat
import typingsJapgolly.protonNative.protonNativeStrings.miter
import typingsJapgolly.protonNative.protonNativeStrings.round
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AreaLine {
  
  inline def apply(x1: Double | String, x2: Double | String, y1: Double | String, y2: Double | String): Builder = {
    val __props = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AreaLineProps]))
  }
  
  @JSImport("proton-native", "AreaLine")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.protonNative.mod.AreaLine] {
    
    inline def align(value: H): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    
    inline def expand(value: H): this.type = set("expand", value.asInstanceOf[js.Any])
    
    inline def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def fillOpacity(value: Double): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    
    inline def span(value: X): this.type = set("span", value.asInstanceOf[js.Any])
    
    inline def stretchy(value: Boolean): this.type = set("stretchy", value.asInstanceOf[js.Any])
    
    inline def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    inline def strokeLinecap(value: flat | round | bevel): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    
    inline def strokeLinejoin(value: miter | round | bevel): this.type = set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    inline def strokeMiterlimit(value: Double): this.type = set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    inline def strokeOpacity(value: Double): this.type = set("strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    inline def transform(value: String): this.type = set("transform", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AreaLineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
