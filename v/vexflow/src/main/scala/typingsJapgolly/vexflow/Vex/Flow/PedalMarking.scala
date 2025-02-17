package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.Vex.Flow.PedalMarking.Styles
import typingsJapgolly.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PedalMarking extends StObject {
  
  def draw(): Unit = js.native
  
  def drawBracketed(): Unit = js.native
  
  def drawText(): Unit = js.native
  
  def setContext(context: IRenderContext): PedalMarking = js.native
  
  def setCustomText(): PedalMarking = js.native
  def setCustomText(depress: String): PedalMarking = js.native
  def setCustomText(depress: String, release: String): PedalMarking = js.native
  def setCustomText(depress: Unit, release: String): PedalMarking = js.native
  
  def setLine(line: Double): PedalMarking = js.native
  
  def setStyle(style: Styles): PedalMarking = js.native
}
object PedalMarking {
  
  @js.native
  sealed trait Styles extends StObject
  @JSGlobal("Vex.Flow.PedalMarking.Styles")
  @js.native
  object Styles extends StObject {
    
    @js.native
    sealed trait BRACKET
      extends StObject
         with Styles
    
    @js.native
    sealed trait MIXED
      extends StObject
         with Styles
    
    @js.native
    sealed trait TEXT
      extends StObject
         with Styles
  }
}
