package typingsJapgolly.mockAwsS3.mod

import typingsJapgolly.awsSdk.libMetadataServiceMod.MetadataServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-aws-s3", "MetadataService")
@js.native
/**
  * Creates a new MetadataService object with a given set of options.
  */
open class MetadataService ()
  extends typingsJapgolly.awsSdk.mod.MetadataService {
  def this(options: MetadataServiceOptions) = this()
}
/* static members */
object MetadataService {
  
  @JSImport("mock-aws-s3", "MetadataService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 169.254.169.254
    */
  @JSImport("mock-aws-s3", "MetadataService.host")
  @js.native
  def host: String = js.native
  inline def host_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("host")(x.asInstanceOf[js.Any])
}
