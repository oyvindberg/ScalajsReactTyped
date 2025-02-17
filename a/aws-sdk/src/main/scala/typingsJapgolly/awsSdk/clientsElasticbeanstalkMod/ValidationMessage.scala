package typingsJapgolly.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationMessage extends StObject {
  
  /**
    * A message describing the error or warning.
    */
  var Message: js.UndefOr[ValidationMessageString] = js.undefined
  
  /**
    * The namespace to which the option belongs.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.undefined
  
  /**
    * The name of the option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined
  
  /**
    * An indication of the severity of this message:    error: This message indicates that this is not a valid setting for an option.    warning: This message is providing information you should take into account.  
    */
  var Severity: js.UndefOr[ValidationSeverity] = js.undefined
}
object ValidationMessage {
  
  inline def apply(): ValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMessage]
  }
  
  extension [Self <: ValidationMessage](x: Self) {
    
    inline def setMessage(value: ValidationMessageString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setNamespace(value: OptionNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setOptionName(value: ConfigurationOptionName): Self = StObject.set(x, "OptionName", value.asInstanceOf[js.Any])
    
    inline def setOptionNameUndefined: Self = StObject.set(x, "OptionName", js.undefined)
    
    inline def setSeverity(value: ValidationSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
  }
}
