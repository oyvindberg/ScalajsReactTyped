package typingsJapgolly.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderChangeEvent extends StObject {
  
  var interaction: Boolean
  
  var previousActive: Double
  
  var slider: Slider
  
  var step: SliderStep
}
object SliderChangeEvent {
  
  inline def apply(interaction: Boolean, previousActive: Double, slider: Slider, step: SliderStep): SliderChangeEvent = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], previousActive = previousActive.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderChangeEvent]
  }
  
  extension [Self <: SliderChangeEvent](x: Self) {
    
    inline def setInteraction(value: Boolean): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPreviousActive(value: Double): Self = StObject.set(x, "previousActive", value.asInstanceOf[js.Any])
    
    inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setStep(value: SliderStep): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
