package typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.RuleSplitCondition")
@js.native
open class RuleSplitCondition protected () extends SplitCondition {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def ruleCall: RuleCall = js.native
  def ruleCall_=(newValue: RuleCall): Unit = js.native
}
object RuleSplitCondition {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.RuleSplitCondition")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RuleSplitCondition instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): RuleSplitCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[RuleSplitCondition]
  
  /**
    * Creates and returns a new RuleSplitCondition instance in the SDK and on the server.
    * The new RuleSplitCondition will be automatically stored in the 'splitCondition' property
    * of the parent ExclusiveSplit element passed as argument.
    */
  /* static member */
  inline def createIn(container: ExclusiveSplit): RuleSplitCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[RuleSplitCondition]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.RuleSplitCondition.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.RuleSplitCondition.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
