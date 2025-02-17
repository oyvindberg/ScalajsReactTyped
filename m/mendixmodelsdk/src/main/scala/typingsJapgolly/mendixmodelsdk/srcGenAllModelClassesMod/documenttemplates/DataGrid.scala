package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.documenttemplates

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/data-grid-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.DataGrid")
@js.native
open class DataGrid protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGrid {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DataGrid {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.DataGrid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataGrid instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGrid]
  
  /**
    * Creates and returns a new DataGrid instance in the SDK and on the server.
    * The new DataGrid will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  inline def createInDocumentTemplateUnderToplevels(
    container: typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DocumentTemplate
  ): typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateUnderToplevels")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGrid]
  
  /**
    * Creates and returns a new DataGrid instance in the SDK and on the server.
    * The new DataGrid will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  /* static member */
  inline def createInDropZoneUnderWidget(container: typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DropZone): typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropZoneUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGrid]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.DataGrid.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.DataGrid.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
