package typingsJapgolly.reactNativeShare.mod

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-share", "ShareSheet")
@js.native
open class ShareSheet protected ()
  extends Component[ShareSheetProps, js.Object, Any] {
  def this(props: ShareSheetProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ShareSheetProps, context: Any) = this()
  
  def backButtonHandler(): Boolean = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MShareSheet(): Unit = js.native
  
  def componentWillUnMount(): Unit = js.native
}
