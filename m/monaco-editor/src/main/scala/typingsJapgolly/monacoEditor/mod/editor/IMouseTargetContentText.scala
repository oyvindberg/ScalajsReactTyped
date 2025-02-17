package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.Range
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.CONTENT_TEXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetContentText
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  val detail: IMouseTargetContentTextData
  
  @JSName("position")
  val position_IMouseTargetContentText: Position
  
  @JSName("range")
  val range_IMouseTargetContentText: Range
  
  val `type`: CONTENT_TEXT
}
object IMouseTargetContentText {
  
  inline def apply(
    detail: IMouseTargetContentTextData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: CONTENT_TEXT
  ): IMouseTargetContentText = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetContentText]
  }
  
  extension [Self <: IMouseTargetContentText](x: Self) {
    
    inline def setDetail(value: IMouseTargetContentTextData): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: CONTENT_TEXT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
