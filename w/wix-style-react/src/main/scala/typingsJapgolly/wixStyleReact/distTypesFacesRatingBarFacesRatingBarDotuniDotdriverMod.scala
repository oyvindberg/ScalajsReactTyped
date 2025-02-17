package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFacesRatingBarFacesRatingBarDotuniDotdriverMod {
  
  trait FacesRatingBarUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSelectedRating(): js.Promise[Double]
    
    def selectRating(): js.Promise[Unit]
  }
  object FacesRatingBarUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSelectedRating: CallbackTo[js.Promise[Double]],
      selectRating: CallbackTo[js.Promise[Unit]]
    ): FacesRatingBarUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSelectedRating = getSelectedRating.toJsFn, selectRating = selectRating.toJsFn)
      __obj.asInstanceOf[FacesRatingBarUniDriver]
    }
    
    extension [Self <: FacesRatingBarUniDriver](x: Self) {
      
      inline def setGetSelectedRating(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getSelectedRating", value.toJsFn)
      
      inline def setSelectRating(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "selectRating", value.toJsFn)
    }
  }
}
