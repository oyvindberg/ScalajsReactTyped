package typingsJapgolly.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*Interfaces*/
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
- typingsJapgolly.yandexMaps.mod.IChild because var conflicts: events. Inlined getParent, setParent, setParent */ @js.native
trait IBaloon[T]
  extends StObject
     with IPopup[T] {
  
  def autoPan(): js.Promise[T] = js.native
  
  def freeze(): IFreezable = js.native
  
  def getParent(): js.Object | Null = js.native
  
  def isFrozen(): Boolean = js.native
  
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
  
  def unfreeze(): IFreezable = js.native
}
