package typingsJapgolly.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapFlip extends StObject
@JSGlobal("Windows.Graphics.Imaging.BitmapFlip")
@js.native
object BitmapFlip extends StObject {
  
  @js.native
  sealed trait horizontal
    extends StObject
       with BitmapFlip
  
  @js.native
  sealed trait none
    extends StObject
       with BitmapFlip
  
  @js.native
  sealed trait vertical
    extends StObject
       with BitmapFlip
}
