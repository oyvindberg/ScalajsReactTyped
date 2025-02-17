package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains all information needed to send a message using one send protocol.
  *
  * To send one message via two different protocols, two RecipientInfos are needed - to send one message to different users with one protocol, one {@link
  * RecipientInfo} can be used.
  */
trait RecipientInfo extends StObject {
  
  /**
    * the recipient(s) of "blind carbon copy" (e.g. e-mail address/es).
    *
    * Multiple addresses are separated by commas.
    */
  var BCC: String
  
  /**
    * the recipient(s) of a "carbon copy" (e.g. e-mail address/es).
    *
    * Multiple addresses are separated by commas.
    */
  var CC: String
  
  /**
    * the newsgroup(s) to which an article is be posted.
    *
    * Multiple addresses are separated by commas.
    */
  var Newsgroups: String
  
  /** the password to be used for authorizing on the send server. */
  var Password: String
  
  /** the number representing the last error (generated by send server). */
  var ProtocolErrorNumber: Double
  
  /** string representing the last error (generated by send server). */
  var ProtocolErrorString: String
  
  /** the protocol to use for sending (i.e. "NNTP", "SMTP", "VIM"). */
  var ProtocolType: String
  
  /** the count of tries to send a message. This count is `1` if the message was sent with the first try and increases with every unsuccessful retry. */
  var SendTries: Double
  
  /** the name of the server to be used for sending the message. */
  var Server: String
  
  /** the current state of the message. */
  var State: OutgoingMessageState
  
  /**
    * the recipient(s) (e.g. e-mail address/es).
    *
    * Multiple addresses are separated by commas.
    */
  var To: String
  
  /** the user name to be used for authorizing on the send server. */
  var Username: String
  
  /** the Post Office Path (VIM only). */
  var VIMPostOfficePath: String
}
object RecipientInfo {
  
  inline def apply(
    BCC: String,
    CC: String,
    Newsgroups: String,
    Password: String,
    ProtocolErrorNumber: Double,
    ProtocolErrorString: String,
    ProtocolType: String,
    SendTries: Double,
    Server: String,
    State: OutgoingMessageState,
    To: String,
    Username: String,
    VIMPostOfficePath: String
  ): RecipientInfo = {
    val __obj = js.Dynamic.literal(BCC = BCC.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Newsgroups = Newsgroups.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], ProtocolErrorNumber = ProtocolErrorNumber.asInstanceOf[js.Any], ProtocolErrorString = ProtocolErrorString.asInstanceOf[js.Any], ProtocolType = ProtocolType.asInstanceOf[js.Any], SendTries = SendTries.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any], VIMPostOfficePath = VIMPostOfficePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientInfo]
  }
  
  extension [Self <: RecipientInfo](x: Self) {
    
    inline def setBCC(value: String): Self = StObject.set(x, "BCC", value.asInstanceOf[js.Any])
    
    inline def setCC(value: String): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
    
    inline def setNewsgroups(value: String): Self = StObject.set(x, "Newsgroups", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setProtocolErrorNumber(value: Double): Self = StObject.set(x, "ProtocolErrorNumber", value.asInstanceOf[js.Any])
    
    inline def setProtocolErrorString(value: String): Self = StObject.set(x, "ProtocolErrorString", value.asInstanceOf[js.Any])
    
    inline def setProtocolType(value: String): Self = StObject.set(x, "ProtocolType", value.asInstanceOf[js.Any])
    
    inline def setSendTries(value: Double): Self = StObject.set(x, "SendTries", value.asInstanceOf[js.Any])
    
    inline def setServer(value: String): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setState(value: OutgoingMessageState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setVIMPostOfficePath(value: String): Self = StObject.set(x, "VIMPostOfficePath", value.asInstanceOf[js.Any])
  }
}
