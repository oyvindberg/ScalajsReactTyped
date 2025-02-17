package typingsJapgolly.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesPrimitivePropertyMod.PrimitiveProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesEnumPropertyMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/EnumProperty", "EnumProperty")
  @js.native
  open class EnumProperty[T /* <: AbstractEnum */] protected () extends PrimitiveProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
    
    /* protected */ var enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum] = js.native
    
    /* private */ var initialValue: Any = js.native
  }
}
