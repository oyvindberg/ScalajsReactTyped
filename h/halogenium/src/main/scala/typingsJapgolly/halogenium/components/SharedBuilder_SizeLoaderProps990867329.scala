package typingsJapgolly.halogenium.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.halogenium.mod.VerticalAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SizeLoaderProps990867329[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  
  inline def size(value: Double | String): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def verticalAlign(value: VerticalAlign): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
}
