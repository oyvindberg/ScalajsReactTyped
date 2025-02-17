package typingsJapgolly.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadonlyMap[K, V] extends StObject {
  
  /**
    * Returns an iterable of key, value pairs for every entry in the map.
    */
  def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
  
  def forEach(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ ReadonlyMap[K, V], Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ ReadonlyMap[K, V], Unit],
    thisArg: Any
  ): Unit = js.native
  
  def get(key: K): js.UndefOr[V] = js.native
  
  def has(key: K): scala.Boolean = js.native
  
  /** Returns an iterable of entries in the map. */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
  
  /**
    * Returns an iterable of keys in the map
    */
  def keys(): IterableIterator[K] = js.native
  
  val size: Double = js.native
  
  /**
    * Returns an iterable of values in the map
    */
  def values(): IterableIterator[V] = js.native
}
