package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEngineDefaultClusterParametersResult extends StObject {
  
  var EngineDefaults: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.EngineDefaults] = js.undefined
}
object DescribeEngineDefaultClusterParametersResult {
  
  inline def apply(): DescribeEngineDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEngineDefaultClusterParametersResult]
  }
  
  extension [Self <: DescribeEngineDefaultClusterParametersResult](x: Self) {
    
    inline def setEngineDefaults(value: EngineDefaults): Self = StObject.set(x, "EngineDefaults", value.asInstanceOf[js.Any])
    
    inline def setEngineDefaultsUndefined: Self = StObject.set(x, "EngineDefaults", js.undefined)
  }
}
