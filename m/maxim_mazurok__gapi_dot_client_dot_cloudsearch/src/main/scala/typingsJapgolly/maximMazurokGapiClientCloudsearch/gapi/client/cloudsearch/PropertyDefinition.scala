package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyDefinition extends StObject {
  
  var booleanPropertyOptions: js.UndefOr[BooleanPropertyOptions] = js.undefined
  
  var datePropertyOptions: js.UndefOr[DatePropertyOptions] = js.undefined
  
  /** The options that determine how the property is displayed in the Cloud Search results page if it's specified to be displayed in the object's display options. */
  var displayOptions: js.UndefOr[PropertyDisplayOptions] = js.undefined
  
  var doublePropertyOptions: js.UndefOr[DoublePropertyOptions] = js.undefined
  
  var enumPropertyOptions: js.UndefOr[EnumPropertyOptions] = js.undefined
  
  var htmlPropertyOptions: js.UndefOr[HtmlPropertyOptions] = js.undefined
  
  var integerPropertyOptions: js.UndefOr[IntegerPropertyOptions] = js.undefined
  
  /**
    * Indicates that the property can be used for generating facets. Cannot be true for properties whose type is object. IsReturnable must be true to set this option. Only supported for
    * boolean, enum, and text properties.
    */
  var isFacetable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that multiple values are allowed for the property. For example, a document only has one description but can have multiple comments. Cannot be true for properties whose
    * type is a boolean. If set to false, properties that contain more than one value cause the indexing request for that item to be rejected.
    */
  var isRepeatable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that the property identifies data that should be returned in search results via the Query API. If set to *true*, indicates that Query API users can use matching property
    * fields in results. However, storing fields requires more space allocation and uses more bandwidth for search queries, which impacts performance over large datasets. Set to *true*
    * here only if the field is needed for search results. Cannot be true for properties whose type is an object.
    */
  var isReturnable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that the property can be used for sorting. Cannot be true for properties that are repeatable. Cannot be true for properties whose type is object. IsReturnable must be true
    * to set this option. Only supported for boolean, date, double, integer, and timestamp properties.
    */
  var isSortable: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates that the property can be used for generating query suggestions. */
  var isSuggestable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that users can perform wildcard search for this property. Only supported for Text properties. IsReturnable must be true to set this option. In a given datasource maximum
    * of 5 properties can be marked as is_wildcard_searchable.
    */
  var isWildcardSearchable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the property. Item indexing requests sent to the Indexing API should set the property name equal to this value. For example, if name is *subject_line*, then indexing
    * requests for document items with subject fields should set the name for that field equal to *subject_line*. Use the name as the identifier for the object property. Once registered
    * as a property for an object, you cannot re-use this name for another property within that object. The name must start with a letter and can only contain letters (A-Z, a-z) or
    * numbers (0-9). The maximum length is 256 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var objectPropertyOptions: js.UndefOr[ObjectPropertyOptions] = js.undefined
  
  var textPropertyOptions: js.UndefOr[TextPropertyOptions] = js.undefined
  
  var timestampPropertyOptions: js.UndefOr[TimestampPropertyOptions] = js.undefined
}
object PropertyDefinition {
  
  inline def apply(): PropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyDefinition]
  }
  
  extension [Self <: PropertyDefinition](x: Self) {
    
    inline def setBooleanPropertyOptions(value: BooleanPropertyOptions): Self = StObject.set(x, "booleanPropertyOptions", value.asInstanceOf[js.Any])
    
    inline def setBooleanPropertyOptionsUndefined: Self = StObject.set(x, "booleanPropertyOptions", js.undefined)
    
    inline def setDatePropertyOptions(value: DatePropertyOptions): Self = StObject.set(x, "datePropertyOptions", value.asInstanceOf[js.Any])
    
    inline def setDatePropertyOptionsUndefined: Self = StObject.set(x, "datePropertyOptions", js.undefined)
    
    inline def setDisplayOptions(value: PropertyDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    inline def setDoublePropertyOptions(value: DoublePropertyOptions): Self = StObject.set(x, "doublePropertyOptions", value.asInstanceOf[js.Any])
    
    inline def setDoublePropertyOptionsUndefined: Self = StObject.set(x, "doublePropertyOptions", js.undefined)
    
    inline def setEnumPropertyOptions(value: EnumPropertyOptions): Self = StObject.set(x, "enumPropertyOptions", value.asInstanceOf[js.Any])
    
    inline def setEnumPropertyOptionsUndefined: Self = StObject.set(x, "enumPropertyOptions", js.undefined)
    
    inline def setHtmlPropertyOptions(value: HtmlPropertyOptions): Self = StObject.set(x, "htmlPropertyOptions", value.asInstanceOf[js.Any])
    
    inline def setHtmlPropertyOptionsUndefined: Self = StObject.set(x, "htmlPropertyOptions", js.undefined)
    
    inline def setIntegerPropertyOptions(value: IntegerPropertyOptions): Self = StObject.set(x, "integerPropertyOptions", value.asInstanceOf[js.Any])
    
    inline def setIntegerPropertyOptionsUndefined: Self = StObject.set(x, "integerPropertyOptions", js.undefined)
    
    inline def setIsFacetable(value: Boolean): Self = StObject.set(x, "isFacetable", value.asInstanceOf[js.Any])
    
    inline def setIsFacetableUndefined: Self = StObject.set(x, "isFacetable", js.undefined)
    
    inline def setIsRepeatable(value: Boolean): Self = StObject.set(x, "isRepeatable", value.asInstanceOf[js.Any])
    
    inline def setIsRepeatableUndefined: Self = StObject.set(x, "isRepeatable", js.undefined)
    
    inline def setIsReturnable(value: Boolean): Self = StObject.set(x, "isReturnable", value.asInstanceOf[js.Any])
    
    inline def setIsReturnableUndefined: Self = StObject.set(x, "isReturnable", js.undefined)
    
    inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    inline def setIsSuggestable(value: Boolean): Self = StObject.set(x, "isSuggestable", value.asInstanceOf[js.Any])
    
    inline def setIsSuggestableUndefined: Self = StObject.set(x, "isSuggestable", js.undefined)
    
    inline def setIsWildcardSearchable(value: Boolean): Self = StObject.set(x, "isWildcardSearchable", value.asInstanceOf[js.Any])
    
    inline def setIsWildcardSearchableUndefined: Self = StObject.set(x, "isWildcardSearchable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjectPropertyOptions(value: ObjectPropertyOptions): Self = StObject.set(x, "objectPropertyOptions", value.asInstanceOf[js.Any])
    
    inline def setObjectPropertyOptionsUndefined: Self = StObject.set(x, "objectPropertyOptions", js.undefined)
    
    inline def setTextPropertyOptions(value: TextPropertyOptions): Self = StObject.set(x, "textPropertyOptions", value.asInstanceOf[js.Any])
    
    inline def setTextPropertyOptionsUndefined: Self = StObject.set(x, "textPropertyOptions", js.undefined)
    
    inline def setTimestampPropertyOptions(value: TimestampPropertyOptions): Self = StObject.set(x, "timestampPropertyOptions", value.asInstanceOf[js.Any])
    
    inline def setTimestampPropertyOptionsUndefined: Self = StObject.set(x, "timestampPropertyOptions", js.undefined)
  }
}
