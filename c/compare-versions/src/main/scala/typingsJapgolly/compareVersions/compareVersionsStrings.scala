package typingsJapgolly.compareVersions

import typingsJapgolly.compareVersions.mod.CompareOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareVersionsStrings {
  
  @js.native
  sealed trait Equalssign
    extends StObject
       with CompareOperator
  inline def Equalssign: Equalssign = "=".asInstanceOf[Equalssign]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with CompareOperator
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with CompareOperator
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with CompareOperator
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with CompareOperator
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
}
