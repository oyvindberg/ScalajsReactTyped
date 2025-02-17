package typingsJapgolly.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclCipherEncrypted
  extends StObject
     with SjclCipherEncryptParams {
  
  var ct: BitArray_
  
  var kemtag: js.UndefOr[BitArray_] = js.undefined
}
object SjclCipherEncrypted {
  
  inline def apply(ct: BitArray_, iv: BitArray_, salt: BitArray_): SjclCipherEncrypted = {
    val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherEncrypted]
  }
  
  extension [Self <: SjclCipherEncrypted](x: Self) {
    
    inline def setCt(value: BitArray_): Self = StObject.set(x, "ct", value.asInstanceOf[js.Any])
    
    inline def setCtVarargs(value: Double*): Self = StObject.set(x, "ct", js.Array(value*))
    
    inline def setKemtag(value: BitArray_): Self = StObject.set(x, "kemtag", value.asInstanceOf[js.Any])
    
    inline def setKemtagUndefined: Self = StObject.set(x, "kemtag", js.undefined)
    
    inline def setKemtagVarargs(value: Double*): Self = StObject.set(x, "kemtag", js.Array(value*))
  }
}
