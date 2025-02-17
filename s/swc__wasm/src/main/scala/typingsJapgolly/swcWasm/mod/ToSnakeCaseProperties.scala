package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @example ToSnakeCaseProperties<{indentLevel: 3}> == {indent_level: 3}
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof T as K extends string? @swc/wasm.@swc/wasm.ToSnakeCase<K> : K ]: T[K]}
  }}}
  */
@js.native
trait ToSnakeCaseProperties[T] extends StObject
