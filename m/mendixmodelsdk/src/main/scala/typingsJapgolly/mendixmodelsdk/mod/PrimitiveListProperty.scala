package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "PrimitiveListProperty")
@js.native
open class PrimitiveListProperty[T] protected ()
  extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.PrimitiveListProperty[T] {
  /**
    * parent is the structure that the value of this property attaches to,
    * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
    *    item.container === this.parent.
    *
    * initialValue is default value except parts and GUID-typed primitives.
    * (by-id/name references do not have default values.)
    */
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
    name: String,
    initialValue: js.Array[T],
    moreArgs: Any*
  ) = this()
}
