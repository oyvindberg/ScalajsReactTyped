package typingsJapgolly.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttendeesRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.undefined
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListAttendeesRequest {
  
  inline def apply(MeetingId: GuidString): ListAttendeesRequest = {
    val __obj = js.Dynamic.literal(MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttendeesRequest]
  }
  
  extension [Self <: ListAttendeesRequest](x: Self) {
    
    inline def setMaxResults(value: ResultMax): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
