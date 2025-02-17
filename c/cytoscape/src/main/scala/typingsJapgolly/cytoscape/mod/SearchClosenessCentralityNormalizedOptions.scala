package typingsJapgolly.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.closenessCentrality
  * trivial
  */
/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  */
trait SearchClosenessCentralityNormalizedOptions extends StObject {
  
  var directed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean indicating whether the algorithm calculates the
    * harmonic mean (true, default) or the arithmetic mean (false) of distances.
    * The harmonic mean is very useful for graphs that are not strongly connected.
    */
  var harmonic: js.UndefOr[Boolean] = js.undefined
  
  /**  A function that returns the weight for the edge. */
  var weight: js.UndefOr[js.Function1[/* edge */ EdgeSingular, Double]] = js.undefined
}
object SearchClosenessCentralityNormalizedOptions {
  
  inline def apply(): SearchClosenessCentralityNormalizedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchClosenessCentralityNormalizedOptions]
  }
  
  extension [Self <: SearchClosenessCentralityNormalizedOptions](x: Self) {
    
    inline def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    inline def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
    
    inline def setHarmonic(value: Boolean): Self = StObject.set(x, "harmonic", value.asInstanceOf[js.Any])
    
    inline def setHarmonicUndefined: Self = StObject.set(x, "harmonic", js.undefined)
    
    inline def setWeight(value: /* edge */ EdgeSingular => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
