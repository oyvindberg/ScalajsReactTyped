package typingsJapgolly.firebaseAppTypes

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import typingsJapgolly.firebaseAppTypes.mod.FirebaseNamespace
import typingsJapgolly.firebaseAppTypes.privateMod.FirebaseService
import typingsJapgolly.firebaseAppTypes.privateMod.FirebaseServiceNamespace
import typingsJapgolly.firebaseUtil.mod.ErrorMap
import typingsJapgolly.firebaseUtil.mod.Observer
import typingsJapgolly.firebaseUtil.mod.Subscribe
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    /**
      * Retrieve an instance of a FirebaseApp.
      *
      * Usage: firebase.app()
      *
      * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
      */
    def apply(): FirebaseApp = js.native
    def apply(name: String): FirebaseApp = js.native
    
    /**
      * For testing FirebaseApp instances:
      *  app() instanceof firebase.app.App
      *
      * DO NOT call this constuctor directly (use firebase.app() instead).
      */
    var App: Instantiable0[FirebaseApp] = js.native
  }
  
  @js.native
  trait Components extends StObject {
    
    /**
      * Use to construct all thrown FirebaseError's.
      */
    var ErrorFactory: Instantiable3[
        /* service */ String, 
        /* serviceName */ String, 
        /* errors */ ErrorMap[/* import warning: RewrittenClass.unapply cls was tparam ErrorCode */ Any], 
        typingsJapgolly.firebaseUtil.mod.ErrorFactory[
          String, 
          /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in / * import warning: RewrittenClass.unapply cls was tparam ErrorCode * / any ]:? @firebase/util.@firebase/util.ErrorData} */ js.Any
        ]
      ] = js.native
    
    /**
      * registered components.
      */
    var components: Map[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ Any
      ] = js.native
    
    /**
      * Just used for testing to start from a fresh namespace.
      */
    def createFirebaseNamespace(): FirebaseNamespace = js.native
    
    /**
      * Create a Subscribe function.  A proxy Observer is created so that
      * events can be sent to single Observer to be fanned out automatically.
      */
    def createSubscribe[T](executor: js.Function1[/* observer */ Observer[T], Unit]): Subscribe[T] = js.native
    def createSubscribe[T](
      executor: js.Function1[/* observer */ Observer[T], Unit],
      onNoObservers: js.Function1[/* observer */ Observer[T], Unit]
    ): Subscribe[T] = js.native
    
    /**
      * Utility exposed for internal testing.
      */
    def deepExtend(target: Any, source: Any): Any = js.native
    
    /**
      * Internal API to install properties on the top-level firebase namespace.
      * @prop props The top level properties of this object are copied to the
      *   namespace.
      */
    def extendNamespace(props: StringDictionary[Any]): Unit = js.native
    
    /**
      * Internal API to register a Firebase Service into the firebase namespace.
      *
      * Each service will create a child namespace (firebase.<name>) which acts as
      * both a namespace for service specific properties, and also as a service
      * accessor function (firebase.<name>() or firebase.<name>(app)).
      *
      * @param name The Firebase Service being registered.
      * @param createService Factory function to create a service instance.
      * @param serviceProperties Properties to copy to the service's namespace.
      * @param appHook All appHooks called before initializeApp returns to caller.
      * @param allowMultipleInstances Whether the registered service supports
      *   multiple instances per app. If not specified, the default is false.
      */
    def registerComponent[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](
      component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<T> */ Any
    ): FirebaseServiceNamespace[FirebaseService] | Null = js.native
    
    /**
      * Internal API to remove an app from the list of registered apps.
      */
    def removeApp(name: String): Unit = js.native
    
    /*
      * Convert service name to factory name to use.
      */
    def useAsService(app: FirebaseApp, serviceName: String): String | Null = js.native
  }
  
  trait Global extends StObject {
    
    var global: Boolean
  }
  object Global {
    
    inline def apply(global: Boolean): Global = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogEvent extends StObject {
    
    def logEvent(eventName: String, eventParams: StringDictionary[Any]): Unit = js.native
    def logEvent(eventName: String, eventParams: StringDictionary[Any], options: Global): Unit = js.native
  }
}
