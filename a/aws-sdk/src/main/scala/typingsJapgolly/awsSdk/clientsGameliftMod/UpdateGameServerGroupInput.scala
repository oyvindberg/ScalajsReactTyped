package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameServerGroupInput extends StObject {
  
  /**
    * Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game server group. Method options include the following:    SPOT_ONLY - Only Spot Instances are used in the game server group. If Spot Instances are unavailable or not viable for game hosting, the game server group provides no hosting capacity until Spot Instances can again be used. Until then, no new instances are started, and the existing nonviable Spot Instances are terminated (after current gameplay ends) and are not replaced.    SPOT_PREFERRED - (default value) Spot Instances are used whenever available in the game server group. If Spot Instances are unavailable, the game server group continues to provide hosting capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after current gameplay ends) and are replaced with new On-Demand Instances.    ON_DEMAND_ONLY - Only On-Demand Instances are used in the game server group. No Spot Instances are used, even when available, while this balancing strategy is in force.  
    */
  var BalancingStrategy: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.BalancingStrategy] = js.undefined
  
  /**
    * A unique identifier for the game server group. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn
  
  /**
    * A flag that indicates whether instances in the game server group are protected from early termination. Unprotected instances that have active game servers running might be terminated during a scale-down event, causing players to be dropped from the game. Protected instances cannot be terminated while there are active game servers running except in the event of a forced game server group deletion (see ). An exception to this is with Spot Instances, which can be terminated by Amazon Web Services regardless of protection status. This property is set to NO_PROTECTION by default.
    */
  var GameServerProtectionPolicy: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.GameServerProtectionPolicy] = js.undefined
  
  /**
    * An updated list of Amazon EC2 instance types to use in the Auto Scaling group. The instance definitions must specify at least two different instance types that are supported by GameLift FleetIQ. This updated list replaces the entire current list of instance definitions for the game server group. For more information on instance types, see EC2 Instance Types in the Amazon EC2 User Guide. You can optionally specify capacity weighting for each instance type. If no weight value is specified for an instance type, it is set to the default value "1". For more information about capacity weighting, see  Instance Weighting for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var InstanceDefinitions: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.InstanceDefinitions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups.
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
}
object UpdateGameServerGroupInput {
  
  inline def apply(GameServerGroupName: GameServerGroupNameOrArn): UpdateGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameServerGroupInput]
  }
  
  extension [Self <: UpdateGameServerGroupInput](x: Self) {
    
    inline def setBalancingStrategy(value: BalancingStrategy): Self = StObject.set(x, "BalancingStrategy", value.asInstanceOf[js.Any])
    
    inline def setBalancingStrategyUndefined: Self = StObject.set(x, "BalancingStrategy", js.undefined)
    
    inline def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    inline def setGameServerProtectionPolicy(value: GameServerProtectionPolicy): Self = StObject.set(x, "GameServerProtectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setGameServerProtectionPolicyUndefined: Self = StObject.set(x, "GameServerProtectionPolicy", js.undefined)
    
    inline def setInstanceDefinitions(value: InstanceDefinitions): Self = StObject.set(x, "InstanceDefinitions", value.asInstanceOf[js.Any])
    
    inline def setInstanceDefinitionsUndefined: Self = StObject.set(x, "InstanceDefinitions", js.undefined)
    
    inline def setInstanceDefinitionsVarargs(value: InstanceDefinition*): Self = StObject.set(x, "InstanceDefinitions", js.Array(value*))
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
