package typingsJapgolly.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceOutput extends StObject {
  
  /**
    * The list of tag keys and values associated with the resource you specified.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ListTagsForResourceOutput {
  
  inline def apply(): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
  
  extension [Self <: ListTagsForResourceOutput](x: Self) {
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
