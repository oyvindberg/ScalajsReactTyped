package typingsJapgolly.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteTableExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
    - typingsJapgolly.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typingsJapgolly.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
    - typingsJapgolly.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  */
  trait DeleteTableExceptionsUnion extends StObject
  object DeleteTableExceptionsUnion {
    
    inline def InternalServerError(): typingsJapgolly.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
    
    inline def LimitExceededException(): typingsJapgolly.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def ResourceInUseException(): typingsJapgolly.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException = {
      val __obj = js.Dynamic.literal(name = "ResourceInUseException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException]
    }
    
    inline def ResourceNotFoundException(): typingsJapgolly.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
  }
}
