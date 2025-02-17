package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermvectorsRequest[TDocument]
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var doc: js.UndefOr[TDocument] = js.undefined
  
  var field_statistics: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[Fields] = js.undefined
  
  var filter: js.UndefOr[TermvectorsFilter] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var index: IndexName
  
  var offsets: js.UndefOr[Boolean] = js.undefined
  
  var payloads: js.UndefOr[Boolean] = js.undefined
  
  var per_field_analyzer: js.UndefOr[Record[Field, String]] = js.undefined
  
  var positions: js.UndefOr[Boolean] = js.undefined
  
  var preference: js.UndefOr[String] = js.undefined
  
  var realtime: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var term_statistics: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
  
  var version_type: js.UndefOr[VersionType] = js.undefined
}
object TermvectorsRequest {
  
  inline def apply[TDocument](index: IndexName): TermvectorsRequest[TDocument] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermvectorsRequest[TDocument]]
  }
  
  extension [Self <: TermvectorsRequest[?], TDocument](x: Self & TermvectorsRequest[TDocument]) {
    
    inline def setDoc(value: TDocument): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setField_statistics(value: Boolean): Self = StObject.set(x, "field_statistics", value.asInstanceOf[js.Any])
    
    inline def setField_statisticsUndefined: Self = StObject.set(x, "field_statistics", js.undefined)
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFilter(value: TermvectorsFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOffsets(value: Boolean): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    inline def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
    
    inline def setPayloads(value: Boolean): Self = StObject.set(x, "payloads", value.asInstanceOf[js.Any])
    
    inline def setPayloadsUndefined: Self = StObject.set(x, "payloads", js.undefined)
    
    inline def setPer_field_analyzer(value: Record[Field, String]): Self = StObject.set(x, "per_field_analyzer", value.asInstanceOf[js.Any])
    
    inline def setPer_field_analyzerUndefined: Self = StObject.set(x, "per_field_analyzer", js.undefined)
    
    inline def setPositions(value: Boolean): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
    
    inline def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setTerm_statistics(value: Boolean): Self = StObject.set(x, "term_statistics", value.asInstanceOf[js.Any])
    
    inline def setTerm_statisticsUndefined: Self = StObject.set(x, "term_statistics", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersion_type(value: VersionType): Self = StObject.set(x, "version_type", value.asInstanceOf[js.Any])
    
    inline def setVersion_typeUndefined: Self = StObject.set(x, "version_type", js.undefined)
  }
}
