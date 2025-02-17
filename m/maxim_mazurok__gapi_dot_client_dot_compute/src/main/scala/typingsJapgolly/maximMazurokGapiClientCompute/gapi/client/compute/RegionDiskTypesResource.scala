package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.CallbackDiskType
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionDiskTypesResource extends StObject {
  
  /** Returns the specified regional disk type. Gets a list of available disk types by making a list() request. */
  def get(): Request[DiskType] = js.native
  def get(request: CallbackDiskType): Request[DiskType] = js.native
  
  /** Retrieves a list of regional disk types available to the specified project. */
  def list(): Request[RegionDiskTypeList] = js.native
  def list(request: Filter): Request[RegionDiskTypeList] = js.native
}
