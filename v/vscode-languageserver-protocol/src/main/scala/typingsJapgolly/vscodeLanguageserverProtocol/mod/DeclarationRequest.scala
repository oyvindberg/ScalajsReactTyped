package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdeclarationMod.DeclarationParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdeclarationMod.DeclarationRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdeclaration
import typingsJapgolly.vscodeLanguageserverTypes.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeclarationRequest {
  
  @JSImport("vscode-languageserver-protocol", "DeclarationRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "DeclarationRequest.method")
  @js.native
  val method: textDocumentSlashdeclaration = js.native
  
  @JSImport("vscode-languageserver-protocol", "DeclarationRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DeclarationParams, 
    Declaration | js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink] | Null, 
    js.Array[
      typingsJapgolly.vscodeLanguageserverTypes.mod.Location | typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    DeclarationRegistrationOptions
  ] = js.native
}
