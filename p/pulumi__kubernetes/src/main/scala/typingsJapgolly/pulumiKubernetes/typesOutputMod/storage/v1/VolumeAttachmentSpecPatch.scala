package typingsJapgolly.pulumiKubernetes.typesOutputMod.storage.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
  */
trait VolumeAttachmentSpecPatch extends StObject {
  
  /**
    * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
    */
  var attacher: String
  
  /**
    * The node that the volume should be attached to.
    */
  var nodeName: String
  
  /**
    * Source represents the volume that should be attached.
    */
  var source: VolumeAttachmentSourcePatch
}
object VolumeAttachmentSpecPatch {
  
  inline def apply(attacher: String, nodeName: String, source: VolumeAttachmentSourcePatch): VolumeAttachmentSpecPatch = {
    val __obj = js.Dynamic.literal(attacher = attacher.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentSpecPatch]
  }
  
  extension [Self <: VolumeAttachmentSpecPatch](x: Self) {
    
    inline def setAttacher(value: String): Self = StObject.set(x, "attacher", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setSource(value: VolumeAttachmentSourcePatch): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
