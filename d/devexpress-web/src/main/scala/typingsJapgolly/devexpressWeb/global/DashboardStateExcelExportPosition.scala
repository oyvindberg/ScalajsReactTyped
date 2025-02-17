package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists constants that specify the position of the dashboard state (such as master filter or current parameter values) in the exported Excel document.
  */
@JSGlobal("DashboardStateExcelExportPosition")
@js.native
open class DashboardStateExcelExportPosition ()
  extends StObject
     with typingsJapgolly.devexpressWeb.DashboardStateExcelExportPosition
object DashboardStateExcelExportPosition {
  
  /**
    * The dashboard state is placed below the exported data.
    */
  /* static member */
  @JSGlobal("DashboardStateExcelExportPosition.Below")
  @js.native
  val Below: String = js.native
  
  /**
    * The dashboard state is placed on a separate sheet.
    */
  /* static member */
  @JSGlobal("DashboardStateExcelExportPosition.SeparateSheet")
  @js.native
  val SeparateSheet: String = js.native
}
