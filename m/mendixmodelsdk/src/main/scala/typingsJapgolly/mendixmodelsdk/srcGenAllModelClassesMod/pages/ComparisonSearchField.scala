package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/search-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ComparisonSearchField")
@js.native
open class ComparisonSearchField protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ComparisonSearchField {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ComparisonSearchField {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ComparisonSearchField")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ComparisonSearchField instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ComparisonSearchField = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ComparisonSearchField]
  
  /**
    * Creates and returns a new ComparisonSearchField instance in the SDK and on the server.
    * The new ComparisonSearchField will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  /* static member */
  inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ControlBar): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ComparisonSearchField = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ComparisonSearchField]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ComparisonSearchField.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ComparisonSearchField.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
