package typingsJapgolly.cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated ​ Deprecated. Use \`{@link JQuery.Event }\`.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.std.Event because Already inherited
- typingsJapgolly.cypress.BaseJQueryEventObject because Already inherited
- typingsJapgolly.cypress.JQueryInputEventObject because Already inherited
- typingsJapgolly.cypress.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target, which. Inlined char, charCode, key, keyCode */ @js.native
trait JQueryEventObject
  extends StObject
     with JQueryMouseEventObject {
  
  /** @deprecated */
  var char: String = js.native
  
  /** @deprecated */
  var charCode: Double = js.native
  
  var key: String = js.native
  
  /** @deprecated */
  var keyCode: Double = js.native
}
