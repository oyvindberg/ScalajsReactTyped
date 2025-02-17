package typingsJapgolly.openlayers.mod.format

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.WFSFeatureCollectionMetadata
import typingsJapgolly.openlayers.mod.WFSTransactionResponse
import typingsJapgolly.openlayers.mod.olx.format.ReadOptions
import typingsJapgolly.openlayers.mod.olx.format.WFSOptions
import typingsJapgolly.openlayers.mod.olx.format.WFSWriteGetFeatureOptions
import typingsJapgolly.openlayers.mod.olx.format.WFSWriteTransactionOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Feature format for reading and writing data in the WFS format.
  * By default, supports WFS version 1.1.0. You can pass a GML format
  * as option if you want to read a WFS that contains GML2 (WFS 1.0.0).
  * Also see {@link ol.format.GMLBase} which is used by this format.
  *
  * @param opt_options
  *     Optional configuration object.
  * @api stable
  */
@JSImport("openlayers", "format.WFS")
@js.native
/**
  * @classdesc
  * Feature format for reading and writing data in the WFS format.
  * By default, supports WFS version 1.1.0. You can pass a GML format
  * as option if you want to read a WFS that contains GML2 (WFS 1.0.0).
  * Also see {@link ol.format.GMLBase} which is used by this format.
  *
  * @param opt_options
  *     Optional configuration object.
  * @api stable
  */
open class WFS () extends XMLFeature {
  def this(opt_options: WFSOptions) = this()
  
  def readFeatureCollectionMetadata(source: String): WFSFeatureCollectionMetadata = js.native
  /**
    * Read feature collection metadata of the source.
    *
    * @param source Source.
    * @return FeatureCollection metadata.
    * @api stable
    */
  def readFeatureCollectionMetadata(source: Document): WFSFeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadata(source: Node): WFSFeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadata(source: GlobalObject): WFSFeatureCollectionMetadata = js.native
  
  def readFeatures(source: String): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  /**
    * Read all features from a WFS FeatureCollection.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  
  def readProjection(source: String): Projection = js.native
  /**
    * Read the projection from a WFS source.
    *
    * @param source Source.
    * @return Projection.
    * @api stable
    */
  def readProjection(source: Document): Projection = js.native
  def readProjection(source: Node): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  
  def readTransactionResponse(source: String): WFSTransactionResponse = js.native
  /**
    * Read transaction response of the source.
    *
    * @param source Source.
    * @return Transaction response.
    * @api stable
    */
  def readTransactionResponse(source: Document): WFSTransactionResponse = js.native
  def readTransactionResponse(source: Node): WFSTransactionResponse = js.native
  def readTransactionResponse(source: GlobalObject): WFSTransactionResponse = js.native
  
  /**
    * Encode format as WFS `GetFeature` and return the Node.
    *
    * @param options Options.
    * @return Result.
    * @api stable
    */
  def writeGetFeature(options: WFSWriteGetFeatureOptions): Node = js.native
  
  /**
    * Encode format as WFS `Transaction` and return the Node.
    *
    * @param inserts The features to insert.
    * @param updates The features to update.
    * @param deletes The features to delete.
    * @param options Write options.
    * @return Result.
    * @api stable
    */
  def writeTransaction(
    inserts: js.Array[typingsJapgolly.openlayers.mod.Feature],
    updates: js.Array[typingsJapgolly.openlayers.mod.Feature],
    deletes: js.Array[typingsJapgolly.openlayers.mod.Feature],
    options: WFSWriteTransactionOptions
  ): Node = js.native
}
