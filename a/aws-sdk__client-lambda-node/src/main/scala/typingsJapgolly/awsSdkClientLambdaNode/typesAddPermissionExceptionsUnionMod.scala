package typingsJapgolly.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAddPermissionExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
    - typingsJapgolly.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typingsJapgolly.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException
    - typingsJapgolly.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
    - typingsJapgolly.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod.PolicyLengthExceededException
    - typingsJapgolly.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
    - typingsJapgolly.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException
  */
  trait AddPermissionExceptionsUnion extends StObject
  object AddPermissionExceptionsUnion {
    
    inline def InvalidParameterValueException(): typingsJapgolly.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = "InvalidParameterValueException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException]
    }
    
    inline def PolicyLengthExceededException(): typingsJapgolly.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod.PolicyLengthExceededException = {
      val __obj = js.Dynamic.literal(name = "PolicyLengthExceededException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod.PolicyLengthExceededException]
    }
    
    inline def PreconditionFailedException(): typingsJapgolly.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException = {
      val __obj = js.Dynamic.literal(name = "PreconditionFailedException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException]
    }
    
    inline def ResourceConflictException(): typingsJapgolly.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException = {
      val __obj = js.Dynamic.literal(name = "ResourceConflictException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException]
    }
    
    inline def ResourceNotFoundException(): typingsJapgolly.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
    inline def ServiceException(): typingsJapgolly.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException = {
      val __obj = js.Dynamic.literal(name = "ServiceException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException]
    }
    
    inline def TooManyRequestsException(): typingsJapgolly.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = "TooManyRequestsException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException]
    }
  }
}
