package typingsJapgolly.materialToolbar

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialToolbar.adapterMod.MDCToolbarAdapter
import typingsJapgolly.materialToolbar.anon.CHANGEEVENT
import typingsJapgolly.materialToolbar.anon.FIXED
import typingsJapgolly.materialToolbar.anon.MAXTITLESIZE
import typingsJapgolly.materialToolbar.anon.PartialMDCToolbarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/toolbar", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialToolbar.foundationMod.default {
    def this(adapter: PartialMDCToolbarAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/toolbar", "default.cssClasses")
    @js.native
    val cssClasses: FIXED = js.native
    
    @JSImport("@material/toolbar", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCToolbarAdapter = js.native
    
    @JSImport("@material/toolbar", "default.numbers")
    @js.native
    val numbers: MAXTITLESIZE = js.native
    
    @JSImport("@material/toolbar", "default.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
  
  @JSImport("@material/toolbar", "MDCToolbar")
  @js.native
  open class MDCToolbar protected ()
    extends typingsJapgolly.materialToolbar.componentMod.MDCToolbar {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialToolbar.foundationMod.MDCToolbarFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCToolbar {
    
    @JSImport("@material/toolbar", "MDCToolbar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialToolbar.componentMod.MDCToolbar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialToolbar.componentMod.MDCToolbar]
  }
  
  @JSImport("@material/toolbar", "MDCToolbarFoundation")
  @js.native
  open class MDCToolbarFoundation ()
    extends typingsJapgolly.materialToolbar.foundationMod.MDCToolbarFoundation {
    def this(adapter: PartialMDCToolbarAdapter) = this()
  }
  /* static members */
  object MDCToolbarFoundation {
    
    @JSImport("@material/toolbar", "MDCToolbarFoundation.cssClasses")
    @js.native
    val cssClasses: FIXED = js.native
    
    @JSImport("@material/toolbar", "MDCToolbarFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCToolbarAdapter = js.native
    
    @JSImport("@material/toolbar", "MDCToolbarFoundation.numbers")
    @js.native
    val numbers: MAXTITLESIZE = js.native
    
    @JSImport("@material/toolbar", "MDCToolbarFoundation.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
  
  object cssClasses {
    
    @JSImport("@material/toolbar", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/toolbar", "cssClasses.FIXED")
    @js.native
    def FIXED: String = js.native
    inline def FIXED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "cssClasses.FIXED_AT_LAST_ROW")
    @js.native
    def FIXED_AT_LAST_ROW: String = js.native
    inline def FIXED_AT_LAST_ROW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED_AT_LAST_ROW")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "cssClasses.FIXED_LASTROW")
    @js.native
    def FIXED_LASTROW: String = js.native
    inline def FIXED_LASTROW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED_LASTROW")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "cssClasses.FLEXIBLE_DEFAULT_BEHAVIOR")
    @js.native
    def FLEXIBLE_DEFAULT_BEHAVIOR: String = js.native
    inline def FLEXIBLE_DEFAULT_BEHAVIOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLEXIBLE_DEFAULT_BEHAVIOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "cssClasses.FLEXIBLE_MAX")
    @js.native
    def FLEXIBLE_MAX: String = js.native
    inline def FLEXIBLE_MAX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLEXIBLE_MAX")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "cssClasses.FLEXIBLE_MIN")
    @js.native
    def FLEXIBLE_MIN: String = js.native
    inline def FLEXIBLE_MIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLEXIBLE_MIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "cssClasses.TOOLBAR_ROW_FLEXIBLE")
    @js.native
    def TOOLBAR_ROW_FLEXIBLE: String = js.native
    inline def TOOLBAR_ROW_FLEXIBLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOOLBAR_ROW_FLEXIBLE")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/toolbar", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/toolbar", "numbers.MAX_TITLE_SIZE")
    @js.native
    def MAX_TITLE_SIZE: Double = js.native
    inline def MAX_TITLE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_TITLE_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "numbers.MIN_TITLE_SIZE")
    @js.native
    def MIN_TITLE_SIZE: Double = js.native
    inline def MIN_TITLE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_TITLE_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "numbers.TOOLBAR_MOBILE_BREAKPOINT")
    @js.native
    def TOOLBAR_MOBILE_BREAKPOINT: Double = js.native
    inline def TOOLBAR_MOBILE_BREAKPOINT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOOLBAR_MOBILE_BREAKPOINT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "numbers.TOOLBAR_ROW_HEIGHT")
    @js.native
    def TOOLBAR_ROW_HEIGHT: Double = js.native
    inline def TOOLBAR_ROW_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOOLBAR_ROW_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "numbers.TOOLBAR_ROW_MOBILE_HEIGHT")
    @js.native
    def TOOLBAR_ROW_MOBILE_HEIGHT: Double = js.native
    inline def TOOLBAR_ROW_MOBILE_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOOLBAR_ROW_MOBILE_HEIGHT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/toolbar", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/toolbar", "strings.CHANGE_EVENT")
    @js.native
    def CHANGE_EVENT: String = js.native
    inline def CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "strings.FIRST_ROW_SELECTOR")
    @js.native
    def FIRST_ROW_SELECTOR: String = js.native
    inline def FIRST_ROW_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIRST_ROW_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "strings.ICON_SELECTOR")
    @js.native
    def ICON_SELECTOR: String = js.native
    inline def ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/toolbar", "strings.TITLE_SELECTOR")
    @js.native
    def TITLE_SELECTOR: String = js.native
    inline def TITLE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TITLE_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
