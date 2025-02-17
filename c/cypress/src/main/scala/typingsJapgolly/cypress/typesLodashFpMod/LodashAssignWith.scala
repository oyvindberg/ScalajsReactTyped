package typingsJapgolly.cypress.typesLodashFpMod

import typingsJapgolly.cypress.typesLodashMod.AssignCustomizer
import typingsJapgolly.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashAssignWith extends StObject {
  
  def apply(customizer: AssignCustomizer): LodashAssignWith1x1 = js.native
  def apply[TObject](customizer: AssignCustomizer, `object`: TObject): LodashAssignWith1x3[TObject] = js.native
  def apply[TSource](customizer: AssignCustomizer, `object`: __, source: TSource): LodashAssignWith1x5[TSource] = js.native
  def apply[TObject](customizer: __, `object`: TObject): LodashAssignWith1x2[TObject] = js.native
  def apply[TSource](customizer: __, `object`: __, source: TSource): LodashAssignWith1x4[TSource] = js.native
  def apply[TObject, TSource](customizer: AssignCustomizer, `object`: TObject, source: TSource): TObject & TSource = js.native
  def apply[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashAssignWith1x6[TObject, TSource] = js.native
}
