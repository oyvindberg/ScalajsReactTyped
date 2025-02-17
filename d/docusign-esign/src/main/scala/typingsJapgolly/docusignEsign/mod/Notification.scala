package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  /**
    * A complex element that specifies the expiration settings for the envelope.
    */
  var expirations: js.UndefOr[
    /* A complex element that specifies the expiration settings for the envelope. */ Expirations
  ] = js.undefined
  
  /**
    * A complex element that specifies reminder settings for the envelope
    */
  var reminders: js.UndefOr[
    /* A complex element that specifies reminder settings for the envelope. */ Reminders
  ] = js.undefined
  
  /**
    * When set to **true**, the account default notification settings are used for the envelope, overriding the reminders and expirations settings. When set to **false**,
    * the reminders and expirations settings specified in this request are used.
    */
  var useAccountDefaults: js.UndefOr[String] = js.undefined
}
object Notification {
  
  inline def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  extension [Self <: Notification](x: Self) {
    
    inline def setExpirations(
      value: /* A complex element that specifies the expiration settings for the envelope. */ Expirations
    ): Self = StObject.set(x, "expirations", value.asInstanceOf[js.Any])
    
    inline def setExpirationsUndefined: Self = StObject.set(x, "expirations", js.undefined)
    
    inline def setReminders(value: /* A complex element that specifies reminder settings for the envelope. */ Reminders): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
    
    inline def setRemindersUndefined: Self = StObject.set(x, "reminders", js.undefined)
    
    inline def setUseAccountDefaults(value: String): Self = StObject.set(x, "useAccountDefaults", value.asInstanceOf[js.Any])
    
    inline def setUseAccountDefaultsUndefined: Self = StObject.set(x, "useAccountDefaults", js.undefined)
  }
}
