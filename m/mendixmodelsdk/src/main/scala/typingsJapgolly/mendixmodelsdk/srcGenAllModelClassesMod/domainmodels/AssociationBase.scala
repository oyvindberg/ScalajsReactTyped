package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/associations relevant section in reference guide}
  */
/* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AssociationBase")
@js.native
open class AssociationBase protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object AssociationBase {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AssociationBase")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AssociationBase.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AssociationBase.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
