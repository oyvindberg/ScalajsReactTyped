package typingsJapgolly.protractor.anon

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.seleniumWebdriver.chromeMod.Driver
import typingsJapgolly.seleniumWebdriver.chromeMod.Options
import typingsJapgolly.seleniumWebdriver.httpMod.Executor
import typingsJapgolly.seleniumWebdriver.mod.CreateSessionCapabilities
import typingsJapgolly.seleniumWebdriver.mod.Session
import typingsJapgolly.seleniumWebdriver.remoteMod.DriverService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDriverInstantiable
  extends StObject
     with Instantiable2[/* session */ Session, /* executor */ Executor, Driver] {
  
  /**
    * Creates a new session with the ChromeDriver.
    *
    * @param {(Capabilities|Options)=} opt_config The configuration options.
    * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
    *     a  DriverService to use for the remote end, or a preconfigured executor
    *     for an externally managed endpoint. If neither is provided, the
    *     {@linkplain ##getDefaultService default service} will be used by
    *     default.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): Driver = js.native
  def createSession(opt_config: Unit, opt_service: Executor): Driver = js.native
  def createSession(opt_config: Unit, opt_service: DriverService): Driver = js.native
  def createSession(opt_config: Options): Driver = js.native
  def createSession(opt_config: Options, opt_service: Executor): Driver = js.native
  def createSession(opt_config: Options, opt_service: DriverService): Driver = js.native
  def createSession(opt_config: CreateSessionCapabilities): Driver = js.native
  def createSession(opt_config: CreateSessionCapabilities, opt_service: Executor): Driver = js.native
  def createSession(opt_config: CreateSessionCapabilities, opt_service: DriverService): Driver = js.native
}
