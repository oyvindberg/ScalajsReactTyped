package typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.javascriptactions.IJavaScriptActionParameter
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
  * In version 8.4.0: removed experimental
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaScriptActionParameterMapping")
@js.native
open class JavaScriptActionParameterMapping protected () extends CodeActionParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def parameter: IJavaScriptActionParameter = js.native
  
  def parameterQualifiedName: String = js.native
  
  def parameterValue: CodeActionParameterValue = js.native
  def parameterValue_=(newValue: CodeActionParameterValue): Unit = js.native
  
  def parameter_=(newValue: IJavaScriptActionParameter): Unit = js.native
}
object JavaScriptActionParameterMapping {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaScriptActionParameterMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new JavaScriptActionParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): JavaScriptActionParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[JavaScriptActionParameterMapping]
  
  /**
    * Creates and returns a new JavaScriptActionParameterMapping instance in the SDK and on the server.
    * The new JavaScriptActionParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent JavaScriptActionCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createIn(container: JavaScriptActionCallAction): JavaScriptActionParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[JavaScriptActionParameterMapping]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaScriptActionParameterMapping.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaScriptActionParameterMapping.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
