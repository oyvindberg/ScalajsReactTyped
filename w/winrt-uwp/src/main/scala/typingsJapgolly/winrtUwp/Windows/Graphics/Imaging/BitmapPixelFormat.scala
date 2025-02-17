package typingsJapgolly.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapPixelFormat extends StObject
/** Specifies the pixel format of pixel data. Each enumeration value defines a channel ordering, bit depth, and data type. */
@JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
@js.native
object BitmapPixelFormat extends StObject {
  
  /** The pixel format is B8G8R8A8 unsigned integer. */
  @js.native
  sealed trait bgra8
    extends StObject
       with BitmapPixelFormat
  
  /** The pixel format is 16 bpp grayscale. */
  @js.native
  sealed trait gray16
    extends StObject
       with BitmapPixelFormat
  
  /** The pixel format is 8 bpp grayscale. */
  @js.native
  sealed trait gray8
    extends StObject
       with BitmapPixelFormat
  
  /** The pixel format is NV12. */
  @js.native
  sealed trait nv12
    extends StObject
       with BitmapPixelFormat
  
  /** The pixel format is R16B16G16A16 unsigned integer. */
  @js.native
  sealed trait rgba16
    extends StObject
       with BitmapPixelFormat
  
  /** The pixel format is R8G8B8A8 unsigned integer. */
  @js.native
  sealed trait rgba8
    extends StObject
       with BitmapPixelFormat
  
  /** The pixel format is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with BitmapPixelFormat
  
  /** The pixel format is YUY2. */
  @js.native
  sealed trait yuy2
    extends StObject
       with BitmapPixelFormat
}
