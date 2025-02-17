package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingTypeDefinition extends StObject {
  
  /**
    * The thing type ARN.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined
  
  /**
    * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
    */
  var thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  
  /**
    * The ThingTypeProperties for the thing type.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
}
object ThingTypeDefinition {
  
  inline def apply(): ThingTypeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeDefinition]
  }
  
  extension [Self <: ThingTypeDefinition](x: Self) {
    
    inline def setThingTypeArn(value: ThingTypeArn): Self = StObject.set(x, "thingTypeArn", value.asInstanceOf[js.Any])
    
    inline def setThingTypeArnUndefined: Self = StObject.set(x, "thingTypeArn", js.undefined)
    
    inline def setThingTypeMetadata(value: ThingTypeMetadata): Self = StObject.set(x, "thingTypeMetadata", value.asInstanceOf[js.Any])
    
    inline def setThingTypeMetadataUndefined: Self = StObject.set(x, "thingTypeMetadata", js.undefined)
    
    inline def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    inline def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
    
    inline def setThingTypeProperties(value: ThingTypeProperties): Self = StObject.set(x, "thingTypeProperties", value.asInstanceOf[js.Any])
    
    inline def setThingTypePropertiesUndefined: Self = StObject.set(x, "thingTypeProperties", js.undefined)
  }
}
