package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.TypedRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesReturnUndefinedRuleMod {
  
  @JSImport("tslint/lib/rules/returnUndefinedRule", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/returnUndefinedRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/returnUndefinedRule", "Rule.FAILURE_STRING_VALUE_RETURN")
    @js.native
    def FAILURE_STRING_VALUE_RETURN: String = js.native
    inline def FAILURE_STRING_VALUE_RETURN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_VALUE_RETURN")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/returnUndefinedRule", "Rule.FAILURE_STRING_VOID_RETURN")
    @js.native
    def FAILURE_STRING_VOID_RETURN: String = js.native
    inline def FAILURE_STRING_VOID_RETURN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_VOID_RETURN")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/returnUndefinedRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
