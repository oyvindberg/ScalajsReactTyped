package typingsJapgolly.mockAwsS3.mod

import typingsJapgolly.awsSdk.libCredentialsCredentialProviderChainMod.provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-aws-s3", "CredentialProviderChain")
@js.native
/**
  * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
  */
open class CredentialProviderChain ()
  extends typingsJapgolly.awsSdk.mod.CredentialProviderChain {
  def this(providers: js.Array[provider]) = this()
}
/* static members */
object CredentialProviderChain {
  
  @JSImport("mock-aws-s3", "CredentialProviderChain")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mock-aws-s3", "CredentialProviderChain.defaultProviders")
  @js.native
  def defaultProviders: js.Array[provider] = js.native
  inline def defaultProviders_=(x: js.Array[provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProviders")(x.asInstanceOf[js.Any])
}
