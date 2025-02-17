package typingsJapgolly.winrt.Windows.UI.Input.Inking

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Rect
import typingsJapgolly.winrt.Windows.UI.Input.PointerPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInkManager
  extends StObject
     with IInkStrokeContainer
     with IInkRecognizerContainer {
  
  var mode: InkManipulationMode = js.native
  
  def processPointerDown(pointerPoint: PointerPoint): Unit = js.native
  
  def processPointerUp(pointerPoint: PointerPoint): Rect = js.native
  
  def processPointerUpdate(pointerPoint: PointerPoint): Any = js.native
  
  def recognizeAsync(recognitionTarget: InkRecognitionTarget): IAsyncOperation[IVectorView[InkRecognitionResult]] = js.native
  
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit = js.native
}
