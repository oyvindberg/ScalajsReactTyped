package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This struct contains a name-value pair of a document header (i.e. the "subject" field and the appropriate value of a MIME message). */
trait DocumentHeaderField extends StObject {
  
  /** The name of the header field. */
  var Name: String
  
  /** The value of the header field. */
  var Value: String
}
object DocumentHeaderField {
  
  inline def apply(Name: String, Value: String): DocumentHeaderField = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHeaderField]
  }
  
  extension [Self <: DocumentHeaderField](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
