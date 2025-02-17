package typingsJapgolly.victoryCore.anon

import typingsJapgolly.victoryCore.esTypesPropTypesMod.Datum
import typingsJapgolly.victoryCore.esVictoryAnimationVictoryAnimationMod.AnimationStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Before extends StObject {
  
  var before: js.UndefOr[
    js.Function3[/* datum */ Datum, /* index */ Double, /* data */ js.Array[Datum], AnimationStyle]
  ] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object Before {
  
  inline def apply(): Before = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Before]
  }
  
  extension [Self <: Before](x: Self) {
    
    inline def setBefore(value: (/* datum */ Datum, /* index */ Double, /* data */ js.Array[Datum]) => AnimationStyle): Self = StObject.set(x, "before", js.Any.fromFunction3(value))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
