package typingsJapgolly.doctrine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Set to `true` to add `lineNumber` to each node, specifying the line on
    * which the node is found in the source. Default: `false`.
    */
  var lineNumbers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to `true` to preserve leading and trailing whitespace when extracting
    * comment text.
    */
  var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * set to `true` to keep parsing even when syntax errors occur. Default:
    * `false`.
    */
  var recoverable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to `true` to allow optional parameters to be specified in brackets
    * (`@param {string} [foo]`). Default: `false`.
    */
  var sloppy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to `true` to throw an error when syntax errors occur. If false then
    * errors will be added to `tag.errors` instead.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of tags to return. When specified, Doctrine returns
    * only tags in this array. For example, if `tags` is `["param"]`, then only
    * `@param` tags will be returned. Default: `null`.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Set to `true` to delete the leading `/ **`, any `*` that begins a line,
    * and the trailing `* /` from the source text. Default: `false`.
    */
  var unwrap: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
    
    inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
    
    inline def setPreserveWhitespace(value: Boolean): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
    
    inline def setRecoverable(value: Boolean): Self = StObject.set(x, "recoverable", value.asInstanceOf[js.Any])
    
    inline def setRecoverableUndefined: Self = StObject.set(x, "recoverable", js.undefined)
    
    inline def setSloppy(value: Boolean): Self = StObject.set(x, "sloppy", value.asInstanceOf[js.Any])
    
    inline def setSloppyUndefined: Self = StObject.set(x, "sloppy", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUnwrap(value: Boolean): Self = StObject.set(x, "unwrap", value.asInstanceOf[js.Any])
    
    inline def setUnwrapUndefined: Self = StObject.set(x, "unwrap", js.undefined)
  }
}
