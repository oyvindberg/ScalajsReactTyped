package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.srcGenMenusMod.menus.MenuItem
import typingsJapgolly.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.GlyphIcon")
@js.native
open class GlyphIcon protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages.GlyphIcon {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object GlyphIcon {
  
  @JSImport("mendixmodelsdk", "pages.GlyphIcon")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon]
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInBottomBarItemUnderIcon(container: BottomBarItem): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBottomBarItemUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon]
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent Button element passed as argument.
    */
  /* static member */
  inline def createInButtonUnderIcon(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Button): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInButtonUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon]
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  inline def createInControlBarButtonUnderIcon(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ControlBarButton): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon]
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent menus.MenuItem element passed as argument.
    */
  /* static member */
  inline def createInMenuItemUnderIcon(container: MenuItem): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon]
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderIcon(container: WidgetValue): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderIcon")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GlyphIcon]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GlyphIcon.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GlyphIcon.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
