package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.javaactions

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
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.EnumerationType")
@js.native
open class EnumerationType protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.EnumerationType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object EnumerationType {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.EnumerationType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.EnumerationType]
  
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  /* static member */
  inline def createInBasicParameterTypeUnderType(container: typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.BasicParameterType): typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicParameterTypeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.EnumerationType]
  
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  /* static member */
  inline def createInJavaActionParameterUnderJavaType(container: typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.JavaActionParameter): typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionParameterUnderJavaType")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.EnumerationType]
  
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  /* static member */
  inline def createInJavaActionUnderJavaReturnType(container: typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.JavaAction): typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionUnderJavaReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.EnumerationType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.EnumerationType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "javaactions.EnumerationType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
