package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.algoliasearchHelper.mod.SearchParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorDescription[TProvided, TExposed] extends StObject {
  
  @JSName("$$type")
  var DollarDollartype: js.UndefOr[String] = js.undefined
  
  /**
    * This method is called when a widget is about to unmount in order to clean the searchState.
    * It takes in the current props of the higher-order component and the searchState of all widgets and expect a new searchState in return.
    * props are the props that were provided to the higher-order component.
    * searchState holds the searchState of all widgets, with the shape {[widgetId]: widgetState}. Stateful widgets describe the format of their searchState
    * in their respective documentation entry.
    */
  var cleanUp: js.UndefOr[
    js.ThisFunction2[
      /* this */ (Component[TExposed & js.Object, js.Object]) & ConnectedWidget, 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      SearchState
    ]
  ] = js.undefined
  
  var defaultProps: js.UndefOr[Any] = js.undefined
  
  var displayName: String
  
  /**
    * This method allows the widget to register a custom metadata object for any props and state combination.
    * If your widget is stateful, the corresponding URL key should be declared on the metadata object as the id property, so that the InstantSearch
    * component can determine which URL keys it controls and which are foreign and should be left intact.
    * The metadata object also allows you to declare any data that you would like to pass down to all other widgets. The list of metadata objects of
    * all components is available as the fourth argument to the getProvidedProps method.
    * The CurrentRefinements widget leverages this mechanism in order to allow any widget to declare the filters it has applied. If you want to add
    * your own filter, declare a filters property on your widget’s metadata
    */
  var getMetadata: js.UndefOr[
    js.ThisFunction3[
      /* this */ (Component[TExposed & js.Object, js.Object]) & ConnectedWidget, 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      /* repeated */ Any, 
      Any
    ]
  ] = js.undefined
  
  /**
    * This method should return the props to forward to the composed component.
    * props are the props that were provided to the higher-order component.
    * searchState holds the search state of all widgets. You can find the shape of all widgets search state in the corresponding guide.
    * searchResults holds the search results, search errors and search loading state, with the shape
    * {results: ?SearchResults, error: ?Error, searching: boolean, searchingForFacetValues: boolean}. The SearchResults type is described in the Helper’s documentation.
    * meta is the list of metadata from all widgets whose connector defines a getMetadata method.
    * searchForFacetValuesResults holds the search for facet values results.
    */
  def getProvidedProps(
    props: TExposed,
    searchState: SearchState,
    searchResults: ConnectorSearchResults[Any],
    metadata: Any,
    resultsFacetValues: Any
  ): TProvided
  
  /**
    * This method applies the current props and state to the provided SearchParameters, and returns a new SearchParameters. The SearchParameters
    * type is described in the Helper’s documentation.
    * Every time the props or state of a widget change, all the getSearchParameters methods of all the registered widgets are called in a chain
    * to produce a new SearchParameters. Then, if the output SearchParameters differs from the previous one, a new search is triggered.
    * As such, the getSearchParameters method allows you to describe how the state and props of a widget should affect the search parameters.
    */
  var getSearchParameters: js.UndefOr[
    js.ThisFunction3[
      /* this */ (Component[TExposed & js.Object, js.Object]) & ConnectedWidget, 
      /* searchParameters */ SearchParameters, 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      SearchParameters
    ]
  ] = js.undefined
  
  var propTypes: js.UndefOr[Any] = js.undefined
  
  /**
    * This method defines exactly how the refine prop of widgets affects the search state.
    * It takes in the current props of the higher-order component, the search state of all widgets, as well as all arguments passed
    * to the refine and createURL props of stateful widgets, and returns a new state.
    */
  var refine: js.UndefOr[
    js.ThisFunction3[
      /* this */ (Component[TExposed & js.Object, js.Object]) & ConnectedWidget, 
      /* props */ TExposed, 
      /* searchState */ SearchState, 
      /* repeated */ Any, 
      SearchState
    ]
  ] = js.undefined
  
  /**
    * This method needs to be implemented if you want to have the ability to perform a search for facet values inside your widget.
    * It takes in the current props of the higher-order component, the search state of all widgets, as well as all arguments passed to the searchForFacetValues
    * props of stateful widgets, and returns an object of the shape: {facetName: string, query: string, maxFacetHits?: number}. The default value for the
    * maxFacetHits is the one set by the API which is 10.
    */
  var searchForFacetValues: js.UndefOr[
    js.ThisFunction2[
      /* this */ (Component[TExposed & js.Object, js.Object]) & ConnectedWidget, 
      /* searchState */ SearchState, 
      /* nextRefinement */ js.UndefOr[Any], 
      Any
    ]
  ] = js.undefined
}
object ConnectorDescription {
  
  inline def apply[TProvided, TExposed](
    displayName: String,
    getProvidedProps: (TExposed, SearchState, ConnectorSearchResults[Any], Any, Any) => TProvided
  ): ConnectorDescription[TProvided, TExposed] = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], getProvidedProps = js.Any.fromFunction5(getProvidedProps))
    __obj.asInstanceOf[ConnectorDescription[TProvided, TExposed]]
  }
  
  extension [Self <: ConnectorDescription[?, ?], TProvided, TExposed](x: Self & (ConnectorDescription[TProvided, TExposed])) {
    
    inline def setCleanUp(
      value: js.ThisFunction2[
          /* this */ (Component[TExposed & js.Object, js.Object]) & ConnectedWidget, 
          /* props */ TExposed, 
          /* searchState */ SearchState, 
          SearchState
        ]
    ): Self = StObject.set(x, "cleanUp", value.asInstanceOf[js.Any])
    
    inline def setCleanUpUndefined: Self = StObject.set(x, "cleanUp", js.undefined)
    
    inline def setDefaultProps(value: Any): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDollarDollartype(value: String): Self = StObject.set(x, "$$type", value.asInstanceOf[js.Any])
    
    inline def setDollarDollartypeUndefined: Self = StObject.set(x, "$$type", js.undefined)
    
    inline def setGetMetadata(
      value: js.ThisFunction3[
          /* this */ (Component[TExposed & js.Object, js.Object]) & ConnectedWidget, 
          /* props */ TExposed, 
          /* searchState */ SearchState, 
          /* repeated */ Any, 
          Any
        ]
    ): Self = StObject.set(x, "getMetadata", value.asInstanceOf[js.Any])
    
    inline def setGetMetadataUndefined: Self = StObject.set(x, "getMetadata", js.undefined)
    
    inline def setGetProvidedProps(value: (TExposed, SearchState, ConnectorSearchResults[Any], Any, Any) => TProvided): Self = StObject.set(x, "getProvidedProps", js.Any.fromFunction5(value))
    
    inline def setGetSearchParameters(
      value: js.ThisFunction3[
          /* this */ (Component[TExposed & js.Object, js.Object]) & ConnectedWidget, 
          /* searchParameters */ SearchParameters, 
          /* props */ TExposed, 
          /* searchState */ SearchState, 
          SearchParameters
        ]
    ): Self = StObject.set(x, "getSearchParameters", value.asInstanceOf[js.Any])
    
    inline def setGetSearchParametersUndefined: Self = StObject.set(x, "getSearchParameters", js.undefined)
    
    inline def setPropTypes(value: Any): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    inline def setPropTypesUndefined: Self = StObject.set(x, "propTypes", js.undefined)
    
    inline def setRefine(
      value: js.ThisFunction3[
          /* this */ (Component[TExposed & js.Object, js.Object]) & ConnectedWidget, 
          /* props */ TExposed, 
          /* searchState */ SearchState, 
          /* repeated */ Any, 
          SearchState
        ]
    ): Self = StObject.set(x, "refine", value.asInstanceOf[js.Any])
    
    inline def setRefineUndefined: Self = StObject.set(x, "refine", js.undefined)
    
    inline def setSearchForFacetValues(
      value: js.ThisFunction2[
          /* this */ (Component[TExposed & js.Object, js.Object]) & ConnectedWidget, 
          /* searchState */ SearchState, 
          /* nextRefinement */ js.UndefOr[Any], 
          Any
        ]
    ): Self = StObject.set(x, "searchForFacetValues", value.asInstanceOf[js.Any])
    
    inline def setSearchForFacetValuesUndefined: Self = StObject.set(x, "searchForFacetValues", js.undefined)
  }
}
