package typingsJapgolly.cordovaPluginCanvascamera

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.cordovaPluginCanvascamera.anon.Width
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.data
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.file
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.landscape
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends StObject {
  
  var available: Boolean = js.native
  
  var buffer: js.Array[Any] = js.native
  
  def bufferize(data: Any, `type`: file | data): Renderer = js.native
  
  def clear(): Renderer = js.native
  
  var context: CanvasRenderingContext2D = js.native
  
  def disable(): Renderer = js.native
  
  def disabled(): Boolean = js.native
  
  def draw(frame: Frame): Renderer = js.native
  
  var element: HTMLCanvasElement = js.native
  
  def enable(): Renderer = js.native
  
  def enabled(): Boolean = js.native
  
  var fullscreen: Boolean = js.native
  
  var image: HTMLImageElement = js.native
  
  def initialize(): Renderer = js.native
  
  def invert(): Renderer = js.native
  
  def onAfterDraw(): Unit = js.native
  def onAfterDraw(frame: Frame): Unit = js.native
  
  def onBeforeDraw(): Unit = js.native
  def onBeforeDraw(frame: Frame): Unit = js.native
  
  def onOrientationChange(): Unit = js.native
  
  var orientation: portrait | landscape = js.native
  
  var parent: CanvasCamera = js.native
  
  def render(data: Any, `type`: file | data): Renderer = js.native
  
  def resize(): Renderer = js.native
  
  def run(): Renderer = js.native
  
  def setOnAfterDraw(onAfterDraw: js.Function1[/* frame */ js.UndefOr[Frame], Unit]): Renderer = js.native
  
  def setOnBeforeDraw(onBeforeDraw: js.Function1[/* frame */ js.UndefOr[Frame], Unit]): Renderer = js.native
  
  def setSize(size: Width): Renderer = js.native
  def setSize(size: Width, auto: Boolean): Renderer = js.native
  
  var size: Width = js.native
  
  var `type`: file | data = js.native
}
