package typingsJapgolly.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactLoaderSpinner.distEsmTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderTriangleMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/Triangle", JSImport.Default)
  @js.native
  val default: FunctionComponent[TriangleProps] = js.native
  
  type TriangleProps = BaseProps
  
  type _To = FunctionComponent[TriangleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsmLoaderTriangleMod.foo` */
  override def _to: FunctionComponent[TriangleProps] = default
}
