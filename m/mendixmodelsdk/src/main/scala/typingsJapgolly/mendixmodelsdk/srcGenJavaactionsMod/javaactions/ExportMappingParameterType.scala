package typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 7.2.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IParameterType because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IExportMappingParameterType because var conflicts: containerAsJavaActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.ExportMappingParameterType")
@js.native
open class ExportMappingParameterType protected () extends ParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsJavaActionParameter")
  def containerAsJavaActionParameter_MExportMappingParameterType: JavaActionParameter = js.native
}
object ExportMappingParameterType {
  
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.ExportMappingParameterType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ExportMappingParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ExportMappingParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ExportMappingParameterType]
  
  /**
    * Creates and returns a new ExportMappingParameterType instance in the SDK and on the server.
    * The new ExportMappingParameterType will be automatically stored in the 'parameterType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 to 7.20.0
    */
  /* static member */
  inline def createIn(container: JavaActionParameter): ExportMappingParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ExportMappingParameterType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.ExportMappingParameterType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.ExportMappingParameterType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
