package typingsJapgolly.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about which Requirement Sets are supported in the current environment.
  */
@js.native
trait RequirementSetSupport extends StObject {
  
  /**
    * Check if the specified requirement set is supported by the Office application.
    * @param name - The requirement set name (e.g., "ExcelApi").
    * @param minVersion - The minimum required version (e.g., "1.4").
    */
  def isSetSupported(name: String): Boolean = js.native
  def isSetSupported(name: String, minVersionNumber: Double): Boolean = js.native
  def isSetSupported(name: String, minVersion: String): Boolean = js.native
}
