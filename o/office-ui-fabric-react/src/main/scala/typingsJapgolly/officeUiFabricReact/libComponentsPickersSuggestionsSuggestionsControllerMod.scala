package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPickersSuggestionsSuggestionsControllerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsController", "SuggestionsController")
  @js.native
  open class SuggestionsController[T] () extends StObject {
    
    /* private */ var _ensureSuggestionModel: Any = js.native
    
    /* private */ var _isSuggestionModel: Any = js.native
    
    def convertSuggestionsToSuggestionItems(suggestions: js.Array[ISuggestionModel[T] | T]): js.Array[ISuggestionModel[T]] = js.native
    
    def createGenericSuggestion(itemToConvert: T): Unit = js.native
    def createGenericSuggestion(itemToConvert: ISuggestionModel[T]): Unit = js.native
    
    var currentIndex: Double = js.native
    
    var currentSuggestion: js.UndefOr[ISuggestionModel[T]] = js.native
    
    def deselectAllSuggestions(): Unit = js.native
    
    def getCurrentItem(): ISuggestionModel[T] = js.native
    
    def getSuggestionAtIndex(index: Double): ISuggestionModel[T] = js.native
    
    def getSuggestions(): js.Array[ISuggestionModel[T]] = js.native
    
    def hasSelectedSuggestion(): Boolean = js.native
    
    /**
      * Increments the suggestion index and gets the next suggestion in the list.
      */
    def nextSuggestion(): Boolean = js.native
    
    /**
      * Decrements the suggestion index and gets the previous suggestion in the list.
      */
    def previousSuggestion(): Boolean = js.native
    
    def removeSuggestion(index: Double): Unit = js.native
    
    def setSelectedSuggestion(index: Double): Unit = js.native
    
    var suggestions: js.Array[ISuggestionModel[T]] = js.native
    
    def updateSuggestions(newSuggestions: js.Array[T]): Unit = js.native
    def updateSuggestions(newSuggestions: js.Array[T], selectedIndex: Double): Unit = js.native
  }
}
