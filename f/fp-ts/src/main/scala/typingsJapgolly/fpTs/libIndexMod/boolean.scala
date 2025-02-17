package typingsJapgolly.fpTs.libIndexMod

import typingsJapgolly.fpTs.libFunctionMod.Lazy
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libOrdMod.Ord_
import typingsJapgolly.fpTs.libRefinementMod.Refinement
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boolean {
  
  @JSImport("fp-ts/lib/index", "boolean")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/index", "boolean.BooleanAlgebra")
  @js.native
  val BooleanAlgebra: typingsJapgolly.fpTs.libBooleanAlgebraMod.BooleanAlgebra[Boolean] = js.native
  
  @JSImport("fp-ts/lib/index", "boolean.Eq")
  @js.native
  val Eq: typingsJapgolly.fpTs.libEqMod.Eq[Boolean] = js.native
  
  @JSImport("fp-ts/lib/index", "boolean.MonoidAll")
  @js.native
  val MonoidAll: Monoid[Boolean] = js.native
  
  @JSImport("fp-ts/lib/index", "boolean.MonoidAny")
  @js.native
  val MonoidAny: Monoid[Boolean] = js.native
  
  @JSImport("fp-ts/lib/index", "boolean.Ord")
  @js.native
  val Ord: Ord_[Boolean] = js.native
  
  @JSImport("fp-ts/lib/index", "boolean.SemigroupAll")
  @js.native
  val SemigroupAll: Semigroup[Boolean] = js.native
  
  @JSImport("fp-ts/lib/index", "boolean.SemigroupAny")
  @js.native
  val SemigroupAny: Semigroup[Boolean] = js.native
  
  @JSImport("fp-ts/lib/index", "boolean.Show")
  @js.native
  val Show: typingsJapgolly.fpTs.libShowMod.Show[Boolean] = js.native
  
  inline def fold[A](onFalse: Lazy[A], onTrue: Lazy[A]): js.Function1[/* value */ Boolean, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onFalse.asInstanceOf[js.Any], onTrue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Boolean, A]]
  
  inline def foldW[A, B](onFalse: Lazy[A], onTrue: Lazy[B]): js.Function1[/* value */ Boolean, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onFalse.asInstanceOf[js.Any], onTrue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Boolean, A | B]]
  
  @JSImport("fp-ts/lib/index", "boolean.isBoolean")
  @js.native
  val isBoolean: Refinement[Any, Boolean] = js.native
  
  inline def `match`[A](onFalse: Lazy[A], onTrue: Lazy[A]): js.Function1[/* value */ Boolean, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onFalse.asInstanceOf[js.Any], onTrue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Boolean, A]]
  
  inline def matchW[A, B](onFalse: Lazy[A], onTrue: Lazy[B]): js.Function1[/* value */ Boolean, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onFalse.asInstanceOf[js.Any], onTrue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Boolean, A | B]]
}
