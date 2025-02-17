package typingsJapgolly.openlayers.mod.format

import org.scalajs.dom.Node
import typingsJapgolly.openlayers.mod.geom.Geometry
import typingsJapgolly.openlayers.mod.olx.format.GMLOptions
import typingsJapgolly.openlayers.mod.olx.format.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Feature format for reading and writing data in the GML format
  * version 3.1.1.
  * Currently only supports GML 3.1.1 Simple Features profile.
  *
  * @param opt_options
  *     Optional configuration object.
  * @api
  */
@JSImport("openlayers", "format.GML3")
@js.native
/**
  * @classdesc
  * Feature format for reading and writing data in the GML format
  * version 3.1.1.
  * Currently only supports GML 3.1.1 Simple Features profile.
  *
  * @param opt_options
  *     Optional configuration object.
  * @api
  */
open class GML3 () extends GMLBase {
  def this(opt_options: GMLOptions) = this()
  
  /**
    * Encode an array of features in GML 3.1.1 Simple Features.
    *
    * @param features Features.
    * @param opt_options Options.
    * @return Result.
    * @api stable
    */
  def writeFeatures(features: js.Array[typingsJapgolly.openlayers.mod.Feature]): String = js.native
  def writeFeatures(features: js.Array[typingsJapgolly.openlayers.mod.Feature], opt_options: WriteOptions): String = js.native
  
  /**
    * Encode an array of features in the GML 3.1.1 format as an XML node.
    *
    * @param features Features.
    * @param opt_options Options.
    * @return Node.
    * @api
    */
  def writeFeaturesNode(features: js.Array[typingsJapgolly.openlayers.mod.Feature]): Node = js.native
  def writeFeaturesNode(features: js.Array[typingsJapgolly.openlayers.mod.Feature], opt_options: WriteOptions): Node = js.native
  
  /**
    * Encode a geometry in GML 3.1.1 Simple Features.
    *
    * @param geometry Geometry.
    * @param opt_options Options.
    * @return Node.
    * @api
    */
  def writeGeometryNode(geometry: Geometry): Node = js.native
  def writeGeometryNode(geometry: Geometry, opt_options: WriteOptions): Node = js.native
}
