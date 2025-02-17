package typingsJapgolly.sinonChrome.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chrome.chrome.cookies.Cookie
import typingsJapgolly.sinonChrome.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugins {
  
  @JSImport("sinon-chrome", "plugins.CookiePlugin")
  @js.native
  open class CookiePlugin () extends StObject {
    def this(state: js.Array[Cookie]) = this()
  }
  
  @JSImport("sinon-chrome", "plugins.I18nPlugin")
  @js.native
  open class I18nPlugin () extends StObject {
    def this(translations: Translations) = this()
  }
  
  type Translations = StringDictionary[Description]
}
