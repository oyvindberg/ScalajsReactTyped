package typingsJapgolly.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateTimeToLiveExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
  */
  trait UpdateTimeToLiveExceptionsUnion extends StObject
  object UpdateTimeToLiveExceptionsUnion {
    
    inline def InternalServerError(): typingsJapgolly.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError]
    }
    
    inline def LimitExceededException(): typingsJapgolly.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def ResourceInUseException(): typingsJapgolly.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException = {
      val __obj = js.Dynamic.literal(name = "ResourceInUseException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException]
    }
    
    inline def ResourceNotFoundException(): typingsJapgolly.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
  }
}
