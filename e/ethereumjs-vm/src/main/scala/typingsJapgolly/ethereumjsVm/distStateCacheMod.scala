package typingsJapgolly.ethereumjsVm

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStateCacheMod {
  
  @JSImport("ethereumjs-vm/dist/state/cache", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Cache {
    def this(trie: Any) = this()
  }
  
  @js.native
  trait Cache extends StObject {
    
    var _cache: Any = js.native
    
    var _checkpoints: js.Array[Any] = js.native
    
    /**
      * Looks up address in underlying trie.
      * @param address - Address of account
      * @param cb - Callback with params (err, account)
      */
    def _lookupAccount(address: Buffer, cb: Any): Unit = js.native
    
    var _trie: Any = js.native
    
    def _update(
      key: Buffer,
      `val`: typingsJapgolly.ethereumjsAccount.mod.default,
      modified: Boolean,
      deleted: Boolean
    ): Unit = js.native
    
    /**
      * Marks current state of cache as checkpoint, which can
      * later on be reverted or commited.
      */
    def checkpoint(): Unit = js.native
    
    /**
      * Clears cache.
      */
    def clear(): Unit = js.native
    
    /**
      * Commits to current state of cache (no effect on trie).
      */
    def commit(): Unit = js.native
    
    /**
      * Marks address as deleted in cache.
      * @param key - Address
      */
    def del(key: Buffer): Unit = js.native
    
    /**
      * Flushes cache by updating accounts that have been modified
      * and removing accounts that have been deleted.
      * @param cb - Callback
      */
    def flush(cb: Any): Unit = js.native
    
    /**
      * Returns the queried account or an empty account.
      * @param key - Address of account
      */
    def get(key: Buffer): typingsJapgolly.ethereumjsAccount.mod.default = js.native
    
    /**
      * Looks up address in cache, if not found, looks it up
      * in the underlying trie.
      * @param key - Address of account
      * @param cb - Callback with params (err, account)
      */
    def getOrLoad(key: Buffer, cb: Any): Unit = js.native
    
    /**
      * Returns the queried account or undefined.
      * @param key - Address of account
      */
    def lookup(key: Buffer): js.UndefOr[typingsJapgolly.ethereumjsAccount.mod.default] = js.native
    
    /**
      * Puts account to cache under its address.
      * @param key - Address of account
      * @param val - Account
      */
    def put(key: Buffer, `val`: typingsJapgolly.ethereumjsAccount.mod.default): Unit = js.native
    def put(key: Buffer, `val`: typingsJapgolly.ethereumjsAccount.mod.default, fromTrie: Boolean): Unit = js.native
    
    /**
      * Revert changes to cache last checkpoint (no effect on trie).
      */
    def revert(): Unit = js.native
    
    /**
      * Warms cache by loading their respective account from trie
      * and putting them in cache.
      * @param addresses - Array of addresses
      * @param cb - Callback
      */
    def warm(addresses: js.Array[String], cb: Any): Unit = js.native
  }
}
