package typingsJapgolly.redisMock

import typingsJapgolly.redis.mod.RedisClusterType
import typingsJapgolly.redis.mod.RedisDefaultModules
import typingsJapgolly.redisClient.distLibClientMod.RedisClientOptions
import typingsJapgolly.redisClient.distLibClientMod.RedisClientType
import typingsJapgolly.redisClient.distLibClusterMod.RedisClusterOptions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisFunctions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisModules
import typingsJapgolly.redisClient.distLibCommandsMod.RedisScripts
import typingsJapgolly.redisClient.distLibLuaScriptMod.RedisScriptConfig
import typingsJapgolly.redisClient.distLibLuaScriptMod.SHA1
import typingsJapgolly.redisTimeSeries.anon.TypeofADD
import typingsJapgolly.redisTimeSeries.anon.TypeofALTER
import typingsJapgolly.redisTimeSeries.anon.TypeofCREATE
import typingsJapgolly.redisTimeSeries.anon.TypeofCREATERULE
import typingsJapgolly.redisTimeSeries.anon.TypeofDECRBY
import typingsJapgolly.redisTimeSeries.anon.TypeofDEL
import typingsJapgolly.redisTimeSeries.anon.TypeofDELETERULE
import typingsJapgolly.redisTimeSeries.anon.TypeofGET
import typingsJapgolly.redisTimeSeries.anon.TypeofINCRBY
import typingsJapgolly.redisTimeSeries.anon.TypeofINFO
import typingsJapgolly.redisTimeSeries.anon.TypeofINFODEBUG
import typingsJapgolly.redisTimeSeries.anon.TypeofMADD
import typingsJapgolly.redisTimeSeries.anon.TypeofMGET
import typingsJapgolly.redisTimeSeries.anon.TypeofMGETWITHLABELS
import typingsJapgolly.redisTimeSeries.anon.TypeofMRANGE
import typingsJapgolly.redisTimeSeries.anon.TypeofMRANGEWITHLABELS
import typingsJapgolly.redisTimeSeries.anon.TypeofMREVRANGE
import typingsJapgolly.redisTimeSeries.anon.TypeofMREVRANGEWITHLABEL
import typingsJapgolly.redisTimeSeries.anon.TypeofQUERYINDEX
import typingsJapgolly.redisTimeSeries.anon.TypeofRANGE
import typingsJapgolly.redisTimeSeries.anon.TypeofREVRANGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redis-mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("redis-mock", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("redis-mock", "default.ADD")
    @js.native
    def ADD_ : TypeofADD = js.native
    
    inline def ADD__=(x: TypeofADD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADD")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.ALTER")
    @js.native
    def ALTER_ : TypeofALTER = js.native
    
    inline def ALTER__=(x: TypeofALTER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALTER")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.CREATERULE")
    @js.native
    def CREATERULE_ : TypeofCREATERULE = js.native
    
    inline def CREATERULE__=(x: TypeofCREATERULE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATERULE")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.CREATE")
    @js.native
    def CREATE_ : TypeofCREATE = js.native
    
    inline def CREATE__=(x: TypeofCREATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.DECRBY")
    @js.native
    def DECRBY_ : TypeofDECRBY = js.native
    
    inline def DECRBY__=(x: TypeofDECRBY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DECRBY")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.DELETERULE")
    @js.native
    def DELETERULE_ : TypeofDELETERULE = js.native
    
    inline def DELETERULE__=(x: TypeofDELETERULE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETERULE")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.DEL")
    @js.native
    def DEL_ : TypeofDEL = js.native
    
    inline def DEL__=(x: TypeofDEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEL")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.GET")
    @js.native
    def GET_ : TypeofGET = js.native
    
    inline def GET__=(x: TypeofGET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GET")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.INCRBY")
    @js.native
    def INCRBY_ : TypeofINCRBY = js.native
    
    inline def INCRBY__=(x: TypeofINCRBY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INCRBY")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.INFO")
    @js.native
    def INFO_ : TypeofINFO = js.native
    
    @JSImport("redis-mock", "default.INFO_DEBUG")
    @js.native
    def INFO_DEBUG: TypeofINFODEBUG = js.native
    inline def INFO_DEBUG_=(x: TypeofINFODEBUG): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO_DEBUG")(x.asInstanceOf[js.Any])
    
    inline def INFO__=(x: TypeofINFO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.MADD")
    @js.native
    def MADD_ : TypeofMADD = js.native
    
    inline def MADD__=(x: TypeofMADD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MADD")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.MGET")
    @js.native
    def MGET_ : TypeofMGET = js.native
    
    @JSImport("redis-mock", "default.MGET_WITHLABELS")
    @js.native
    def MGET_WITHLABELS: TypeofMGETWITHLABELS = js.native
    inline def MGET_WITHLABELS_=(x: TypeofMGETWITHLABELS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MGET_WITHLABELS")(x.asInstanceOf[js.Any])
    
    inline def MGET__=(x: TypeofMGET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MGET")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.MRANGE")
    @js.native
    def MRANGE_ : TypeofMRANGE = js.native
    
    @JSImport("redis-mock", "default.MRANGE_WITHLABELS")
    @js.native
    def MRANGE_WITHLABELS: TypeofMRANGEWITHLABELS = js.native
    inline def MRANGE_WITHLABELS_=(x: TypeofMRANGEWITHLABELS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MRANGE_WITHLABELS")(x.asInstanceOf[js.Any])
    
    inline def MRANGE__=(x: TypeofMRANGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MRANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.MREVRANGE")
    @js.native
    def MREVRANGE_ : TypeofMREVRANGE = js.native
    
    @JSImport("redis-mock", "default.MREVRANGE_WITHLABELS")
    @js.native
    def MREVRANGE_WITHLABELS: TypeofMREVRANGEWITHLABEL = js.native
    inline def MREVRANGE_WITHLABELS_=(x: TypeofMREVRANGEWITHLABEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MREVRANGE_WITHLABELS")(x.asInstanceOf[js.Any])
    
    inline def MREVRANGE__=(x: TypeofMREVRANGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MREVRANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.QUERYINDEX")
    @js.native
    def QUERYINDEX_ : TypeofQUERYINDEX = js.native
    
    inline def QUERYINDEX__=(x: TypeofQUERYINDEX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUERYINDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.RANGE")
    @js.native
    def RANGE_ : TypeofRANGE = js.native
    
    inline def RANGE__=(x: TypeofRANGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.REVRANGE")
    @js.native
    def REVRANGE_ : TypeofREVRANGE = js.native
    
    inline def REVRANGE__=(x: TypeofREVRANGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVRANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.add")
    @js.native
    def add: TypeofADD = js.native
    inline def add_=(x: TypeofADD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("add")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.alter")
    @js.native
    def alter: TypeofALTER = js.native
    inline def alter_=(x: TypeofALTER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alter")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.create")
    @js.native
    def create: TypeofCREATE = js.native
    
    @JSImport("redis-mock", "default.createRule")
    @js.native
    def createRule: TypeofCREATERULE = js.native
    inline def createRule_=(x: TypeofCREATERULE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createRule")(x.asInstanceOf[js.Any])
    
    inline def create_=(x: TypeofCREATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.decrBy")
    @js.native
    def decrBy: TypeofDECRBY = js.native
    inline def decrBy_=(x: TypeofDECRBY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decrBy")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.del")
    @js.native
    def del: TypeofDEL = js.native
    inline def del_=(x: TypeofDEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("del")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.deleteRule")
    @js.native
    def deleteRule: TypeofDELETERULE = js.native
    inline def deleteRule_=(x: TypeofDELETERULE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deleteRule")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.get")
    @js.native
    def get: TypeofGET = js.native
    inline def get_=(x: TypeofGET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.incrBy")
    @js.native
    def incrBy: TypeofINCRBY = js.native
    inline def incrBy_=(x: TypeofINCRBY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("incrBy")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.info")
    @js.native
    def info: TypeofINFO = js.native
    
    @JSImport("redis-mock", "default.infoDebug")
    @js.native
    def infoDebug: TypeofINFODEBUG = js.native
    inline def infoDebug_=(x: TypeofINFODEBUG): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infoDebug")(x.asInstanceOf[js.Any])
    
    inline def info_=(x: TypeofINFO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.mAdd")
    @js.native
    def mAdd: TypeofMADD = js.native
    inline def mAdd_=(x: TypeofMADD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mAdd")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.mGet")
    @js.native
    def mGet: TypeofMGET = js.native
    
    @JSImport("redis-mock", "default.mGetWithLabels")
    @js.native
    def mGetWithLabels: TypeofMGETWITHLABELS = js.native
    inline def mGetWithLabels_=(x: TypeofMGETWITHLABELS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mGetWithLabels")(x.asInstanceOf[js.Any])
    
    inline def mGet_=(x: TypeofMGET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mGet")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.mRange")
    @js.native
    def mRange: TypeofMRANGE = js.native
    
    @JSImport("redis-mock", "default.mRangeWithLabels")
    @js.native
    def mRangeWithLabels: TypeofMRANGEWITHLABELS = js.native
    inline def mRangeWithLabels_=(x: TypeofMRANGEWITHLABELS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mRangeWithLabels")(x.asInstanceOf[js.Any])
    
    inline def mRange_=(x: TypeofMRANGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mRange")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.mRevRange")
    @js.native
    def mRevRange: TypeofMREVRANGE = js.native
    
    @JSImport("redis-mock", "default.mRevRangeWithLabels")
    @js.native
    def mRevRangeWithLabels: TypeofMREVRANGEWITHLABEL = js.native
    inline def mRevRangeWithLabels_=(x: TypeofMREVRANGEWITHLABEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mRevRangeWithLabels")(x.asInstanceOf[js.Any])
    
    inline def mRevRange_=(x: TypeofMREVRANGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mRevRange")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.queryIndex")
    @js.native
    def queryIndex: TypeofQUERYINDEX = js.native
    inline def queryIndex_=(x: TypeofQUERYINDEX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.range")
    @js.native
    def range: TypeofRANGE = js.native
    inline def range_=(x: TypeofRANGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("range")(x.asInstanceOf[js.Any])
    
    @JSImport("redis-mock", "default.revRange")
    @js.native
    def revRange: TypeofREVRANGE = js.native
    inline def revRange_=(x: TypeofREVRANGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("revRange")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("redis-mock", "AbortError")
  @js.native
  open class AbortError ()
    extends typingsJapgolly.redis.mod.AbortError
  
  @JSImport("redis-mock", "AggregateGroupByReducers")
  @js.native
  object AggregateGroupByReducers extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers & String
      ] = js.native
    
    /* "AVG" */ val AVG: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.AVG & String = js.native
    
    /* "COUNT" */ val COUNT: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT & String = js.native
    
    /* "COUNT_DISTINCT" */ val COUNT_DISTINCT: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCT & String = js.native
    
    /* "COUNT_DISTINCTISH" */ val COUNT_DISTINCTISH: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCTISH & String = js.native
    
    /* "FIRST_VALUE" */ val FIRST_VALUE: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.FIRST_VALUE & String = js.native
    
    /* "MAX" */ val MAX: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MAX & String = js.native
    
    /* "MIN" */ val MIN: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MIN & String = js.native
    
    /* "QUANTILE" */ val QUANTILE: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.QUANTILE & String = js.native
    
    /* "RANDOM_SAMPLE" */ val RANDOM_SAMPLE: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.RANDOM_SAMPLE & String = js.native
    
    /* "STDDEV" */ val STDDEV: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.STDDEV & String = js.native
    
    /* "SUM" */ val SUM: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.SUM & String = js.native
    
    /* "TOLIST" */ val TOLIST: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.TOLIST & String = js.native
    
    /* "TOLIST" */ val TO_LIST: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.TO_LIST & String = js.native
  }
  
  @JSImport("redis-mock", "AggregateSteps")
  @js.native
  object AggregateSteps extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateSteps & String] = js.native
    
    /* "APPLY" */ val APPLY: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateSteps.APPLY & String = js.native
    
    /* "FILTER" */ val FILTER: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateSteps.FILTER & String = js.native
    
    /* "GROUPBY" */ val GROUPBY: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateSteps.GROUPBY & String = js.native
    
    /* "LIMIT" */ val LIMIT: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateSteps.LIMIT & String = js.native
    
    /* "SORTBY" */ val SORTBY: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateSteps.SORTBY & String = js.native
  }
  
  @JSImport("redis-mock", "ClientClosedError")
  @js.native
  open class ClientClosedError ()
    extends typingsJapgolly.redis.mod.ClientClosedError
  
  @JSImport("redis-mock", "ConnectionTimeoutError")
  @js.native
  open class ConnectionTimeoutError ()
    extends typingsJapgolly.redis.mod.ConnectionTimeoutError
  
  @JSImport("redis-mock", "DisconnectsClientError")
  @js.native
  open class DisconnectsClientError ()
    extends typingsJapgolly.redis.mod.DisconnectsClientError
  
  @JSImport("redis-mock", "ErrorReply")
  @js.native
  open class ErrorReply protected ()
    extends typingsJapgolly.redis.mod.ErrorReply {
    def this(message: String) = this()
  }
  
  @JSImport("redis-mock", "GeoReplyWith")
  @js.native
  object GeoReplyWith extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith & String
      ] = js.native
    
    /* "WITHCOORD" */ val COORDINATES: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.COORDINATES & String = js.native
    
    /* "WITHDIST" */ val DISTANCE: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.DISTANCE & String = js.native
    
    /* "WITHHASH" */ val HASH: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.HASH & String = js.native
  }
  
  @JSImport("redis-mock", "ReconnectStrategyError")
  @js.native
  open class ReconnectStrategyError protected ()
    extends typingsJapgolly.redis.mod.ReconnectStrategyError {
    def this(originalError: js.Error, socketError: Any) = this()
  }
  
  @JSImport("redis-mock", "RootNodesUnavailableError")
  @js.native
  open class RootNodesUnavailableError ()
    extends typingsJapgolly.redis.mod.RootNodesUnavailableError
  
  @JSImport("redis-mock", "SchemaFieldTypes")
  @js.native
  object SchemaFieldTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.redisSearch.distCommandsMod.SchemaFieldTypes & String] = js.native
    
    /* "GEO" */ val GEO: typingsJapgolly.redisSearch.distCommandsMod.SchemaFieldTypes.GEO & String = js.native
    
    /* "NUMERIC" */ val NUMERIC: typingsJapgolly.redisSearch.distCommandsMod.SchemaFieldTypes.NUMERIC & String = js.native
    
    /* "TAG" */ val TAG: typingsJapgolly.redisSearch.distCommandsMod.SchemaFieldTypes.TAG & String = js.native
    
    /* "TEXT" */ val TEXT: typingsJapgolly.redisSearch.distCommandsMod.SchemaFieldTypes.TEXT & String = js.native
    
    /* "VECTOR" */ val VECTOR: typingsJapgolly.redisSearch.distCommandsMod.SchemaFieldTypes.VECTOR & String = js.native
  }
  
  @JSImport("redis-mock", "SchemaTextFieldPhonetics")
  @js.native
  object SchemaTextFieldPhonetics extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.redisSearch.distCommandsMod.SchemaTextFieldPhonetics & String] = js.native
    
    /* "dm:en" */ val DM_EN: typingsJapgolly.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.DM_EN & String = js.native
    
    /* "dm:es" */ val DM_ES: typingsJapgolly.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.DM_ES & String = js.native
    
    /* "dm:fr" */ val DM_FR: typingsJapgolly.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.DM_FR & String = js.native
    
    /* "dm:pt" */ val FM_PT: typingsJapgolly.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.FM_PT & String = js.native
  }
  
  @JSImport("redis-mock", "SocketClosedUnexpectedlyError")
  @js.native
  open class SocketClosedUnexpectedlyError ()
    extends typingsJapgolly.redis.mod.SocketClosedUnexpectedlyError
  
  @JSImport("redis-mock", "TimeSeriesAggregationType")
  @js.native
  object TimeSeriesAggregationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType & String
      ] = js.native
    
    /* "avg" */ val AVERAGE: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.AVERAGE & String = js.native
    
    /* "count" */ val COUNT: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.COUNT & String = js.native
    
    /* "first" */ val FIRST: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.FIRST & String = js.native
    
    /* "last" */ val LAST: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.LAST & String = js.native
    
    /* "max" */ val MAXIMUM: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MAXIMUM & String = js.native
    
    /* "min" */ val MINIMUM: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MINIMUM & String = js.native
    
    /* "range" */ val RANGE: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.RANGE & String = js.native
    
    /* "std.p" */ val STD_P: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.STD_P & String = js.native
    
    /* "std.s" */ val STD_S: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.STD_S & String = js.native
    
    /* "sum" */ val SUM: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.SUM & String = js.native
    
    /* "var.p" */ val VAR_P: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.VAR_P & String = js.native
    
    /* "var.s" */ val VAR_S: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.VAR_S & String = js.native
  }
  
  @JSImport("redis-mock", "TimeSeriesDuplicatePolicies")
  @js.native
  object TimeSeriesDuplicatePolicies extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies & String
      ] = js.native
    
    /* "BLOCK" */ val BLOCK: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.BLOCK & String = js.native
    
    /* "FIRST" */ val FIRST: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.FIRST & String = js.native
    
    /* "LAST" */ val LAST: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.LAST & String = js.native
    
    /* "MAX" */ val MAX: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.MAX & String = js.native
    
    /* "MIN" */ val MIN: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.MIN & String = js.native
    
    /* "SUM" */ val SUM: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.SUM & String = js.native
  }
  
  @JSImport("redis-mock", "TimeSeriesEncoding")
  @js.native
  object TimeSeriesEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesEncoding & String] = js.native
    
    /* "COMPRESSED" */ val COMPRESSED: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesEncoding.COMPRESSED & String = js.native
    
    /* "UNCOMPRESSED" */ val UNCOMPRESSED: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesEncoding.UNCOMPRESSED & String = js.native
  }
  
  @JSImport("redis-mock", "VectorAlgorithms")
  @js.native
  object VectorAlgorithms extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.redisSearch.distCommandsMod.VectorAlgorithms & String] = js.native
    
    /* "FLAT" */ val FLAT: typingsJapgolly.redisSearch.distCommandsMod.VectorAlgorithms.FLAT & String = js.native
    
    /* "HNSW" */ val HNSW: typingsJapgolly.redisSearch.distCommandsMod.VectorAlgorithms.HNSW & String = js.native
  }
  
  @JSImport("redis-mock", "WatchError")
  @js.native
  open class WatchError ()
    extends typingsJapgolly.redis.mod.WatchError
  
  @JSImport("redis-mock", "commandOptions")
  @js.native
  val commandOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RedisClient.commandOptions */ Any = js.native
  
  inline def createClient[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): RedisClientType[RedisDefaultModules & M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[RedisClientType[RedisDefaultModules & M, F, S]]
  inline def createClient[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](options: RedisClientOptions[M, F, S]): RedisClientType[RedisDefaultModules & M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[RedisClientType[RedisDefaultModules & M, F, S]]
  @JSImport("redis-mock", "createClient")
  @js.native
  val createClient_Fmod: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RedisClient.create */ Any = js.native
  
  @JSImport("redis-mock", "createCluster")
  @js.native
  val createCluster: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RedisCluster.create */ Any = js.native
  inline def createCluster[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](options: RedisClusterOptions[M, F, S]): RedisClusterType[RedisDefaultModules & M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCluster")(options.asInstanceOf[js.Any]).asInstanceOf[RedisClusterType[RedisDefaultModules & M, F, S]]
  
  inline def defineScript[S /* <: RedisScriptConfig */](script: S): S & SHA1 = ^.asInstanceOf[js.Dynamic].applyDynamic("defineScript")(script.asInstanceOf[js.Any]).asInstanceOf[S & SHA1]
}
