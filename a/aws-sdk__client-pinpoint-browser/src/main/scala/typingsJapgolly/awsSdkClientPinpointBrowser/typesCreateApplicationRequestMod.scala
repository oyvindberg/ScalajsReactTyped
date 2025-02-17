package typingsJapgolly.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateApplicationRequestMod {
  
  trait CreateApplicationRequest extends StObject {
    
    /**
      * The display name of the application. Used in the Amazon Pinpoint console.
      */
    var Name: js.UndefOr[String] = js.undefined
  }
  object CreateApplicationRequest {
    
    inline def apply(): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateApplicationRequest]
    }
    
    extension [Self <: CreateApplicationRequest](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    }
  }
  
  type UnmarshalledCreateApplicationRequest = CreateApplicationRequest
}
