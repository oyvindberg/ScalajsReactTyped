package typingsJapgolly.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Replaces a type with a Sinon stub if it's a function.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends (args : infer TArgs): infer TReturnValue ? sinon.sinon.SinonStub<TArgs, TReturnValue> : T
  }}}
  */
@js.native
trait SinonStubbedMember[T] extends StObject
