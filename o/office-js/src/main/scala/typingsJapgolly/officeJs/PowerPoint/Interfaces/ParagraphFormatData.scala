package typingsJapgolly.officeJs.PowerPoint.Interfaces

import typingsJapgolly.officeJs.PowerPoint.ParagraphHorizontalAlignment
import typingsJapgolly.officeJs.officeJsStrings.Center
import typingsJapgolly.officeJs.officeJsStrings.Distributed
import typingsJapgolly.officeJs.officeJsStrings.Justify
import typingsJapgolly.officeJs.officeJsStrings.JustifyLow
import typingsJapgolly.officeJs.officeJsStrings.Left
import typingsJapgolly.officeJs.officeJsStrings.Right
import typingsJapgolly.officeJs.officeJsStrings.ThaiDistributed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `paragraphFormat.toJSON()`. */
trait ParagraphFormatData extends StObject {
  
  /**
    * Represents the horizontal alignment of the paragraph. Returns 'null' if the 'TextRange' includes text fragments with different horizontal alignment values. See {@link PowerPoint.ParagraphHorizontalAlignment} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var horizontalAlignment: js.UndefOr[
    ParagraphHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
  ] = js.undefined
}
object ParagraphFormatData {
  
  inline def apply(): ParagraphFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphFormatData]
  }
  
  extension [Self <: ParagraphFormatData](x: Self) {
    
    inline def setHorizontalAlignment(
      value: ParagraphHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
    ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
  }
}
