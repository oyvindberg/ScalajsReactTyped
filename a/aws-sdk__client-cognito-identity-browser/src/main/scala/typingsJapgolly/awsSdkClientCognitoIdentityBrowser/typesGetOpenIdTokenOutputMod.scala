package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetOpenIdTokenOutputMod {
  
  trait GetOpenIdTokenOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on input.</p>
      */
    var IdentityId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An OpenID token, valid for 15 minutes.</p>
      */
    var Token: js.UndefOr[String] = js.undefined
  }
  object GetOpenIdTokenOutput {
    
    inline def apply($metadata: ResponseMetadata): GetOpenIdTokenOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOpenIdTokenOutput]
    }
    
    extension [Self <: GetOpenIdTokenOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
      
      inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
    }
  }
}
