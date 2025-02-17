package typingsJapgolly.materializecssMaterialize.global.M

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.materializecssMaterialize.M.FormSelectOptions
import typingsJapgolly.materializecssMaterialize.MElements
import typingsJapgolly.materializecssMaterialize.anon.PartialFormSelectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.FormSelect")
@js.native
open class FormSelect ()
  extends StObject
     with typingsJapgolly.materializecssMaterialize.M.FormSelect {
  
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * Instance of the dropdown plugin for this select
    */
  /* CompleteClass */
  var dropdown: typingsJapgolly.materializecssMaterialize.M.Dropdown = js.native
  
  /**
    * Dropdown UL element
    */
  /* CompleteClass */
  var dropdownOptions: HTMLUListElement = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * Get selected values in an array
    */
  /* CompleteClass */
  override def getSelectedValues(): js.Array[String] = js.native
  
  /**
    * Text input that shows current selected option
    */
  /* CompleteClass */
  var input: HTMLInputElement = js.native
  
  /**
    * If this is a multiple select
    */
  /* CompleteClass */
  var isMultiple: Boolean = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: FormSelectOptions = js.native
  
  /**
    * The select wrapper element
    */
  /* CompleteClass */
  var wrapper: Element = js.native
}
object FormSelect {
  
  @JSGlobal("M.FormSelect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typingsJapgolly.materializecssMaterialize.M.FormSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.FormSelect]
  
  /**
    * Init FormSelect
    */
  /* static member */
  inline def init(els: Element): typingsJapgolly.materializecssMaterialize.M.FormSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.FormSelect]
  inline def init(els: Element, options: PartialFormSelectOptions): typingsJapgolly.materializecssMaterialize.M.FormSelect = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.FormSelect]
  /**
    * Init FormSelects
    */
  /* static member */
  inline def init(els: MElements): js.Array[typingsJapgolly.materializecssMaterialize.M.FormSelect] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.materializecssMaterialize.M.FormSelect]]
  inline def init(els: MElements, options: PartialFormSelectOptions): js.Array[typingsJapgolly.materializecssMaterialize.M.FormSelect] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.materializecssMaterialize.M.FormSelect]]
}
