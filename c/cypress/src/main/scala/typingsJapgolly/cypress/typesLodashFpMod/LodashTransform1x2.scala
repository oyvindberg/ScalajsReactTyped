package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.Dictionary
import typingsJapgolly.cypress.typesLodashMod.MemoVoidIteratorCapped
import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashTransform1x2[TResult] extends StObject {
  
  def apply[T](iteratee: MemoVoidIteratorCapped[T, TResult]): LodashTransform1x3[T, TResult] = js.native
  def apply[T](iteratee: MemoVoidIteratorCapped[T, TResult], `object`: js.Array[T]): TResult = js.native
  def apply[T](iteratee: MemoVoidIteratorCapped[T, TResult], `object`: Dictionary[T]): TResult = js.native
  def apply[T](iteratee: __, `object`: js.Array[T]): LodashTransform1x6[T, TResult] = js.native
  def apply[T](iteratee: __, `object`: Dictionary[T]): LodashTransform2x6[T, TResult] = js.native
}
