package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.HistogramResult
import typingsJapgolly.arcgisJsApi.esri.histogramHistogramParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSmartMappingStatisticsHistogramMod extends Shortcut {
  
  @JSImport("esri/smartMapping/statistics/histogram", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[/* params */ histogramHistogramParams, js.Promise[HistogramResult]] = js.native
  
  type _To = js.Function1[/* params */ histogramHistogramParams, js.Promise[HistogramResult]]
  
  /* This means you don't have to write `^`, but can instead just say `esriSmartMappingStatisticsHistogramMod.foo` */
  override def _to: js.Function1[/* params */ histogramHistogramParams, js.Promise[HistogramResult]] = ^
}
