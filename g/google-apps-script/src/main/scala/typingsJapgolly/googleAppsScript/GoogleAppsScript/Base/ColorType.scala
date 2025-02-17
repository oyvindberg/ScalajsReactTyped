package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorType extends StObject
/**
  * The types of Colors
  */
@JSGlobal("GoogleAppsScript.Base.ColorType")
@js.native
object ColorType extends StObject {
  
  @js.native
  sealed trait RGB
    extends StObject
       with ColorType
  
  @js.native
  sealed trait THEME
    extends StObject
       with ColorType
  
  @js.native
  sealed trait UNSUPPORTED
    extends StObject
       with ColorType
}
