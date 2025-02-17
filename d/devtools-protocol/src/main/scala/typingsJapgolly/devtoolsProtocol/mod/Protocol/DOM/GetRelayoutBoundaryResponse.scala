package typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelayoutBoundaryResponse extends StObject {
  
  /**
    * Relayout boundary node id for the given node.
    */
  var nodeId: NodeId
}
object GetRelayoutBoundaryResponse {
  
  inline def apply(nodeId: NodeId): GetRelayoutBoundaryResponse = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelayoutBoundaryResponse]
  }
  
  extension [Self <: GetRelayoutBoundaryResponse](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
