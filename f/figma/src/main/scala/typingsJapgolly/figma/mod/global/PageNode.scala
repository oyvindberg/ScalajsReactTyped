package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.anon.End
import typingsJapgolly.figma.figmaStrings.PAGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageNode
  extends StObject
     with BaseNodeMixin
     with ChildrenMixin
     with ExportMixin
     with BaseNode {
  
  var backgrounds: js.Array[Paint] = js.native
  
  var guides: js.Array[Guide] = js.native
  
  val prototypeStartNode: FrameNode | GroupNode | ComponentNode | InstanceNode | Null = js.native
  
  var selectedTextRange: End | Null = js.native
  
  var selection: js.Array[SceneNode] = js.native
  
  val `type`: PAGE = js.native
}
