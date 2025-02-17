package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactPhoneKind extends StObject
/** Specifies the kinds of phones for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactPhoneKind")
@js.native
object ContactPhoneKind extends StObject {
  
  /** The phone number of the contact's assistant. */
  @js.native
  sealed trait assistant
    extends StObject
       with ContactPhoneKind
  
  /** The business fax of the contact. */
  @js.native
  sealed trait businessFax
    extends StObject
       with ContactPhoneKind
  
  /** The company phone of the contact. */
  @js.native
  sealed trait company
    extends StObject
       with ContactPhoneKind
  
  /** The home phone of the contact. */
  @js.native
  sealed trait home
    extends StObject
       with ContactPhoneKind
  
  /** The home fax of the contact. */
  @js.native
  sealed trait homeFax
    extends StObject
       with ContactPhoneKind
  
  /** The mobile phone of the contact. */
  @js.native
  sealed trait mobile
    extends StObject
       with ContactPhoneKind
  
  /** A phone of the contact other than home, mobile, or work. */
  @js.native
  sealed trait other
    extends StObject
       with ContactPhoneKind
  
  /** The pager number of the contact. */
  @js.native
  sealed trait pager
    extends StObject
       with ContactPhoneKind
  
  /** The radio address of the contact. */
  @js.native
  sealed trait radio
    extends StObject
       with ContactPhoneKind
  
  /** The work phone of the contact. */
  @js.native
  sealed trait work
    extends StObject
       with ContactPhoneKind
}
