package typingsJapgolly.awsSdkClientSso

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.URL
import typingsJapgolly.awsSdkFetchHttpHandler.mod.FetchHttpHandler
import typingsJapgolly.awsSdkNodeHttpHandler.mod.NodeHttpHandler
import typingsJapgolly.awsSdkProtocolHttp.distTypesHttpHandlerMod.HttpHandler
import typingsJapgolly.awsSdkSmithyClient.distTypesDefaultsModeMod.DefaultsMode
import typingsJapgolly.awsSdkSmithyClient.distTypesDefaultsModeMod.ResolvedDefaultsMode
import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.Endpoint
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesLoggerMod.Logger
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.StreamCollector
import typingsJapgolly.awsSdkTypes.distTypesTransferMod.RequestHandler
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.BodyLengthCalculator
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Decoder
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Encoder
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfo
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfoProvider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfoProviderOptions
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RetryStrategy
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UrlParser
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UserAgent
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UserAgentPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApiVersion extends StObject {
    
    var apiVersion: String
    
    def base64Decoder(input: String): js.typedarray.Uint8Array
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder
    
    def base64Encoder(input: js.typedarray.Uint8Array): String
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder
    
    def bodyLengthChecker(body: Any): js.UndefOr[Double]
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: BodyLengthCalculator
    
    var customUserAgent: js.UndefOr[String | UserAgent] = js.undefined
    
    def defaultUserAgentProvider(): js.Promise[UserAgent]
    @JSName("defaultUserAgentProvider")
    var defaultUserAgentProvider_Original: Provider[UserAgent]
    
    def defaultsMode(): js.Promise[ResolvedDefaultsMode]
    @JSName("defaultsMode")
    var defaultsMode_Original: Provider[ResolvedDefaultsMode]
    
    var disableHostPrefix: Boolean
    
    var endpoint: js.UndefOr[String | Endpoint | Provider[Endpoint]] = js.undefined
    
    var logger: Logger
    
    var maxAttempts: Double | Provider[Double]
    
    var region: String | Provider[Any]
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: RegionInfoProviderOptions): js.Promise[js.UndefOr[RegionInfo]]
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    var requestHandler: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | FetchHttpHandler
    
    var retryMode: String | Provider[String]
    
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
    
    var runtime: String
    
    var serviceId: String
    
    var sha256: HashConstructor
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array]
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector
    
    var tls: js.UndefOr[Boolean] = js.undefined
    
    def urlParser(url: String): Endpoint
    def urlParser(url: URL): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
    
    var useDualstackEndpoint: Boolean | Provider[Boolean]
    
    var useFipsEndpoint: Boolean | Provider[Boolean]
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder
  }
  object ApiVersion {
    
    inline def apply(
      apiVersion: String,
      base64Decoder: /* input */ String => js.typedarray.Uint8Array,
      base64Encoder: /* input */ js.typedarray.Uint8Array => String,
      bodyLengthChecker: /* body */ Any => js.UndefOr[Double],
      defaultUserAgentProvider: CallbackTo[js.Promise[UserAgent]],
      defaultsMode: CallbackTo[js.Promise[ResolvedDefaultsMode]],
      disableHostPrefix: Boolean,
      logger: Logger,
      maxAttempts: Double | Provider[Double],
      region: String | Provider[Any],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]],
      requestHandler: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | FetchHttpHandler,
      retryMode: String | Provider[String],
      runtime: String,
      serviceId: String,
      sha256: HashConstructor,
      streamCollector: /* stream */ Any => js.Promise[js.typedarray.Uint8Array],
      urlParser: /* url */ String | URL => Endpoint,
      useDualstackEndpoint: Boolean | Provider[Boolean],
      useFipsEndpoint: Boolean | Provider[Boolean],
      utf8Decoder: /* input */ String => js.typedarray.Uint8Array,
      utf8Encoder: /* input */ js.typedarray.Uint8Array => String
    ): ApiVersion = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], base64Decoder = js.Any.fromFunction1(base64Decoder), base64Encoder = js.Any.fromFunction1(base64Encoder), bodyLengthChecker = js.Any.fromFunction1(bodyLengthChecker), defaultUserAgentProvider = defaultUserAgentProvider.toJsFn, defaultsMode = defaultsMode.toJsFn, disableHostPrefix = disableHostPrefix.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), requestHandler = requestHandler.asInstanceOf[js.Any], retryMode = retryMode.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], streamCollector = js.Any.fromFunction1(streamCollector), urlParser = js.Any.fromFunction1(urlParser), useDualstackEndpoint = useDualstackEndpoint.asInstanceOf[js.Any], useFipsEndpoint = useFipsEndpoint.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder), utf8Encoder = js.Any.fromFunction1(utf8Encoder))
      __obj.asInstanceOf[ApiVersion]
    }
    
    extension [Self <: ApiVersion](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setBodyLengthChecker(value: /* body */ Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      inline def setCustomUserAgent(value: String | UserAgent): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
      
      inline def setCustomUserAgentVarargs(value: UserAgentPair*): Self = StObject.set(x, "customUserAgent", js.Array(value*))
      
      inline def setDefaultUserAgentProvider(value: CallbackTo[js.Promise[UserAgent]]): Self = StObject.set(x, "defaultUserAgentProvider", value.toJsFn)
      
      inline def setDefaultsMode(value: CallbackTo[js.Promise[ResolvedDefaultsMode]]): Self = StObject.set(x, "defaultsMode", value.toJsFn)
      
      inline def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String | Endpoint | Provider[Endpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointCallbackTo(value: CallbackTo[js.Promise[Endpoint]]): Self = StObject.set(x, "endpoint", value.toJsFn)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsCallbackTo(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "maxAttempts", value.toJsFn)
      
      inline def setRegion(value: String | Provider[Any]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionCallbackTo(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setRequestHandler(value: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | FetchHttpHandler): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setRetryMode(value: String | Provider[String]): Self = StObject.set(x, "retryMode", value.asInstanceOf[js.Any])
      
      inline def setRetryModeCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "retryMode", value.toJsFn)
      
      inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setStreamCollector(value: /* stream */ Any => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUseDualstackEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useDualstackEndpoint", value.toJsFn)
      
      inline def setUseFipsEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useFipsEndpoint", value.toJsFn)
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      inline def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
    }
  }
  
  trait Base64Decoder extends StObject {
    
    var apiVersion: String
    
    def base64Decoder(input: String): js.typedarray.Uint8Array
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder
    
    def base64Encoder(input: js.typedarray.Uint8Array): String
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder
    
    def bodyLengthChecker(body: Any): js.UndefOr[Double]
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: BodyLengthCalculator
    
    var customUserAgent: js.UndefOr[String | UserAgent] = js.undefined
    
    def defaultUserAgentProvider(): js.Promise[UserAgent]
    @JSName("defaultUserAgentProvider")
    var defaultUserAgentProvider_Original: Provider[UserAgent]
    
    def defaultsMode(): js.Promise[ResolvedDefaultsMode]
    @JSName("defaultsMode")
    var defaultsMode_Original: Provider[ResolvedDefaultsMode]
    
    var disableHostPrefix: Boolean
    
    var endpoint: js.UndefOr[String | Endpoint | Provider[Endpoint]] = js.undefined
    
    var logger: Logger
    
    var maxAttempts: Double | Provider[Double]
    
    var region: String | Provider[String]
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: RegionInfoProviderOptions): js.Promise[js.UndefOr[RegionInfo]]
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    var requestHandler: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | NodeHttpHandler
    
    var retryMode: String | Provider[String]
    
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
    
    var runtime: String
    
    var serviceId: String
    
    var sha256: HashConstructor
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array]
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector
    
    var tls: js.UndefOr[Boolean] = js.undefined
    
    def urlParser(url: String): Endpoint
    def urlParser(url: URL): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
    
    var useDualstackEndpoint: Boolean | Provider[Boolean]
    
    var useFipsEndpoint: Boolean | Provider[Boolean]
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder
  }
  object Base64Decoder {
    
    inline def apply(
      apiVersion: String,
      base64Decoder: /* input */ String => js.typedarray.Uint8Array,
      base64Encoder: /* input */ js.typedarray.Uint8Array => String,
      bodyLengthChecker: /* body */ Any => js.UndefOr[Double],
      defaultUserAgentProvider: CallbackTo[js.Promise[UserAgent]],
      defaultsMode: CallbackTo[js.Promise[ResolvedDefaultsMode]],
      disableHostPrefix: Boolean,
      logger: Logger,
      maxAttempts: Double | Provider[Double],
      region: String | Provider[String],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]],
      requestHandler: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | NodeHttpHandler,
      retryMode: String | Provider[String],
      runtime: String,
      serviceId: String,
      sha256: HashConstructor,
      streamCollector: /* stream */ Any => js.Promise[js.typedarray.Uint8Array],
      urlParser: /* url */ String | URL => Endpoint,
      useDualstackEndpoint: Boolean | Provider[Boolean],
      useFipsEndpoint: Boolean | Provider[Boolean],
      utf8Decoder: /* input */ String => js.typedarray.Uint8Array,
      utf8Encoder: /* input */ js.typedarray.Uint8Array => String
    ): Base64Decoder = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], base64Decoder = js.Any.fromFunction1(base64Decoder), base64Encoder = js.Any.fromFunction1(base64Encoder), bodyLengthChecker = js.Any.fromFunction1(bodyLengthChecker), defaultUserAgentProvider = defaultUserAgentProvider.toJsFn, defaultsMode = defaultsMode.toJsFn, disableHostPrefix = disableHostPrefix.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), requestHandler = requestHandler.asInstanceOf[js.Any], retryMode = retryMode.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], streamCollector = js.Any.fromFunction1(streamCollector), urlParser = js.Any.fromFunction1(urlParser), useDualstackEndpoint = useDualstackEndpoint.asInstanceOf[js.Any], useFipsEndpoint = useFipsEndpoint.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder), utf8Encoder = js.Any.fromFunction1(utf8Encoder))
      __obj.asInstanceOf[Base64Decoder]
    }
    
    extension [Self <: Base64Decoder](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setBodyLengthChecker(value: /* body */ Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      inline def setCustomUserAgent(value: String | UserAgent): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
      
      inline def setCustomUserAgentVarargs(value: UserAgentPair*): Self = StObject.set(x, "customUserAgent", js.Array(value*))
      
      inline def setDefaultUserAgentProvider(value: CallbackTo[js.Promise[UserAgent]]): Self = StObject.set(x, "defaultUserAgentProvider", value.toJsFn)
      
      inline def setDefaultsMode(value: CallbackTo[js.Promise[ResolvedDefaultsMode]]): Self = StObject.set(x, "defaultsMode", value.toJsFn)
      
      inline def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String | Endpoint | Provider[Endpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointCallbackTo(value: CallbackTo[js.Promise[Endpoint]]): Self = StObject.set(x, "endpoint", value.toJsFn)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsCallbackTo(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "maxAttempts", value.toJsFn)
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setRequestHandler(value: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | NodeHttpHandler): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setRetryMode(value: String | Provider[String]): Self = StObject.set(x, "retryMode", value.asInstanceOf[js.Any])
      
      inline def setRetryModeCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "retryMode", value.toJsFn)
      
      inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setStreamCollector(value: /* stream */ Any => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUseDualstackEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useDualstackEndpoint", value.toJsFn)
      
      inline def setUseFipsEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useFipsEndpoint", value.toJsFn)
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      inline def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
    }
  }
  
  trait Base64Encoder extends StObject {
    
    var apiVersion: String
    
    def base64Decoder(input: String): js.typedarray.Uint8Array
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder
    
    def base64Encoder(input: js.typedarray.Uint8Array): String
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder
    
    def bodyLengthChecker(body: Any): js.UndefOr[Double]
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: BodyLengthCalculator
    
    var customUserAgent: js.UndefOr[String | UserAgent] = js.undefined
    
    def defaultUserAgentProvider(): js.Promise[UserAgent]
    @JSName("defaultUserAgentProvider")
    var defaultUserAgentProvider_Original: Provider[UserAgent]
    
    var defaultsMode: DefaultsMode | Provider[DefaultsMode]
    
    var disableHostPrefix: Boolean
    
    var endpoint: js.UndefOr[String | Endpoint | Provider[Endpoint]] = js.undefined
    
    var logger: Logger
    
    var maxAttempts: Double | Provider[Double]
    
    var region: String | Provider[Any]
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: RegionInfoProviderOptions): js.Promise[js.UndefOr[RegionInfo]]
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    var requestHandler: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | FetchHttpHandler
    
    var retryMode: String | Provider[String]
    
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
    
    var runtime: String
    
    var serviceId: String
    
    var sha256: HashConstructor
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array]
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector
    
    var tls: js.UndefOr[Boolean] = js.undefined
    
    def urlParser(url: String): Endpoint
    def urlParser(url: URL): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
    
    var useDualstackEndpoint: Boolean | Provider[Boolean]
    
    var useFipsEndpoint: Boolean | Provider[Boolean]
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder
  }
  object Base64Encoder {
    
    inline def apply(
      apiVersion: String,
      base64Decoder: /* input */ String => js.typedarray.Uint8Array,
      base64Encoder: /* input */ js.typedarray.Uint8Array => String,
      bodyLengthChecker: /* body */ Any => js.UndefOr[Double],
      defaultUserAgentProvider: CallbackTo[js.Promise[UserAgent]],
      defaultsMode: DefaultsMode | Provider[DefaultsMode],
      disableHostPrefix: Boolean,
      logger: Logger,
      maxAttempts: Double | Provider[Double],
      region: String | Provider[Any],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]],
      requestHandler: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | FetchHttpHandler,
      retryMode: String | Provider[String],
      runtime: String,
      serviceId: String,
      sha256: HashConstructor,
      streamCollector: /* stream */ Any => js.Promise[js.typedarray.Uint8Array],
      urlParser: /* url */ String | URL => Endpoint,
      useDualstackEndpoint: Boolean | Provider[Boolean],
      useFipsEndpoint: Boolean | Provider[Boolean],
      utf8Decoder: /* input */ String => js.typedarray.Uint8Array,
      utf8Encoder: /* input */ js.typedarray.Uint8Array => String
    ): Base64Encoder = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], base64Decoder = js.Any.fromFunction1(base64Decoder), base64Encoder = js.Any.fromFunction1(base64Encoder), bodyLengthChecker = js.Any.fromFunction1(bodyLengthChecker), defaultUserAgentProvider = defaultUserAgentProvider.toJsFn, defaultsMode = defaultsMode.asInstanceOf[js.Any], disableHostPrefix = disableHostPrefix.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), requestHandler = requestHandler.asInstanceOf[js.Any], retryMode = retryMode.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], streamCollector = js.Any.fromFunction1(streamCollector), urlParser = js.Any.fromFunction1(urlParser), useDualstackEndpoint = useDualstackEndpoint.asInstanceOf[js.Any], useFipsEndpoint = useFipsEndpoint.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder), utf8Encoder = js.Any.fromFunction1(utf8Encoder))
      __obj.asInstanceOf[Base64Encoder]
    }
    
    extension [Self <: Base64Encoder](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setBodyLengthChecker(value: /* body */ Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      inline def setCustomUserAgent(value: String | UserAgent): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
      
      inline def setCustomUserAgentVarargs(value: UserAgentPair*): Self = StObject.set(x, "customUserAgent", js.Array(value*))
      
      inline def setDefaultUserAgentProvider(value: CallbackTo[js.Promise[UserAgent]]): Self = StObject.set(x, "defaultUserAgentProvider", value.toJsFn)
      
      inline def setDefaultsMode(value: DefaultsMode | Provider[DefaultsMode]): Self = StObject.set(x, "defaultsMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultsModeCallbackTo(value: CallbackTo[js.Promise[DefaultsMode]]): Self = StObject.set(x, "defaultsMode", value.toJsFn)
      
      inline def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String | Endpoint | Provider[Endpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointCallbackTo(value: CallbackTo[js.Promise[Endpoint]]): Self = StObject.set(x, "endpoint", value.toJsFn)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsCallbackTo(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "maxAttempts", value.toJsFn)
      
      inline def setRegion(value: String | Provider[Any]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionCallbackTo(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setRequestHandler(value: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | FetchHttpHandler): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setRetryMode(value: String | Provider[String]): Self = StObject.set(x, "retryMode", value.asInstanceOf[js.Any])
      
      inline def setRetryModeCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "retryMode", value.toJsFn)
      
      inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setStreamCollector(value: /* stream */ Any => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUseDualstackEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useDualstackEndpoint", value.toJsFn)
      
      inline def setUseFipsEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useFipsEndpoint", value.toJsFn)
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      inline def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
    }
  }
  
  trait DisableHostPrefix extends StObject {
    
    var apiVersion: String
    
    var disableHostPrefix: Boolean
    
    var logger: Logger
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: RegionInfoProviderOptions): js.Promise[js.UndefOr[RegionInfo]]
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    var serviceId: String
    
    def urlParser(url: String): Endpoint
    def urlParser(url: URL): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
  }
  object DisableHostPrefix {
    
    inline def apply(
      apiVersion: String,
      disableHostPrefix: Boolean,
      logger: Logger,
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]],
      serviceId: String,
      urlParser: /* url */ String | URL => Endpoint
    ): DisableHostPrefix = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], disableHostPrefix = disableHostPrefix.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), serviceId = serviceId.asInstanceOf[js.Any], urlParser = js.Any.fromFunction1(urlParser))
      __obj.asInstanceOf[DisableHostPrefix]
    }
    
    extension [Self <: DisableHostPrefix](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/models_0.InvalidRequestException, @aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/SSOServiceException.SSOServiceException> */
  trait ExceptionOptionTypeInvali extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeInvali {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeInvali = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeInvali]
    }
    
    extension [Self <: ExceptionOptionTypeInvali](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/models_0.ResourceNotFoundException, @aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/SSOServiceException.SSOServiceException> */
  trait ExceptionOptionTypeResour extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeResour {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeResour = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeResour]
    }
    
    extension [Self <: ExceptionOptionTypeResour](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/models_0.TooManyRequestsException, @aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/SSOServiceException.SSOServiceException> */
  trait ExceptionOptionTypeTooMan extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeTooMan {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeTooMan = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeTooMan]
    }
    
    extension [Self <: ExceptionOptionTypeTooMan](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/models_0.UnauthorizedException, @aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/SSOServiceException.SSOServiceException> */
  trait ExceptionOptionTypeUnauth extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeUnauth {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeUnauth = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeUnauth]
    }
    
    extension [Self <: ExceptionOptionTypeUnauth](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
