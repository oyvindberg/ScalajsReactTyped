package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The builder that can handle the changes in program and iterate through changed file to emit the files
  * The semantic diagnostics are cached per file and managed by clearing for the changed/affected files
  */
@js.native
trait EmitAndSemanticDiagnosticsBuilderProgram
  extends StObject
     with SemanticDiagnosticsBuilderProgram {
  
  /**
    * Emits the next affected file's emit result (EmitResult and sourceFiles emitted) or returns undefined if iteration is complete
    * The first of writeFile if provided, writeFile of BuilderProgramHost if provided, writeFile of compiler host
    * in that order would be used to write the files
    */
  def emitNextAffectedFile(): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(writeFile: Unit, cancellationToken: Unit, emitOnlyDtsFiles: Boolean): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(
    writeFile: Unit,
    cancellationToken: Unit,
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(
    writeFile: Unit,
    cancellationToken: Unit,
    emitOnlyDtsFiles: Unit,
    customTransformers: CustomTransformers
  ): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(writeFile: Unit, cancellationToken: CancellationToken): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(writeFile: Unit, cancellationToken: CancellationToken, emitOnlyDtsFiles: Boolean): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(
    writeFile: Unit,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(
    writeFile: Unit,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Unit,
    customTransformers: CustomTransformers
  ): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(writeFile: WriteFileCallback): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(writeFile: WriteFileCallback, cancellationToken: Unit, emitOnlyDtsFiles: Boolean): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(
    writeFile: WriteFileCallback,
    cancellationToken: Unit,
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(
    writeFile: WriteFileCallback,
    cancellationToken: Unit,
    emitOnlyDtsFiles: Unit,
    customTransformers: CustomTransformers
  ): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(writeFile: WriteFileCallback, cancellationToken: CancellationToken): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(writeFile: WriteFileCallback, cancellationToken: CancellationToken, emitOnlyDtsFiles: Boolean): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Unit,
    customTransformers: CustomTransformers
  ): AffectedFileResult[EmitResult] = js.native
}
