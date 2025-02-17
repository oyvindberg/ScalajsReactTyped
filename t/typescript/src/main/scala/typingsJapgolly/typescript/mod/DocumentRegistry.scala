package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.ModuleKind.CommonJS
import typingsJapgolly.typescript.mod.ModuleKind.ESNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The document registry represents a store of SourceFile objects that can be shared between
  * multiple LanguageService instances. A LanguageService instance holds on the SourceFile (AST)
  * of files in the context.
  * SourceFile objects account for most of the memory usage by the language service. Sharing
  * the same DocumentRegistry instance between different instances of LanguageService allow
  * for more efficient memory utilization since all projects will share at least the library
  * file (lib.d.ts).
  *
  * A more advanced use of the document registry is to serialize sourceFile objects to disk
  * and re-hydrate them when needed.
  *
  * To create a default DocumentRegistry, use createDocumentRegistry to create one, and pass it
  * to all subsequent createLanguageService calls.
  */
@js.native
trait DocumentRegistry extends StObject {
  
  /**
    * Request a stored SourceFile with a given fileName and compilationSettings.
    * The first call to acquire will call createLanguageServiceSourceFile to generate
    * the SourceFile if was not found in the registry.
    *
    * @param fileName The name of the file requested
    * @param compilationSettingsOrHost Some compilation settings like target affects the
    * shape of a the resulting SourceFile. This allows the DocumentRegistry to store
    * multiple copies of the same file for different compilation settings. A minimal
    * resolution cache is needed to fully define a source file's shape when
    * the compilation settings include `module: node16`+, so providing a cache host
    * object should be preferred. A common host is a language service `ConfiguredProject`.
    * @param scriptSnapshot Text of the file. Only used if the file was not found
    * in the registry and a new one was created.
    * @param version Current version of the file. Only used if the file was not found
    * in the registry and a new one was created.
    */
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String
  ): SourceFile = js.native
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind
  ): SourceFile = js.native
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String
  ): SourceFile = js.native
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind
  ): SourceFile = js.native
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def acquireDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String
  ): SourceFile = js.native
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind
  ): SourceFile = js.native
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String
  ): SourceFile = js.native
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind
  ): SourceFile = js.native
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def acquireDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  
  def getKeyForCompilationSettings(settings: CompilerOptions): DocumentRegistryBucketKey = js.native
  
  /**
    * Informs the DocumentRegistry that a file is not needed any longer.
    *
    * Note: It is not allowed to call release on a SourceFile that was not acquired from
    * this registry originally.
    *
    * @param fileName The name of the file to be released
    * @param compilationSettings The compilation settings used to acquire the file
    * @param scriptKind The script kind of the file to be released
    */
  /**@deprecated pass scriptKind and impliedNodeFormat for correctness */
  def releaseDocument(fileName: java.lang.String, compilationSettings: CompilerOptions): Unit = js.native
  def releaseDocument(fileName: java.lang.String, compilationSettings: CompilerOptions, scriptKind: ScriptKind): Unit = js.native
  def releaseDocument(
    fileName: java.lang.String,
    compilationSettings: CompilerOptions,
    scriptKind: ScriptKind,
    impliedNodeFormat: CommonJS
  ): Unit = js.native
  def releaseDocument(
    fileName: java.lang.String,
    compilationSettings: CompilerOptions,
    scriptKind: ScriptKind,
    impliedNodeFormat: ESNext
  ): Unit = js.native
  
  /**
    * @deprecated pass scriptKind for and impliedNodeFormat correctness */
  def releaseDocumentWithKey(path: Path, key: DocumentRegistryBucketKey): Unit = js.native
  def releaseDocumentWithKey(path: Path, key: DocumentRegistryBucketKey, scriptKind: ScriptKind): Unit = js.native
  def releaseDocumentWithKey(path: Path, key: DocumentRegistryBucketKey, scriptKind: ScriptKind, impliedNodeFormat: CommonJS): Unit = js.native
  def releaseDocumentWithKey(path: Path, key: DocumentRegistryBucketKey, scriptKind: ScriptKind, impliedNodeFormat: ESNext): Unit = js.native
  
  def reportStats(): java.lang.String = js.native
  
  /**
    * Request an updated version of an already existing SourceFile with a given fileName
    * and compilationSettings. The update will in-turn call updateLanguageServiceSourceFile
    * to get an updated SourceFile.
    *
    * @param fileName The name of the file requested
    * @param compilationSettingsOrHost Some compilation settings like target affects the
    * shape of a the resulting SourceFile. This allows the DocumentRegistry to store
    * multiple copies of the same file for different compilation settings. A minimal
    * resolution cache is needed to fully define a source file's shape when
    * the compilation settings include `module: node16`+, so providing a cache host
    * object should be preferred. A common host is a language service `ConfiguredProject`.
    * @param scriptSnapshot Text of the file.
    * @param version Current version of the file.
    */
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String
  ): SourceFile = js.native
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind
  ): SourceFile = js.native
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: CompilerOptions,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String
  ): SourceFile = js.native
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind
  ): SourceFile = js.native
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def updateDocument(
    fileName: java.lang.String,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String
  ): SourceFile = js.native
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind
  ): SourceFile = js.native
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: CompilerOptions,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String
  ): SourceFile = js.native
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: Unit,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind
  ): SourceFile = js.native
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: CreateSourceFileOptions
  ): SourceFile = js.native
  def updateDocumentWithKey(
    fileName: java.lang.String,
    path: Path,
    compilationSettingsOrHost: MinimalResolutionCacheHost,
    key: DocumentRegistryBucketKey,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    scriptKind: ScriptKind,
    sourceFileOptions: ScriptTarget
  ): SourceFile = js.native
}
