package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.std.Set
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.document
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.executionSummary
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.kind
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotebookCell {
  
  @JSImport("vscode-languageserver", "NotebookCell")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    kind: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCellKind,
    document: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri
  ): typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(kind.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell]
  
  inline def diff(
    one: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell,
    two: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell
  ): Set[
    /* keyof vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ kind | document | metadata | executionSummary
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Set[
    /* keyof vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ kind | document | metadata | executionSummary
  ]]
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ Boolean]
}
