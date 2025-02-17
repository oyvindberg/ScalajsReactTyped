package typingsJapgolly.winrtUwp.Windows.Graphics.Printing3D

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of composite materials. */
trait Printing3DCompositeMaterialGroup extends StObject {
  
  /** Gets an list of mixtures that define individual composite materials. Each mixture is defined by listing the proportion of the overall mixture for each base material (values between 0 and 1), where the proportion values are specified in the same order as the base materials in MaterialIndices . */
  var composites: IVector[Printing3DCompositeMaterial]
  
  /** Gets the identifier (ID) of the base material group that defines the materials used in the composite material group. */
  var materialGroupId: Double
  
  /** Gets an ordered list of base materials that are used to make the composite materials in the group. The order of base materials is maintained in the mixture values defined by Composites . */
  var materialIndices: IVector[Double]
}
object Printing3DCompositeMaterialGroup {
  
  inline def apply(
    composites: IVector[Printing3DCompositeMaterial],
    materialGroupId: Double,
    materialIndices: IVector[Double]
  ): Printing3DCompositeMaterialGroup = {
    val __obj = js.Dynamic.literal(composites = composites.asInstanceOf[js.Any], materialGroupId = materialGroupId.asInstanceOf[js.Any], materialIndices = materialIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DCompositeMaterialGroup]
  }
  
  extension [Self <: Printing3DCompositeMaterialGroup](x: Self) {
    
    inline def setComposites(value: IVector[Printing3DCompositeMaterial]): Self = StObject.set(x, "composites", value.asInstanceOf[js.Any])
    
    inline def setMaterialGroupId(value: Double): Self = StObject.set(x, "materialGroupId", value.asInstanceOf[js.Any])
    
    inline def setMaterialIndices(value: IVector[Double]): Self = StObject.set(x, "materialIndices", value.asInstanceOf[js.Any])
  }
}
