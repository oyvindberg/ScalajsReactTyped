package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classifier extends StObject {
  
  /**
    * Gives lexical classifications of tokens on a line without any syntactic context.
    * For instance, a token consisting of the text 'string' can be either an identifier
    * named 'string' or the keyword 'string', however, because this classifier is not aware,
    * it relies on certain heuristics to give acceptable results. For classifications where
    * speed trumps accuracy, this function is preferable; however, for true accuracy, the
    * syntactic classifier is ideal. In fact, in certain editing scenarios, combining the
    * lexical, syntactic, and semantic classifiers may issue the best user experience.
    *
    * @param text                      The text of a line to classify.
    * @param lexState                  The state of the lexical classifier at the end of the previous line.
    * @param syntacticClassifierAbsent Whether the client is *not* using a syntactic classifier.
    *                                  If there is no syntactic classifier (syntacticClassifierAbsent=true),
    *                                  certain heuristics may be used in its place; however, if there is a
    *                                  syntactic classifier (syntacticClassifierAbsent=false), certain
    *                                  classifications which may be incorrectly categorized will be given
    *                                  back as Identifiers in order to allow the syntactic classifier to
    *                                  subsume the classification.
    * @deprecated Use getLexicalClassifications instead.
    */
  def getClassificationsForLine(text: java.lang.String, lexState: EndOfLineState, syntacticClassifierAbsent: Boolean): ClassificationResult
  
  def getEncodedLexicalClassifications(text: java.lang.String, endOfLineState: EndOfLineState, syntacticClassifierAbsent: Boolean): Classifications
}
object Classifier {
  
  inline def apply(
    getClassificationsForLine: (java.lang.String, EndOfLineState, Boolean) => ClassificationResult,
    getEncodedLexicalClassifications: (java.lang.String, EndOfLineState, Boolean) => Classifications
  ): Classifier = {
    val __obj = js.Dynamic.literal(getClassificationsForLine = js.Any.fromFunction3(getClassificationsForLine), getEncodedLexicalClassifications = js.Any.fromFunction3(getEncodedLexicalClassifications))
    __obj.asInstanceOf[Classifier]
  }
  
  extension [Self <: Classifier](x: Self) {
    
    inline def setGetClassificationsForLine(value: (java.lang.String, EndOfLineState, Boolean) => ClassificationResult): Self = StObject.set(x, "getClassificationsForLine", js.Any.fromFunction3(value))
    
    inline def setGetEncodedLexicalClassifications(value: (java.lang.String, EndOfLineState, Boolean) => Classifications): Self = StObject.set(x, "getEncodedLexicalClassifications", js.Any.fromFunction3(value))
  }
}
