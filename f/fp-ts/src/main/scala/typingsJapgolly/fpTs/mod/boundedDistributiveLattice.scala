package typingsJapgolly.fpTs.mod

import typingsJapgolly.fpTs.libBoundedDistributiveLatticeMod.BoundedDistributiveLattice
import typingsJapgolly.fpTs.libOrdMod.Ord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundedDistributiveLattice {
  
  @JSImport("fp-ts", "boundedDistributiveLattice")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMinMaxBoundedDistributiveLattice[A](O: Ord_[A]): js.Function2[/* min */ A, /* max */ A, BoundedDistributiveLattice[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinMaxBoundedDistributiveLattice")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* min */ A, /* max */ A, BoundedDistributiveLattice[A]]]
}
