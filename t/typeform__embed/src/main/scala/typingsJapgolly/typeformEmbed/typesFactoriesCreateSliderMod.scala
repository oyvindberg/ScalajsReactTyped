package typingsJapgolly.typeformEmbed

import typingsJapgolly.typeformEmbed.typesFactoriesCreateSliderCreateSliderMod.Slider
import typingsJapgolly.typeformEmbed.typesFactoriesCreateSliderSliderOptionsMod.SliderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFactoriesCreateSliderMod {
  
  @JSImport("@typeform/embed/types/factories/create-slider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSlider(formId: String): Slider = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlider")(formId.asInstanceOf[js.Any]).asInstanceOf[Slider]
  inline def createSlider(formId: String, userOptions: SliderOptions): Slider = (^.asInstanceOf[js.Dynamic].applyDynamic("createSlider")(formId.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Slider]
}
