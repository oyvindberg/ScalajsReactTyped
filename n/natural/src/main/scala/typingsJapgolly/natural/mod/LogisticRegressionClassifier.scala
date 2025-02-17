package typingsJapgolly.natural.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogisticRegressionClassifier extends StObject {
  
  def addDocument(text: String, stem: String): Unit = js.native
  def addDocument(text: js.Array[String], stem: String): Unit = js.native
  
  def classify(observation: String): String = js.native
  
  var events: EventEmitter = js.native
  
  def getClassifications(observation: String): js.Array[LogisticRegressionClassifierClassification] = js.native
  
  def save(filename: String, callback: LogisticRegressionClassifierCallback): Unit = js.native
  
  def train(): Unit = js.native
}
