package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanging event.
  */
trait ASPxClientTreeViewNodeCancelEventArgs
  extends StObject
     with ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets a node object related to the event.
    */
  var node: ASPxClientTreeViewNode
}
object ASPxClientTreeViewNodeCancelEventArgs {
  
  inline def apply(cancel: Boolean, node: ASPxClientTreeViewNode, processOnServer: Boolean): ASPxClientTreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeCancelEventArgs]
  }
  
  extension [Self <: ASPxClientTreeViewNodeCancelEventArgs](x: Self) {
    
    inline def setNode(value: ASPxClientTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
