package typingsJapgolly.apolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.IService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "Service")
@js.native
open class Service protected ()
  extends typingsJapgolly.apolloProtobufjs.mod.Service {
  /**
    * Constructs a new service instance.
    * @param name Service name
    * @param [options] Service options
    * @throws {TypeError} If arguments are invalid
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[Any]) = this()
}
/* static members */
object Service {
  
  @JSImport("@apollo/protobufjs/minimal", "Service")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a service from a service descriptor.
    * @param name Service name
    * @param json Service descriptor
    * @returns Created service
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IService): typingsJapgolly.apolloProtobufjs.mod.Service = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.Service]
}
