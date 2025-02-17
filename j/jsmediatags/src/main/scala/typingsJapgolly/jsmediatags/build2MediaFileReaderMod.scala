package typingsJapgolly.jsmediatags

import typingsJapgolly.jsmediatags.build2StringUtilsMod.DecodedString
import typingsJapgolly.jsmediatags.typesMod.CharsetType
import typingsJapgolly.jsmediatags.typesMod.LoadCallbackType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object build2MediaFileReaderMod {
  
  @JSImport("jsmediatags/build2/MediaFileReader", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MediaFileReader {
    def this(path: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/MediaFileReader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def canReadFile(file: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  trait MediaFileReader extends StObject {
    
    def _init(callbacks: LoadCallbackType): Unit = js.native
    
    var _isInitialized: Boolean = js.native
    
    var _size: Double = js.native
    
    def getByteAt(offset: Double): Double = js.native
    
    def getBytesAt(offset: Double, length: Double): js.Array[Double] = js.native
    
    def getCharAt(offset: Double): String = js.native
    
    def getInteger24At(offset: Double, isBigEndian: Boolean): Double = js.native
    
    def getLongAt(offset: Double, isBigEndian: Boolean): Double = js.native
    
    def getSByteAt(offset: Double): Double = js.native
    
    def getSLongAt(offset: Double, isBigEndian: Boolean): Double = js.native
    
    def getSShortAt(offset: Double, isBigEndian: Boolean): Double = js.native
    
    def getShortAt(offset: Double, isBigEndian: Boolean): Double = js.native
    
    def getSize(): Double = js.native
    
    def getStringAt(offset: Double, length: Double): String = js.native
    
    def getStringWithCharsetAt(offset: Double, length: Double): DecodedString = js.native
    def getStringWithCharsetAt(offset: Double, length: Double, charset: CharsetType): DecodedString = js.native
    
    def getSynchsafeInteger32At(offset: Double): Double = js.native
    
    def init(callbacks: LoadCallbackType): Unit = js.native
    
    def isBitSetAt(offset: Double, bit: Double): Boolean = js.native
    
    def loadRange(range: js.Tuple2[Double, Double], callbacks: LoadCallbackType): Unit = js.native
  }
}
