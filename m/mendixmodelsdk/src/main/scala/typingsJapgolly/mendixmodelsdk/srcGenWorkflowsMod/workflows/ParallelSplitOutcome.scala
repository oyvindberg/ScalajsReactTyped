package typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.IOutcome because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.IParallelSplitOutcome because var conflicts: containerAsConditionOutcomeActivity, containerAsParallelSplitActivity, containerAsUserTask, flow, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.ParallelSplitOutcome")
@js.native
open class ParallelSplitOutcome protected () extends Outcome {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsParallelSplitActivity")
  def containerAsParallelSplitActivity_MParallelSplitOutcome: ParallelSplitActivity = js.native
}
object ParallelSplitOutcome {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.ParallelSplitOutcome")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ParallelSplitOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ParallelSplitOutcome]
  
  /**
    * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
    * The new ParallelSplitOutcome will be automatically stored in the 'outcomes' property
    * of the parent ParallelSplitActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: ParallelSplitActivity): ParallelSplitOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ParallelSplitOutcome]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.ParallelSplitOutcome.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.ParallelSplitOutcome.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
