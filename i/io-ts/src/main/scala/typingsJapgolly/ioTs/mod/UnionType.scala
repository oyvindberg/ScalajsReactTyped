package typingsJapgolly.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("io-ts", "UnionType")
@js.native
open class UnionType[CS /* <: js.Array[Any_] */, A, O, I] protected () extends Type_[A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], types: CS) = this()
  
  /**
    * @since 1.0.0
    */
  val _tag: typingsJapgolly.ioTs.ioTsStrings.UnionType = js.native
  
  val types: CS = js.native
}
