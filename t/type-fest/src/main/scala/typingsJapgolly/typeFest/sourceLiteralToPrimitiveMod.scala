package typingsJapgolly.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceLiteralToPrimitiveMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends number ? number : T extends bigint ? bigint : T extends string ? string : T extends boolean ? boolean : T extends symbol ? symbol : T extends null ? null : T extends undefined ? undefined : never
    }}}
    */
  @js.native
  trait LiteralToPrimitive[T] extends StObject
}
