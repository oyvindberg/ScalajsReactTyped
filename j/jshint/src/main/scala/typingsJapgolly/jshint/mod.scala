package typingsJapgolly.jshint

import typingsJapgolly.jshint.anon.Complexity
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object JSHINT {
    
    inline def apply(source: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def apply(source: String, options: Unit, predef: Record[String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], predef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(source: String, options: LintOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(source: String, options: LintOptions, predef: Record[String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], predef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(source: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def apply(source: js.Array[String], options: Unit, predef: Record[String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], predef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(source: js.Array[String], options: LintOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(source: js.Array[String], options: LintOptions, predef: Record[String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], predef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("jshint", "JSHINT")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addModule(func: ModuleFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addModule")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Generate a report containing details about the most recent invocation of JSHINT. */
    inline def data(): js.UndefOr[LintData | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("data")().asInstanceOf[js.UndefOr[LintData | Null]]
    
    /** An array of warnings and errors generated by the most recent invocation of JSHINT. */
    @JSImport("jshint", "JSHINT.errors")
    @js.native
    val errors: js.Array[LintError] = js.native
    
    // Circular reference from jshint.JSHINT
    @JSImport("jshint", "JSHINT.jshint")
    @js.native
    val jshint: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof JSHINT */ Any = js.native
  }
  
  trait ExtensionAPI extends StObject {
    
    def getOption(name: String): Any | Null
    
    val isJSON: Boolean
  }
  object ExtensionAPI {
    
    inline def apply(getOption: String => Any | Null, isJSON: Boolean): ExtensionAPI = {
      val __obj = js.Dynamic.literal(getOption = js.Any.fromFunction1(getOption), isJSON = isJSON.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtensionAPI]
    }
    
    extension [Self <: ExtensionAPI](x: Self) {
      
      inline def setGetOption(value: String => Any | Null): Self = StObject.set(x, "getOption", js.Any.fromFunction1(value))
      
      inline def setIsJSON(value: Boolean): Self = StObject.set(x, "isJSON", value.asInstanceOf[js.Any])
    }
  }
  
  trait LintData extends StObject {
    
    var errors: js.UndefOr[js.Array[LintError]] = js.undefined
    
    var functions: js.UndefOr[js.Array[LintFunction]] = js.undefined
    
    var globals: js.UndefOr[js.Array[String]] = js.undefined
    
    var implieds: js.UndefOr[Any] = js.undefined
    
    /* istanbul ignore next */
    var json: js.UndefOr[Any] = js.undefined
    
    var member: js.UndefOr[Any] = js.undefined
    
    var options: js.UndefOr[LintOptions] = js.undefined
    
    var unused: js.UndefOr[js.Array[LintUnused]] = js.undefined
  }
  object LintData {
    
    inline def apply(): LintData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LintData]
    }
    
    extension [Self <: LintData](x: Self) {
      
      inline def setErrors(value: js.Array[LintError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: LintError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFunctions(value: js.Array[LintFunction]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setFunctionsVarargs(value: LintFunction*): Self = StObject.set(x, "functions", js.Array(value*))
      
      inline def setGlobals(value: js.Array[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setGlobalsVarargs(value: String*): Self = StObject.set(x, "globals", js.Array(value*))
      
      inline def setImplieds(value: Any): Self = StObject.set(x, "implieds", value.asInstanceOf[js.Any])
      
      inline def setImpliedsUndefined: Self = StObject.set(x, "implieds", js.undefined)
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMember(value: Any): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
      
      inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
      
      inline def setOptions(value: LintOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setUnused(value: js.Array[LintUnused]): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
      
      inline def setUnusedUndefined: Self = StObject.set(x, "unused", js.undefined)
      
      inline def setUnusedVarargs(value: LintUnused*): Self = StObject.set(x, "unused", js.Array(value*))
    }
  }
  
  trait LintError extends StObject {
    
    var a: js.UndefOr[Any] = js.undefined
    
    var b: js.UndefOr[Any] = js.undefined
    
    var c: js.UndefOr[Any] = js.undefined
    
    var character: Double
    
    var code: String
    
    var d: js.UndefOr[Any] = js.undefined
    
    var evidence: String
    
    var id: String
    
    var line: Double
    
    var raw: String
    
    var reason: String
    
    var scope: String
  }
  object LintError {
    
    inline def apply(
      character: Double,
      code: String,
      evidence: String,
      id: String,
      line: Double,
      raw: String,
      reason: String,
      scope: String
    ): LintError = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintError]
    }
    
    extension [Self <: LintError](x: Self) {
      
      inline def setA(value: Any): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setB(value: Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setC(value: Any): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      inline def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setD(value: Any): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setEvidence(value: String): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait LintFunction extends StObject {
    
    var character: Double
    
    var last: Double
    
    var lastcharacter: Double
    
    var line: Double
    
    var metrics: Complexity
    
    var name: String
    
    var param: Any
  }
  object LintFunction {
    
    inline def apply(
      character: Double,
      last: Double,
      lastcharacter: Double,
      line: Double,
      metrics: Complexity,
      name: String,
      param: Any
    ): LintFunction = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], lastcharacter = lastcharacter.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintFunction]
    }
    
    extension [Self <: LintFunction](x: Self) {
      
      inline def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastcharacter(value: Double): Self = StObject.set(x, "lastcharacter", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: Complexity): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParam(value: Any): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  type LintOptions = Record[String, Any]
  
  trait LintUnused extends StObject {
    
    var character: Double
    
    var line: Double
    
    var name: String
  }
  object LintUnused {
    
    inline def apply(character: Double, line: Double, name: String): LintUnused = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintUnused]
    }
    
    extension [Self <: LintUnused](x: Self) {
      
      inline def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ModuleFunction = js.Function1[/* api */ ExtensionAPI, Unit]
}
