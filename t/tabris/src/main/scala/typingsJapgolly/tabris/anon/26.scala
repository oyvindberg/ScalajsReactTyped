package typingsJapgolly.tabris.anon

import typingsJapgolly.tabris.mod.ListenersKeysOf
import typingsJapgolly.tabris.tabrisStrings.Asterisk
import typingsJapgolly.tabris.tabrisStrings.default
import typingsJapgolly.tabris.tabrisStrings.strict
import typingsJapgolly.tabris.tabrisStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26`[Target] extends StObject {
  
  var mode: js.UndefOr[default | strict] = js.undefined
  
  var trigger: js.UndefOr[ListenersKeysOf[Target] | update | Asterisk | js.Symbol] = js.undefined
}
object `26` {
  
  inline def apply[Target](): `26`[Target] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`26`[Target]]
  }
  
  extension [Self <: `26`[?], Target](x: Self & `26`[Target]) {
    
    inline def setMode(value: default | strict): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setTrigger(value: ListenersKeysOf[Target] | update | Asterisk | js.Symbol): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
