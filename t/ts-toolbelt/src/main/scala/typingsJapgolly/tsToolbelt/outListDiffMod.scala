package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyInternalMod.Match
import typingsJapgolly.tsToolbelt.outListObjectOfMod.ObjectOf
import typingsJapgolly.tsToolbelt.outObjectListOfMod.ListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListDiffMod {
  
  type Diff[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, L1 /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, `match` /* <: Match */] = ListOf[
    typingsJapgolly.tsToolbelt.outObjectDiffMod.Diff[ObjectOf[L], ObjectOf[L1], `match`]
  ]
}
