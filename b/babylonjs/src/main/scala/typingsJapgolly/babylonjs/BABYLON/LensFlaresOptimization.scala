package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LensFlaresOptimization
  extends StObject
     with SceneOptimization
object LensFlaresOptimization {
  
  inline def apply(apply: (Scene, SceneOptimizer) => Boolean, getDescription: CallbackTo[String], priority: Double): LensFlaresOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = getDescription.toJsFn, priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[LensFlaresOptimization]
  }
}
