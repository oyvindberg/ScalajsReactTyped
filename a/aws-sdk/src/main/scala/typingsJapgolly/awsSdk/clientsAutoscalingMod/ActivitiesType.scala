package typingsJapgolly.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivitiesType extends StObject {
  
  /**
    * The scaling activities. Activities are sorted by start time. Activities still in progress are described first.
    */
  var Activities: typingsJapgolly.awsSdk.clientsAutoscalingMod.Activities
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object ActivitiesType {
  
  inline def apply(Activities: Activities): ActivitiesType = {
    val __obj = js.Dynamic.literal(Activities = Activities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitiesType]
  }
  
  extension [Self <: ActivitiesType](x: Self) {
    
    inline def setActivities(value: Activities): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "Activities", js.Array(value*))
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
