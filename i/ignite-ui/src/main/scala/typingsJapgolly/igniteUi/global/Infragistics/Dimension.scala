package typingsJapgolly.igniteUi.global.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Infragistics.Dimension")
@js.native
open class Dimension ()
  extends StObject
     with typingsJapgolly.igniteUi.Infragistics.Dimension {
  
  /**
    * Returns the caption of the dimension used when displaying the name of the dimension to the user.
    *
    * @param value
    */
  /* CompleteClass */
  override def caption(value: js.Object): String = js.native
  
  /**
    * Returns a user-friendly description of the dimension.
    *
    * @param value
    */
  /* CompleteClass */
  override def description(value: js.Object): String = js.native
  
  /**
    * Returns the type of the dimension which is a value from the $.ig.DimensionType enumeration.
    *
    *             $.ig.DimensionType.prototype.unknown = 0;
    *             $.ig.DimensionType.prototype.time = 1;
    *             $.ig.DimensionType.prototype.measure = 2;
    *             $.ig.DimensionType.prototype.other = 3;
    *             $.ig.DimensionType.prototype.quantitative = 5;
    *             $.ig.DimensionType.prototype.accounts = 6;
    *             $.ig.DimensionType.prototype.customers = 7;
    *             $.ig.DimensionType.prototype.products = 8;
    *             $.ig.DimensionType.prototype.scenario = 9;
    *             $.ig.DimensionType.prototype.utility = 10;
    *             $.ig.DimensionType.prototype.currency = 11;
    *             $.ig.DimensionType.prototype.rates = 12;
    *             $.ig.DimensionType.prototype.channel = 13;
    *             $.ig.DimensionType.prototype.promotion = 14;
    *             $.ig.DimensionType.prototype.organization = 15;
    *             $.ig.DimensionType.prototype.billOfMaterials = 16;
    *             $.ig.DimensionType.prototype.geography = 17;
    *
    * @param value
    */
  /* CompleteClass */
  override def dimensionType(value: js.Object): Double = js.native
  
  /**
    * Returns the name of the dimension.
    *
    * @param value
    */
  /* CompleteClass */
  override def name(value: js.Object): String = js.native
  
  /**
    * Returns the unique name of the dimension.
    *
    * @param value
    */
  /* CompleteClass */
  override def uniqueName(value: js.Object): String = js.native
}
