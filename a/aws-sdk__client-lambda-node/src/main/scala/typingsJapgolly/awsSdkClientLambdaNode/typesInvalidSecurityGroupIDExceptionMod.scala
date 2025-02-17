package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidSecurityGroupIDExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidSecurityGroupIDExceptionDetails> * / any */ trait InvalidSecurityGroupIDException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSecurityGroupIDException
  }
  object InvalidSecurityGroupIDException {
    
    inline def apply(): InvalidSecurityGroupIDException = {
      val __obj = js.Dynamic.literal(name = "InvalidSecurityGroupIDException")
      __obj.asInstanceOf[InvalidSecurityGroupIDException]
    }
    
    extension [Self <: InvalidSecurityGroupIDException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSecurityGroupIDException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidSecurityGroupIDExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object InvalidSecurityGroupIDExceptionDetails {
    
    inline def apply(): InvalidSecurityGroupIDExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidSecurityGroupIDExceptionDetails]
    }
    
    extension [Self <: InvalidSecurityGroupIDExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
