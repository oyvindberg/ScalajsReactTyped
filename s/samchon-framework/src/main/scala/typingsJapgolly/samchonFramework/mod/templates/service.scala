package typingsJapgolly.samchonFramework.mod.templates

import typingsJapgolly.samchon.protocolCommunicatorClientDriverWebClientDriverMod.WebClientDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object service {
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.service.Client")
  @js.native
  open class Client protected ()
    extends typingsJapgolly.samchon.mod.templates.service.Client {
    /**
      * Construct from parent {@link User} and communicator.
      *
      * @param user Parent {@link User} object.
      * @param driver Communicator with remote client.
      */
    def this(user: typingsJapgolly.samchon.templatesServiceUserMod.User, driver: WebClientDriver) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.service.Server")
  @js.native
  /**
    * Default Constructor.
    */
  open class Server ()
    extends typingsJapgolly.samchon.mod.templates.service.Server
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.service.Service")
  @js.native
  open class Service protected ()
    extends typingsJapgolly.samchon.mod.templates.service.Service {
    /**
      * Construct from parent {@link Client} and requested path.
      *
      * @param client Driver of remote client.
      * @param path Requested path that identifies this {@link Service}.
      */
    def this(client: typingsJapgolly.samchon.templatesServiceClientMod.Client, path: String) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.service.User")
  @js.native
  open class User protected ()
    extends typingsJapgolly.samchon.mod.templates.service.User {
    /**
      * Construct from its parent {@link Server}.
      *
      * @param server The parent {@link Server} object.
      */
    def this(server: typingsJapgolly.samchon.templatesServiceServerMod.Server) = this()
  }
}
