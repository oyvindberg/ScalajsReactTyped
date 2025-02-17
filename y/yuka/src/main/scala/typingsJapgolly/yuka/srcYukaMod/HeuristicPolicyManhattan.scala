package typingsJapgolly.yuka.srcYukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "HeuristicPolicyManhattan")
@js.native
open class HeuristicPolicyManhattan ()
  extends typingsJapgolly.yuka.srcGraphExtraHeuristicPolicyMod.HeuristicPolicyManhattan
/* static members */
object HeuristicPolicyManhattan {
  
  @JSImport("yuka/src/Yuka", "HeuristicPolicyManhattan")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Calculates the manhattan distance between two nodes.
    *
    * @param graph - The graph.
    * @param source - The index of the source node.
    * @param target - The index of the target node.
    * @return The manhattan distance between both nodes.
    */
  inline def calculate(
    graph: typingsJapgolly.yuka.srcGraphCoreGraphMod.Graph[
      typingsJapgolly.yuka.srcGraphCoreNodeMod.Node, 
      typingsJapgolly.yuka.srcGraphCoreEdgeMod.Edge
    ],
    source: Double,
    target: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
}
