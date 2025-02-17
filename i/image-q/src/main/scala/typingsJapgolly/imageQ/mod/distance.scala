package typingsJapgolly.imageQ.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distance {
  
  /* note: abstract class */ @JSImport("image-q", "distance.AbstractDistanceCalculator")
  @js.native
  open class AbstractDistanceCalculator ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.AbstractDistanceCalculator
  
  /* note: abstract class */ @JSImport("image-q", "distance.AbstractEuclidean")
  @js.native
  open class AbstractEuclidean ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.AbstractEuclidean
  
  /* note: abstract class */ @JSImport("image-q", "distance.AbstractManhattan")
  @js.native
  open class AbstractManhattan ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.AbstractManhattan
  
  @JSImport("image-q", "distance.CIE94GraphicArts")
  @js.native
  open class CIE94GraphicArts ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.CIE94GraphicArts
  
  @JSImport("image-q", "distance.CIE94Textiles")
  @js.native
  open class CIE94Textiles ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.CIE94Textiles
  
  @JSImport("image-q", "distance.CIEDE2000")
  @js.native
  open class CIEDE2000 ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.CIEDE2000
  /* static members */
  object CIEDE2000 {
    
    @JSImport("image-q", "distance.CIEDE2000")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._calculateRT")
    @js.native
    def _calculateRT: Any = js.native
    inline def _calculateRT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_calculateRT")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q", "distance.CIEDE2000._calculateT")
    @js.native
    def _calculateT: Any = js.native
    inline def _calculateT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_calculateT")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q", "distance.CIEDE2000._calculate_ahp")
    @js.native
    def _calculate_ahp: Any = js.native
    inline def _calculate_ahp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_calculate_ahp")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q", "distance.CIEDE2000._calculate_dHp")
    @js.native
    def _calculate_dHp: Any = js.native
    inline def _calculate_dHp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_calculate_dHp")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q", "distance.CIEDE2000._calculatehp")
    @js.native
    def _calculatehp: Any = js.native
    inline def _calculatehp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_calculatehp")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q", "distance.CIEDE2000._deg180InRad")
    @js.native
    val _deg180InRad: Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg25InRad")
    @js.native
    val _deg25InRad: Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg275InRad")
    @js.native
    val _deg275InRad: Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg30InRad")
    @js.native
    val _deg30InRad: Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg360InRad")
    @js.native
    val _deg360InRad: Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg63InRad")
    @js.native
    val _deg63InRad: Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg6InRad")
    @js.native
    val _deg6InRad: Any = js.native
    
    /**
      * Weight in distance: 0.25
      * Max DeltaE: 100
      * Max DeltaA: 255
      */
    @JSImport("image-q", "distance.CIEDE2000._kA")
    @js.native
    val _kA: Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._pow25to7")
    @js.native
    val _pow25to7: Any = js.native
  }
  
  @JSImport("image-q", "distance.CMetric")
  @js.native
  open class CMetric ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.CMetric
  
  @JSImport("image-q", "distance.Euclidean")
  @js.native
  open class Euclidean ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.Euclidean
  
  @JSImport("image-q", "distance.EuclideanBT709")
  @js.native
  open class EuclideanBT709 ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.EuclideanBT709
  
  @JSImport("image-q", "distance.EuclideanBT709NoAlpha")
  @js.native
  open class EuclideanBT709NoAlpha ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.EuclideanBT709NoAlpha
  
  @JSImport("image-q", "distance.Manhattan")
  @js.native
  open class Manhattan ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.Manhattan
  
  @JSImport("image-q", "distance.ManhattanBT709")
  @js.native
  open class ManhattanBT709 ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.ManhattanBT709
  
  @JSImport("image-q", "distance.ManhattanNommyde")
  @js.native
  open class ManhattanNommyde ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.ManhattanNommyde
  
  @JSImport("image-q", "distance.PNGQuant")
  @js.native
  open class PNGQuant ()
    extends typingsJapgolly.imageQ.distTypesSrcDistanceMod.PNGQuant
}
