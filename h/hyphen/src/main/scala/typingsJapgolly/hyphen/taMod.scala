package typingsJapgolly.hyphen

import typingsJapgolly.hyphen.mod.HyphenationFunctionAsync
import typingsJapgolly.hyphen.mod.HyphenationFunctionSync
import typingsJapgolly.hyphen.mod.PatternsDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taMod {
  
  @JSImport("hyphen/ta", "hyphenate")
  @js.native
  val hyphenate: HyphenationFunctionAsync = js.native
  
  @JSImport("hyphen/ta", "hyphenateHTML")
  @js.native
  val hyphenateHTML: HyphenationFunctionAsync = js.native
  
  @JSImport("hyphen/ta", "hyphenateHTMLSync")
  @js.native
  val hyphenateHTMLSync: HyphenationFunctionSync = js.native
  
  @JSImport("hyphen/ta", "hyphenateSync")
  @js.native
  val hyphenateSync: HyphenationFunctionSync = js.native
  
  @JSImport("hyphen/ta", "patterns")
  @js.native
  val patterns: PatternsDefinition = js.native
}
