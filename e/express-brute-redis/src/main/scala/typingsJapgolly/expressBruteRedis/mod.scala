package typingsJapgolly.expressBruteRedis

import typingsJapgolly.expressBruteRedis.anon.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @summary Redis store for Express Brute
    */
  @JSImport("express-brute-redis", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RedisStore {
    /**
      * @summary constructor
      * @param options Options to configure the Redis client.
      */
    def this(
      options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any) & Client,
      args: Any*
    ) = this()
    def this(options: Unit, args: Any*) = this()
  }
  @JSImport("express-brute-redis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("express-brute-redis", "Redis")
  @js.native
  def Redis: Any = js.native
  inline def Redis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Redis")(x.asInstanceOf[js.Any])
  
  /* static member */
  object defaults {
    
    @JSImport("express-brute-redis", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("express-brute-redis", "defaults.host")
    @js.native
    def host: String = js.native
    inline def host_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("host")(x.asInstanceOf[js.Any])
    
    @JSImport("express-brute-redis", "defaults.port")
    @js.native
    def port: String = js.native
    inline def port_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("port")(x.asInstanceOf[js.Any])
    
    @JSImport("express-brute-redis", "defaults.prefix")
    @js.native
    def prefix: String = js.native
    inline def prefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @summary Redis store for Express Brute
    */
  @js.native
  trait RedisStore extends StObject {
    
    /**
      * @summary Gets a key in Redis storage.
      */
    def get(key: String): String | Null = js.native
    def get(key: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): String | Null = js.native
    
    /**
      * @summary Resets a key in Redis storage.
      */
    def reset(key: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit], args: Any*): Unit = js.native
    def reset(key: String, callback: Unit, args: Any*): Unit = js.native
    
    /**
      * @summary Sets a key in Redis storage.
      */
    def set(key: String, value: String): Unit = js.native
    def set(key: String, value: String, lifetime: Double): Unit = js.native
    def set(key: String, value: String, lifetime: Double, callback: js.Function1[/* sender */ this.type, Unit]): Unit = js.native
    def set(key: String, value: String, lifetime: Unit, callback: js.Function1[/* sender */ this.type, Unit]): Unit = js.native
  }
}
