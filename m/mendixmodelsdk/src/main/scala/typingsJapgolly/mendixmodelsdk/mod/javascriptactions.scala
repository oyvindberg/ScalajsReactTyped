package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object javascriptactions {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/javascript-actions relevant section in reference guide}
    *
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  @JSImport("mendixmodelsdk", "javascriptactions.JavaScriptAction")
  @js.native
  open class JavaScriptAction protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.javascriptactions.JavaScriptAction {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object JavaScriptAction {
    
    @JSImport("mendixmodelsdk", "javascriptactions.JavaScriptAction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new JavaScriptAction unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.javascriptactions.JavaScriptAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.javascriptactions.JavaScriptAction]
    
    /* static member */
    @JSImport("mendixmodelsdk", "javascriptactions.JavaScriptAction.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "javascriptactions.JavaScriptAction.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  @JSImport("mendixmodelsdk", "javascriptactions.JavaScriptActionParameter")
  @js.native
  open class JavaScriptActionParameter protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.javascriptactions.JavaScriptActionParameter {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object JavaScriptActionParameter {
    
    @JSImport("mendixmodelsdk", "javascriptactions.JavaScriptActionParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new JavaScriptActionParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.javascriptactions.JavaScriptActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.javascriptactions.JavaScriptActionParameter]
    
    /* static member */
    @JSImport("mendixmodelsdk", "javascriptactions.JavaScriptActionParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "javascriptactions.JavaScriptActionParameter.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.4.0: introduced
    */
  @JSImport("mendixmodelsdk", "javascriptactions.NanoflowJavaScriptActionParameterType")
  @js.native
  open class NanoflowJavaScriptActionParameterType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.javascriptactions.NanoflowJavaScriptActionParameterType {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NanoflowJavaScriptActionParameterType {
    
    @JSImport("mendixmodelsdk", "javascriptactions.NanoflowJavaScriptActionParameterType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NanoflowJavaScriptActionParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.javascriptactions.NanoflowJavaScriptActionParameterType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.javascriptactions.NanoflowJavaScriptActionParameterType]
    
    /* static member */
    @JSImport("mendixmodelsdk", "javascriptactions.NanoflowJavaScriptActionParameterType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "javascriptactions.NanoflowJavaScriptActionParameterType.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenJavascriptactionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
