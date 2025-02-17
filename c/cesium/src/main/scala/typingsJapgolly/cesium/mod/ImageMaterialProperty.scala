package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.anon.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ImageMaterialProperty")
@js.native
open class ImageMaterialProperty () extends StObject {
  def this(options: Image) = this()
  
  /**
    * Gets or sets the Color Property specifying the desired color applied to the image.
    */
  var color: js.UndefOr[Property] = js.native
  
  /**
    * Gets the event that is raised whenever the definition of this property changes.
    * The definition is considered to have changed if a call to getValue would return
    * a different result for the same time.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Compares this property to the provided property and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [other] - The other property.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  
  /**
    * Gets the {@link Material} type at the provided time.
    * @param time - The time for which to retrieve the type.
    * @returns The type of material.
    */
  def getType(time: JulianDate): String = js.native
  
  /**
    * Gets the value of the property at the provided time.
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(time: JulianDate): Any = js.native
  def getValue(time: JulianDate, result: Any): Any = js.native
  
  /**
    * Gets or sets the Property specifying Image, URL, Canvas, or Video to use.
    */
  var image: js.UndefOr[Property] = js.native
  
  /**
    * Gets a value indicating if this property is constant.  A property is considered
    * constant if getValue always returns the same result for the current definition.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Gets or sets the {@link Cartesian2} Property specifying the number of times the image repeats in each direction.
    */
  var repeat: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Boolean Property specifying whether the image has transparency
    */
  var transparent: js.UndefOr[Property] = js.native
}
