package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRequest[TDocument, TPartialDocument]
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var _source: js.UndefOr[SearchSourceConfig] = js.undefined
  
  var _source_excludes: js.UndefOr[Fields] = js.undefined
  
  var _source_includes: js.UndefOr[Fields] = js.undefined
  
  var detect_noop: js.UndefOr[Boolean] = js.undefined
  
  var doc: js.UndefOr[TPartialDocument] = js.undefined
  
  var doc_as_upsert: js.UndefOr[Boolean] = js.undefined
  
  var id: Id
  
  var if_primary_term: js.UndefOr[long] = js.undefined
  
  var if_seq_no: js.UndefOr[SequenceNumber] = js.undefined
  
  var index: IndexName
  
  var lang: js.UndefOr[String] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var require_alias: js.UndefOr[Boolean] = js.undefined
  
  var retry_on_conflict: js.UndefOr[integer] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
  
  var scripted_upsert: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var upsert: js.UndefOr[TDocument] = js.undefined
  
  var wait_for_active_shards: js.UndefOr[WaitForActiveShards] = js.undefined
}
object UpdateRequest {
  
  inline def apply[TDocument, TPartialDocument](id: Id, index: IndexName): UpdateRequest[TDocument, TPartialDocument] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRequest[TDocument, TPartialDocument]]
  }
  
  extension [Self <: UpdateRequest[?, ?], TDocument, TPartialDocument](x: Self & (UpdateRequest[TDocument, TPartialDocument])) {
    
    inline def setDetect_noop(value: Boolean): Self = StObject.set(x, "detect_noop", value.asInstanceOf[js.Any])
    
    inline def setDetect_noopUndefined: Self = StObject.set(x, "detect_noop", js.undefined)
    
    inline def setDoc(value: TPartialDocument): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setDoc_as_upsert(value: Boolean): Self = StObject.set(x, "doc_as_upsert", value.asInstanceOf[js.Any])
    
    inline def setDoc_as_upsertUndefined: Self = StObject.set(x, "doc_as_upsert", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIf_primary_term(value: long): Self = StObject.set(x, "if_primary_term", value.asInstanceOf[js.Any])
    
    inline def setIf_primary_termUndefined: Self = StObject.set(x, "if_primary_term", js.undefined)
    
    inline def setIf_seq_no(value: SequenceNumber): Self = StObject.set(x, "if_seq_no", value.asInstanceOf[js.Any])
    
    inline def setIf_seq_noUndefined: Self = StObject.set(x, "if_seq_no", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRequire_alias(value: Boolean): Self = StObject.set(x, "require_alias", value.asInstanceOf[js.Any])
    
    inline def setRequire_aliasUndefined: Self = StObject.set(x, "require_alias", js.undefined)
    
    inline def setRetry_on_conflict(value: integer): Self = StObject.set(x, "retry_on_conflict", value.asInstanceOf[js.Any])
    
    inline def setRetry_on_conflictUndefined: Self = StObject.set(x, "retry_on_conflict", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setScripted_upsert(value: Boolean): Self = StObject.set(x, "scripted_upsert", value.asInstanceOf[js.Any])
    
    inline def setScripted_upsertUndefined: Self = StObject.set(x, "scripted_upsert", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUpsert(value: TDocument): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    
    inline def setWait_for_active_shards(value: WaitForActiveShards): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
    
    inline def set_source(value: SearchSourceConfig): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVarargs(value: Field*): Self = StObject.set(x, "_source", js.Array(value*))
    
    inline def set_source_excludes(value: Fields): Self = StObject.set(x, "_source_excludes", value.asInstanceOf[js.Any])
    
    inline def set_source_excludesUndefined: Self = StObject.set(x, "_source_excludes", js.undefined)
    
    inline def set_source_excludesVarargs(value: Field*): Self = StObject.set(x, "_source_excludes", js.Array(value*))
    
    inline def set_source_includes(value: Fields): Self = StObject.set(x, "_source_includes", value.asInstanceOf[js.Any])
    
    inline def set_source_includesUndefined: Self = StObject.set(x, "_source_includes", js.undefined)
    
    inline def set_source_includesVarargs(value: Field*): Self = StObject.set(x, "_source_includes", js.Array(value*))
  }
}
