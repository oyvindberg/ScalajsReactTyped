package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticRepliesMailTips extends StObject {
  
  // The automatic reply message.
  var message: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The language that the automatic reply message is in.
  var messageLanguage: js.UndefOr[NullableOption[LocaleInfo]] = js.undefined
  
  // The date and time that automatic replies are set to end.
  var scheduledEndTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // The date and time that automatic replies are set to begin.
  var scheduledStartTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
}
object AutomaticRepliesMailTips {
  
  inline def apply(): AutomaticRepliesMailTips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticRepliesMailTips]
  }
  
  extension [Self <: AutomaticRepliesMailTips](x: Self) {
    
    inline def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageLanguage(value: NullableOption[LocaleInfo]): Self = StObject.set(x, "messageLanguage", value.asInstanceOf[js.Any])
    
    inline def setMessageLanguageNull: Self = StObject.set(x, "messageLanguage", null)
    
    inline def setMessageLanguageUndefined: Self = StObject.set(x, "messageLanguage", js.undefined)
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setScheduledEndTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "scheduledEndTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledEndTimeNull: Self = StObject.set(x, "scheduledEndTime", null)
    
    inline def setScheduledEndTimeUndefined: Self = StObject.set(x, "scheduledEndTime", js.undefined)
    
    inline def setScheduledStartTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "scheduledStartTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledStartTimeNull: Self = StObject.set(x, "scheduledStartTime", null)
    
    inline def setScheduledStartTimeUndefined: Self = StObject.set(x, "scheduledStartTime", js.undefined)
  }
}
