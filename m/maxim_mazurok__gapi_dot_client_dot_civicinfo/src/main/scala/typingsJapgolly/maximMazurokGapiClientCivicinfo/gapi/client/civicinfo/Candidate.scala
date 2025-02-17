package typingsJapgolly.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Candidate extends StObject {
  
  /** The URL for the candidate's campaign web site. */
  var candidateUrl: js.UndefOr[String] = js.undefined
  
  /** A list of known (social) media channels for this candidate. */
  var channels: js.UndefOr[js.Array[Channel]] = js.undefined
  
  /** The email address for the candidate's campaign. */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The candidate's name. If this is a joint ticket it will indicate the name of the candidate at the top of a ticket followed by a / and that name of candidate at the bottom of the
    * ticket. e.g. "Mitt Romney / Paul Ryan"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The order the candidate appears on the ballot for this contest. */
  var orderOnBallot: js.UndefOr[String] = js.undefined
  
  /** The full name of the party the candidate is a member of. */
  var party: js.UndefOr[String] = js.undefined
  
  /** The voice phone number for the candidate's campaign office. */
  var phone: js.UndefOr[String] = js.undefined
  
  /** A URL for a photo of the candidate. */
  var photoUrl: js.UndefOr[String] = js.undefined
}
object Candidate {
  
  inline def apply(): Candidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Candidate]
  }
  
  extension [Self <: Candidate](x: Self) {
    
    inline def setCandidateUrl(value: String): Self = StObject.set(x, "candidateUrl", value.asInstanceOf[js.Any])
    
    inline def setCandidateUrlUndefined: Self = StObject.set(x, "candidateUrl", js.undefined)
    
    inline def setChannels(value: js.Array[Channel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrderOnBallot(value: String): Self = StObject.set(x, "orderOnBallot", value.asInstanceOf[js.Any])
    
    inline def setOrderOnBallotUndefined: Self = StObject.set(x, "orderOnBallot", js.undefined)
    
    inline def setParty(value: String): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
  }
}
