package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.microflows

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

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.MappingRequestHandling")
@js.native
open class MappingRequestHandling protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MappingRequestHandling {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MappingRequestHandling {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.MappingRequestHandling")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MappingRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MappingRequestHandling]
  
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'resultHandling' property
    * of the parent ExportXmlAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  /* static member */
  inline def createInExportXmlActionUnderResultHandling(container: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ExportXmlAction): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MappingRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInExportXmlActionUnderResultHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MappingRequestHandling]
  
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  inline def createInRestCallActionUnderRequestHandling(container: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.RestCallAction): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MappingRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderRequestHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MappingRequestHandling]
  
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  inline def createInWebServiceCallActionUnderRequestBodyHandling(container: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.WebServiceCallAction): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MappingRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderRequestBodyHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MappingRequestHandling]
  
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  inline def createInWebServiceCallActionUnderRequestHeaderHandling(container: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.WebServiceCallAction): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MappingRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderRequestHeaderHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MappingRequestHandling]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.MappingRequestHandling.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.MappingRequestHandling.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
