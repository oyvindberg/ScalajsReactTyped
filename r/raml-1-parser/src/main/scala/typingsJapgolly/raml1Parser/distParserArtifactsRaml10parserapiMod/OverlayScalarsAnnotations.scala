package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayScalarsAnnotations
  extends StObject
     with ApiScalarsAnnotations {
  
  /**
    * Overlay.extends annotations
    **/
  def `extends`(): js.Array[AnnotationRef]
  
  /**
    * Overlay.usage annotations
    **/
  def usage(): js.Array[AnnotationRef]
}
object OverlayScalarsAnnotations {
  
  inline def apply(
    baseUri: CallbackTo[js.Array[AnnotationRef]],
    description: CallbackTo[js.Array[AnnotationRef]],
    `extends`: CallbackTo[js.Array[AnnotationRef]],
    mediaType: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    protocols: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    securedBy: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    title: CallbackTo[js.Array[AnnotationRef]],
    usage: CallbackTo[js.Array[AnnotationRef]],
    version: CallbackTo[js.Array[AnnotationRef]]
  ): OverlayScalarsAnnotations = {
    val __obj = js.Dynamic.literal(baseUri = baseUri.toJsFn, description = description.toJsFn, mediaType = mediaType.toJsFn, protocols = protocols.toJsFn, securedBy = securedBy.toJsFn, title = title.toJsFn, usage = usage.toJsFn, version = version.toJsFn)
    __obj.updateDynamic("extends")(`extends`.toJsFn)
    __obj.asInstanceOf[OverlayScalarsAnnotations]
  }
  
  extension [Self <: OverlayScalarsAnnotations](x: Self) {
    
    inline def setExtends(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "extends", value.toJsFn)
    
    inline def setUsage(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "usage", value.toJsFn)
  }
}
