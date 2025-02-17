package typingsJapgolly.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclOCB2Mode extends StObject {
  
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: Unit, tlen: Double): BitArray_ = js.native
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: Unit, tlen: Double, premac: Boolean): BitArray_ = js.native
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: Unit, tlen: Unit, premac: Boolean): BitArray_ = js.native
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext: BitArray_,
    iv: BitArray_,
    adata: BitArray_,
    tlen: Double,
    premac: Boolean
  ): BitArray_ = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext: BitArray_,
    iv: BitArray_,
    adata: BitArray_,
    tlen: Unit,
    premac: Boolean
  ): BitArray_ = js.native
  
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: Unit, tlen: Double): BitArray_ = js.native
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: Unit, tlen: Double, premac: Boolean): BitArray_ = js.native
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: Unit, tlen: Unit, premac: Boolean): BitArray_ = js.native
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext: BitArray_,
    iv: BitArray_,
    adata: BitArray_,
    tlen: Double,
    premac: Boolean
  ): BitArray_ = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext: BitArray_,
    iv: BitArray_,
    adata: BitArray_,
    tlen: Unit,
    premac: Boolean
  ): BitArray_ = js.native
  
  def pmac(prf: SjclCipher, adata: BitArray_): js.Array[Double] = js.native
}
