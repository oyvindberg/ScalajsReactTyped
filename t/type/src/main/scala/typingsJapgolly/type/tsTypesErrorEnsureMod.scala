package typingsJapgolly.`type`

import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureDefault
import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesErrorEnsureMod {
  
  @JSImport("type/ts-types/error/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): js.Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Error | Null]
  inline def default(value: Any, options: EnsureBaseOptions & EnsureIsOptional): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  inline def default_Error(value: Any): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  inline def default_Error(
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & EnsureDefault[js.Error]) | EnsureBaseOptions
  ): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Error]
}
