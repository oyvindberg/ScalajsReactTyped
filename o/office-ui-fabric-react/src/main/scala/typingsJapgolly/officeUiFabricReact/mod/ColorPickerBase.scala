package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.anon.PartialIColorPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "ColorPickerBase")
@js.native
open class ColorPickerBase protected ()
  extends typingsJapgolly.officeUiFabricReact.libColorPickerMod.ColorPickerBase {
  def this(props: IColorPickerProps) = this()
}
/* static members */
object ColorPickerBase {
  
  @JSImport("office-ui-fabric-react", "ColorPickerBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "ColorPickerBase.defaultProps")
  @js.native
  def defaultProps: PartialIColorPickerProps = js.native
  inline def defaultProps_=(x: PartialIColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
