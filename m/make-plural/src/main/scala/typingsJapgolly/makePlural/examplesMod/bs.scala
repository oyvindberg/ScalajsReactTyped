package typingsJapgolly.makePlural.examplesMod

import typingsJapgolly.makePlural.anon.FewOne
import typingsJapgolly.makePlural.anon.Other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bs {
  
  @JSImport("make-plural/examples", "bs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "bs.cardinal")
  @js.native
  def cardinal: FewOne = js.native
  inline def cardinal_=(x: FewOne): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "bs.ordinal")
  @js.native
  def ordinal: Other = js.native
  inline def ordinal_=(x: Other): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
