package typingsJapgolly.semanticUiSearch.anon

import typingsJapgolly.semanticUiSearch.SemanticUI.Search.FieldsSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'categoryName'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl>> */
trait PickImplcategoryNameParti
  extends StObject
     with Param {
  
  var action: js.UndefOr[String] = js.undefined
  
  var actionText: js.UndefOr[String] = js.undefined
  
  var actionURL: js.UndefOr[String] = js.undefined
  
  var categories: js.UndefOr[String] = js.undefined
  
  var categoryName: String & js.UndefOr[String]
  
  var categoryResults: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var price: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PickImplcategoryNameParti {
  
  inline def apply(categoryName: String & js.UndefOr[String]): PickImplcategoryNameParti = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcategoryNameParti]
  }
  
  extension [Self <: PickImplcategoryNameParti](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
    
    inline def setActionTextUndefined: Self = StObject.set(x, "actionText", js.undefined)
    
    inline def setActionURL(value: String): Self = StObject.set(x, "actionURL", value.asInstanceOf[js.Any])
    
    inline def setActionURLUndefined: Self = StObject.set(x, "actionURL", js.undefined)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCategories(value: String): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoryName(value: String & js.UndefOr[String]): Self = StObject.set(x, "categoryName", value.asInstanceOf[js.Any])
    
    inline def setCategoryResults(value: String): Self = StObject.set(x, "categoryResults", value.asInstanceOf[js.Any])
    
    inline def setCategoryResultsUndefined: Self = StObject.set(x, "categoryResults", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
