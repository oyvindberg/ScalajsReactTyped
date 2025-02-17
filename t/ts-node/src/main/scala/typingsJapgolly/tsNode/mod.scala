package typingsJapgolly.tsNode

import japgolly.scalajs.react.Callback
import typingsJapgolly.makeError.mod.BaseError
import typingsJapgolly.std.Record
import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI1
import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI2
import typingsJapgolly.tsNode.distReplMod.CreateReplOptions
import typingsJapgolly.tsNode.distReplMod.ReplService
import typingsJapgolly.tsNode.distTsCompilerTypesMod.TSCommon
import typingsJapgolly.tsNode.tsNodeStrings.explicit
import typingsJapgolly.tsNode.tsNodeStrings.node
import typingsJapgolly.typescript.mod.CustomTransformers
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.ParsedCommandLine
import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-node", "REGISTER_INSTANCE")
  @js.native
  val REGISTER_INSTANCE: js.Symbol = js.native
  
  @JSImport("ts-node", "TSError")
  @js.native
  open class TSError protected () extends BaseError {
    def this(diagnosticText: String, diagnosticCodes: js.Array[Double]) = this()
    def this(diagnosticText: String, diagnosticCodes: js.Array[Double], diagnostics: js.Array[Diagnostic]) = this()
    
    var diagnosticCodes: js.Array[Double] = js.native
    
    var diagnosticText: String = js.native
    
    var diagnostics: js.Array[Diagnostic] = js.native
  }
  
  @JSImport("ts-node", "VERSION")
  @js.native
  val VERSION: Any = js.native
  
  inline def create(): Service = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Service]
  inline def create(rawOptions: CreateOptions): Service = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rawOptions.asInstanceOf[js.Any]).asInstanceOf[Service]
  
  @JSImport("ts-node", "createEsmHooks")
  @js.native
  val createEsmHooks: js.Function1[/* tsNodeService */ Service, NodeLoaderHooksAPI1 | NodeLoaderHooksAPI2] = js.native
  
  inline def createRepl(): ReplService = ^.asInstanceOf[js.Dynamic].applyDynamic("createRepl")().asInstanceOf[ReplService]
  inline def createRepl(options: CreateReplOptions): ReplService = ^.asInstanceOf[js.Dynamic].applyDynamic("createRepl")(options.asInstanceOf[js.Any]).asInstanceOf[ReplService]
  
  inline def register(): Service = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Service]
  inline def register(opts: RegisterOptions): Service = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(opts.asInstanceOf[js.Any]).asInstanceOf[Service]
  inline def register(service: Service): Service = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(service.asInstanceOf[js.Any]).asInstanceOf[Service]
  
  trait CreateOptions extends StObject {
    
    /**
      * Specify a custom TypeScript compiler.
      *
      * @default "typescript"
      */
    var compiler: js.UndefOr[String] = js.undefined
    
    /**
      * Use TypeScript's compiler host API instead of the language service API.
      *
      * @default false
      */
    var compilerHost: js.UndefOr[Boolean] = js.undefined
    
    /**
      * JSON object to merge with TypeScript `compilerOptions`.
      *
      * @allOf [{"$ref": "https://schemastore.azurewebsites.net/schemas/json/tsconfig.json#definitions/compilerOptionsDefinition/properties/compilerOptions"}]
      */
    var compilerOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Behave as if invoked within this working directory.  Roughly equivalent to `cd $dir && ts-node ...`
      *
      * @default process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Legacy alias for `cwd`
      *
      * @deprecated use `projectSearchDir` or `cwd`
      */
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * Emit output files into `.ts-node` directory.
      *
      * @default false
      */
    var emit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable native ESM support.
      *
      * For details, see https://typestrong.org/ts-node/docs/imports#native-ecmascript-modules
      */
    var esm: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows the usage of top level await in REPL.
      *
      * Uses node's implementation which accomplishes this with an AST syntax transformation.
      *
      * Enabled by default when tsconfig target is es2018 or above. Set to false to disable.
      *
      * **Note**: setting to `true` when tsconfig target is too low will throw an Error.  Leave as `undefined`
      * to get default, automatic behavior.
      */
    var experimentalReplAwait: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Like node's `--experimental-specifier-resolution`, , but can also be set in your `tsconfig.json` for convenience.
      *
      * For details, see https://nodejs.org/dist/latest-v18.x/docs/api/esm.html#customizing-esm-specifier-resolution-algorithm
      */
    var experimentalSpecifierResolution: js.UndefOr[node | explicit] = js.undefined
    
    /**
      * Allow using voluntary `.ts` file extension in import specifiers.
      *
      * Typically, in ESM projects, import specifiers must have an emit extension, `.js`, `.cjs`, or `.mjs`,
      * and we automatically map to the corresponding `.ts`, `.cts`, or `.mts` source file.  This is the
      * recommended approach.
      *
      * However, if you really want to use `.ts` in import specifiers, and are aware that this may
      * break tooling, you can enable this flag.
      */
    var experimentalTsImportSpecifiers: js.UndefOr[Boolean] = js.undefined
    
    var fileExists: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
    
    /**
      * Load "files" and "include" from `tsconfig.json` on startup.
      *
      * Default is to override `tsconfig.json` "files" and "include" to only include the entrypoint script.
      *
      * @default false
      */
    var files: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Paths which should not be compiled.
      *
      * Each string in the array is converted to a regular expression via `new RegExp()` and tested against source paths prior to compilation.
      *
      * Source paths are normalized to posix-style separators, relative to the directory containing `tsconfig.json` or to cwd if no `tsconfig.json` is loaded.
      *
      * Default is to ignore all node_modules subdirectories.
      *
      * @default ["(?:^|/)node_modules/"]
      */
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Ignore TypeScript warnings by diagnostic code.
      */
    var ignoreDiagnostics: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    /**
      * Logs TypeScript errors to stderr instead of throwing exceptions.
      *
      * @default false
      */
    var logError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Override certain paths to be compiled and executed as CommonJS or ECMAScript modules.
      * When overridden, the tsconfig "module" and package.json "type" fields are overridden, and
      * the file extension is ignored.
      * This is useful if you cannot use .mts, .cts, .mjs, or .cjs file extensions;
      * it achieves the same effect.
      *
      * Each key is a glob pattern following the same rules as tsconfig's "include" array.
      * When multiple patterns match the same file, the last pattern takes precedence.
      *
      * `cjs` overrides matches files to compile and execute as CommonJS.
      * `esm` overrides matches files to compile and execute as native ECMAScript modules.
      * `package` overrides either of the above to default behavior, which obeys package.json "type" and
      * tsconfig.json "module" options.
      */
    var moduleTypes: js.UndefOr[ModuleTypes] = js.undefined
    
    /**
      * Re-order file extensions so that TypeScript imports are preferred.
      *
      * For example, when both `index.js` and `index.ts` exist, enabling this option causes `require('./index')` to resolve to `index.ts` instead of `index.js`
      *
      * @default false
      */
    var preferTsExts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use pretty diagnostic formatter.
      *
      * @default false
      */
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to TypeScript config file or directory containing a `tsconfig.json`.
      * Similar to the `tsc --project` flag: https://www.typescriptlang.org/docs/handbook/compiler-options.html
      */
    var project: js.UndefOr[String] = js.undefined
    
    /**
      * Search for TypeScript config file (`tsconfig.json`) in this or parent directories.
      */
    var projectSearchDir: js.UndefOr[String] = js.undefined
    
    var readFile: js.UndefOr[js.Function1[/* path */ String, js.UndefOr[String]]] = js.undefined
    
    /**
      * Modules to require, like node's `--require` flag.
      *
      * If specified in `tsconfig.json`, the modules will be resolved relative to the `tsconfig.json` file.
      *
      * If specified programmatically, each input string should be pre-resolved to an absolute path for
      * best results.
      */
    var require: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Scope compiler to files within `scopeDir`.
      *
      * @default false
      */
    var scope: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default First of: `tsconfig.json` "rootDir" if specified, directory containing `tsconfig.json`, or cwd if no `tsconfig.json` is loaded.
      */
    var scopeDir: js.UndefOr[String] = js.undefined
    
    /**
      * Skip ignore check, so that compilation will be attempted for all files with matching extensions.
      *
      * @default false
      */
    var skipIgnore: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Skip project config resolution and loading.
      *
      * @default false
      */
    var skipProject: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Transpile with swc instead of the TypeScript compiler, and skip typechecking.
      *
      * Equivalent to setting both `transpileOnly: true` and `transpiler: 'ts-node/transpilers/swc'`
      *
      * For complete instructions: https://typestrong.org/ts-node/docs/transpilers
      */
    var swc: js.UndefOr[Boolean] = js.undefined
    
    var transformers: js.UndefOr[CustomTransformers | (js.Function1[/* p */ Program, CustomTransformers])] = js.undefined
    
    /**
      * Use TypeScript's faster `transpileModule`.
      *
      * @default false
      */
    var transpileOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify a custom transpiler for use with transpileOnly
      */
    var transpiler: js.UndefOr[String | (js.Tuple2[String, js.Object])] = js.undefined
    
    /**
      * A function to collect trace messages from the TypeScript compiler, for example when `traceResolution` is enabled.
      *
      * @default console.log
      */
    var tsTrace: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.undefined
    
    /**
      * **DEPRECATED** Specify type-check is enabled (e.g. `transpileOnly == false`).
      *
      * @default true
      */
    var typeCheck: js.UndefOr[Boolean] = js.undefined
  }
  object CreateOptions {
    
    inline def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    extension [Self <: CreateOptions](x: Self) {
      
      inline def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerHost(value: Boolean): Self = StObject.set(x, "compilerHost", value.asInstanceOf[js.Any])
      
      inline def setCompilerHostUndefined: Self = StObject.set(x, "compilerHost", js.undefined)
      
      inline def setCompilerOptions(value: js.Object): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setEmit(value: Boolean): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
      
      inline def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
      
      inline def setEsm(value: Boolean): Self = StObject.set(x, "esm", value.asInstanceOf[js.Any])
      
      inline def setEsmUndefined: Self = StObject.set(x, "esm", js.undefined)
      
      inline def setExperimentalReplAwait(value: Boolean): Self = StObject.set(x, "experimentalReplAwait", value.asInstanceOf[js.Any])
      
      inline def setExperimentalReplAwaitUndefined: Self = StObject.set(x, "experimentalReplAwait", js.undefined)
      
      inline def setExperimentalSpecifierResolution(value: node | explicit): Self = StObject.set(x, "experimentalSpecifierResolution", value.asInstanceOf[js.Any])
      
      inline def setExperimentalSpecifierResolutionUndefined: Self = StObject.set(x, "experimentalSpecifierResolution", js.undefined)
      
      inline def setExperimentalTsImportSpecifiers(value: Boolean): Self = StObject.set(x, "experimentalTsImportSpecifiers", value.asInstanceOf[js.Any])
      
      inline def setExperimentalTsImportSpecifiersUndefined: Self = StObject.set(x, "experimentalTsImportSpecifiers", js.undefined)
      
      inline def setFileExists(value: /* path */ String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
      
      inline def setFileExistsUndefined: Self = StObject.set(x, "fileExists", js.undefined)
      
      inline def setFiles(value: Boolean): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDiagnostics(value: js.Array[Double | String]): Self = StObject.set(x, "ignoreDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDiagnosticsUndefined: Self = StObject.set(x, "ignoreDiagnostics", js.undefined)
      
      inline def setIgnoreDiagnosticsVarargs(value: (Double | String)*): Self = StObject.set(x, "ignoreDiagnostics", js.Array(value*))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setLogError(value: Boolean): Self = StObject.set(x, "logError", value.asInstanceOf[js.Any])
      
      inline def setLogErrorUndefined: Self = StObject.set(x, "logError", js.undefined)
      
      inline def setModuleTypes(value: ModuleTypes): Self = StObject.set(x, "moduleTypes", value.asInstanceOf[js.Any])
      
      inline def setModuleTypesUndefined: Self = StObject.set(x, "moduleTypes", js.undefined)
      
      inline def setPreferTsExts(value: Boolean): Self = StObject.set(x, "preferTsExts", value.asInstanceOf[js.Any])
      
      inline def setPreferTsExtsUndefined: Self = StObject.set(x, "preferTsExts", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectSearchDir(value: String): Self = StObject.set(x, "projectSearchDir", value.asInstanceOf[js.Any])
      
      inline def setProjectSearchDirUndefined: Self = StObject.set(x, "projectSearchDir", js.undefined)
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setReadFile(value: /* path */ String => js.UndefOr[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
      
      inline def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
      
      inline def setRequire(value: js.Array[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setRequireVarargs(value: String*): Self = StObject.set(x, "require", js.Array(value*))
      
      inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeDir(value: String): Self = StObject.set(x, "scopeDir", value.asInstanceOf[js.Any])
      
      inline def setScopeDirUndefined: Self = StObject.set(x, "scopeDir", js.undefined)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSkipIgnore(value: Boolean): Self = StObject.set(x, "skipIgnore", value.asInstanceOf[js.Any])
      
      inline def setSkipIgnoreUndefined: Self = StObject.set(x, "skipIgnore", js.undefined)
      
      inline def setSkipProject(value: Boolean): Self = StObject.set(x, "skipProject", value.asInstanceOf[js.Any])
      
      inline def setSkipProjectUndefined: Self = StObject.set(x, "skipProject", js.undefined)
      
      inline def setSwc(value: Boolean): Self = StObject.set(x, "swc", value.asInstanceOf[js.Any])
      
      inline def setSwcUndefined: Self = StObject.set(x, "swc", js.undefined)
      
      inline def setTransformers(value: CustomTransformers | (js.Function1[/* p */ Program, CustomTransformers])): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      inline def setTransformersFunction1(value: /* p */ Program => CustomTransformers): Self = StObject.set(x, "transformers", js.Any.fromFunction1(value))
      
      inline def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
      
      inline def setTranspileOnly(value: Boolean): Self = StObject.set(x, "transpileOnly", value.asInstanceOf[js.Any])
      
      inline def setTranspileOnlyUndefined: Self = StObject.set(x, "transpileOnly", js.undefined)
      
      inline def setTranspiler(value: String | (js.Tuple2[String, js.Object])): Self = StObject.set(x, "transpiler", value.asInstanceOf[js.Any])
      
      inline def setTranspilerUndefined: Self = StObject.set(x, "transpiler", js.undefined)
      
      inline def setTsTrace(value: /* str */ String => Callback): Self = StObject.set(x, "tsTrace", js.Any.fromFunction1((t0: /* str */ String) => value(t0).runNow()))
      
      inline def setTsTraceUndefined: Self = StObject.set(x, "tsTrace", js.undefined)
      
      inline def setTypeCheck(value: Boolean): Self = StObject.set(x, "typeCheck", value.asInstanceOf[js.Any])
      
      inline def setTypeCheckUndefined: Self = StObject.set(x, "typeCheck", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tsNode.tsNodeStrings.node
    - typingsJapgolly.tsNode.tsNodeStrings.explicit
  */
  trait ExperimentalSpecifierResolution extends StObject
  object ExperimentalSpecifierResolution {
    
    inline def explicit: typingsJapgolly.tsNode.tsNodeStrings.explicit = "explicit".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.explicit]
    
    inline def node: typingsJapgolly.tsNode.tsNodeStrings.node = "node".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.node]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tsNode.tsNodeStrings.cjs
    - typingsJapgolly.tsNode.tsNodeStrings.esm
    - typingsJapgolly.tsNode.tsNodeStrings._package
  */
  trait ModuleTypeOverride extends StObject
  object ModuleTypeOverride {
    
    inline def _package: typingsJapgolly.tsNode.tsNodeStrings._package = "package".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings._package]
    
    inline def cjs: typingsJapgolly.tsNode.tsNodeStrings.cjs = "cjs".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.cjs]
    
    inline def esm: typingsJapgolly.tsNode.tsNodeStrings.esm = "esm".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.esm]
  }
  
  type ModuleTypes = Record[String, ModuleTypeOverride]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tsNode.tsNodeStrings.nodeesm
    - typingsJapgolly.tsNode.tsNodeStrings.nodecjs
  */
  trait NodeModuleEmitKind extends StObject
  object NodeModuleEmitKind {
    
    inline def nodecjs: typingsJapgolly.tsNode.tsNodeStrings.nodecjs = "nodecjs".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.nodecjs]
    
    inline def nodeesm: typingsJapgolly.tsNode.tsNodeStrings.nodeesm = "nodeesm".asInstanceOf[typingsJapgolly.tsNode.tsNodeStrings.nodeesm]
  }
  
  trait RegisterOptions
    extends StObject
       with CreateOptions {
    
    /**
      * Enable experimental features that re-map imports and require calls to support:
      * `baseUrl`, `paths`, `rootDirs`, `.js` to `.ts` file extension mappings,
      * `outDir` to `rootDir` mappings for composite projects and monorepos.
      *
      * For details, see https://github.com/TypeStrong/ts-node/issues/1514
      */
    var experimentalResolver: js.UndefOr[Boolean] = js.undefined
  }
  object RegisterOptions {
    
    inline def apply(): RegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterOptions]
    }
    
    extension [Self <: RegisterOptions](x: Self) {
      
      inline def setExperimentalResolver(value: Boolean): Self = StObject.set(x, "experimentalResolver", value.asInstanceOf[js.Any])
      
      inline def setExperimentalResolverUndefined: Self = StObject.set(x, "experimentalResolver", js.undefined)
    }
  }
  
  type Register_ = Service
  
  @js.native
  trait Service extends StObject {
    
    def compile(code: String, fileName: String): String = js.native
    def compile(code: String, fileName: String, lineOffset: Double): String = js.native
    
    var config: ParsedCommandLine = js.native
    
    def enabled(): Boolean = js.native
    def enabled(enabled: Boolean): Boolean = js.native
    
    def getTypeInfo(code: String, fileName: String, position: Double): TypeInfo = js.native
    
    def ignored(fileName: String): Boolean = js.native
    
    var options: RegisterOptions = js.native
    
    var ts: TSCommon = js.native
  }
  
  /* Inlined parent std.Omit<ts-node.ts-node.RegisterOptions, 'transformers' | 'readFile' | 'fileExists' | 'skipProject' | 'project' | 'dir' | 'cwd' | 'projectSearchDir' | 'optionBasePaths' | 'tsTrace'> */
  trait TsConfigOptions extends StObject {
    
    var compiler: js.UndefOr[String] = js.undefined
    
    var compilerHost: js.UndefOr[Boolean] = js.undefined
    
    var compilerOptions: js.UndefOr[js.Object] = js.undefined
    
    var emit: js.UndefOr[Boolean] = js.undefined
    
    var esm: js.UndefOr[Boolean] = js.undefined
    
    var experimentalReplAwait: js.UndefOr[Boolean] = js.undefined
    
    var experimentalResolver: js.UndefOr[Boolean] = js.undefined
    
    var experimentalSpecifierResolution: js.UndefOr[node | explicit] = js.undefined
    
    var experimentalTsImportSpecifiers: js.UndefOr[Boolean] = js.undefined
    
    var files: js.UndefOr[Boolean] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreDiagnostics: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    var logError: js.UndefOr[Boolean] = js.undefined
    
    var moduleTypes: js.UndefOr[ModuleTypes] = js.undefined
    
    var preferTsExts: js.UndefOr[Boolean] = js.undefined
    
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    var require: js.UndefOr[js.Array[String]] = js.undefined
    
    var scope: js.UndefOr[Boolean] = js.undefined
    
    var scopeDir: js.UndefOr[String] = js.undefined
    
    var skipIgnore: js.UndefOr[Boolean] = js.undefined
    
    var swc: js.UndefOr[Boolean] = js.undefined
    
    var transpileOnly: js.UndefOr[Boolean] = js.undefined
    
    var transpiler: js.UndefOr[String | (js.Tuple2[String, js.Object])] = js.undefined
    
    var typeCheck: js.UndefOr[Boolean] = js.undefined
  }
  object TsConfigOptions {
    
    inline def apply(): TsConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TsConfigOptions]
    }
    
    extension [Self <: TsConfigOptions](x: Self) {
      
      inline def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerHost(value: Boolean): Self = StObject.set(x, "compilerHost", value.asInstanceOf[js.Any])
      
      inline def setCompilerHostUndefined: Self = StObject.set(x, "compilerHost", js.undefined)
      
      inline def setCompilerOptions(value: js.Object): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setEmit(value: Boolean): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
      
      inline def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
      
      inline def setEsm(value: Boolean): Self = StObject.set(x, "esm", value.asInstanceOf[js.Any])
      
      inline def setEsmUndefined: Self = StObject.set(x, "esm", js.undefined)
      
      inline def setExperimentalReplAwait(value: Boolean): Self = StObject.set(x, "experimentalReplAwait", value.asInstanceOf[js.Any])
      
      inline def setExperimentalReplAwaitUndefined: Self = StObject.set(x, "experimentalReplAwait", js.undefined)
      
      inline def setExperimentalResolver(value: Boolean): Self = StObject.set(x, "experimentalResolver", value.asInstanceOf[js.Any])
      
      inline def setExperimentalResolverUndefined: Self = StObject.set(x, "experimentalResolver", js.undefined)
      
      inline def setExperimentalSpecifierResolution(value: node | explicit): Self = StObject.set(x, "experimentalSpecifierResolution", value.asInstanceOf[js.Any])
      
      inline def setExperimentalSpecifierResolutionUndefined: Self = StObject.set(x, "experimentalSpecifierResolution", js.undefined)
      
      inline def setExperimentalTsImportSpecifiers(value: Boolean): Self = StObject.set(x, "experimentalTsImportSpecifiers", value.asInstanceOf[js.Any])
      
      inline def setExperimentalTsImportSpecifiersUndefined: Self = StObject.set(x, "experimentalTsImportSpecifiers", js.undefined)
      
      inline def setFiles(value: Boolean): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDiagnostics(value: js.Array[Double | String]): Self = StObject.set(x, "ignoreDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDiagnosticsUndefined: Self = StObject.set(x, "ignoreDiagnostics", js.undefined)
      
      inline def setIgnoreDiagnosticsVarargs(value: (Double | String)*): Self = StObject.set(x, "ignoreDiagnostics", js.Array(value*))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setLogError(value: Boolean): Self = StObject.set(x, "logError", value.asInstanceOf[js.Any])
      
      inline def setLogErrorUndefined: Self = StObject.set(x, "logError", js.undefined)
      
      inline def setModuleTypes(value: ModuleTypes): Self = StObject.set(x, "moduleTypes", value.asInstanceOf[js.Any])
      
      inline def setModuleTypesUndefined: Self = StObject.set(x, "moduleTypes", js.undefined)
      
      inline def setPreferTsExts(value: Boolean): Self = StObject.set(x, "preferTsExts", value.asInstanceOf[js.Any])
      
      inline def setPreferTsExtsUndefined: Self = StObject.set(x, "preferTsExts", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setRequire(value: js.Array[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setRequireVarargs(value: String*): Self = StObject.set(x, "require", js.Array(value*))
      
      inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeDir(value: String): Self = StObject.set(x, "scopeDir", value.asInstanceOf[js.Any])
      
      inline def setScopeDirUndefined: Self = StObject.set(x, "scopeDir", js.undefined)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSkipIgnore(value: Boolean): Self = StObject.set(x, "skipIgnore", value.asInstanceOf[js.Any])
      
      inline def setSkipIgnoreUndefined: Self = StObject.set(x, "skipIgnore", js.undefined)
      
      inline def setSwc(value: Boolean): Self = StObject.set(x, "swc", value.asInstanceOf[js.Any])
      
      inline def setSwcUndefined: Self = StObject.set(x, "swc", js.undefined)
      
      inline def setTranspileOnly(value: Boolean): Self = StObject.set(x, "transpileOnly", value.asInstanceOf[js.Any])
      
      inline def setTranspileOnlyUndefined: Self = StObject.set(x, "transpileOnly", js.undefined)
      
      inline def setTranspiler(value: String | (js.Tuple2[String, js.Object])): Self = StObject.set(x, "transpiler", value.asInstanceOf[js.Any])
      
      inline def setTranspilerUndefined: Self = StObject.set(x, "transpiler", js.undefined)
      
      inline def setTypeCheck(value: Boolean): Self = StObject.set(x, "typeCheck", value.asInstanceOf[js.Any])
      
      inline def setTypeCheckUndefined: Self = StObject.set(x, "typeCheck", js.undefined)
    }
  }
  
  trait TypeInfo extends StObject {
    
    var comment: String
    
    var name: String
  }
  object TypeInfo {
    
    inline def apply(comment: String, name: String): TypeInfo = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeInfo]
    }
    
    extension [Self <: TypeInfo](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Expose `REGISTER_INSTANCE` information on node.js `process`.
    */
  object global {
    
    object NodeJS {
      
      @js.native
      trait Process extends StObject
    }
  }
}
