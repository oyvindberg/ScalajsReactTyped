package typingsJapgolly.dateFnsTz

import typingsJapgolly.dateFnsTz.mod.OptionsWithTZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toDateMod {
  
  inline def apply(argument: String): js.Date = ^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def apply(argument: String, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def apply(argument: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def apply(argument: js.Date, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def apply(argument: Double): js.Date = ^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def apply(argument: Double, options: OptionsWithTZ): js.Date = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  @JSImport("date-fns-tz/toDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
