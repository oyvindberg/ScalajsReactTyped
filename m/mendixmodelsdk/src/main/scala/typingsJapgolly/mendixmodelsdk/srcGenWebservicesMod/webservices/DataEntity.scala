package typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/webservices", "webservices.DataEntity")
@js.native
open class DataEntity protected () extends DataEntityBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DataEntity {
  
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.DataEntity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): DataEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataEntity]
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  /* static member */
  inline def createInDataEntityBaseUnderChildMembers(container: DataEntityBase): DataEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataEntityBaseUnderChildMembers")(container.asInstanceOf[js.Any]).asInstanceOf[DataEntity]
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedParameter element passed as argument.
    */
  /* static member */
  inline def createInPublishedParameterUnderDataEntity(container: PublishedParameter): DataEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderDataEntity")(container.asInstanceOf[js.Any]).asInstanceOf[DataEntity]
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedResource element passed as argument.
    */
  /* static member */
  inline def createInPublishedResourceUnderDataEntity(container: PublishedResource): DataEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedResourceUnderDataEntity")(container.asInstanceOf[js.Any]).asInstanceOf[DataEntity]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.DataEntity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.DataEntity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
