package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These properties describe the printing of the content of a text document. */
trait PrintSettings extends StObject {
  
  /**
    * determines how notes are printed.
    * @see NotePrintMode
    */
  var PrintAnnotationMode: NotePrintMode
  
  /** determines if characters are always printed in black. */
  var PrintBlackFonts: Boolean
  
  /** determines if control shapes are printed. */
  var PrintControls: Boolean
  
  /** determines if shapes are printed. */
  var PrintDrawings: Boolean
  
  /** determines if automatically inserted empty pages are printed. */
  var PrintEmptyPages: Boolean
  
  /** contains the name of the fax. */
  var PrintFaxName: String
  
  /** determines if graphic objects are printed */
  var PrintGraphics: Boolean
  
  /** determines if left pages are printed. */
  var PrintLeftPages: Boolean
  
  /** determines if the background color / background graphic of pages is printed. */
  var PrintPageBackground: Boolean
  
  /**
    * specifies if the printer paper tray selection of the system printer is used.
    *
    * If com::sun::star::view::PrintSettings::PaperFromSetup is `FALSE` , then the paper tray selection of the page styles is used.
    */
  var PrintPaperFromSetup: Boolean
  
  /** determines if prospect printing is used. */
  var PrintProspect: Boolean
  
  /** determines if the pages are printed in the reverse order, starting with the last page. */
  var PrintReversed: Boolean
  
  /** determines if right pages are printed. */
  var PrintRightPages: Boolean
  
  /** determines if text tables are printed. */
  var PrintTables: Boolean
}
object PrintSettings {
  
  inline def apply(
    PrintAnnotationMode: NotePrintMode,
    PrintBlackFonts: Boolean,
    PrintControls: Boolean,
    PrintDrawings: Boolean,
    PrintEmptyPages: Boolean,
    PrintFaxName: String,
    PrintGraphics: Boolean,
    PrintLeftPages: Boolean,
    PrintPageBackground: Boolean,
    PrintPaperFromSetup: Boolean,
    PrintProspect: Boolean,
    PrintReversed: Boolean,
    PrintRightPages: Boolean,
    PrintTables: Boolean
  ): PrintSettings = {
    val __obj = js.Dynamic.literal(PrintAnnotationMode = PrintAnnotationMode.asInstanceOf[js.Any], PrintBlackFonts = PrintBlackFonts.asInstanceOf[js.Any], PrintControls = PrintControls.asInstanceOf[js.Any], PrintDrawings = PrintDrawings.asInstanceOf[js.Any], PrintEmptyPages = PrintEmptyPages.asInstanceOf[js.Any], PrintFaxName = PrintFaxName.asInstanceOf[js.Any], PrintGraphics = PrintGraphics.asInstanceOf[js.Any], PrintLeftPages = PrintLeftPages.asInstanceOf[js.Any], PrintPageBackground = PrintPageBackground.asInstanceOf[js.Any], PrintPaperFromSetup = PrintPaperFromSetup.asInstanceOf[js.Any], PrintProspect = PrintProspect.asInstanceOf[js.Any], PrintReversed = PrintReversed.asInstanceOf[js.Any], PrintRightPages = PrintRightPages.asInstanceOf[js.Any], PrintTables = PrintTables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintSettings]
  }
  
  extension [Self <: PrintSettings](x: Self) {
    
    inline def setPrintAnnotationMode(value: NotePrintMode): Self = StObject.set(x, "PrintAnnotationMode", value.asInstanceOf[js.Any])
    
    inline def setPrintBlackFonts(value: Boolean): Self = StObject.set(x, "PrintBlackFonts", value.asInstanceOf[js.Any])
    
    inline def setPrintControls(value: Boolean): Self = StObject.set(x, "PrintControls", value.asInstanceOf[js.Any])
    
    inline def setPrintDrawings(value: Boolean): Self = StObject.set(x, "PrintDrawings", value.asInstanceOf[js.Any])
    
    inline def setPrintEmptyPages(value: Boolean): Self = StObject.set(x, "PrintEmptyPages", value.asInstanceOf[js.Any])
    
    inline def setPrintFaxName(value: String): Self = StObject.set(x, "PrintFaxName", value.asInstanceOf[js.Any])
    
    inline def setPrintGraphics(value: Boolean): Self = StObject.set(x, "PrintGraphics", value.asInstanceOf[js.Any])
    
    inline def setPrintLeftPages(value: Boolean): Self = StObject.set(x, "PrintLeftPages", value.asInstanceOf[js.Any])
    
    inline def setPrintPageBackground(value: Boolean): Self = StObject.set(x, "PrintPageBackground", value.asInstanceOf[js.Any])
    
    inline def setPrintPaperFromSetup(value: Boolean): Self = StObject.set(x, "PrintPaperFromSetup", value.asInstanceOf[js.Any])
    
    inline def setPrintProspect(value: Boolean): Self = StObject.set(x, "PrintProspect", value.asInstanceOf[js.Any])
    
    inline def setPrintReversed(value: Boolean): Self = StObject.set(x, "PrintReversed", value.asInstanceOf[js.Any])
    
    inline def setPrintRightPages(value: Boolean): Self = StObject.set(x, "PrintRightPages", value.asInstanceOf[js.Any])
    
    inline def setPrintTables(value: Boolean): Self = StObject.set(x, "PrintTables", value.asInstanceOf[js.Any])
  }
}
