package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAliasInput extends StObject {
  
  /**
    * A unique identifier for the alias that you want to update. You can use either the alias ID or ARN value.
    */
  var AliasId: AliasIdOrArn
  
  /**
    * A human-readable description of the alias.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined
  
  /**
    * The routing configuration, including routing type and fleet target, for the alias.
    */
  var RoutingStrategy: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.RoutingStrategy] = js.undefined
}
object UpdateAliasInput {
  
  inline def apply(AliasId: AliasIdOrArn): UpdateAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAliasInput]
  }
  
  extension [Self <: UpdateAliasInput](x: Self) {
    
    inline def setAliasId(value: AliasIdOrArn): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NonZeroAndMaxString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NonBlankAndLengthConstraintString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoutingStrategy(value: RoutingStrategy): Self = StObject.set(x, "RoutingStrategy", value.asInstanceOf[js.Any])
    
    inline def setRoutingStrategyUndefined: Self = StObject.set(x, "RoutingStrategy", js.undefined)
  }
}
