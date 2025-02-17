package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.abort
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.transactional
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.undo
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textOnlyTransactional
*/
trait FailureHandlingKind extends StObject
object FailureHandlingKind {
  
  /**
    * Applying the workspace change is simply aborted if one of the changes provided
    * fails. All operations executed before the failing operation stay executed.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "FailureHandlingKind.Abort")
  @js.native
  val Abort: FailureHandlingKind = js.native
  
  /**
    * If the workspace edit contains only textual file changes they are executed transactional.
    * If resource changes (create, rename or delete file) are part of the change the failure
    * handling strategy is abort.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "FailureHandlingKind.TextOnlyTransactional")
  @js.native
  val TextOnlyTransactional: FailureHandlingKind = js.native
  
  /**
    * All operations are executed transactional. That means they either all
    * succeed or no changes at all are applied to the workspace.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "FailureHandlingKind.Transactional")
  @js.native
  val Transactional: FailureHandlingKind = js.native
  
  /**
    * The client tries to undo the operations already executed. But there is no
    * guarantee that this is succeeding.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "FailureHandlingKind.Undo")
  @js.native
  val Undo: FailureHandlingKind = js.native
}
