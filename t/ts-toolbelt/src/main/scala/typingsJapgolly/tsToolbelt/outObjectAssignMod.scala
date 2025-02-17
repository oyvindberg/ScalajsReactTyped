package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outObjectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectAssignMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? Os extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Assign._Assign<O, Os, depth, ignore, fill> : never : never
    }}}
    */
  @js.native
  trait Assign[O /* <: js.Object */, Os /* <: typingsJapgolly.tsToolbelt.outListListMod.List[js.Object] */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Object/Assign.__Assign<O, Os, depth, ignore, fill, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<0>> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, object> : never
    }}}
    */
  @js.native
  trait _Assign[O /* <: js.Object */, Os /* <: typingsJapgolly.tsToolbelt.outListListMod.List[js.Object] */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */] extends StObject
  
  /**
    * @hidden
    */
  type __Assign[O /* <: js.Object */, Os /* <: typingsJapgolly.tsToolbelt.outListListMod.List[js.Object] */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0Assign<Os, I, O, depth, ignore, fill>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>, ts-toolbelt.ts-toolbelt/out/List/Length.Length<Os>>] */ js.Any
}
