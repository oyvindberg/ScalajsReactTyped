package typingsJapgolly.winrtUwp.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a static list of media marker types. */
/* note: abstract class */ @JSGlobal("Windows.Media.MediaMarkerTypes")
@js.native
open class MediaMarkerTypes ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.MediaMarkerTypes
object MediaMarkerTypes {
  
  @JSGlobal("Windows.Media.MediaMarkerTypes")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the value of the Bookmark type which is returned as the string "Bookmark" */
  /* static member */
  @JSGlobal("Windows.Media.MediaMarkerTypes.bookmark")
  @js.native
  def bookmark: String = js.native
  inline def bookmark_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bookmark")(x.asInstanceOf[js.Any])
}
