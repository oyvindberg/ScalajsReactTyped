package typingsJapgolly.materialSegmentedButton

import org.scalajs.dom.DOMRect
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import typingsJapgolly.materialSegmentedButton.segmentAdapterMod.MDCSegmentedButtonSegmentAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentFoundationMod {
  
  @JSImport("@material/segmented-button/segment/foundation", "MDCSegmentedButtonSegmentFoundation")
  @js.native
  open class MDCSegmentedButtonSegmentFoundation () extends MDCFoundation[MDCSegmentedButtonSegmentAdapter] {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
    
    /**
      * @return Returns bounding rectangle for ripple effect
      */
    def getDimensions(): DOMRect = js.native
    
    /**
      * @return Returns segment's segmentId if it was set by client
      */
    def getSegmentId(): js.UndefOr[String] = js.native
    
    /**
      * Called when segment is clicked. If the wrapping segmented button is single
      * select, doesn't allow segment to be set to not selected. Otherwise, toggles
      * segment's selected status. Finally, emits event to wrapping segmented
      * button.
      *
      * @event selected With detail - SegmentDetail
      */
    def handleClick(): Unit = js.native
    
    /**
      * @return Returns true if segment is currently selected, otherwise returns
      * false
      */
    def isSelected(): Boolean = js.native
    
    /**
      * Sets appropriate aria attribute, based on wrapping segmented button's
      * single selected value, to new value
      *
      * @param value Value that represents selected status
      */
    /* private */ var setAriaAttr: Any = js.native
    
    /**
      * Sets segment to be selected
      */
    def setSelected(): Unit = js.native
    
    /**
      * Sets segment to be not selected
      */
    def setUnselected(): Unit = js.native
    
    /**
      * Sets segment from not selected to selected, or selected to not selected
      */
    /* private */ var toggleSelection: Any = js.native
  }
}
