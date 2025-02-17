package typingsJapgolly.confidence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("confidence", "Store")
  @js.native
  /**
    * @constructor
    * @param {any} document - the configuration document for this document store
    */
  open class Store () extends StObject {
    def this(document: Any) = this()
    
    /**
      * Retrieves a value from the configuration document after applying the provided criteria where:
      *   @param {string} key - the requested key path. All keys must begin with '/'. '/' returns the the entire document.
      *   @param {any} criteria - optional object used as criteria for applying filters in the configuration document. Defaults to {}.
      *
      *   @return {any} Returns the value found after applying the criteria. If the key is invalid or not found, returns undefined.
      */
    def get(key: String): Any = js.native
    def get(key: String, criteria: Any): Any = js.native
    
    /**
      * Validates the provided configuration, clears any existing configuration, then loads the configuration where:
      *   @param {any} document - an object containing a confidence configuration object generated from a parsed JSON document. If the document is invlaid, will throw an error.
      */
    def load(document: Any): Unit = js.native
    
    /**
      * Retrieves the metadata (if any) from the configuration document after applying the provided criteria where:
      *   @param {string} key - the requested key path. All keys must begin with '/'. '/' returns the the entire document.
      *   @param {any} criteria - optional object used as criteria for applying filters in the configuration document. Defaults to {}.
      *
      *   @return {any} Returns the metadata found after applying the criteria. If the key is invalid or not found, or if no metadata is available, returns undefined.
      */
    def meta(key: String): Any = js.native
    def meta(key: String, criteria: Any): Any = js.native
  }
}
