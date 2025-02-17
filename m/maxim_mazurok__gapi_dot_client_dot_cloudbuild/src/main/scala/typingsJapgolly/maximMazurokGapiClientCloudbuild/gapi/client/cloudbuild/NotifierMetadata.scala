package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifierMetadata extends StObject {
  
  /** The human-readable and user-given name for the notifier. For example: "repo-merge-email-notifier". */
  var name: js.UndefOr[String] = js.undefined
  
  /** The string representing the name and version of notifier to deploy. Expected to be of the form of "/:". For example: "gcr.io/my-project/notifiers/smtp:1.2.34". */
  var notifier: js.UndefOr[String] = js.undefined
}
object NotifierMetadata {
  
  inline def apply(): NotifierMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierMetadata]
  }
  
  extension [Self <: NotifierMetadata](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotifier(value: String): Self = StObject.set(x, "notifier", value.asInstanceOf[js.Any])
    
    inline def setNotifierUndefined: Self = StObject.set(x, "notifier", js.undefined)
  }
}
