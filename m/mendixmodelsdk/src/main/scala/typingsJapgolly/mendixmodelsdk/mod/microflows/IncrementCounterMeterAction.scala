package typingsJapgolly.mendixmodelsdk.mod.microflows

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

/**
  * See: {@link https://docs.mendix.com/refguide/metrics-increment-counter relevant section in reference guide}
  *
  * In version 9.7.0: removed experimental
  * In version 9.5.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.IncrementCounterMeterAction")
@js.native
open class IncrementCounterMeterAction protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.microflows.IncrementCounterMeterAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object IncrementCounterMeterAction {
  
  @JSImport("mendixmodelsdk", "microflows.IncrementCounterMeterAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new IncrementCounterMeterAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.IncrementCounterMeterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.IncrementCounterMeterAction]
  
  /**
    * Creates and returns a new IncrementCounterMeterAction instance in the SDK and on the server.
    * The new IncrementCounterMeterAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.5.0 and higher
    */
  /* static member */
  inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ActionActivity): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.IncrementCounterMeterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.IncrementCounterMeterAction]
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.IncrementCounterMeterAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.IncrementCounterMeterAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
