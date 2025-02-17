package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlueprintsResult extends StObject {
  
  /**
    * An array of key-value pairs that contains information about the available blueprints.
    */
  var blueprints: js.UndefOr[BlueprintList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetBlueprints request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetBlueprintsResult {
  
  inline def apply(): GetBlueprintsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBlueprintsResult]
  }
  
  extension [Self <: GetBlueprintsResult](x: Self) {
    
    inline def setBlueprints(value: BlueprintList): Self = StObject.set(x, "blueprints", value.asInstanceOf[js.Any])
    
    inline def setBlueprintsUndefined: Self = StObject.set(x, "blueprints", js.undefined)
    
    inline def setBlueprintsVarargs(value: Blueprint*): Self = StObject.set(x, "blueprints", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
