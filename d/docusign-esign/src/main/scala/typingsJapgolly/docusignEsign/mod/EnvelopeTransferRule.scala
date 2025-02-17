package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeTransferRule extends StObject {
  
  /**
    * When set to **true**, the original owner is added as a carbon copy recipient after envelope transfer. The default value is **false**.
    */
  var carbonCopyOriginalOwner: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the envelope transfer rule is active.
    */
  var enabled: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the envelope transfer rule. The system generates this id when the rule is first created.
    */
  var envelopeTransferRuleId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of envelope event that triggers the transfer. Valid values are:
    *
    * - `sent`
    * - `before sent`
    * - `completed`
    */
  var eventType: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the group that triggers the transfer.
    */
  var fromGroup: js.UndefOr[/* This object contains information about a group. */ Group] = js.undefined
  
  /**
    * Information about the user who triggers the transfer.
    */
  var fromUser: js.UndefOr[UserInformation] = js.undefined
  
  /**
    * The UTC DateTime when the envelope transfer rule was last modified. This property is read only.
    */
  var modifiedDate: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the user who last modified the envelope transfer rule.
    */
  var modifiedUser: js.UndefOr[UserInformation] = js.undefined
  
  /**
    * Information about the destination folder to which the envelope is transferred.
    */
  var toFolder: js.UndefOr[/* This object contains details about a folder. */ Folder] = js.undefined
  
  /**
    * Information about the user to which the envelope is transferred.
    */
  var toUser: js.UndefOr[UserInformation] = js.undefined
}
object EnvelopeTransferRule {
  
  inline def apply(): EnvelopeTransferRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeTransferRule]
  }
  
  extension [Self <: EnvelopeTransferRule](x: Self) {
    
    inline def setCarbonCopyOriginalOwner(value: String): Self = StObject.set(x, "carbonCopyOriginalOwner", value.asInstanceOf[js.Any])
    
    inline def setCarbonCopyOriginalOwnerUndefined: Self = StObject.set(x, "carbonCopyOriginalOwner", js.undefined)
    
    inline def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEnvelopeTransferRuleId(value: String): Self = StObject.set(x, "envelopeTransferRuleId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeTransferRuleIdUndefined: Self = StObject.set(x, "envelopeTransferRuleId", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setFromGroup(value: /* This object contains information about a group. */ Group): Self = StObject.set(x, "fromGroup", value.asInstanceOf[js.Any])
    
    inline def setFromGroupUndefined: Self = StObject.set(x, "fromGroup", js.undefined)
    
    inline def setFromUser(value: UserInformation): Self = StObject.set(x, "fromUser", value.asInstanceOf[js.Any])
    
    inline def setFromUserUndefined: Self = StObject.set(x, "fromUser", js.undefined)
    
    inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
    
    inline def setModifiedUser(value: UserInformation): Self = StObject.set(x, "modifiedUser", value.asInstanceOf[js.Any])
    
    inline def setModifiedUserUndefined: Self = StObject.set(x, "modifiedUser", js.undefined)
    
    inline def setToFolder(value: /* This object contains details about a folder. */ Folder): Self = StObject.set(x, "toFolder", value.asInstanceOf[js.Any])
    
    inline def setToFolderUndefined: Self = StObject.set(x, "toFolder", js.undefined)
    
    inline def setToUser(value: UserInformation): Self = StObject.set(x, "toUser", value.asInstanceOf[js.Any])
    
    inline def setToUserUndefined: Self = StObject.set(x, "toUser", js.undefined)
  }
}
