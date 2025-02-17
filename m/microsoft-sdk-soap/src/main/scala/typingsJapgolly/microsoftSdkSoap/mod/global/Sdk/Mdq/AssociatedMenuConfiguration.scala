package typingsJapgolly.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedMenuConfiguration extends StObject {
  
  var Behavior: AssociatedMenuBehavior
  
  var Group: AssociatedMenuGroup
  
  var Label: typingsJapgolly.microsoftSdkSoap.mod.global.Sdk.Mdq.Label
  
  var Order: Double
}
object AssociatedMenuConfiguration {
  
  inline def apply(Behavior: AssociatedMenuBehavior, Group: AssociatedMenuGroup, Label: Label, Order: Double): AssociatedMenuConfiguration = {
    val __obj = js.Dynamic.literal(Behavior = Behavior.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedMenuConfiguration]
  }
  
  extension [Self <: AssociatedMenuConfiguration](x: Self) {
    
    inline def setBehavior(value: AssociatedMenuBehavior): Self = StObject.set(x, "Behavior", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: AssociatedMenuGroup): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
  }
}
