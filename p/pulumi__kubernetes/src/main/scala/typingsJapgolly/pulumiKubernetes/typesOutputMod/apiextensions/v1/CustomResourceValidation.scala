package typingsJapgolly.pulumiKubernetes.typesOutputMod.apiextensions.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceValidation is a list of validation methods for CustomResources.
  */
trait CustomResourceValidation extends StObject {
  
  /**
    * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
    */
  var openAPIV3Schema: JSONSchemaProps
}
object CustomResourceValidation {
  
  inline def apply(openAPIV3Schema: JSONSchemaProps): CustomResourceValidation = {
    val __obj = js.Dynamic.literal(openAPIV3Schema = openAPIV3Schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceValidation]
  }
  
  extension [Self <: CustomResourceValidation](x: Self) {
    
    inline def setOpenAPIV3Schema(value: JSONSchemaProps): Self = StObject.set(x, "openAPIV3Schema", value.asInstanceOf[js.Any])
  }
}
