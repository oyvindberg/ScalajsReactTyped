package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashsymbol
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkspaceSymbolParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkspaceSymbolRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbolRequest {
  
  @JSImport("vscode-languageclient", "WorkspaceSymbolRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceSymbolRequest.method")
  @js.native
  val method: workspaceSlashsymbol = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceSymbolRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    WorkspaceSymbolParams, 
    (js.Array[
      typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolInformation | typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol
    ]) | Null, 
    js.Array[
      typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolInformation | typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol
    ], 
    Unit, 
    WorkspaceSymbolRegistrationOptions
  ] = js.native
}
