package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to specify how a sheet is linked to another sheet.
  * @see com.sun.star.sheet.SheetLinks
  * @see com.sun.star.sheet.SheetLink
  * @see com.sun.star.sheet.XSheetLinkable
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait SheetLinkMode extends StObject
object SheetLinkMode {
  
  /**
    * no cells are moved.
    *
    * no condition is specified.
    *
    * nothing is imported.
    *
    * nothing is calculated.
    *
    * new values are used without changes.
    *
    * sheet is not linked.
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** all contents (values and formulas) are copied. */
  inline def NORMAL: `1` = 1.asInstanceOf[`1`]
  
  /** instead of using formulas, the result values are copied. */
  inline def VALUE: `2` = 2.asInstanceOf[`2`]
}
