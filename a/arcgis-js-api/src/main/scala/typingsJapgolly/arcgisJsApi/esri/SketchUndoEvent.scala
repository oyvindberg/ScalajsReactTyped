package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.circle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.move
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.point
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.transform
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.undo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchUndoEvent extends StObject {
  
  var graphics: js.Array[Graphic]
  
  var tool: point | polyline | polygon | rectangle | circle | move | transform | reshape
  
  var `type`: undo
}
object SketchUndoEvent {
  
  inline def apply(
    graphics: js.Array[Graphic],
    tool: point | polyline | polygon | rectangle | circle | move | transform | reshape
  ): SketchUndoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("undo")
    __obj.asInstanceOf[SketchUndoEvent]
  }
  
  extension [Self <: SketchUndoEvent](x: Self) {
    
    inline def setGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    inline def setGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "graphics", js.Array(value*))
    
    inline def setTool(value: point | polyline | polygon | rectangle | circle | move | transform | reshape): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setType(value: undo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
