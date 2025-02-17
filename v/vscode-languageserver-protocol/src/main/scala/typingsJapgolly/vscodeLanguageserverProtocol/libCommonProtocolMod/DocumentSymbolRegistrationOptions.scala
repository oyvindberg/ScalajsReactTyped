package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSymbolRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with DocumentSymbolOptions
object DocumentSymbolRegistrationOptions {
  
  inline def apply(): DocumentSymbolRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[DocumentSymbolRegistrationOptions]
  }
}
