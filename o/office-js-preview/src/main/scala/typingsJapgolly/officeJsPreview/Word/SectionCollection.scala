package typingsJapgolly.officeJsPreview.Word

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.LoadOption
import typingsJapgolly.officeJsPreview.Word.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJsPreview.Word.Interfaces.SectionCollectionData
import typingsJapgolly.officeJsPreview.Word.Interfaces.SectionCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the collection of the document's {@link Word.Section} objects.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@js.native
trait SectionCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SectionCollection: RequestContext = js.native
  
  /**
    * Gets the first section in this collection. Throws an `ItemNotFound` error if this collection is empty.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getFirst(): Section = js.native
  
  /**
    * Gets the first section in this collection. If this collection is empty, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getFirstOrNullObject(): Section = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Section] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SectionCollection = js.native
  def load(options: SectionCollectionLoadOptions & CollectionLoadOptions): SectionCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): SectionCollection = js.native
  def load(propertyNames: String): SectionCollection = js.native
  def load(propertyNames: js.Array[String]): SectionCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Word.SectionCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.SectionCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SectionCollectionData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): SectionCollection = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): SectionCollection = js.native
}
