package typingsJapgolly.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecryptExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
    - typingsJapgolly.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException
    - typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod.InvalidCiphertextException
    - typingsJapgolly.awsSdkClientKmsBrowser.typesKeyUnavailableExceptionMod.KeyUnavailableException
    - typingsJapgolly.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
    - typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
    - typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait DecryptExceptionsUnion extends StObject
  object DecryptExceptionsUnion {
    
    inline def DependencyTimeoutException(): typingsJapgolly.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    inline def DisabledException(): typingsJapgolly.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException = {
      val __obj = js.Dynamic.literal(name = "DisabledException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException]
    }
    
    inline def InvalidCiphertextException(): typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod.InvalidCiphertextException = {
      val __obj = js.Dynamic.literal(name = "InvalidCiphertextException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod.InvalidCiphertextException]
    }
    
    inline def InvalidGrantTokenException(): typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException = {
      val __obj = js.Dynamic.literal(name = "InvalidGrantTokenException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException]
    }
    
    inline def KMSInternalException(): typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    inline def KMSInvalidStateException(): typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    inline def KeyUnavailableException(): typingsJapgolly.awsSdkClientKmsBrowser.typesKeyUnavailableExceptionMod.KeyUnavailableException = {
      val __obj = js.Dynamic.literal(name = "KeyUnavailableException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesKeyUnavailableExceptionMod.KeyUnavailableException]
    }
    
    inline def NotFoundException(): typingsJapgolly.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
