package typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a provider of symmetric key algorithms. For more information, see Cryptographic keys. */
trait SymmetricKeyAlgorithmProvider extends StObject {
  
  /** Gets the name of the open symmetric algorithm. */
  var algorithmName: String
  
  /** Gets the size, in bytes, of the cipher block for the open algorithm. */
  var blockLength: Double
  
  /**
    * Creates a symmetric key.
    * @param keyMaterial Data used to generate the key. You can call the GenerateRandom method to create random key material.
    * @return Symmetric key.
    */
  def createSymmetricKey(keyMaterial: IBuffer): CryptographicKey
}
object SymmetricKeyAlgorithmProvider {
  
  inline def apply(algorithmName: String, blockLength: Double, createSymmetricKey: IBuffer => CryptographicKey): SymmetricKeyAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], blockLength = blockLength.asInstanceOf[js.Any], createSymmetricKey = js.Any.fromFunction1(createSymmetricKey))
    __obj.asInstanceOf[SymmetricKeyAlgorithmProvider]
  }
  
  extension [Self <: SymmetricKeyAlgorithmProvider](x: Self) {
    
    inline def setAlgorithmName(value: String): Self = StObject.set(x, "algorithmName", value.asInstanceOf[js.Any])
    
    inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    inline def setCreateSymmetricKey(value: IBuffer => CryptographicKey): Self = StObject.set(x, "createSymmetricKey", js.Any.fromFunction1(value))
  }
}
