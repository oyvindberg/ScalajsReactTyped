package typingsJapgolly.keccak

import typingsJapgolly.keccak.mod.KeccakAlgorithm
import typingsJapgolly.keccak.mod.Sha3Algorithm
import typingsJapgolly.keccak.mod.ShakeAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keccakStrings {
  
  @js.native
  sealed trait keccak224
    extends StObject
       with KeccakAlgorithm
  inline def keccak224: keccak224 = "keccak224".asInstanceOf[keccak224]
  
  @js.native
  sealed trait keccak256
    extends StObject
       with KeccakAlgorithm
  inline def keccak256: keccak256 = "keccak256".asInstanceOf[keccak256]
  
  @js.native
  sealed trait keccak384
    extends StObject
       with KeccakAlgorithm
  inline def keccak384: keccak384 = "keccak384".asInstanceOf[keccak384]
  
  @js.native
  sealed trait keccak512
    extends StObject
       with KeccakAlgorithm
  inline def keccak512: keccak512 = "keccak512".asInstanceOf[keccak512]
  
  @js.native
  sealed trait `sha3-224`
    extends StObject
       with Sha3Algorithm
  inline def `sha3-224`: `sha3-224` = "sha3-224".asInstanceOf[`sha3-224`]
  
  @js.native
  sealed trait `sha3-256`
    extends StObject
       with Sha3Algorithm
  inline def `sha3-256`: `sha3-256` = "sha3-256".asInstanceOf[`sha3-256`]
  
  @js.native
  sealed trait `sha3-384`
    extends StObject
       with Sha3Algorithm
  inline def `sha3-384`: `sha3-384` = "sha3-384".asInstanceOf[`sha3-384`]
  
  @js.native
  sealed trait `sha3-512`
    extends StObject
       with Sha3Algorithm
  inline def `sha3-512`: `sha3-512` = "sha3-512".asInstanceOf[`sha3-512`]
  
  @js.native
  sealed trait shake128
    extends StObject
       with ShakeAlgorithm
  inline def shake128: shake128 = "shake128".asInstanceOf[shake128]
  
  @js.native
  sealed trait shake256
    extends StObject
       with ShakeAlgorithm
  inline def shake256: shake256 = "shake256".asInstanceOf[shake256]
}
