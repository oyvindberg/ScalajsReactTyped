package typingsJapgolly.googleCloudSpanner.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.grpcGrpcJs.anon.PartialConsole
import typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import typingsJapgolly.grpcGrpcJs.buildSrcChannelMod.Channel
import typingsJapgolly.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typingsJapgolly.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptingCallInterface
import typingsJapgolly.grpcGrpcJs.buildSrcClientMod.Client
import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity
import typingsJapgolly.grpcGrpcJs.buildSrcMakeClientMod.GrpcObject
import typingsJapgolly.grpcGrpcJs.buildSrcMakeClientMod.PackageDefinition
import typingsJapgolly.grpcGrpcJs.buildSrcMakeClientMod.ServiceClientConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcServerMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofgrpc extends StObject {
  
  var CallCredentials: TypeofCallCredentials = js.native
  
  var Channel: Instantiable3[
    /* target */ String, 
    /* credentials */ ChannelCredentials, 
    /* options */ ChannelOptions, 
    typingsJapgolly.googleGax.mod.grpc.Channel
  ] = js.native
  
  var ChannelCredentials: TypeofChannelCredentials = js.native
  
  var Client: Instantiable2[
    /* address */ String, 
    /* credentials */ ChannelCredentials, 
    typingsJapgolly.googleGax.mod.grpc.Client
  ] = js.native
  
  var InterceptingCall: Instantiable1[
    /* nextCall */ InterceptingCallInterface, 
    typingsJapgolly.googleGax.mod.grpc.InterceptingCall
  ] = js.native
  
  var InterceptorConfigurationError: Instantiable1[
    /* message */ String, 
    typingsJapgolly.googleGax.mod.grpc.InterceptorConfigurationError
  ] = js.native
  
  var ListenerBuilder: Instantiable0[typingsJapgolly.googleGax.mod.grpc.ListenerBuilder] = js.native
  
  var Metadata: TypeofMetadata = js.native
  
  var RequesterBuilder: Instantiable0[typingsJapgolly.googleGax.mod.grpc.RequesterBuilder] = js.native
  
  var Server: Instantiable0[typingsJapgolly.googleGax.mod.grpc.Server] = js.native
  
  var ServerCredentials: TypeofServerCredentials = js.native
  
  var StatusBuilder: Instantiable0[typingsJapgolly.googleGax.mod.grpc.StatusBuilder] = js.native
  
  def addAdminServicesToServer(server: Server): Unit = js.native
  
  def closeClient(client: Client): Unit = js.native
  
  val credentials: Typeofcredentials = js.native
  
  val experimental: Typeofexperimental = js.native
  
  def getChannelzHandlers(): Any = js.native
  
  def getChannelzServiceDefinition(): Any = js.native
  
  def getClientChannel(client: Client): Channel = js.native
  
  def load(filename: Any, format: Any, options: Any): scala.Nothing = js.native
  
  def loadObject(value: Any, options: Any): scala.Nothing = js.native
  
  def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
  
  def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
  def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  
  def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
  def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  
  def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
  
  def setLogger(logger: PartialConsole): Unit = js.native
  
  def waitForClientReady(client: Client, deadline: js.Date, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def waitForClientReady(client: Client, deadline: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
}
