package typingsJapgolly.materializecssMaterialize.global.M

import org.scalajs.dom.Element
import typingsJapgolly.materializecssMaterialize.M.ModalOptions
import typingsJapgolly.materializecssMaterialize.MElements
import typingsJapgolly.materializecssMaterialize.anon.PartialModalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Modal")
@js.native
open class Modal ()
  extends StObject
     with typingsJapgolly.materializecssMaterialize.M.Modal {
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * ID of the modal element
    */
  /* CompleteClass */
  var id: String = js.native
  
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: ModalOptions = js.native
}
object Modal {
  
  @JSGlobal("M.Modal")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typingsJapgolly.materializecssMaterialize.M.Modal = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Modal]
  
  /**
    * Init Modal
    */
  /* static member */
  inline def init(els: Element): typingsJapgolly.materializecssMaterialize.M.Modal = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Modal]
  inline def init(els: Element, options: PartialModalOptions): typingsJapgolly.materializecssMaterialize.M.Modal = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Modal]
  /**
    * Init Modals
    */
  /* static member */
  inline def init(els: MElements): js.Array[typingsJapgolly.materializecssMaterialize.M.Modal] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.materializecssMaterialize.M.Modal]]
  inline def init(els: MElements, options: PartialModalOptions): js.Array[typingsJapgolly.materializecssMaterialize.M.Modal] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.materializecssMaterialize.M.Modal]]
}
