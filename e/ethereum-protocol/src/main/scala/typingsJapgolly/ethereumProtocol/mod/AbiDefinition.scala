package typingsJapgolly.ethereumProtocol.mod

import typingsJapgolly.ethereumProtocol.mod.AbiType.Constructor
import typingsJapgolly.ethereumProtocol.mod.AbiType.Event
import typingsJapgolly.ethereumProtocol.mod.AbiType.Fallback
import typingsJapgolly.ethereumProtocol.mod.AbiType.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ethereumProtocol.mod.FunctionAbi
  - typingsJapgolly.ethereumProtocol.mod.EventAbi
*/
trait AbiDefinition extends StObject
object AbiDefinition {
  
  inline def ConstructorAbi(
    inputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: ConstructorStateMutability,
    `type`: Constructor
  ): typingsJapgolly.ethereumProtocol.mod.ConstructorAbi = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ethereumProtocol.mod.ConstructorAbi]
  }
  
  inline def EventAbi(anonymous: Boolean, inputs: js.Array[EventParameter], name: String, `type`: Event): typingsJapgolly.ethereumProtocol.mod.EventAbi = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ethereumProtocol.mod.EventAbi]
  }
  
  inline def FallbackAbi(payable: Boolean, `type`: Fallback): typingsJapgolly.ethereumProtocol.mod.FallbackAbi = {
    val __obj = js.Dynamic.literal(payable = payable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ethereumProtocol.mod.FallbackAbi]
  }
  
  inline def MethodAbi(
    constant: Boolean,
    inputs: js.Array[DataItem],
    name: String,
    outputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: StateMutability,
    `type`: Function
  ): typingsJapgolly.ethereumProtocol.mod.MethodAbi = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ethereumProtocol.mod.MethodAbi]
  }
}
