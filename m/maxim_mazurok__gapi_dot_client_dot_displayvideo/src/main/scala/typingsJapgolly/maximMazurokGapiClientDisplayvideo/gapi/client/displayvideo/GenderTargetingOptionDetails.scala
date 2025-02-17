package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenderTargetingOptionDetails extends StObject {
  
  /** Output only. The gender of an audience. */
  var gender: js.UndefOr[String] = js.undefined
}
object GenderTargetingOptionDetails {
  
  inline def apply(): GenderTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenderTargetingOptionDetails]
  }
  
  extension [Self <: GenderTargetingOptionDetails](x: Self) {
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
  }
}
