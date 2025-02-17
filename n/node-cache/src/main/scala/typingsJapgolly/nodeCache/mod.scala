package typingsJapgolly.nodeCache

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-cache", JSImport.Namespace)
  @js.native
  /** constructor */
  open class ^ () extends NodeCache {
    def this(options: Options) = this()
  }
  
  type Callback[T] = js.Function2[/* err */ Any, /* data */ js.UndefOr[T], Unit]
  
  type Data = StringDictionary[WrappedValue[Any]]
  
  /**
  	 * Since 4.1.0: Key-validation: The keys can be given as either string or number,
  	 * but are casted to a string internally anyway.
  	 */
  type Key = String | Double
  
  @js.native
  trait NodeCache extends EventEmitter {
    
    /**
    	 * This will clear the interval timeout which is set on checkperiod option.
    	 */
    def close(): Unit = js.native
    
    /** container for cached data */
    var data: Data = js.native
    
    def del(keys: js.Array[Key]): Double = js.native
    /**
    	 * remove keys
    	 * @param keys cache key to delete or a array of cache keys
    	 * @param cb Callback function
    	 * @returns Number of deleted keys
    	 */
    def del(keys: Key): Double = js.native
    
    /**
    	 * flush the whole data and reset the stats
    	 */
    def flushAll(): Unit = js.native
    
    /**
    	 * flush the stats and reset all counters to 0
    	 */
    def flushStats(): Unit = js.native
    
    /**
    	 * get a cached key and change the stats
    	 *
    	 * @param key cache key
    	 * @returns The value stored in the key
    	 */
    def get[T](key: Key): js.UndefOr[T] = js.native
    
    /**
    	 * get the stats
    	 *
    	 * @returns Stats data
    	 */
    def getStats(): Stats = js.native
    
    def getTtl(key: Key): js.UndefOr[Double] = js.native
    @JSName("getTtl")
    def getTtl_Boolean(key: Key): Boolean = js.native
    
    /**
    	 * Check if a key is cached
    	 * @param key cache key to check
    	 * @returns Boolean indicating if the key is cached or not
    	 */
    def has(key: Key): Boolean = js.native
    
    /**
    	 * list all keys within this cache
    	 * @returns An array of all keys
    	 */
    def keys(): js.Array[String] = js.native
    
    /**
    	 * get multiple cached keys at once and change the stats
    	 *
    	 * @param keys an array of keys
    	 * @returns an object containing the values stored in the matching keys
    	 */
    def mget[T](keys: js.Array[Key]): StringDictionary[T] = js.native
    
    /**
    	 * set multiple cached keys at once and change the stats
    	 *
    	 * @param keyValueSet an array of object which includes key,value and ttl
    	 */
    def mset[T](keyValueSet: js.Array[ValueSetItem[T]]): Boolean = js.native
    
    /** module options */
    var options: Options = js.native
    
    def set[T](key: Key, value: T): Boolean = js.native
    def set[T](key: Key, value: T, ttl: String): Boolean = js.native
    /**
    	 * set a cached key and change the stats
    	 *
    	 * @param key cache key
    	 * @param value A element to cache. If the option `option.forceString` is `true` the module trys to translate
    	 * it to a serialized JSON
    	 * @param ttl The time to live in seconds.
    	 */
    def set[T](key: Key, value: T, ttl: Double): Boolean = js.native
    
    /** statistics container */
    var stats: Stats = js.native
    
    /**
    	 * get a cached key and remove it from the cache.
    	 * Equivalent to calling `get(key)` + `del(key)`.
    	 * Useful for implementing `single use` mechanism such as OTP, where once a value is read it will become obsolete.
    	 *
    	 * @param key cache key
    	 * @returns The value stored in the key
    	 */
    def take[T](key: Key): js.UndefOr[T] = js.native
    
    def ttl(key: Key): Boolean = js.native
    /**
    	 * reset or redefine the ttl of a key. If `ttl` is not passed or set to 0 it's similar to `.del()`
    	 */
    def ttl(key: Key, ttl: Double): Boolean = js.native
  }
  
  @js.native
  trait NodeCacheLegacyCallbacks extends StObject {
    
    /**
    		 * This will clear the interval timeout which is set on checkperiod option.
    		 */
    def close(): Unit = js.native
    
    /** container for cached data */
    var data: Data = js.native
    
    def del(keys: js.Array[Key]): Double = js.native
    def del(keys: js.Array[Key], cb: Callback[Double]): Double = js.native
    /**
    		 * remove keys
    		 * @param keys cache key to delete or a array of cache keys
    		 * @param cb Callback function
    		 * @returns Number of deleted keys
    		 */
    def del(keys: Key): Double = js.native
    def del(keys: Key, cb: Callback[Double]): Double = js.native
    
    /**
    		 * flush the whole data and reset the stats
    		 */
    def flushAll(): Unit = js.native
    
    /**
    		 * get a cached key and change the stats
    		 *
    		 * @param key cache key or an array of keys
    		 * @param cb Callback function
    		 */
    def get[T](key: Key): js.UndefOr[T] = js.native
    def get[T](key: Key, cb: Callback[T]): js.UndefOr[T] = js.native
    
    /**
    		 * get the stats
    		 *
    		 * @returns Stats data
    		 */
    def getStats(): Stats = js.native
    
    def getTtl(key: Key): js.UndefOr[Double] = js.native
    def getTtl(key: Key, cb: Callback[Boolean]): Boolean = js.native
    @JSName("getTtl")
    def getTtl_Boolean(key: Key): Boolean = js.native
    
    /**
    		 * list all keys within this cache
    		 * @param cb Callback function
    		 * @returns An array of all keys
    		 */
    def keys(): js.Array[String] = js.native
    def keys(cb: Callback[js.Array[String]]): js.Array[String] = js.native
    
    /**
    		 * get multiple cached keys at once and change the stats
    		 *
    		 * @param keys an array of keys
    		 * @param cb Callback function
    		 */
    def mget[T](keys: js.Array[Key]): StringDictionary[T] = js.native
    def mget[T](keys: js.Array[Key], cb: Callback[StringDictionary[T]]): StringDictionary[T] = js.native
    
    /**
    		 * set multiple cached keys at once and change the stats
    		 *
    		 * @param keyValueSet  an array of object which includes key,value and ttl
    		 */
    def mset[T](keyValueSet: js.Array[ValueSetItem[T]]): Boolean = js.native
    
    /** module options */
    var options: Options = js.native
    
    def set[T](key: Key, value: T): Boolean = js.native
    def set[T](key: Key, value: T, cb: Callback[Boolean]): Boolean = js.native
    def set[T](key: Key, value: T, ttl: String): Boolean = js.native
    def set[T](key: Key, value: T, ttl: String, cb: Callback[Boolean]): Boolean = js.native
    /**
    		 * set a cached key and change the stats
    		 *
    		 * @param key cache key
    		 * @param value A element to cache. If the option `option.forceString` is `true` the module trys to translate
    		 * it to a serialized JSON
    		 * @param ttl The time to live in seconds.
    		 * @param cb Callback function
    		 */
    def set[T](key: Key, value: T, ttl: Double): Boolean = js.native
    def set[T](key: Key, value: T, ttl: Double, cb: Callback[Boolean]): Boolean = js.native
    
    /** statistics container */
    var stats: Stats = js.native
    
    def ttl(key: Key): Boolean = js.native
    def ttl(key: Key, cb: Callback[Boolean]): Boolean = js.native
    /**
    		 * reset or redefine the ttl of a key. If `ttl` is not passed or set to 0 it's similar to `.del()`
    		 */
    def ttl(key: Key, ttl: Double): Boolean = js.native
    def ttl(key: Key, ttl: Double, cb: Callback[Boolean]): Boolean = js.native
  }
  
  trait Options extends StObject {
    
    var arrayValueSize: js.UndefOr[Double] = js.undefined
    
    /**
    		 * time in seconds to check all data and delete expired keys
    		 *
    		 * @type {number}
    		 * @memberof Options
    		 */
    var checkperiod: js.UndefOr[Double] = js.undefined
    
    var deleteOnExpire: js.UndefOr[Boolean] = js.undefined
    
    /**
    		 * enable legacy callbacks.
    		 * legacy callback support will drop in v6.x!
    		 *
    		 * @type {boolean}
    		 * @memberof Options
    		 */
    var enableLegacyCallbacks: js.UndefOr[Boolean] = js.undefined
    
    var errorOnMissing: js.UndefOr[Boolean] = js.undefined
    
    /**
    		 * If enabled, all values will be stringified during the set operation
    		 *
    		 * @type {boolean}
    		 * @memberof Options
    		 */
    var forceString: js.UndefOr[Boolean] = js.undefined
    
    /**
    		 * max amount of keys that are being stored.
    		 * set operations will throw an error when the cache is full
    		 *
    		 * @type {number}
    		 * @memberof Options
    		 */
    var maxKeys: js.UndefOr[Double] = js.undefined
    
    var objectValueSize: js.UndefOr[Double] = js.undefined
    
    var promiseValueSize: js.UndefOr[Double] = js.undefined
    
    /**
    		 * standard time to live in seconds. 0 = infinity
    		 *
    		 * @type {number}
    		 * @memberof Options
    		 */
    var stdTTL: js.UndefOr[Double] = js.undefined
    
    /**
    		 * en/disable cloning of variables.
    		 * disabling this is strongly encouraged when aiming for performance!
    		 *
    		 * If `true`: set operations store a clone of the value and get operations will create a fresh clone of the cached value
    		 * If `false` you'll just store a reference to your value
    		 *
    		 * @type {boolean}
    		 * @memberof Options
    		 */
    var useClones: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArrayValueSize(value: Double): Self = StObject.set(x, "arrayValueSize", value.asInstanceOf[js.Any])
      
      inline def setArrayValueSizeUndefined: Self = StObject.set(x, "arrayValueSize", js.undefined)
      
      inline def setCheckperiod(value: Double): Self = StObject.set(x, "checkperiod", value.asInstanceOf[js.Any])
      
      inline def setCheckperiodUndefined: Self = StObject.set(x, "checkperiod", js.undefined)
      
      inline def setDeleteOnExpire(value: Boolean): Self = StObject.set(x, "deleteOnExpire", value.asInstanceOf[js.Any])
      
      inline def setDeleteOnExpireUndefined: Self = StObject.set(x, "deleteOnExpire", js.undefined)
      
      inline def setEnableLegacyCallbacks(value: Boolean): Self = StObject.set(x, "enableLegacyCallbacks", value.asInstanceOf[js.Any])
      
      inline def setEnableLegacyCallbacksUndefined: Self = StObject.set(x, "enableLegacyCallbacks", js.undefined)
      
      inline def setErrorOnMissing(value: Boolean): Self = StObject.set(x, "errorOnMissing", value.asInstanceOf[js.Any])
      
      inline def setErrorOnMissingUndefined: Self = StObject.set(x, "errorOnMissing", js.undefined)
      
      inline def setForceString(value: Boolean): Self = StObject.set(x, "forceString", value.asInstanceOf[js.Any])
      
      inline def setForceStringUndefined: Self = StObject.set(x, "forceString", js.undefined)
      
      inline def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
      
      inline def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
      
      inline def setObjectValueSize(value: Double): Self = StObject.set(x, "objectValueSize", value.asInstanceOf[js.Any])
      
      inline def setObjectValueSizeUndefined: Self = StObject.set(x, "objectValueSize", js.undefined)
      
      inline def setPromiseValueSize(value: Double): Self = StObject.set(x, "promiseValueSize", value.asInstanceOf[js.Any])
      
      inline def setPromiseValueSizeUndefined: Self = StObject.set(x, "promiseValueSize", js.undefined)
      
      inline def setStdTTL(value: Double): Self = StObject.set(x, "stdTTL", value.asInstanceOf[js.Any])
      
      inline def setStdTTLUndefined: Self = StObject.set(x, "stdTTL", js.undefined)
      
      inline def setUseClones(value: Boolean): Self = StObject.set(x, "useClones", value.asInstanceOf[js.Any])
      
      inline def setUseClonesUndefined: Self = StObject.set(x, "useClones", js.undefined)
    }
  }
  
  trait Stats extends StObject {
    
    var hits: Double
    
    var keys: Double
    
    var ksize: Double
    
    var misses: Double
    
    var vsize: Double
  }
  object Stats {
    
    inline def apply(hits: Double, keys: Double, ksize: Double, misses: Double, vsize: Double): Stats = {
      val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], ksize = ksize.asInstanceOf[js.Any], misses = misses.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Double): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKsize(value: Double): Self = StObject.set(x, "ksize", value.asInstanceOf[js.Any])
      
      inline def setMisses(value: Double): Self = StObject.set(x, "misses", value.asInstanceOf[js.Any])
      
      inline def setVsize(value: Double): Self = StObject.set(x, "vsize", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueSetItem[T] extends StObject {
    
    var key: Key
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var `val`: T
  }
  object ValueSetItem {
    
    inline def apply[T](key: Key, `val`: T): ValueSetItem[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueSetItem[T]]
    }
    
    extension [Self <: ValueSetItem[?], T](x: Self & ValueSetItem[T]) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setVal(value: T): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  trait WrappedValue[T] extends StObject {
    
    // ttl
    var t: Double
    
    // value
    var v: T
  }
  object WrappedValue {
    
    inline def apply[T](t: Double, v: T): WrappedValue[T] = {
      val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedValue[T]]
    }
    
    extension [Self <: WrappedValue[?], T](x: Self & WrappedValue[T]) {
      
      inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setV(value: T): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
