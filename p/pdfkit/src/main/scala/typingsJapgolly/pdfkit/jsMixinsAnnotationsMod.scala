package typingsJapgolly.pdfkit

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.pdfkit.PDFKit.Mixins.PDFAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsMixinsAnnotationsMod extends Shortcut {
  
  @JSImport("pdfkit/js/mixins/annotations", JSImport.Namespace)
  @js.native
  val ^ : PDFAnnotation = js.native
  
  type _To = PDFAnnotation
  
  /* This means you don't have to write `^`, but can instead just say `jsMixinsAnnotationsMod.foo` */
  override def _to: PDFAnnotation = ^
}
