package typingsJapgolly.openlayers.mod.source

import typingsJapgolly.openlayers.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Events emitted by {@link ol.source.Image} instances are instances of this
  * type.
  *
  * @param type Type.
  * @param image The image.
  */
@JSImport("openlayers", "source.ImageEvent")
@js.native
open class ImageEvent protected () extends Event {
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Image} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param image The image.
    */
  def this(`type`: String, image: typingsJapgolly.openlayers.mod.Image) = this()
  
  /**
    * The image related to the event.
    * @api
    */
  var image: typingsJapgolly.openlayers.mod.Image = js.native
}
