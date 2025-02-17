package typingsJapgolly.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImgContainerType extends StObject
@JSGlobal("CUI.ImgContainerType")
@js.native
object ImgContainerType extends StObject {
  
  @js.native
  sealed trait anchor
    extends StObject
       with ImgContainerType
  
  @js.native
  sealed trait div
    extends StObject
       with ImgContainerType
  
  @js.native
  sealed trait span
    extends StObject
       with ImgContainerType
}
