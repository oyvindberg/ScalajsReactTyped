package typingsJapgolly.hyphen

import typingsJapgolly.hyphen.mod.HyphenationFunctionAsync
import typingsJapgolly.hyphen.mod.HyphenationFunctionSync
import typingsJapgolly.hyphen.mod.PatternsDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object euMod {
  
  @JSImport("hyphen/eu", "hyphenate")
  @js.native
  val hyphenate: HyphenationFunctionAsync = js.native
  
  @JSImport("hyphen/eu", "hyphenateHTML")
  @js.native
  val hyphenateHTML: HyphenationFunctionAsync = js.native
  
  @JSImport("hyphen/eu", "hyphenateHTMLSync")
  @js.native
  val hyphenateHTMLSync: HyphenationFunctionSync = js.native
  
  @JSImport("hyphen/eu", "hyphenateSync")
  @js.native
  val hyphenateSync: HyphenationFunctionSync = js.native
  
  @JSImport("hyphen/eu", "patterns")
  @js.native
  val patterns: PatternsDefinition = js.native
}
