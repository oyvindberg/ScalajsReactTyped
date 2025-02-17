package typingsJapgolly.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spellcheck extends StObject {
  
  def getCorrections(word: String): js.Array[String] = js.native
  def getCorrections(word: String, maxDistance: Double): js.Array[String] = js.native
  
  def isCorrect(word: String): Boolean = js.native
}
