package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.FillProperties
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.LineProperties
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.CharacterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegressionCurveEquation
  extends StObject
     with PropertySet
     with FillProperties
     with LineProperties
     with CharacterProperties {
  
  var NumberFormat: Double = js.native
  
  var ReferencePageSize: Size = js.native
  
  var RelativePosition: typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.RelativePosition = js.native
  
  var ShowCorrelationCoefficient: Boolean = js.native
  
  var ShowEquation: Boolean = js.native
  
  var XName: String = js.native
  
  var YName: String = js.native
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}
