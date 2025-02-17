package typingsJapgolly.flot.jquery.flot

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import typingsJapgolly.jquery.JQueryCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait plot extends StObject {
  
  def draw(): Unit = js.native
  
  def getAxes(): axes = js.native
  
  def getCanvas(): HTMLCanvasElement = js.native
  
  def getData(): js.Array[dataSeries] = js.native
  
  def getOptions(): plotOptions = js.native
  
  def getPlaceholder(): JQuery[HTMLElement] = js.native
  
  def getPlotOffset(): canvasPoint = js.native
  
  def getXAxes(): js.Array[axis] = js.native
  
  def getYAxes(): js.Array[axis] = js.native
  
  def height(): Double = js.native
  
  def highlight(series: dataSeries, datapoint: item): Unit = js.native
  
  def offset(): JQueryCoordinates = js.native
  
  def pointOffset(point: point): offset = js.native
  
  def resize(): Unit = js.native
  
  def setData(data: Any): Unit = js.native
  
  def setupGrid(): Unit = js.native
  
  def shutdown(): Unit = js.native
  
  def triggerRedrawOverlay(): Unit = js.native
  
  def unhighlight(): Unit = js.native
  def unhighlight(series: dataSeries, datapoint: item): Unit = js.native
  
  def width(): Double = js.native
}
