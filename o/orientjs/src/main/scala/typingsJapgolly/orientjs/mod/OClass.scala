package typingsJapgolly.orientjs.mod

import typingsJapgolly.orientjs.anon.Force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The class constructor.
  * @param config The configuration for the class
  */
@JSImport("orientjs", "OClass")
@js.native
open class OClass () extends StObject {
  
  /**
    * Cache the given class data for fast lookup later.
    *
    * @param  classes The class objects to cache.
    * @return                The db instance.
    */
  def cacheData(classes: js.Array[OClass]): ODB = js.native
  
  var clusterIds: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Create a new class.
    *
    * @param  name            The name of the class to create.
    * @param  parentName      The name of the parent to extend, if any.
    * @param  cluster The cluster name or id.
    * @param  isAbstract     The flag for the abstract class
    * @param  ifnotexist     The flag for the if not exist class
    * @promise {Object}                The created class object
    */
  def create(name: String): js.Promise[OClass] = js.native
  def create(name: String, parentName: String): js.Promise[OClass] = js.native
  def create(name: String, parentName: String, cluster: String): js.Promise[OClass] = js.native
  def create(name: String, parentName: String, cluster: String, isAbstract: Boolean): js.Promise[OClass] = js.native
  def create(name: String, parentName: String, cluster: String, isAbstract: Boolean, ifnotexist: Boolean): js.Promise[OClass] = js.native
  def create(name: String, parentName: String, cluster: String, isAbstract: Unit, ifnotexist: Boolean): js.Promise[OClass] = js.native
  def create(name: String, parentName: String, cluster: Unit, isAbstract: Boolean): js.Promise[OClass] = js.native
  def create(name: String, parentName: String, cluster: Unit, isAbstract: Boolean, ifnotexist: Boolean): js.Promise[OClass] = js.native
  def create(name: String, parentName: String, cluster: Unit, isAbstract: Unit, ifnotexist: Boolean): js.Promise[OClass] = js.native
  def create(name: String, parentName: Unit, cluster: String): js.Promise[OClass] = js.native
  def create(name: String, parentName: Unit, cluster: String, isAbstract: Boolean): js.Promise[OClass] = js.native
  def create(name: String, parentName: Unit, cluster: String, isAbstract: Boolean, ifnotexist: Boolean): js.Promise[OClass] = js.native
  def create(name: String, parentName: Unit, cluster: String, isAbstract: Unit, ifnotexist: Boolean): js.Promise[OClass] = js.native
  def create(name: String, parentName: Unit, cluster: Unit, isAbstract: Boolean): js.Promise[OClass] = js.native
  def create(name: String, parentName: Unit, cluster: Unit, isAbstract: Boolean, ifnotexist: Boolean): js.Promise[OClass] = js.native
  def create(name: String, parentName: Unit, cluster: Unit, isAbstract: Unit, ifnotexist: Boolean): js.Promise[OClass] = js.native
  /**
    * Create a record for this class.
    *
    * @param   record The record to create.
    * @promise {Object}        The created record.
    */
  def create(record: ORecord): js.Promise[ORecord] = js.native
  
  var db: js.UndefOr[ODB] = js.native
  
  var defaultClusterId: js.UndefOr[Any] = js.native
  
  /**
    * Delete a class.
    *
    * @param  name The name of the class to delete.
    * @param  config The config.
    * @promise {Db}         The database instance.
    */
  def drop(name: String): js.Promise[ODB] = js.native
  def drop(name: String, config: Force): js.Promise[ODB] = js.native
  
  /**
    * Find a list of records in the class.
    *
    * @param   attributes The attributes to search with.
    * @param  limit      The maximum number of records to return
    * @param  offset     The offset to start returning records from.
    * @promise {Object[]}          An array of records in the class.
    */
  def find(attributes: Any): js.Promise[js.Array[ORecord]] = js.native
  def find(attributes: Any, limit: Double): js.Promise[js.Array[ORecord]] = js.native
  def find(attributes: Any, limit: Double, offset: Double): js.Promise[js.Array[ORecord]] = js.native
  def find(attributes: Any, limit: Unit, offset: Double): js.Promise[js.Array[ORecord]] = js.native
  
  /**
    * Get a class by name.
    *
    * @param   name The name of the class.
    * @param   refresh Whether to refresh the data, defaults to false.
    * @promise {Object}          The class object if it exists.
    */
  def get(name: String): js.Promise[OClass] = js.native
  def get(name: String, refresh: Boolean): js.Promise[OClass] = js.native
  
  def list(limit: Any): js.Promise[js.Array[OClass]] = js.native
  def list(limit: Any, offset: Double): js.Promise[js.Array[OClass]] = js.native
  def list(limit: Boolean): js.Promise[js.Array[OClass]] = js.native
  def list(limit: Boolean, offset: Double): js.Promise[js.Array[OClass]] = js.native
  /**
    * Configure the class instance.
    * @param  config The configuration object.
    */
  /**
    * Retreive a list of classes from the database.
    *
    * @param  refresh Whether to refresh the list or not.
    * @promise {Object[]}       An array of class objects.
    */
  def list(limit: Double): js.Promise[js.Array[OClass]] = js.native
  def list(limit: Double, offset: Double): js.Promise[js.Array[OClass]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var originalName: js.UndefOr[String] = js.native
  
  var property: OClassProperty = js.native
  
  /**
    * Reload the class instance.
    *
    * @promise {Class} The class instance.
    */
  def reload(): js.Promise[js.Array[OClass]] = js.native
  
  var shortName: js.UndefOr[String] = js.native
  
  var superClass: js.UndefOr[String] = js.native
  
  /**
    * Update the given class.
    *
    * @param    class    The class settings.
    * @param   reload   Whether to reload the class, default to true.
    * @promise {Object}           The updated class.
    */
  def update(cls: Any, reload: Boolean): js.Promise[OClass] = js.native
}
