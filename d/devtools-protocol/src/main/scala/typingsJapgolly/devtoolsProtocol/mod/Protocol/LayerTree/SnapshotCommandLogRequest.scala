package typingsJapgolly.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCommandLogRequest extends StObject {
  
  /**
    * The id of the layer snapshot.
    */
  var snapshotId: SnapshotId
}
object SnapshotCommandLogRequest {
  
  inline def apply(snapshotId: SnapshotId): SnapshotCommandLogRequest = {
    val __obj = js.Dynamic.literal(snapshotId = snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCommandLogRequest]
  }
  
  extension [Self <: SnapshotCommandLogRequest](x: Self) {
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
  }
}
