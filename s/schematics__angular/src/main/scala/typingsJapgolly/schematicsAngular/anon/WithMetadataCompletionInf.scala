package typingsJapgolly.schematicsAngular.anon

import typingsJapgolly.schematicsAngular.schematicsAngularBooleans.`true`
import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionEntry
import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionInfoFlags
import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.WithMetadata<@schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.CompletionInfo> */
trait WithMetadataCompletionInf extends StObject {
  
  var entries: js.Array[CompletionEntry]
  
  /** For performance telemetry. */
  var flags: js.UndefOr[CompletionInfoFlags] = js.undefined
  
  /** Not true for all global completions. This will be true if the enclosing scope matches a few syntax kinds. See `isSnippetScope`. */
  var isGlobalCompletion: Boolean
  
  /**
    * Indicates to client to continue requesting completions on subsequent keystrokes.
    */
  var isIncomplete: js.UndefOr[`true`] = js.undefined
  
  var isMemberCompletion: Boolean
  
  /**
    * true when the current location also allows for a new identifier
    */
  var isNewIdentifierLocation: Boolean
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  /**
    * In the absence of `CompletionEntry["replacementSpan"], the editor may choose whether to use
    * this span or its default one. If `CompletionEntry["replacementSpan"]` is defined, that span
    * must be used to commit that completion entry.
    */
  var optionalReplacementSpan: js.UndefOr[TextSpan] = js.undefined
}
object WithMetadataCompletionInf {
  
  inline def apply(
    entries: js.Array[CompletionEntry],
    isGlobalCompletion: Boolean,
    isMemberCompletion: Boolean,
    isNewIdentifierLocation: Boolean
  ): WithMetadataCompletionInf = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], isGlobalCompletion = isGlobalCompletion.asInstanceOf[js.Any], isMemberCompletion = isMemberCompletion.asInstanceOf[js.Any], isNewIdentifierLocation = isNewIdentifierLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithMetadataCompletionInf]
  }
  
  extension [Self <: WithMetadataCompletionInf](x: Self) {
    
    inline def setEntries(value: js.Array[CompletionEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: CompletionEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setFlags(value: CompletionInfoFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setIsGlobalCompletion(value: Boolean): Self = StObject.set(x, "isGlobalCompletion", value.asInstanceOf[js.Any])
    
    inline def setIsIncomplete(value: `true`): Self = StObject.set(x, "isIncomplete", value.asInstanceOf[js.Any])
    
    inline def setIsIncompleteUndefined: Self = StObject.set(x, "isIncomplete", js.undefined)
    
    inline def setIsMemberCompletion(value: Boolean): Self = StObject.set(x, "isMemberCompletion", value.asInstanceOf[js.Any])
    
    inline def setIsNewIdentifierLocation(value: Boolean): Self = StObject.set(x, "isNewIdentifierLocation", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOptionalReplacementSpan(value: TextSpan): Self = StObject.set(x, "optionalReplacementSpan", value.asInstanceOf[js.Any])
    
    inline def setOptionalReplacementSpanUndefined: Self = StObject.set(x, "optionalReplacementSpan", js.undefined)
  }
}
