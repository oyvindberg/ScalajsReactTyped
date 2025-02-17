package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionGroup extends StObject {
  
  /**
    * This field is true if this group is collapsed. A collapsed group remains collapsed if an overlapping group at a shallower depth is expanded. A true value does not imply that all
    * dimensions within the group are hidden, since a dimension's visibility can change independently from this group property. However, when this property is updated, all dimensions
    * within it are set to hidden if this field is true, or set to visible if this field is false.
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /** The depth of the group, representing how many groups have a range that wholly contains the range of this group. */
  var depth: js.UndefOr[Double] = js.undefined
  
  /** The range over which this group exists. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}
object DimensionGroup {
  
  inline def apply(): DimensionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionGroup]
  }
  
  extension [Self <: DimensionGroup](x: Self) {
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
